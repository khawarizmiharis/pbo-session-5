class Student extends User {
    public Student(int id, String name, String email, String password) {
        super(id, name, email, password, Role.STUDENT);
    }

    public void accessLesson() {
        System.out.println(getName() + " is accessing lessons.");
    }
    
    public void enrollStudent() {
        System.out.println(getName() + " enrolled in a course.");
    }
    
    public void unenrollStudent() {
        System.out.println(getName() + " unenrolled from a course.");
    }
}
