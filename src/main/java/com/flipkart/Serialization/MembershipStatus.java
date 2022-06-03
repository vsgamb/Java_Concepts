package com.flipkart.Serialization;

import java.util.HashMap;
import java.util.Map;

public enum MembershipStatus {
    ACTIVE("active"),
    ACTIVATE_ELIGIBLE("activateEligible"),
    INACTIVE("inactive");

    private static final Map<String, MembershipStatus> keyToEnumMap = new HashMap();
    private String key;

    private MembershipStatus(String key) {
        this.key = key;
    }

    public static MembershipStatus getByKey(String key) {
        return (MembershipStatus)keyToEnumMap.get(key);
    }

    public String getKey() {
        return this.key;
    }

    public String toString() {
        return this.name();
    }

    static {
        MembershipStatus[] var0 = values();
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            MembershipStatus membershipStatus = var0[var2];
            keyToEnumMap.put(membershipStatus.key, membershipStatus);
        }

    }
}
