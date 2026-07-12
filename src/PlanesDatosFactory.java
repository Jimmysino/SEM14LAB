public class PlanesDatosFactory {

    public static void calculoConsumo(FabricaProveedor proveedor, String tipo, int numeroMegasConsumido) {
        PlanDatos plan = proveedor.crearPlanDatos(tipo);
        if (plan != null) {
            float pago = plan.calculoPago(numeroMegasConsumido);
            System.out.println(plan.toString() + " Pago: " + pago + " por " + numeroMegasConsumido + " megas");
        } else {
            System.out.println("Tipo de plan no reconocido.");
        }
    }

    public static void main(String[] args) {
        int megas = 1000;

        System.out.println("BIENVENIDOS A LINEA RAPIDA");
        FabricaProveedor lineaRapida = new FabricaLineaRapida();
        calculoConsumo(lineaRapida, "Personal", megas);
        calculoConsumo(lineaRapida, "Negocio", megas);
        calculoConsumo(lineaRapida, "Academico", megas);

        System.out.println("\nBIENVENIDOS A CLARO");
        FabricaProveedor claro = new FabricaClaro();
        calculoConsumo(claro, "Personal", megas);
        calculoConsumo(claro, "Negocio", megas);
        calculoConsumo(claro, "Academico", megas);

        System.out.println("\nBIENVENIDOS A MOVISTAR");
        FabricaProveedor movistar = new FabricaMovistar();
        calculoConsumo(movistar, "Personal", megas);
        calculoConsumo(movistar, "Negocio", megas);
        calculoConsumo(movistar, "Academico", megas);
    }
}