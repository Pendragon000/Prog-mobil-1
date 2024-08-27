public class Elf extends Personnage {
    public Elf(int force, int intelligence, int sagesse, int dexterite,
               int constitution, int charisme) {
        super(force, intelligence, sagesse, dexterite, constitution, charisme);
        this.dexterite += 2;
    }
}
