class Lesson {
    private int id;
    private String title;
    private String content;
    private String videoUrl;
    private int courseId;

    public Lesson(int id, String title, String content, String videoUrl, int courseId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.videoUrl = videoUrl;
        this.courseId = courseId;
    }
    
    public void accessLesson() {
        System.out.println("Accessing lesson: " + title);
    }
}