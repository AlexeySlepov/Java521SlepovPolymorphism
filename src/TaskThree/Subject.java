package TaskThree;

public class Subject {

    private String name;
    private String teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Subject(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Subject(String name) {
        this.name = name;
    }

    public Subject() {
    }

    public void study() {
        System.out.print("Предмет - " + name + ", учитель - " + teacher);
    }
}
