import java.util.*;
public abstract class colis implements Comparable<colis>  {


    
    private String code;
    private int poids;
    private boolean horsDakar;


    public colis( String code, int poids, boolean horsDakar){
        if(poids<=0)
            throw new IllegalArgumentException( "Le poids ne peut pas etre inferieur ou egal a 0");
         this.code=code;
         this.poids=poids;
         this.horsDakar=horsDakar;

         public String getCode(){
            return code;
         }
         public int getPoids(){
            return poids;
         }
         public boolean isHorsDakar(){
            return horsDakar;
         }
         
         public int tarif(){ 
            tarif_base=poids*Parametres.TARIF_KG;
            if(horsDakar=true)
                tarif_base= tarif_base+ Parametres.SURCHARGE_HORS_DAKAR;
            return tarif_base;

         }
         static abstract sigle(){
            return 
         }
    }


}
