package test_folder_practise.otwani;

public class GradeCalculator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int math = 85;
        int science = 90;
        int english = 78;
        float percentage;
        String Grade;

        System.out.println("Marks in Math:" + math);
        System.out.println("Marks in Science:" + science);
        System.out.println("Marks in English:" + english);
        percentage = (math + science + english) / 3.0f;
        System.out.println("Total Percentage:" + percentage);
        if (percentage >= 90) {
            Grade = "A";
        } else if (percentage >= 80) {
            Grade = "B";
        } else if (percentage >= 70) {
            Grade = "C";
        } else if (percentage >= 60) {
            Grade = "D";
        } else {
            Grade = "Fail";
        }

        if (Grade.equalsIgnoreCase("Fail")) {
            System.out.print("Your Grade is:" + Grade + "(because one subject has less than 35 marks)");
        } else {
            System.out.print("Your Grade is:" + Grade);
        }
    }

}
