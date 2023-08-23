import java.util.Scanner;
import java.util.Stack;

public class Control {
    public static void main(String[] args){
        int opcion=0;
        int ultAccion = 0;
        Scanner c = new Scanner(System.in); 
        Stack<Integer> pila = new Stack<Integer>();
        
        ControlRemoto remote = new ControlRemoto();
        //ControlRemoto [] arregloDeControl = new ControlRemoto[4];  
        Luz luz = new Luz();
        LuzEnComando luzOn = new LuzEnComando(luz);
        LuzOffComando luzOff = new LuzOffComando(luz);
        PuertaGarage puerta = new PuertaGarage();
        ComandoGarage puertaOn = new ComandoGarage(puerta) ;
        ComandoGarageCerrar puertaOff = new ComandoGarageCerrar(puerta);
        Stereo stereo = new Stereo("Sala");
        StereoOnComando StereoOn = new StereoOnComando(stereo);
        StereoOffComando StereoOff = new StereoOffComando(stereo);
        SalaLuzOn luzEnc = new SalaLuzOn(luz);
        SalaLuzOff luzApa = new SalaLuzOff(luz);
        Yacuzzi yacuzzi = new Yacuzzi();
        YacuzziOn yaOn = new YacuzziOn(yacuzzi);
        YacuzziOff yaOff = new YacuzziOff(yacuzzi);
        TV tv = new TV("Cuarto");
        TVOn tvon = new TVOn(tv);
        TVOff tvoff = new TVOff(tv);
        Ventilador ventilador = new Ventilador();
        VentiladorOn von = new VentiladorOn(ventilador);
        VentiladorOff voff = new VentiladorOff(ventilador);


do{
System.out.println("\n Elíge la opción que deseas: \n 1. Encender la luz \n 2. Apagar Luz \n 3. Abrir Puerta \n 4. Cerrar Puerta \n 5. Encender Stereo \n 6. Apagar Stereo \n 7. Encender luz de la Sala \n 8. Apagar luz de la sala \n 9. Encender yacuzzi \n 10. Apagar yacuzzi  \n 11. Encender TV \n 12. Apagar TV \n 13. Encender Ventilador \n 14. Apagar Ventilador \n 15. Undo \n 16. Salir \n");
opcion = c.nextInt();

switch(opcion){
        case 1:
        remote.setCommand(luzOn);
        remote.buttonWasPressed();
        pila.push(1);
        break;
        case 2:
        remote.setCommand(luzOff);
        remote.buttonWasPressed();
        pila.push(2);
        break;
        case 3:
        remote.setCommand(puertaOn);
        remote.buttonWasPressed();
        pila.push(3);
        break;
        case 4:
        remote.setCommand(puertaOff);
        remote.buttonWasPressed();
        pila.push(4);
        break;
        case 5:
        remote.setCommand(StereoOn);
        remote.buttonWasPressed();
        pila.push(5);
        break;
        case 6:
        remote.setCommand(StereoOff);
        remote.buttonWasPressed();
        pila.push(6);
        break;
        case 7:
        remote.setCommand(luzEnc);
        remote.buttonWasPressed();
        pila.push(7);
        break;
        case 8:
        remote.setCommand(luzApa);
        remote.buttonWasPressed();
        pila.push(8);
        break;
        case 9: 
        remote.setCommand(yaOn);
        remote.buttonWasPressed();
        pila.push(9);
        break;
        case 10: 
        remote.setCommand(yaOff);
        remote.buttonWasPressed();
        pila.push(10);
        break; 
        case 11:
        remote.setCommand(tvon);
        remote.buttonWasPressed();
        pila.push(11);
        break;
        case 12:
        remote.setCommand(tvoff);
        remote.buttonWasPressed();
        pila.push(12);
        break;
        case 13:
        remote.setCommand(von);
        remote.buttonWasPressed();
        pila.push(13);
        break;
        case 14:
        remote.setCommand(voff);
        remote.buttonWasPressed();
        pila.push(14);
        break;
        case 15:
        ultAccion = pila.peek();
        pila.pop();
        if(ultAccion == 1){
        remote.setCommand(luzOff);
        remote.buttonWasPressed();
         pila.push(2);
        }
            if(ultAccion == 2){
            remote.setCommand(luzOn);
            remote.buttonWasPressed();
             pila.push(1);
            }
                if(ultAccion == 3){
                remote.setCommand(puertaOff);
                remote.buttonWasPressed();
                 pila.push(4);
                }
                    if(ultAccion == 4){
                    remote.setCommand(puertaOn);
                    remote.buttonWasPressed();
                     pila.push(3);
                    }
                        if(ultAccion == 5){
                        remote.setCommand(StereoOff);
                        remote.buttonWasPressed();
                         pila.push(6);
                        }
                            if(ultAccion == 6){
                            remote.setCommand(StereoOn);
                            remote.buttonWasPressed();
                             pila.push(5);
                            }
                                if(ultAccion == 7){
                                remote.setCommand(luzApa);
                                remote.buttonWasPressed();
                                 pila.push(8);
                                }
                                    if(ultAccion == 8){
                                    remote.setCommand(luzEnc);
                                    remote.buttonWasPressed();
                                     pila.push(7);
                                    }
                                        if(ultAccion == 9){
                                        remote.setCommand(yaOff);
                                        remote.buttonWasPressed();
                                         pila.push(10);
                                        }
                                             if(ultAccion == 10){
                                             remote.setCommand(yaOn);
                                            remote.buttonWasPressed();
                                             pila.push(9);
                                            }
                                                if(ultAccion == 11){
                                                    remote.setCommand(tvoff);
                                                    remote.buttonWasPressed();
                                                     pila.push(12);
                                                    }
                                                        if(ultAccion == 12){
                                                            remote.setCommand(tvon);
                                                            remote.buttonWasPressed();
                                                             pila.push(11);
                                                        }
                                                                if(ultAccion == 13){
                                                                remote.setCommand(voff);
                                                                remote.buttonWasPressed();
                                                                 pila.push(14);
                                                                }
                                                                    if(ultAccion == 14){
                                                                    remote.setCommand(von);
                                                                    remote.buttonWasPressed();
                                                                     pila.push(13);
                                                                    }
        break;
        case 16: 

        break;
        }
    }while(opcion != 16);
    }
}
