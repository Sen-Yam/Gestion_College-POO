// LARABA Yamina Nesrine Acad B groupe 2 , matricule : 202031043730


package Implementation;

import java.util.ArrayList;

public class Classe {
    Niveau niveau;
    String Code;
    ArrayList <Enseignant> E ; 
    ArrayList <Seance> EmploiDuTemps;
    /*  les 2 listes ont la meme taille et elles sont convenables : 
    la 1ere seance de la 2eme liste est enseignee par le 1er enseignant de la 1ere liste ....etc
    c a dire E[i] est l'enseignant de la seance EmploiDuTemps[i]
    */
    public Classe(Niveau N , String C , ArrayList E , ArrayList S) {
        this.niveau=N;
        this.Code=C;
        this.E=E;
        this.EmploiDuTemps=S;

    }
}
