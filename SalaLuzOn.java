public class SalaLuzOn implements Comando {
    Luz luz;

    public SalaLuzOn(Luz luz){
        this.luz=luz;
    }

    public void execute(){
        luz.on();
    }
}
