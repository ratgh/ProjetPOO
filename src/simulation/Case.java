package simulation;

public class Case {
    public enum NatureTerrain {EAU, FORET, ROCHE, TERRAIN_LIBRE, HABITAT}

    private int ligne;
    private int colonne;
    private NatureTerrain nature;

    public static boolean casesEgales(Case c1, Case c2) {
    	return ((c1.ligne == c2.ligne) && (c1.colonne == c2.colonne));
    }

    public Case()
    {
      this.ligne = 0;
      this.colonne = 0;
      this.nature = NatureTerrain.TERRAIN_LIBRE;
    }

    public Case(int ligne, int colonne, NatureTerrain nature)
    {
        this.ligne = ligne;
        this.colonne = colonne;
        this.nature = nature;
    }

    public int getLigne()
    {
        return ligne;
    }

    public int getColonne()
    {
        return colonne;
    }

    public NatureTerrain getNature()
    {
        return nature;
    }
}
