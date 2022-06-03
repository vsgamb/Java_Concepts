//package com.flipkart.Serialization;
//
//import com.google.gson.Gson;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.*;
//
//public class SerializationClass {
//
//    public static void main(String[] args) {
//        Person person1 = new Person();
//        Person person2 = new Person();
//
//        // By doing this only the reference Value is copied .
//        // So thats why we will see same value whatever found in person1 inside person2.
//        person2 = person1;
//        System.out.println(person1);
//        System.out.println(person2);
//
//
//        Person person3 = new Person();
//        person3.setAge(24);
//
//        person3.setName("Vishal");
//
//        List<String> subjects = new ArrayList<>();
//        subjects.add("Physics");
//        subjects.add("Maths");
//        subjects.add("Puzzles");
//
//        //Detect why it was saying that it is illegal way of starting the expression.
//        //person3.setMarks(["Physics" , "Maths" , "Puzzles"]);
//
//        person3.setMarks(subjects);
//
//        Map<String,String> l = new HashMap<>();
//
//        l.put("Akku Didi" ,  "Akku Didi is love");
//        l.put("Bullu didi" ,  "Bullu didi is also love");
//        l.put("gaurav Bhai" ,  "Gaurav bhai is also love");
//
//        person3.setLove(l);
//
//        Optional<MembershipStatus> lockin = Optional.ofNullable(MembershipStatus.ACTIVE);
//
//        person3.setLockinStatus(lockin);
//
//        Gson gson = new Gson();
//
//        //gson.toJson(person3, new FileWriter("/Users/vishal.jangid/Practice_java_concepts/src/main/java/com/flipkart/learnPickingDataFromJson/Person.json"));
//
//        try (FileWriter writer = new FileWriter("/Users/vishal.jangid/Practice_java_concepts/src/main/java/com/flipkart/learnPickingDataFromJson/Person.json")) {
//            gson.toJson(person3, writer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
////        setup_ok_case()
////        setupRequestContainer()
////        given:
////        DecisionEngineContext context = null
////        DecisionEngineRequest input = getObjectFromFile("src/test/resources/decisionEngineInput.json", new TypeReference<DecisionEngineRequest>() {
////        })
////
////        //To-Do : Adding lockinstatus directly in json
//////        Optional<MembershipStatus> lockinStatus = Optional.ofNullable(MembershipStatus.ACTIVATE_ELIGIBLE);
//////        input.setLockinStatus(lockinStatus);
////
////        DecisionEngineResponse output = new DecisionEngineResponse()
////        when:
////        decisionEngineGetActionImpl.apply(context, input, output)
////
////        then:
////        // COD checks
////        output.codFraudScoreEnum.name() == "NONE"
////        output.codExecutionPlan == "NO_FRICTION"
////        output.codCustomerFraud == false
////        output.isCodReviewedCustomer() == true
////
////        output.getItemLevelPaymentRecomendation().size() == 2
////        output.getItemLevelPaymentRecomendation().get("81852105034035200").getPaymentOptionEligibility() == "ENABLE_COD_WITH_CAPTCHA"
////        output.getItemLevelPaymentRecomendation().get("81852105034035200").getPaymentOptionExperience() == "NO_FRICTION"
////
////        output.getItemLevelPaymentRecomendation().get("81852105034035201").getPaymentOptionEligibility() == "ENABLE_COD_WITH_CAPTCHA"
////        output.getItemLevelPaymentRecomendation().get("81852105034035201").getPaymentOptionExperience() == "NO_FRICTION"
////
////        // bajaj checks
////        output.isBajajEnabled() == true
////        output.getBajajExecutionPlan() == "NONE"
////
////        //duplicate order checks
////        output.isDuplicateOrder() == false
////        output.getItemLevelRepeatRecommendationMap().size() == 2
////        output.getItemLevelRepeatRecommendationMap().get("81852105034035200").getRecommendation().name() == "NON_REPEATED_ITEM"
////        output.getItemLevelRepeatRecommendationMap().get("81852105034035201").getRecommendation().name() == "NON_REPEATED_ITEM"
////
////        //CancellationPolicyData Checks
////        output.getCancellationPolicyDataMap().size() == 1
////        output.getCancellationPolicyDataMap().containsKey("LSTGHEF8GYZPADV9H6W7XNDYW:VER-51123786007205350-180-1034153197:P:C-0012:U:SPCMS")
////        output.getCancellationPolicyDataMap().get("LSTGHEF8GYZPADV9H6W7XNDYW:VER-51123786007205350-180-1034153197:P:C-0012:U:SPCMS").isEligible()
////        output.getCancellationPolicyDataMap().get("LSTGHEF8GYZPADV9H6W7XNDYW:VER-51123786007205350-180-1034153197:P:C-0012:U:SPCMS").getFeesSortedList().size() == 2
//
//
//
////        def "buildDeRequest"() {
////            setup: "setup the input objects"
////            expect: "check output against input"
////            DecisionEngineRequest decisionEngineRequest = DecisionEngineUtils.buildDecisionEngineRequest(omsOrder,accountInfo,channel)
////
////            //Will remove this line after adding Optional type Object in expected_de_request.json
////            //output.setLockinStatus(Optional.ofNullable(MembershipStatus.ACTIVE))
////            TestHelper.compare(decisionEngineRequest, output)
//        }
//    }
//}
