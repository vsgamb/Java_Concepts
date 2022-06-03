package com.flipkart.LearnNull;

public class GroupBuyContext {
    private byte [] meta;
    private GroupBuyStatus groupbuyStatus;

    public GroupBuyContext() {
    }

    public byte[] getMeta() {
        return meta;
    }

    public void setMeta(byte[] meta) {
        this.meta = meta;
    }

    public GroupBuyStatus getGroupbuyStatus() {
        return groupbuyStatus;
    }

    public void setGroupbuyStatus(GroupBuyStatus groupbuyStatus) {
        this.groupbuyStatus = groupbuyStatus;
    }
}
