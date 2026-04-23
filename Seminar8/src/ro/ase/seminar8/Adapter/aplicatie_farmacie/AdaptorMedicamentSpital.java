package ro.ase.seminar8.Adapter.aplicatie_farmacie;

import ro.ase.seminar8.Adapter.aplicatie_spital.MedicamentSpital;

public class AdaptorMedicamentSpital extends MedicamentFarmacie{
    MedicamentSpital medicamentSpital;

    public AdaptorMedicamentSpital(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
