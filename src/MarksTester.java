public class MarksTester {
    public static void main(String[] args) {
        Marks[] marks={new StudentA(99,98,97), new StudentB(80,75,99,100)};
        for (int i = 0; i < marks.length; i++) {
            Marks marks1= marks[i];
            if(i==0) {
                System.out.println("Student A Percentage: " + marks1.getPercentage()+"%");
            }else {
                System.out.println("Student B Percentage: " + marks1.getPercentage()+"%");
            }
        }
    }

}
