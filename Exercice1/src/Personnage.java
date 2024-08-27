public abstract class Personnage {
    protected int force;
    protected int intelligence;
    protected int sagesse;
    protected int dexterite;
    protected int constitution;
    protected int charisme;

    protected Personnage(int force, int intelligence, int sagesse,
                         int dexterite, int constitution, int charisme) {
        this.force = force;
        this.intelligence = intelligence;
        this.sagesse = sagesse;
        this.dexterite = dexterite;
        this.constitution = constitution;
        this.charisme = charisme;
    }

}
