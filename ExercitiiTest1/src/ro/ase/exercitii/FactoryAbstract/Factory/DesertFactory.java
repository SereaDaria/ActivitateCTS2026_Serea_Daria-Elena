//package ro.ase.exercitii.FactoryAbstract.Factory;
//
//import ro.ase.exercitii.FactoryAbstract.Entity.Clatite;
//import ro.ase.exercitii.FactoryAbstract.Entity.FelDeMancare;
//import ro.ase.exercitii.FactoryAbstract.Entity.Papanasi;
//
//public class DesertFactory implements FelDeMancareFactory {
//
//
//    @Override
//    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, String nume, float pret) {
//       return this.getFelDeMancare(tip, nume, pret, 200);
//    }
//
//    @Override
//    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, String nume, float pret, int cantitate) {
//       return switch(tip){
//           case TipDesert.PAPANASI->new Papanasi(nume, pret, cantitate);
//           case TipDesert.CLATITE->new Clatite(nume, pret, cantitate);
//           default->null;
//       };
//
//    }
//}
