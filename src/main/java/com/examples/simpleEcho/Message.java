package com.examples.simpleEcho;

import java.io.Serializable;

/**
 * Created by hank on 5/30/18.
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 6244257218143511661L;

    private long messageId;

    private String messageName = "mmm";

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

}
