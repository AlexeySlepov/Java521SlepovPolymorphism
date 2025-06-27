package TaskThree;

public class Science extends Subject {

    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Science(String teacher, String type) {
        setName("Science");
        setTeacher(teacher);
        this.type = type;
    }

    public void study() {
        super.study();
        System.out.print(", тип научного предмета - " + type + "\n");
    }
}
