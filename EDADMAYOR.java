/*
Autor: Gustavo Garcia Barrera
Fecha: 19-10-2021
*/

import java.util.Scanner;
public class EDADMAYOR {//Inicio clase principal
	public static void main(String[] args){//Inicio metodo principal

		//Declaracion de variables
		int fecha_Nacimiento;
		int fecha_Actual =2021;
		int diferencia = 0;
		Scanner teclado =new Scanner (System.in);

		System.out.print("Digite su año de nacimiento: ");
		fecha_Nacimiento = teclado.nextInt();

		diferencia =(fecha_Actual - fecha_Nacimiento);

	        if (diferencia>=18){
			System.out.print ("El usuario tiene " + diferencia + ", es mayor de edad");
		}
		else {
			System.out.print ("El usuario tiene " + diferencia + ", es menor de edad");
		}
	}//Fin metodo principal

}//Fin clase principal


		
