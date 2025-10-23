package Unidad2.Actividad2;

public class packages {
    String CodigoReferencia;
   double PesoPaquete;

    public void Paquete(String CodigoReferencia, double PesoPaquete){
        this.CodigoReferencia=CodigoReferencia;
        this.PesoPaquete=PesoPaquete;

        System.out.println("Codigo de referencia "+CodigoReferencia+" peso del paquete "+PesoPaquete+"kg");

    }

    public void datos(){
        System.out.println("Codigo de referencia "+CodigoReferencia);
        System.out.println("Peso del paquete "+PesoPaquete);
    }
}
