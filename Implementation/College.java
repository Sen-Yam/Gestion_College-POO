package Implementation;

import java.util.ArrayList;

public class College {
    ArrayList <Enseignant> Enseignant;
    ArrayList <Classe> Classe;
    ArrayList <Salle> Salle;

    public College(ArrayList E , ArrayList C , ArrayList S) {
        this.Classe=C;
        this.Enseignant=E;
        this.Salle=S;
    }
    public int NbrClasse() {
        return this.Classe.size();
    }
    public ArrayList EnsP() {
        ArrayList <EnsPermanent> Ens = new  ArrayList <EnsPermanent> ();
        for(int i =0 ; i<this.Enseignant.size() ; i++) {
            if(this.Enseignant.get(i) instanceof EnsPermanent) {
                boolean E = Ens.add((EnsPermanent) this.Enseignant.get(i) );
            }
        }
        return Ens;
    }
    public void Afficher() {
        System.out.println("La liste des enseignants qui interviennent dans tous les niveaux est : ");
        for(int i =0 ; i<this.Enseignant.size() ; i++) {
            if(this.Enseignant.get(i).IntervenirDansTousLesNiveaux()==true) {
                this.Enseignant.get(i).Afficher();
            }
        }
    }

    public void ClassePaNiveau() {
        int first = 0 , second = 0 , third = 0 , fourth = 0;
        for(int i =0 ; i<this.Classe.size();i++) {
            if(this.Classe.get(i).niveau.Numero==1) {
                first++;
            }
            else {
                if(this.Classe.get(i).niveau.Numero==2) {
                    second++;
                }
                else {
                    if(this.Classe.get(i).niveau.Numero==3) {
                        third++;
                    }
                    else {
                        fourth++;
                    }
                }
            }
        }
        System.out.println("Nombre des classes par niveau : ");
        System.out.println("Niveau 1 : "+first+" classes");
        System.out.println("Niveau 2 : "+second+" classes");
        System.out.println("Niveau 3 : "+third+" classes");
        System.out.println("Niveau 4 : "+fourth+" classes");



    }

    public Object Libre(Classe C) {
        int Array []= new int[100];
        int index=0;
        for(int i =0 ; i<C.E.size() ; i++) {
            if(C.E.get(i)==null) {
                Array[index]=C.EmploiDuTemps.get(i).Creneau;
                index++;
            }
        }


        return Array;
    }

    public void Horaire() {
        for(int i =0;i<this.Enseignant.size();i++) {
            if(this.Enseignant.get(i) instanceof EnsPermanent) {
                int H = 0;
                for(int j=0;j<this.Classe.size();j++) {
                    for(int k =0;k<this.Classe.get(j).E.size() ; k++) {
                        if(this.Classe.get(j).E.get(k).Matricule==this.Enseignant.get(i).Matricule) {
                            H++;
                        }
                    }
                  }
                  System.out.println("Ensegnant : ");
                  this.Enseignant.get(i).Afficher();
                  System.out.println("Volume horaire hebdomadaire : "+H);
            }
        }
    }
}
