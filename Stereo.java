public class Stereo {
    String location;
    public Stereo(String location){
        this.location = location;
    }

    public void on(){
        System.out.println("El stereo de la "+ location + " Se ha encendido ");
    }
     public void off(){
        System.out.println("El stereo de la " +location + " Se ha apagado ");
    }
     public void setCD(){
        System.out.println( " Se ha puesto un CD en el stereo de la " +location);
    }
    public void setRadio(){
        System.out.println("Se ha puesto la radio en el stereo de la "+ location);
    }
    public void setDVD(){
        System.out.println("Se ha puesto un DVD en el stereo de la "+ location );
    }
     public void setVolume(int volumen){
        System.out.println("El volumen en el stereo de la " +location+" fui subido a " +volumen);
    }

}
