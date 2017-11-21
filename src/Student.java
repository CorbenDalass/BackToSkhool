public class Student extends Person {
    private String idNumber;
    private double gpa;

    public Student(String name, int age, String gender, String idNumber, double gpa) {
        super(name, age, gender);
        this.gpa = gpa;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", student ID: "+idNumber+ ", Gpa: " +gpa;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
