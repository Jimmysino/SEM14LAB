public abstract class PlanDatos {
    public String nombre;
    public float tasa;

    public abstract void setTasa();

    public float calculoPago(int datos) {
        return tasa * datos;
    }

    @Override
    public String toString() {
        return "Plan: " + nombre + " Tasa : " + tasa;
    }
}