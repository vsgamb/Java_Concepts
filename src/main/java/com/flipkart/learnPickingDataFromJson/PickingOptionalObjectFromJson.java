//package com.flipkart.learnPickingDataFromJson;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
//import java.io.FileReader;
//import java.util.Iterator;
//
//public class PickingOptionalObjectFromJson {
//
//    public static void main(String[] args) {
//        JSONParser parser = new JSONParser();
//        try {
//            Object obj = parser.parse(new FileReader("/Users/vishal.jangid/Practice_java_concepts/src/main/java/com/flipkart/learnPickingDataFromJson/StudentObject.json"));
//
//            // A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
//            JSONObject jsonObject = (JSONObject) obj;
//
//            // A JSON array. JSONObject supports java.util.List interface.
//         //   JSONArray companyList = (JSONArray) jsonObject.get("age");
//
//            // An iterator over a collection. Iterator takes the place of Enumeration in the Java Collections Framework.
//            // Iterators differ from enumerations in two ways:
//            // 1. Iterators allow the caller to remove elements from the underlying collection during the iteration with well-defined semantics.
//            // 2. Method names have been improved.
//
//            System.out.println(obj);
//            System.out.println(jsonObject);
//            System.out.println(jsonObject.get("name"));
//            System.out.println(jsonObject.get("company").getClass().getName());
//
//
//
////            Iterator<JSONObject> iterator = companyList.iterator();
////            while (iterator.hasNext()) {
////                System.out.println(iterator.next());
////            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
