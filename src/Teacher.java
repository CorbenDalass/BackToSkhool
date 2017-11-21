import javax.security.auth.Subject;

public class Teacher extends Person {
    private double salary;
    private String subject;
    public static final String[] SUBJECTS = {"Computer Science", "Chemistry", "English", "Other"};
    public static final double[] SALARIES = {6000, 8000, 16000, 14000};
    public Teacher( String name,int age,String gender,String subject){
        super(name, age, gender);
        this.subject=subject;
        for (int schetchik=0;schetchik<SUBJECTS.length;schetchik++){
            if (subject.equals(SUBJECTS[schetchik])){
                this.salary=SALARIES[schetchik];
            }
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject+ " ,salaries: " + salary;
    }
}
