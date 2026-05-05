package ro.ase.seminar11.Command.command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<ICommand> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void invoca(ICommand command){
        comenzi.add(command);
    }

    public void executaComanda(){
        if(comenzi.size()>0){
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}
