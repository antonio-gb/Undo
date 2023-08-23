public class StereoOffComando implements Comando {
    Stereo stereo;

    public StereoOffComando(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.off();
        
    }
}
