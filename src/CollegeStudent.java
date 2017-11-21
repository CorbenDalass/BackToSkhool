public class CollegeStudent extends Student {
    private int year;
    private String major;
    public static final String[] MAJORS = {"Electrical Engineering", "Communications", "Undeclared"};

    @Override
    public String toString() {
        return super.toString()+ ", Year: " + year + ", major: " + major;
    }

    public CollegeStudent(String name, int age, String gender, String idNumber, double gpa, int year, String major) {
        super(name, age, gender, idNumber, gpa);
        this.major=major;
        this.year=year;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
