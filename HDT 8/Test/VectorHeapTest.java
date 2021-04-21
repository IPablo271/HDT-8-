import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VectorHeapTest {
    VectorHeap v_Heap=new VectorHeap();
    ArrayList<String> primeradivision=new ArrayList<String>();
    ArrayList<String[]> segundadivision=new ArrayList<>();

    @org.junit.jupiter.api.Test
    void add() {
        String a="Juan Perez, fractura de pierna, C";
        String[] arr=a.split("\n");//Dividir el primer archivo en una lista donde el parametro de division es cada linea
        for(int i=0;i<arr.length;i++){
            String c=arr[i];
            primeradivision.add(c);
        }
        for(int c=0;c<primeradivision.size();c++){//Dividir cada en linea en las 3 palabras que contiene el archivo.
            String b=primeradivision.get(c);
            String[] arr2=b.split(",");
            segundadivision.add(arr2);
        }
        for(int i=0;i<segundadivision.size();i++) {
            String sublista[] = segundadivision.get(i);//Crear una sublista
            String uno = sublista[0];//Nombre del paciente
            String dos = sublista[1];//Enfermedad o padecimiento
            String tres = sublista[2];//Tipo de prioridad
            Paciente p=new Paciente(uno,dos,tres);//Se crea la instancia de paciente
            v_Heap.add(p);

        }
        assertEquals(false,v_Heap.isEmpty());

    }

    @org.junit.jupiter.api.Test
    void remove() {
        String a="Juan Perez, fractura de pierna, C";
        String pal="Juan Perez,  fractura de pierna,  C";
        String[] arr=a.split("\n");//Dividir el primer archivo en una lista donde el parametro de division es cada linea
        for(int i=0;i<arr.length;i++){
            String c=arr[i];
            primeradivision.add(c);
        }
        for(int c=0;c<primeradivision.size();c++){//Dividir cada en linea en las 3 palabras que contiene el archivo.
            String b=primeradivision.get(c);
            String[] arr2=b.split(",");
            segundadivision.add(arr2);
        }
        for(int i=0;i<segundadivision.size();i++) {
            String sublista[] = segundadivision.get(i);//Crear una sublista
            String uno = sublista[0];//Nombre del paciente
            String dos = sublista[1];//Enfermedad o padecimiento
            String tres = sublista[2];//Tipo de prioridad
            Paciente p=new Paciente(uno,dos,tres);//Se crea la instancia de paciente
            v_Heap.add(p);

        }
        assertEquals(pal,v_Heap.remove().toString());


    }
}