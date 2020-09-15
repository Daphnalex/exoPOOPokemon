public class ExecutablePokemon {
    public static void main(String[] args){
        Pokemon pokemon1 = new Pokemon("Bulbizarre",3,"plante");
        Pokemon pokemon2 = new Pokemon("Tortank",4,"eau");
        System.out.println(pokemon1.getNom());   
        System.out.println(pokemon2.getNom());
        System.out.println(pokemon1.getPV());
        System.out.println(pokemon2.getPV());
        System.out.println(pokemon1.getAttaque());
        System.out.println(pokemon2.getAttaque());
        System.out.println(pokemon1.getType());
        System.out.println(pokemon2.getType());
        pokemon1.evolue("Herbizarre",5);
        pokemon2.evolue("Toto",5);
        System.out.println(pokemon1.getNom());   
        System.out.println(pokemon2.getNom());
        System.out.println(pokemon1.getAttaque());
        System.out.println(pokemon2.getAttaque());
        System.out.println(pokemon1.estVaincu());
        System.out.println(pokemon2.estVaincu());
    }
}