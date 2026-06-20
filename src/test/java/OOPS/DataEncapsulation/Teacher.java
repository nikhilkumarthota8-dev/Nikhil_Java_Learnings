package OOPS.DataEncapsulation;

public class Teacher {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Nikhil");
        System.out.println(s.getName());
        s.setEmail("NikhilkumarThota7@gmail.com");
        System.out.println(s.getEmail());

        Student s1 = new Student();
        s1.setName("Kohli");
        System.out.println(s1.getName());
        s1.setEmail("Kohli@gmail.com");
        System.out.println(s1.getEmail());

    }
}
