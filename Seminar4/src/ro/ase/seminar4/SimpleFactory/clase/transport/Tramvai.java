package ro.ase.seminar4.SimpleFactory.clase.transport;

public class Tramvai implements MijlocTransport {
    private Integer nrLinie;
    private String marca;

    public Tramvai(Integer nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport(){
        StringBuilder sb = new StringBuilder();
        sb.append("Tramvai de pe linia ").append(this.nrLinie)
                .append(" este produs de ").append(this.marca);
        System.out.println(sb.toString());
    }
}
