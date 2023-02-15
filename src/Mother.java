public class Mother {
    private  String name;
    private int age;
    private String eye;
    private String color;

    public Mother(String name, int age, String eye, String color) {
        this.name = name;
        this.age = age;
        this.eye = eye;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNamee() {
        return
                "name='" + name + " this is mother" +
                "";
    }
}
