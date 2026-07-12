public class PlanDatosAcademico extends PlanDatos {
    public PlanDatosAcademico() {
        this.nombre = "Academico";
        setTasa();
    }

    @Override
    public void setTasa() {
        this.tasa = 1.0f; // Tasa por defecto (Línea Rápida)
    }
}