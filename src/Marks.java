/*
   We have to calculate the average of marks obtained in three subjects by student A and by student B.
   Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
   Provide implementation of abstract method in classes 'A' and 'B'.
   The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects
   as its parameters for student B. T
   Test your code
    */
public abstract class Marks {
    public double Math;
    public double Science;
    public double English;
    public double Spanish;
    abstract double getPercentage();
}
class StudentA extends Marks{
    StudentA(double Math, double Science, double English){
        this.Math = Math;
        this.Science = Science;
        this.English = English;
    }
    @Override
    double getPercentage() {
        double totalMarks = Math+Science+English;
        double totalPercentage = (totalMarks/300)*100;
        return totalPercentage;
    }
}
class StudentB extends Marks{
    StudentB(double Math, double Science, double English, double Spanish){
        this.Math = Math;
        this.Science = Science;
        this.English = English;
        this.Spanish = Spanish;
    }
    @Override
    double getPercentage() {
        double totalMarks = Math + Science + English + Spanish;
        double totalPercentage = (totalMarks / 400) * 100;
        return totalPercentage;
    }}
