public class Trapecio implements FiguraGeometrica {
    private String nombre;
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(String nombre, double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.nombre = nombre;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }//Constructor

    public double calcularArea() {
        return (((baseMayor + baseMenor) / 2) * altura);
    }//calcularArea

    public double calcularPerimetro() {
        return (baseMayor + baseMenor + lado1 + lado2);
    }//calcularPerimetro

    public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public double getBaseMayor() {
		return baseMayor;
	}//getBaseMayor

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}//setBaseMayor

	public double getBaseMenor() {
		return baseMenor;
	}//getBaseMenor

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}//setBaseMenor

	public double getAltura() {
		return altura;
	}//getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura

	public double getLado1() {
		return lado1;
	}//getLado1

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}//setLado1

	public double getLado2() {
		return lado2;
	}//getLado2

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}//setLado2

	@Override
    public String toString() {
        return "Trapecio [nombre=" + nombre + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura=" + altura + ", lado1=" + lado1 + ", lado2=" + lado2 + "]";
    }//toString
}//class Trapecio
