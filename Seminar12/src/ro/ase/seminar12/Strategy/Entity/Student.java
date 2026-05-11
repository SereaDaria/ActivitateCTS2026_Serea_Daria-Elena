package ro.ase.seminar12.Strategy.Entity;

public class Student {
    private ModSustinere modSustinere;

    public Student(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public Student() {
        this.modSustinere = new Grila();
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }
}
