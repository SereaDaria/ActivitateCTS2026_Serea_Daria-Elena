package ro.ase.seminar4.SimpleFactory.clase.transport;

public class Troleibuz implements MijlocTransport {
    private Integer nrLinie;
    private String marca;

    public Troleibuz(Integer nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport(){
        StringBuilder sb = new StringBuilder();
        sb.append("Troleibuz de pe linia ").append(this.nrLinie)
                .append(" este produs de ").append(this.marca);
        System.out.println(sb.toString());
    }}
