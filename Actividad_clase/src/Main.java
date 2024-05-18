//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Automovil auto1= new Automovil("chevrolet","sail","rojo",2000);
        Automovil auto2=new Automovil("Testarossa","rojo",5000);
        Automovil auto3= new Automovil(4000);

        System.out.println("datos del auto1: ");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: "+ auto1.getModelo());
        System.out.println("Color: "+ auto1.getColor());
        System.out.println("Cilindraje: "+ auto1.getCilindraje());

        System.out.println("");

        System.out.println("datos del auto2: ");
        System.out.println("Marca: " + auto2.getMarca());
        System.out.println("Modelo: "+ auto2.getModelo());
        System.out.println("Color: "+ auto2.getColor());
        System.out.println("Cilindraje: "+ auto2.getCilindraje());

        System.out.println("");

        System.out.println("datos del auto3: ");
        System.out.println("Marca: " + auto3.getMarca());
        System.out.println("Modelo: "+ auto3.getModelo());
        System.out.println("Color: "+ auto3.getColor());
        System.out.println("Cilindraje: "+ auto3.getCilindraje());





    }
}