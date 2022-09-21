public class Main {

    public static void main(String[] args) {

        String student1 = "Engin";
        String student2 = "Derin";
        String student3 = "Salih";
        String student4 = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("--------------------");

        String[] students = new String[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("*****************");

        for (String student: students) {
            System.out.println(student);
        }
    }
}
