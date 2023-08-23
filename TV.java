public class TV {
    String location;
    int channel;

    public TV(String location){
        this.location = location;
    }

    public void on(){
        System.out.println("La televisión fue encendida");
    }
    public void off(){
        System.out.println("La televisión fue apagada");
    }
    public void setChannel(){
        this.channel=3;
        System.out.println("Se ha puesto el canal 3");
    }
}
