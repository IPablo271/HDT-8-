//Nombre Pablo Daniel Gonzalez Ramos
//Carnet: 20362
//Universidad del Valle de Guatemala
//Hoja de Trabajo 8 que gestiona la cola de un hospital por medio de una cola prioritaria
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class main {
    public static void main(String[] args) throws FileNotFoundException {
        //Intsancias de PriorityQueve
        VectorHeap V_Heap = new VectorHeap();
        PriorityQueue<Paciente> priority=new PriorityQueue<Paciente>();
        //Listas para la division del archivo
        ArrayList<String> primeradivision=new ArrayList<String>();
        ArrayList<String[]> segundadivision=new ArrayList<>();
        //Leer el archivo txt
        File file=new File("pacientes.txt");
        Scanner scan=new Scanner(file);
        Scanner scan2 = new Scanner(System.in);
        String filecontent="";
        while(scan.hasNext()){
            filecontent=filecontent.concat(scan.nextLine()+"\n");
        }
        String[] arr=filecontent.split("\n");//Dividir el primer archivo en una lista donde el parametro de division es cada linea
        for(int i=0;i<arr.length;i++){
            String a=arr[i];
            primeradivision.add(a);
        }
        for(int c=0;c<primeradivision.size();c++){//Dividir cada en linea en las 3 palabras que contiene el archivo.
            String a=primeradivision.get(c);
            String[] arr2=a.split(",");
            segundadivision.add(arr2);
        }
        for(int i=0;i<segundadivision.size();i++) {
            String sublista[] = segundadivision.get(i);//Crear una sublista
            String uno = sublista[0];//Nombre del paciente
            String dos = sublista[1];//Enfermedad o padecimiento
            String tres = sublista[2];//Tipo de prioridad
            Paciente p=new Paciente(uno,dos,tres);//Se crea la instancia de paciente
            V_Heap.add(p);//Se agrega al heap
            priority.add(p);//Se agrega a la cola de prioridad
        }
        boolean rungeneral=true;
        while(rungeneral){
            System.out.print("\nBienvenido al programa...");
            System.out.print("\n1 Visualizar lista de espera");
            System.out.print("\n2.Salir del programa");
            System.out.print("\nIngrese su opcion: ");
            int h=scan2.nextInt();

            if(h==1){
                //Opcion 1
                boolean subrun=true;
                while(subrun){
                    try{
                        System.out.print("\n1.Usar Priority heap");
                        System.out.print("\n2.Usar java collections framework");
                        System.out.print("\nIngrese su opcion: ");
                        int c=scan2.nextInt();
                        if(c==1){
                            int y = V_Heap.size();
                            while(y !=0){
                                System.out.println("Los datos del paciente son: "+V_Heap.remove().toString());
                                y--;
                            }
                            subrun=false;

                        }
                        if(c==2){
                            int y = priority.size();
                            while(y !=0){
                                System.out.println("Los datos del paciente son: "+priority.remove().toString());
                                y--;
                            }
                            subrun=false;

                        }
                        else{
                            System.out.print("Ingrese un valor que este dentro de las opciones");

                        }

                    }
                    catch(InputMismatchException e){
                        System.out.print("Ingrese un valor numerico");
                        subrun=false;

                    }

                }



            }
            if(h==2){
                System.out.print("Saliendo del programa");
               break;
            }
            else{
                System.out.print("Ingrese una opcion valida");
            }


        }





    }
}
