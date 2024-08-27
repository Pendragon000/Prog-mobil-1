public class HighElf extends Elf {
    public HighElf(int force, int intelligence, int sagesse, int dexterite,
               int constitution, int charisme) {
        super(force, intelligence, sagesse, dexterite, constitution, charisme);
        this.intelligence++;
    }
}
