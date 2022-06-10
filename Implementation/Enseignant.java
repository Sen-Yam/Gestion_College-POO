package Implementation;

import java.util.ArrayList;

public class Enseignant {
    String Matricule , Nom , Prenom , Adresse , Diplome;
    ArrayList <Classe> C ; 
    Matiere Matiere;
    public Enseignant(String Mat , String N , String P , String A , String D , ArrayList C , Matiere M) {
        this.Adresse=A;
        this.C=C;
        this.Diplome=D;
        this.Matiere=M;
        this.Matricule=Mat;
        this.Nom=N;
        this.Prenom=P;
    }
    public void Afficher() {
        System.out.println("Matricule "+this.Matricule+" Nom "+this.Nom+" Prenom "+this.Prenom+" Adresse "+this.Adresse+" Diplome "+this.Diplome+" Matiere "+this.Matiere);
    }

    public boolean IntervenirDansTousLesNiveaux() {
        boolean I=false;
        
        boolean first=false , second = false , third = false , fourth = false; 
        for(int i =0 ; i<this.C.size() ; i++) {
            if(this.C.get(i).niveau.Numero==1 && first == false) {
                first=true;
            
            }
            else {
                if(this.C.get(i).niveau.Numero==2 && second == false) {
                    second = true;
                }
                else {
                    if(this.C.get(i).niveau.Numero==3 && third == false) {
                        third = true;
                    }
                    else {
                        if(this.C.get(i).niveau.Numero==4 && fourth == false) {
                            fourth = true;
                        }
                    }
                }
            }
        }
        if(first==true && second==true && third == true && fourth == true) {
            I=true;
        }
        return I;
    }
}
