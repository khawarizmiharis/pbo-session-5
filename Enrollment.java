class Enrollment {
    private int id;
    private int studentId;
    private int courseId;
    private String enrolledDate;

    public Enrollment(int id, int studentId, int courseId, String enrolledDate) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrolledDate = enrolledDate;
    }
    
    public void enrollStudent() {
        System.out.println("Student ID " + studentId + " enrolled in course ID " + courseId);
    }
    
    public void unenrollStudent() {
        System.out.println("Student ID " + studentId + " unenrolled from course ID " + courseId);
    }
}