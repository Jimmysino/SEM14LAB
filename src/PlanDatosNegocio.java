public class PlanDatosNegocio extends PlanDatos {
    public PlanDatosNegocio() {
        this.nombre = "Negocio";
        setTasa();
    }

    @Override
    public void setTasa() {
        this.tasa = 1.5f; // Tasa por defecto (Línea Rápida)
    }
}