public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Mr. John", "john@example.com", "password123");
        Student student = new Student(2, "Alice", "alice@example.com", "password456");

        // Demonstration of Inheritance & Encapsulation
        teacher.register();
        student.register();

        // Demonstration of Polymorphism (Overriding)
        teacher.login(); // Overridden Method
        student.login(); // Inherited Method
        
        // Demonstration of Polymorphism (Overloading)
        Lesson lesson = new Lesson(101, "Java Basics", "Introduction to Java", "java_video.mp4", 1);
        lesson.accessLesson();
        
        // Demonstration of Class Functions
        teacher.addLesson();
        student.accessLesson();
    }
}