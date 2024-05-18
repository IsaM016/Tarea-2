// estamos usando la abstraccion, que es crear una clase a partir de propiedades y metodos
public class Automovil {
    //se utiliza el stactic para reforzar con el private que los atributos solo se pueden modificar desde la clase
    //se hace un encapsulamiento con el static
    private static String marca;
    private static String modelo;
    private static String color;
    private static int cilindraje;

    // polimorfismo: realizar acciones diferentes haciendo uso del mismo metodo
    public Automovil(String marca, String modelo, String color, int cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;

    }

    public Automovil( String modelo, String color, int cilindraje) {
        this.marca = "ferrari";
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;

    }

    public Automovil(  int cilindraje) {

        this.cilindraje = cilindraje;

    }
    public static String getMarca() {
        return marca;
    }
    public static void setMarca(String marca) {
        Automovil.marca = marca;
    }


    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Automovil.modelo = modelo;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Automovil.color = color;
    }

    public static int getCilindraje() {
        return cilindraje;
    }

    public static void setCilindraje(int cilindraje) {
        Automovil.cilindraje = cilindraje;
    }





}
