//package ro.ase.exercitii.FactoryAbstract.Main;
//
//import ro.ase.exercitii.FactoryAbstract.Entity.FelDeMancare;
//import ro.ase.exercitii.FactoryAbstract.Factory.*;
//
//public class Main {
//    public static void main(String[] args) {
//        FelDeMancareFactory fabricaSupa = new SupaFactory();
//        FelDeMancare supaDeLegume = fabricaSupa.getFelDeMancare(TipSupa.LEGUME, "Cu carne", 20);
//        FelDeMancare supaDeVita = fabricaSupa.getFelDeMancare(TipSupa.VITA, "Cu Rosii", 30);
//        supaDeLegume.afiseazaFelDeMancare();
//        supaDeVita.afiseazaFelDeMancare();
//
//        FelDeMancareFactory fabricaDesert = new DesertFactory();
//        FelDeMancare papanasi = fabricaDesert.getFelDeMancare(TipDesert.PAPANASI, "Cu dulceata", 15, 200);
//        FelDeMancare clatite = fabricaDesert.getFelDeMancare(TipDesert.CLATITE, "Cu nutella" , 10, 150);
//        papanasi.afiseazaFelDeMancare();
//        clatite.afiseazaFelDeMancare();
//    }
//
//}
