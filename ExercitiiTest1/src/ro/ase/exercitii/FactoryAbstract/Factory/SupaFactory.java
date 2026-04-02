//package ro.ase.exercitii.FactoryAbstract.Factory;
//
//import ro.ase.exercitii.FactoryAbstract.Entity.FelDeMancare;
//import ro.ase.exercitii.FactoryAbstract.Entity.SupaDeLegume;
//import ro.ase.exercitii.FactoryAbstract.Entity.SupaDeVita;
//
//public class SupaFactory implements FelDeMancareFactory {
//
//    @Override
//    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, String nume, float pret) {
//        return switch(tip){
//            case TipSupa.LEGUME -> new SupaDeLegume(nume, pret);
//            case TipSupa.VITA->new SupaDeVita(nume, pret);
//            default -> null;
//        };
//    }
//
//    @Override
//    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, String nume, float pret, int cantitate) {
//        return this.getFelDeMancare(tip, nume, pret);
//    }
//}
