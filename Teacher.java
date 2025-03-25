class Teacher extends User {
    public Teacher(int id, String name, String email, String password) {
        super(id, name, email, password, Role.TEACHER);
    }

    public void addLesson() {
        System.out.println(getName() + " added a lesson.");
    }
    
    public void updateLesson() {
        System.out.println(getName() + " updated a lesson.");
    }
    
    public void deleteLesson() {
        System.out.println(getName() + " deleted a lesson.");
    }

    // Polymorphism (Overriding)
    @Override
    public void login() {
        System.out.println("Teacher " + getName() + " logged in with extra privileges.");
    }
}
