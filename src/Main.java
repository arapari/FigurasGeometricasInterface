public class Main {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("Pants", 127);
		Rectangulo r1 = new Rectangulo("Relo", 10, 5);
        	Rombo rom1 = new Rombo("Cometa", 12, 8, 7);
       	 	Romboide rombide1 = new Romboide("Rambo", 15, 10, 8);
        	Trapecio tra1 = new Trapecio("Circo", 12, 8, 5, 6, 7);		
		imprimirCalculo(t1); imprimirCalculo(t2);
		imprimirCalculo(c1);
		imprimirCalculo(r1);
        	imprimirCalculo(rom1);
		imprimirCalculo(rombide1);
		imprimirCalculo(tra1);
	}//main
	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+========================================");
		System.out.println("|El área de ["+f.getName()+"] es: " + f.calcularArea() + 
				"\n" + "|El perímetro de ["+f.getName()+"] es: " + f.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class Main
