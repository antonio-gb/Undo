public class ComandoGarage implements Comando{
    PuertaGarage puerta;

    public ComandoGarage(PuertaGarage puerta){
        this.puerta = puerta;
    }
    public void execute(){
        puerta.up();
    }
}
