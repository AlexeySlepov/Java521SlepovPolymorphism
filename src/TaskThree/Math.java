package TaskThree;

public class Math extends Subject {

    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Math(String teacher, String type) {
        setName("Math");
        setTeacher(teacher);
        this.type = type;
    }

    public void study() {
        super.study();
        System.out.print(", дисциплина - " + type + "\n");
    }
}
