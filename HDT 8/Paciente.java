//Nombre: Pablo Daniel Gonzalez Ramos
//Carnet: 20362
//
public class Paciente implements Comparable<Paciente>{

    protected String codigo,nombre,sintoma;


    public Paciente(String nombre, String sintoma, String codigo){
        this.nombre=nombre;
        this.sintoma=sintoma;
        this.codigo=codigo;
    }

    public int compareTo(Paciente p){
        Paciente enfermo = (Paciente)p;
        return codigo.compareTo(enfermo.getCodigo());
    }

    public String getCodigo(){
        return codigo;
    }


    public String toString(){
        return (nombre+", "+sintoma+", "+codigo);
    }
}
