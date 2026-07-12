public class FabricaMovistar extends FabricaProveedor {
    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        PlanDatos plan = null;
        if (tipo.equalsIgnoreCase("Personal")) {
            plan = new PlanDatosPersonal();
            plan.tasa = 0.8f;
        } else if (tipo.equalsIgnoreCase("Negocio")) {
            plan = new PlanDatosNegocio();
            plan.tasa = 1.6f;
        } else if (tipo.equalsIgnoreCase("Academico")) {
            plan = new PlanDatosAcademico();
            plan.tasa = 1.25f;
        }
        return plan;
    }
}