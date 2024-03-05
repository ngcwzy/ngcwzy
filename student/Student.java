import java.util.Arrays;

public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public Student(String studentID, String studentName, int numberOfExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numberOfExtraActivities];
    }

    public void addExtraActivity(String activity) {
        for (int i = 0; i < extraActivities.length; i++) {
            if (extraActivities[i] == null) {
                extraActivities[i] = activity;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + "\n" +
               "Student Name: " + studentName + "\n" +
               "Extra Activities: " + Arrays.toString(extraActivities) + "\n";
    }

    // Getters and setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }
}