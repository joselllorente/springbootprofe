package es.curso.springboot.springbootprofe.lambdas;

import org.hibernate.internal.build.AllowSysOut;

public class PruebaLambdas {

	public static void main(String[] args) {
		
		
//		Comparable compare = (texto,num)-> {
//			System.out.println(""+texto+num);
//			int operacion = num*3;
//			System.out.println(""+operacion);
//		};
//		compare.pintaDatos("Texto", 4);
		
		Comparable compare = t -> { 
			
			System.out.println("Hola "+t+Math.random()); 
			
			};
		compare.metodo1("Prueba");
		
//		Comparable compare2 = () -> System.out.println("Adios "+Math.random());
//		compare2.metodo1();
		
//		Operacion suma = new Suma();
//		suma.operar(2, 3);
//		miOperacion(7, 3, suma);
//		
//		Operacion ope = (a,b) -> (int)Math.random();
//		
//		Operacion ope2 = (a,b) -> a+b;
//		
//		miOperacion(6,8,ope);
//		
//		miOperacion(9,18, (f,g)-> f-g );
//		
//		
//		miOperacion(9,18, (f,g) -> { 
//						if (f>5) {
//							f= f*4;
//						}
//						g=g+3;
//						return f*g;
//					});
		
//		System.out.println(ope.operar(2, 3));
//		ope = (a,b) -> a+b;
//		System.out.println(ope.operar(2, 3));

	}
	
	static void miOperacion (int valor1, int valor2, Operacion op) {
		int resultado = op.operar(valor1, valor2);
		System.out.println(resultado);
	}
	
	

}






