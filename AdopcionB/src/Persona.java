import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private List<Perro> perrosAdoptados;


    public Persona(String nombre, String apellido, int edad, String documento) {
    }

    public Persona(String nombre, String apellido, int edad, String documento, List<Perro> perrosAdoptados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perrosAdoptados = new ArrayList<>();
    }


    public boolean adoptarPerro(Perro perro){
        if (perrosAdoptados.size()<3){
            perrosAdoptados.add(perro);
            return true;
        }
        return false;
    }

    public Perro perroMasGrande(){
        if (perrosAdoptados.isEmpty()) return null;
        Perro Mayor = perrosAdoptados.get(0);
        for (Perro perro: perrosAdoptados){
            if(perro.getEdad()> Mayor.getEdad()){
                Mayor = perro;
            }
        }
        return Mayor;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                ", perrosAdoptados=" + perrosAdoptados +
                '}';
    }
}
