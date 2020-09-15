public class Pokemon{
    /**
    @param nom
    Nom du Pokémon
    */
     private String nom;

    /**
     @param pv
     Nombre de points de vie du Pokémon
    */
     private int pv = 50;

    /**
    @param attaque
    Nombre d'attaque du Pokémon
     */
     private int attaque;

    /**
     @param type
     Type de pokémon
    */
    private String type; 

    /** 
        Constructeur de pokémon
        Instancie le nom et le nombre d'attaque du pokémon
     */
    public Pokemon(String nom, int attaque){
        this.nom = nom;
        this.attaque = attaque;
    }


    /** 
        Constructeur de pokémon
        Instancie le type du pokémon
     */
    public Pokemon(String nom, int attaque, String type){
        this(nom,attaque);
        this.type = type;
    }

    /**
    Méthode qui Renvoie le nom du pokémon
    @return nom
     */
     public String getNom(){
         return this.nom;
     }

     /**
     Méthode qui renvoie le nombre de points de vie
     @return pv
      */

      public int getPV(){
          return this.pv;
      }

      /** 
      Méthode qui renvoie le nombre d'attaque
      @return attaque
      */
      public int getAttaque(){
          return this.attaque;
      }

      /**
      Méthode qui renvoie le type du Pokémon
      @return type
       */
       public String getType(){
           return this.type;
       }

       /**
       la méthode evolue(nouveauNom, nouvelleAttaque) 
       permet de modifier le nom et la valeur d'attaque du Pokemon.
        */
        public void evolue(String nouveauNom, int nouvelleAttaque){
            this.nom = nouveauNom;
            this.attaque = nouvelleAttaque;
        }
        /**
        la méthode ``estVaincu()`` renvoie ``true`` si les points de vie (``pv``) 
        du Pokemon sont inférieurs à zéro, et ``false`` sinon.
         */
        public boolean estVaincu(){
            if(this.pv == 0) return true;
            else return false;
        }
        /** la méthode ``seSoigne()`` prend en paramètre un entier ``soin`` qui représente
         le nombre de pv que regagne le Pokemon (dans la limite de 50) */
        public void seSoigne(int soin){
            
        }
}  