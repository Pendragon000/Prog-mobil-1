public class Main {

    static Personnage personnage;

    public static void main(String[] args) {
        System.out.println("Veuillez entrer le numéros de la race choisi");
        System.out.println("1. Elf");
        System.out.println("2. High Elf");
        System.out.println("3. Wood Elf");
        personnage = new Elf(12, 12, 12, 12, 12, 12);
    }
    private static void afficherPersonnage(Personnage p) {

    }

}