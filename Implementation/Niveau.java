package Implementation;

import java.util.ArrayList;

public class Niveau {
    int Numero ; 
     ArrayList <Matiere> M ;

     public boolean equals(Niveau N1  , Niveau N2) {
         boolean B = false;
         if(N1.Numero== N2.Numero) {
             B=true;
         }
         return B;
     }
}
