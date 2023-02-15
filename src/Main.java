public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother("mother",88,"black","black");
         Mother daughter = new Daughter("daughter",23,"black","black");
        System.out.println(mother.getNamee());
        System.out.println(daughter.getNamee());
    }
}