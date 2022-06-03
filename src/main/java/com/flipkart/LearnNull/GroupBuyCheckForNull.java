package com.flipkart.LearnNull;

public class GroupBuyCheckForNull {
    public static void main(String[] args) {
        GroupBuyContext groupBuyContext = new GroupBuyContext();
        // By doing this , NPE would not come. BRILLIANT !!
        if ((GroupBuyStatus.TRUE).equals(groupBuyContext.getGroupbuyStatus())) {
            System.out.println("Even though status is null , nPOE does not come: Case TRUE");
        } else {
            System.out.println("Even though status is null , nPOE does not come: Case FALSE");
        }


        // So in this case NPE will come when GroupBuyContext is not null but GroupBuyStatus is null i.e. not set kind of thing
        // So if GroupBuyStatus is null , then calling .equals method on that would give NPE. Hence always apply .equals function at constant or enum. So here we should flip this.
        if (groupBuyContext.getGroupbuyStatus().equals(GroupBuyStatus.TRUE)) {
            System.out.println("NPE case");
        } else {
            System.out.println("NPE did not occures");
        }
    }
}
