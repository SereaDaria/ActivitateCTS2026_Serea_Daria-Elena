package ro.ase.seminar4.Singleton.clase;

public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;

    private static Logger instanta = null;

    private Logger(String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;
    }

    public int getCod() {
        return cod;
    }

    public String getSender() {
        return sender;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void afiseazaLog(String text){
        System.out.println("Log{ Id: " + cod + ", Sender: "
                + sender + ", Categorie: " + categorie + "\nText: " + text + "}" );
        this.cod++;
    }

    //thread singleton cu synchronized
    public static synchronized Logger getInstanta(String sender, String categorie) {
        if(instanta == null){
            instanta = new Logger(sender, categorie);
        }
        return instanta;
    }

}
