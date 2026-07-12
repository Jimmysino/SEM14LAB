public class FabricaLineaRapida extends FabricaProveedor {
    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        if (tipo.equalsIgnoreCase("Personal")) {
            return new PlanDatosPersonal();
        } else if (tipo.equalsIgnoreCase("Negocio")) {
            return new PlanDatosNegocio();
        } else if (tipo.equalsIgnoreCase("Academico")) {
            return new PlanDatosAcademico();
        }
        return null;
    }
}