import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public static void main(String[] args) {


   Scanner teclado = new Scanner(System.in);

    List<Persona> personas = new ArrayList<>();
    List<Perro> perrosDisponibles = new ArrayList<>();

   int opcion;
   String placa;
   String nombre;
   String apellido;
   int edad = 0;
   String documento;
   String nombrePerro;
   String raza;
   String edadPerro;
   String tamaño;



   do {

       System.out.println("""
               1. Registrar persona.
               2. Registrar perro.
               3. Ver personas registradas.
               4. Ver perros disponibles.
               5. Adoptar un perro.
               6. Consultar el perro mas viejo adoptado.
               7. Salir""");

       opcion = teclado.nextInt();


       switch (opcion){
           case 1->{
               System.out.println("Ingrese su nombre: ");
               nombre = teclado.nextLine();
               System.out.println("Ingrese su apellido: ");
               apellido = teclado.nextLine();
               System.out.println("Ingrese su edad: ");
               edad = teclado.nextInt();
               teclado.nextLine();
               System.out.println("Ingrese su documento: ");
               documento = teclado.nextLine();
               personas.add(new Persona(nombre, apellido, edad, documento));
               break;
           }

           case 2->{
               System.out.println("Ingrese la placa del perro: ");
               placa = teclado.nextLine();
               System.out.println("Ingrese el nombre del perro: ");
               nombrePerro = teclado.nextLine();
               System.out.println("Ingrese la raza del perro: ");
               raza = teclado.nextLine();
               System.out.println("Ingrese la edad del perro: ");
               edadPerro = teclado.nextLine();
               System.out.println("Ingrese el tamaño del perro: ");
               tamaño = teclado.nextLine();
               perrosDisponibles.add(new Perro(placa, nombrePerro, raza, edad, tamaño));
               break;
           }

           case 3->{
               for (Persona persona: personas){
                   System.out.println(persona);
               }
           }

           case 4->{
               for (Perro perro: perrosDisponibles){
                   System.out.println(perro);
               }
           }

           case 5->{
               System.out.println("Ingrese su documento: ");
               


           }


       }








    }while (opcion!=7);
}