import java.util.Scanner;
import java.util.Random;

public class Ud2Bloque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// PARTE 1: Peticion de datos, String y operadores aritméticos
		//Inicializamos "Scanner" al principio de la clase para que nos valga para todos los ejercicios.
		Scanner sc = new Scanner(System.in);
		
		// Ejercicio 1
		final String miNombre = "Miguel Ángel";
		System.out.println("Bienvenido, " + miNombre);
		// Ejercicio 2
		System.out.println("Introduce tu nombre: ");
		final String NOMBRE = sc.nextLine();
		System.out.println("Bienvenido, " + NOMBRE);
		// Ejercicio 3
		final double numeropi = 3.14;
		System.out.println("Introduce el radio de la esfera: ");
		double radio = sc.nextDouble();
		double volEsfera = (4.0/3.0) * numeropi * Math.pow(radio, 3);
		System.out.println("El volumen de una esfera de radio " + radio + " es " + volEsfera);
		// Ejercicio 4
		System.out.println("El radio de la circunferencia es: ");
		radio = sc.nextDouble();
		double longCircunferencia = 2 * numeropi * radio;
		System.out.println("La longitud de la circunferencia es: "+ longCircunferencia);
		//Ejercicio 5
		//int ascii = 'p';
		//System.out.println(ascii);
		//Ejercicio 6
		System.out.println("Introduce un número: ");
		int ascii = sc.nextInt();
		char letrascii = (char) ascii;
		System.out.println(letrascii);
		// Ejercicio 7
		System.out.println("Por favor introduce la temperatura: ");
		double celsius = sc.nextDouble();
		double farhenheit = 32 + (9 * celsius / 5);
		System.out.println("Su equivalente en farhenheit es " + farhenheit);
		// Ejercicio 8
		System.out.println("Introduce la velocidad en km/h: ");
		double velocidadKMH = sc.nextDouble();
		double velocidadMS = velocidadKMH / 3.6;
		System.out.println("La conversión a m/s es "+ velocidadMS);
		// Ejercicio 9
		System.out.println("Introduce la longitud del primer cateto: ");
		double cateto1 = sc.nextDouble();
		System.out.println("Introduce la longitud del segundo cateto: ");
		double cateto2 = sc.nextDouble();
		double hipotenusa = Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
		System.out.println("El resultado de la hipotenusa es: "+ hipotenusa);
		// PARTE 2: Operadores lógicos y relacionales
		// Prohibido usar estructuras if (condicionales)
		
		// Ejercicio 10
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		boolean mayoria = edad >= 18;
		System.out.println("Mayoria de edad: " + mayoria);
		// Ejercicio 11
		System.out.println("Vuelve a introducir tu edad: ");
		int edad2 = sc.nextInt();
		boolean mayorDeEdad = ! (edad2 < 18);
		System.out.println("Mayoria de edad: " + mayorDeEdad);
		// Ejercicio 12
		System.out.println("Edad del joven: ");
		int edad3 = sc.nextInt();
		boolean menorDeEdad = edad3 <= 17;
		System.out.println("Menor de edad: " + menorDeEdad);
		// Ejercicio 13
		System.out.println("La edad del hombre es: ");
		int adulto = sc.nextInt();
		boolean esAdulto = adulto >= 16 && adulto <= 65;
		System.out.println("Es adulto: " + esAdulto);
		// Ejercicio 14
			// Solucion 1: Usando operador de inversión lógica.
		System.out.println("Introduce la edad nuevamente: ");
		int newEdad = sc.nextInt();
		boolean esEdad = ! (newEdad < 18);
		System.out.println("Esta en edad de trabajar: " + esEdad);
			// Solucion 2: No utilizar operador de inversión lógica.
		System.out.println("Introduce la edad nuevamente: ");
		int segundaEdad = sc.nextInt();
		boolean canWork = segundaEdad >= 18;
		System.out.println("Esta en edad de trabajar: "+ canWork);
		// Ejercicio 15
		System.out.println("Introduce tu altura: ");
		double altura1 = sc.nextDouble();
		System.out.println("Introduce tu altura: ");
		double altura2 = sc.nextDouble();
		System.out.println("Introduce tu altura: ");
		double altura3 = sc.nextDouble();
		double mediaAltura = (altura1 + altura2 + altura3) / 3;
		System.out.println("La media de altura es: " + mediaAltura);
		// Ejercicio 16
		System.out.println("Introduce tu altura: ");
		double newAltura1 = sc.nextDouble();
		System.out.println("Introduce tu altura: ");
		double newAltura2 = sc.nextDouble();
		System.out.println("Introduce tu altura: ");
		double newAltura3 = sc.nextDouble();
		double newMediaAltura = (newAltura1 + newAltura2 + newAltura3) / 3;
		boolean mediaNacional = newMediaAltura >= 1.69;
		System.out.println("Está en la media nacional: "+ mediaNacional);
		// Ejercicio 17
		System.out.println("Vamos a comprobar la media de alturas según sexo.");
		System.out.println("Introduce tu altura: ");
		double genreAltura1 = sc.nextDouble();
		System.out.println("Introduce tu altura: ");
		double genreAltura2 = sc.nextDouble();
		System.out.println("Introduce tu altura: ");
		double genreAltura3 = sc.nextDouble();
		System.out.println("Introduce tu genero: ");
		char genreLetra = Character.toUpperCase(sc.next().charAt(0));
		double mediaAlturaNacional = (genreAltura1 + genreAltura2 + genreAltura3) / 3;
		boolean newMediaNacional = mediaAlturaNacional >= 1.76 && genreLetra == 'H' || mediaAlturaNacional >= 1.62 && genreLetra == 'M';
		System.out.println("La media está en la media nacional: " + newMediaNacional);
		// Ejercicio 18
		// Modificamos la lógica anterior para que admita mayúsculas o minúsculas en el género.
		// Ejercicio 19
		System.out.println("¿Está lloviendo?");
		char answer1 = sc.next().charAt(0);
		System.out.println("¿Hace sol?");
		char answer2 = sc.next().charAt(0);
		boolean rainbow = answer1 == 'S' && answer2 == 'S';
		System.out.println("¿Sale el arcoiris? "+ rainbow);
		// Ejercicio 20;;
		System.out.println("¿Nos puedes decir tu edad?");
		int age = sc.nextInt();
		System.out.println("Nos puedes decir tu salario?");
		int salary = sc.nextInt();
		System.out.println("¿Cuantas horas trabajas?");
		int hours = sc.nextInt();
		boolean explotacion = (age < 16) || (age > 70) || (salary < 700) || (hours > 50) || (hours > 40) && (salary >= 700 && salary <= 1100);
		System.out.println("Actualmente estás explotado: "+ explotacion);

		// PARTE 3: Variables auxiliares.
		// Ejercicio 21
		
		System.out.println("Introduce un valor: ");
		int primerNumero = sc.nextInt();
		System.out.println("Introduce un segundo valor: ");
		int segundoNumero = sc.nextInt();
		System.out.println("Inicialmente los valores son primer número: "+ primerNumero + " y segundo número: " + segundoNumero);
		int tercerNumero;
		tercerNumero = primerNumero;
		primerNumero = segundoNumero;
		segundoNumero = tercerNumero;
		System.out.println("Los valores intercambiados son primer número: " + primerNumero + " y segundo número:  " + segundoNumero);
		
		// Ejercicio 22
		sc.nextLine();
		System.out.println("Primera cadena: ");
		String cadena1 = sc.nextLine();
		System.out.println("Segunda cadena: ");
		String cadena2 = sc.nextLine();
		System.out.println("Tercera cadena: ");
		String cadena3 = sc.nextLine();
		System.out.println("Vamos a reordenar los valores de las cadenas.");
		String cadena4;
		cadena4 = cadena1;
		cadena1 = cadena2;
		cadena2 = cadena3;
		cadena3 = cadena4;
		System.out.println("Las cadenas reordenadas quedan así: Primera cadena: "+ cadena1 + ", Segunda cadena: " + cadena2 + " y Tercera cadena: " + cadena3);
		
		// BLOQUE 2 DE EJERCICIOS UNIDAD 2.
		// EJERCICIO 1
		System.out.println("Dime el año actual: ");
		int añoActual = sc.nextInt();
		System.out.println("Dime tu año de nacimiento: ");
		int añoNacimiento = sc.nextInt();
		int edadCalculada = añoActual - añoNacimiento;
		System.out.println("Ahora mismo tienes "+ edadCalculada + " años.");
		// EJERCICIO 2
		System.out.println("¿Está lloviendo? (true/false)");
		boolean rain = sc.nextBoolean();
		System.out.println("¿Has acabado las tareas? (true/false)");
		boolean tareas = sc.nextBoolean();
		System.out.println("¿Tienes que ir a la biblioteca? (true/false)");
		boolean biblioteca = sc.nextBoolean();
		boolean puedeSalir = (!rain && tareas) || biblioteca;
		System.out.println("Puedes salir a la calle: " + puedeSalir);
		// EJERCICIO 3
		System.out.println("Introduce la nota del primer trimestre: ");
		int primerTrimestre = sc.nextInt();
		System.out.println("Introduce la nota del segundo trimestre: ");
		int segundoTrimestre = sc.nextInt();
		System.out.println("Introduce la nota del tercer trimestre: ");
		int tercerTrimestre = sc.nextInt();
		int notaMedia = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3;
		double mediaDecimal = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3.0;
		System.out.println("La nota redondeada es: " + notaMedia);
		System.out.println("La nota exacta es: " + mediaDecimal);
		// EJERCICIO 4
		System.out.println("Introduce una distancia en milimetros: ");
		double milimetros = sc.nextDouble();
		System.out.println("Introduce una distancia en centimetros: ");
		int centimetros = sc.nextInt();
		System.out.println("Introduce una distancia en metros: ");
		int metros = sc.nextInt();
		double sumaCentimetros = (milimetros / 10 ) + centimetros + (metros * 100);
		System.out.println("La suma total en centimetros es: " + sumaCentimetros);
		// EJERCICIO 5
		int patas = 0;
		System.out.println("Indica el número de hormigas capturadas: ");
		patas += sc.nextInt() * 6;
		System.out.println("Introduce el número de arañas capturadas: ");
		patas += sc.nextInt() * 8;
		System.out.println("Introduce por ultimo el numero de cochinillas capturadas: ");
		patas += sc.nextInt() * 14;
		System.out.println("El número total de patas es: " + patas);
		// EJERCICIO 6
		Random rd = new Random();
		int numero = rd.nextInt(9) +1;
		System.out.println("Estoy pensando un numero del 1 al 9, intenta adivinarlo: ");
		int opcion = sc.nextInt();
		boolean acierto = numero == opcion;
		System.out.println("¿Has acertado? " + acierto);
		// EJERCICIO 7
		System.out.println("Tira un dado: ");
		int primerDado = rd.nextInt(6) +1;
		System.out.println("Sacaste " + primerDado);
		System.out.println("Ahora voy a tirar yo un dado: ");
		int segundoDado = rd.nextInt(6) + 1;
		System.out.println("He sacado "+ segundoDado);
		boolean winner = primerDado > segundoDado;
		System.out.println("¿Has ganado? " + winner);
		// EJERCICIO 8
		System.out.println("Piensa en un año: ");
		int year = sc.nextInt();
		boolean bisiesto = ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0);
		System.out.println("¿Es bisiesto? " + bisiesto);
		
		// EJERCICIO 9
		System.out.println("Vamos a tirar 5 dados: ");
		int dado1 = rd.nextInt(6) + 1;
		System.out.println("Primer dado: " + dado1);
		int dado2 = rd.nextInt(6) + 1;
		System.out.println("Segundo dado: " + dado2);
		int dado3 = rd.nextInt(6) + 1;
		System.out.println("Tercer dado: " + dado3);
		int dado4 = rd.nextInt(6) + 1;
		System.out.println("Cuarto dado: " + dado4);
		int dado5 = rd.nextInt(6) + 1;
		System.out.println("Quinto dado: " + dado5);
		boolean valenCinco = (dado1 == 5) && (dado2 == 5) && (dado3 == 5) && (dado4 == 5) && (dado5 == 5);
		System.out.println("Todos los dados valen 5: " + valenCinco);
		boolean mayorQueVeinte = (dado1 + dado2 + dado3 + dado4 + dado5) > 20;
		System.out.println("La suma es mayor que 20: " + mayorQueVeinte);
		boolean saleUnoOSeis = (dado1 == 1 || dado1 == 6) && (dado2 == 1 || dado2 == 6) && (dado3 == 1 || dado3 == 6) && (dado4 == 1 || dado4 == 6) && (dado5 == 1 || dado5 == 6);
		System.out.println("Todos unos o seises: " + saleUnoOSeis);
		// EJERCICIO 10
		System.out.println("Introduce el primer numero: ");
		int consecutivo1 = sc.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int consecutivo2 = sc.nextInt();
		boolean sonConsecutivos = (consecutivo1 + 1 == consecutivo2) || (consecutivo1 - 1 == consecutivo2);
		System.out.println("Son consecutivos: " + sonConsecutivos);
		
		} 

}
