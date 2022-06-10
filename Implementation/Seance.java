package Implementation;

public class Seance {
    Jours Jour;
    int Creneau;
    Salle Salle;
    Matiere Matiere;

    public Seance(Jours j , int C , Salle S , Matiere M) {
        this.Creneau=C;
        this.Jour=j;
        this.Salle=S;
        this.Matiere=M;
    }

    public Seance Comparaison(Seance S1 , Seance S2) {
        Seance S = new Seance(S1.Jour , S1.Creneau , S1.Salle , S1.Matiere);


        for(Jours jour : Jours.values()) {
            if(jour == S1.Jour && jour !=S2.Jour) {
                
            }
            else {
                if(jour != S1.Jour && jour ==S2.Jour) {
                    S=S2;
                   
                }
                else {
        
                  
                        if (S1.Creneau > S2.Creneau) {
                            S=S2;
                        }
                        
                       
                    
                    
                }
            }
        }





        
        return S;
    }
}
