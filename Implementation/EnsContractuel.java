package Implementation;

import java.time.LocalDate;
import java.util.ArrayList;

public class EnsContractuel extends Enseignant {
    
    LocalDate Date_Debut;
    LocalDate Date_Fin;
   

    public EnsContractuel(String Mat , String N , String P , String A , String D , LocalDate D1 , LocalDate D2 , Matiere M , ArrayList C) {
        super(Mat, N, P, A, D, C, M);
        this.Date_Fin= D2;
        this.Date_Debut=D1;
        
    }
    public void Afficher() {
        super.Afficher();
        System.out.println("Date debut "+this.Date_Debut+" Date Fin "+this.Date_Fin);
    }
    
}
