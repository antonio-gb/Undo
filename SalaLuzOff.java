public class SalaLuzOff implements Comando {
    Luz luz;

    public SalaLuzOff(Luz luz){
        this.luz=luz;
    }

    public void execute(){
        luz.off();
    }
}
