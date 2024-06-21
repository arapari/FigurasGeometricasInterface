public class Rectangulo implements FiguraGeometrica{
    private String nombre;
    private double largo;
    private double ancho;

    public Rectangulo(String nombre, double largo, double ancho) {
        this.nombre = nombre;
        this.largo = largo;
        this.ancho = ancho;
    }//Constructor

    public double calcularArea() {
        return (largo * ancho);
    }//calcularArea
    
    public double calcularPerimetro() {
        return (2 * (largo + ancho));
    }//calcularPerimetro
    
    public double getLargo() {
		return largo;
	}//getLargo
	public void setLargo(double largo) {
		this.largo = largo;
	}//setLargo
	public double getAncho() {
		return ancho;
	}//getAncho
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}//setAncho
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	@Override
    public String toString() {
        return "Rectangulo [nombre=" + nombre + ", largo=" + largo + ", ancho=" + ancho + "]";
    }//toString
}//class Rectangulo
