package Ex2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.callSetName("duc");
        s1.callSetClasses("C06");
        System.out.println(s1.getName()+" : "+ s1.getClasses());
    }
}
