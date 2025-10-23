package Unidad1.Actividad4.PasePorReferencia;


public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(20);

        System.out.println("Antes del intercambio:");
        System.out.println("Box1 size: " + box1.size);
        System.out.println("Box2 size: " + box2.size);

    }
   
}
