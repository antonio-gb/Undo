public class LuzEnComando implements Comando{
    Luz luz;

    public LuzEnComando(Luz luz){
        this.luz = luz;
    }

    public void execute(){
        luz.on();
    }
}
