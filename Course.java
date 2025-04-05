
public class Course {

    // Class attributes
    private String courseName;
    private String courseCode;

    // Constructor using the "this" keyword to differentiate class attributes from parameters
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;  // "this.courseName" refers to the class attribute, while "courseName" refers to the constructor parameter
        this.courseCode = courseCode;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    public static void main(String[] args) {
        // Create an object of the Course class
        Course course1 = new Course("Introduction to Java", "CSE101");

        // Display the course details
        course1.displayCourseDetails();
    }
}
