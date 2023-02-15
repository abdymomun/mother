public class Daughter extends Mother{
    private String hair;
    private String color;
    private String heigh;

    public Daughter(String name, int age, String eye, String color) {
        super(name, age, eye, color);
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String getHeigh() {
        return heigh;
    }

    public void setHeigh(String heigh) {
        this.heigh = heigh;
    }

    @Override
    public String getNamee() {
        return  "this is daugher";
    }
}
