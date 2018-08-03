package com.app.util;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import org.msgpack.core.MessageBufferPacker;
import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;


import org.msgpack.core.MessagePack;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by hank on 8/1/18.
 */
public class SerialUtil {

    private static Map<Class<?>, Schema<?>> cachedSchema = new ConcurrentHashMap<Class<?>, Schema<?>>();

    private static Objenesis objenesis = new ObjenesisStd(true);

    private static <T> Schema<T> getSchema(Class<T> clazz) {
        @SuppressWarnings("unchecked")
        Schema<T> schema = (Schema<T>) cachedSchema.get(clazz);
        if (schema == null) {
            schema = RuntimeSchema.getSchema(clazz);
            if (schema != null) {
                cachedSchema.put(clazz, schema);
            }
        }
        return schema;
    }

    /**
     * 序列化
     *
     * @param obj
     * @return
     */
    public static <T> byte[] serializer(T obj) {
        if (obj == null) {
            return null;
            //throw new RuntimeException("Failed to serializer");
        }

        LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.MIN_BUFFER_SIZE);
        byte[] bytestuff = null;
        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) obj.getClass();
        try {
            Schema<T> schema = getSchema(clazz);
            bytestuff = ProtostuffIOUtil.toByteArray(obj, schema, buffer);
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        } finally {
            buffer.clear();
        }
        return bytestuff;
    }

    /**
     * 反序列化
     *
     * @param data
     * @param clazz
     * @return
     */
    public static <T> T deserializer(byte[] data, Class<T> clazz) {
        if (data == null) {
            return null;
            //throw new RuntimeException("Failed to serializer");
        }

        T obj = null;
        try {
            obj = objenesis.newInstance(clazz);
            Schema<T> schema = getSchema(clazz);
            ProtostuffIOUtil.mergeFrom(data, obj, schema);
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
        return obj;
    }

    /**
     * 序列化集合对象
     *
     * @param objList
     * @return
     */
    public static <T> byte[] serializeList(List<T> objList) {
        if (objList == null) {
            return null;
            //throw new RuntimeException("Failed to serializer");
        }

        LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.MIN_BUFFER_SIZE);
        byte[] bytestuff = null;
        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) objList.get(0).getClass();
        try {
            Schema<T> schema = getSchema(clazz);
            ByteOutputStream bos = new ByteOutputStream();
            int len = ProtostuffIOUtil.writeListTo(bos, objList, schema, buffer);
            bytestuff = bos.toByteArray();
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        } finally {
            buffer.clear();
        }
        return bytestuff;
    }

    /**
     * 反序列化集合对象
     *
     * @param data
     * @param clazz
     * @return
     */
    public static <T> List<T> deserializeList(byte[] data, Class<T> clazz) {
        if (data == null) {
            return null;
            //throw new RuntimeException("Failed to serializer");
        }

        List<T> result = null;
        try {
            Schema<T> schema = getSchema(clazz);
            result = ProtostuffIOUtil.parseListFrom(new ByteInputStream(data), schema);
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
        return result;
    }



    public static void  main(String ss[]) {
        System.out.println("====");
        List<String> messageList = new ArrayList();
        messageList.add("111yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        messageList.add("222yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        messageList.add("333yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        System.out.println(messageList.toString());

        byte[] bb = serializer("123458");
        System.out.println(bb.length);
        ByteBuffer buffer = ByteBuffer.allocate(bb.length);
        buffer.put(bb);

        String tt = deserializer(buffer.array(), String.class);
        System.out.println("::" + tt);

        Map<Integer, String> mm = new HashMap<>();
        mm.put(1, "11111ttttt");
        mm.put(2, "22222ttttt");
        mm.put(3, "33333ttttt");
    }

}

