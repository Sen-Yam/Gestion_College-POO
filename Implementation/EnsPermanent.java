package Implementation;

import java.time.LocalDate;
import java.util.ArrayList;

public class EnsPermanent extends Enseignant {

    
    LocalDate Date_Rec;
     

    public EnsPermanent(String Mat , String N , String P , String A , String D , LocalDate D1 , Matiere M , ArrayList C) {
        super(Mat, N, P, A, D, C, M);
        this.Date_Rec=D1;
        
    }
    public void Afficher() {
        super.Afficher();
        System.out.println("Date de recrutement "+this.Date_Rec);
    }
    
}
