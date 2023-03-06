import RIKKEI.Student;

public class Test extends Student{
    public static void main(String[] args) {
    Test s1 = new Test();
        System.out.println("before change");
        System.out.println(s1.getName());
        System.out.println(s1.getClasses());
//        s1.setClasses("co1");
        s1.setName("ninh");
        System.out.println("after");
        System.out.println(s1.getName());
        System.out.println(s1.getClasses());
    }
}
