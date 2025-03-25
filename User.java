abstract class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private Role role;

    public User(int id, String name, String email, String password, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // Getters & Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    // Common Methods
    public void register() {
        System.out.println(name + " has registered.");
    }
    
    public void login() {
        System.out.println(name + " has logged in.");
    }
    
    public void logout() {
        System.out.println(name + " has logged out.");
    }
}
