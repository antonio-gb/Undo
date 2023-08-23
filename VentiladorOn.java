public class VentiladorOn implements Comando {
    Ventilador ventilador;

    public VentiladorOn(Ventilador ventilador){
        this.ventilador=ventilador;
    }

    public void execute(){
        ventilador.on();
    }
}
