public class PlanDatosPersonal extends PlanDatos {
    public PlanDatosPersonal() {
        this.nombre = "Personal";
        setTasa();
    }

    @Override
    public void setTasa() {
        this.tasa = 0.5f;
    }
}



