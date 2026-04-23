package ro.ase.seminar8.Adapter.main;

import ro.ase.seminar8.Adapter.aplicatie_farmacie.AdaptorMedicamentSpital;
import ro.ase.seminar8.Adapter.aplicatie_farmacie.MedicamentFarmacie;
import ro.ase.seminar8.Adapter.aplicatie_spital.MedicamentSpital;

public class Main {
    public static void realizeazaAchizitie(MedicamentFarmacie medicamentFarmacie) {
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentSpital paracetamol = new MedicamentSpital();
        MedicamentFarmacie nurofen = new MedicamentFarmacie();

        paracetamol.achizitioneazaMedicament();
        nurofen.cumparaMedicament();

        realizeazaAchizitie(nurofen);
//        realizeazaAchizitie(paracetamol);
        //daca avem mai  multe clase, suntem obligati sa facem adapter de obiecte, deoarece
        //adapterul nu poate mosteni 2 clase in java

        AdaptorMedicamentSpital paracetamolAdaptat = new AdaptorMedicamentSpital(paracetamol);
        realizeazaAchizitie(paracetamolAdaptat);
    }
}
