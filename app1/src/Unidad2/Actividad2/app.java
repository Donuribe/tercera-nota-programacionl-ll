package Unidad2.Actividad2;



public interface app {
    public static void main(String[] args) {

        packages p1 = new packages();
        p1.Paquete("ABCD1234", 5.6);
        packages p2 = p1;
        System.out.println("Antes de modificar:");
        p1.datos();
        p2.datos();
        p2.PesoPaquete = 7.5;
        System.out.println("\nDespués de modificar a través de p2:");
        p1.datos();
        System.out.println("\nDespués de pasar el objeto al método:");
        p1.datos();

    }

     public static void cambiarPeso(packages paquete) {
        paquete.PesoPaquete = 10.0;
        System.out.println("Peso cambiado dentro del método a: " + paquete.PesoPaquete);
    }
}