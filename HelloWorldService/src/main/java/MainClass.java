public class MainClass {
    public static void main(String[] args) {

    SmallPojo smallPojo=new SmallPojo();
    smallPojo.setAge(23);
    smallPojo.setName("Vishal");


    smallPojo.setHeight(10.5);


    System.out.println("Hi Everyone !!");
    System.out.println("Name is : " + smallPojo.getName());
    System.out.println("Age is : " + smallPojo.getAge());


    System.out.println("he : "+ smallPojo.getHeight());


    }
}
