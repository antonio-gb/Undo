public class ControlRemoto {
    Comando slot;


    public ControlRemoto ( ){}

    public void setCommand(Comando Comando){
slot = Comando;
    }
    public void buttonWasPressed(){
      slot.execute();
    }
    }

