package ro.ase.seminar1.animale;

public class Lion extends Animal {
    private int kg;

    public Lion(String name, int age, int kg) {
        super(name, age);
        this.kg = kg;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Leul a mancat "+ mancare);

    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Leu: ");
        buffer.append(super.toString());
        buffer.append("greutate = ");
        buffer.append(this.kg);
        return buffer.toString();
    }
}
