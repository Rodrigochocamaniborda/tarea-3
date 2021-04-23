import java.util.Scanner;

/**
 * Write a description of class Matematico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   public class matematico {
public calculadora Calculadora;
public void matematico(calculadora Calculadora){
this.Calculadora= Calculadora;

}
  public String indicarMayorMenorMedio(int A, int B, int C){
    String respuesta;
    if(A>B) {
    respuesta= "a es mayor que b";
    }
    if(C>B)
    respuesta = "a es mayor que b y c es el numero medio";
    else{
    if(B>A){
     respuesta="b es mayor que a";  
    }
    if(C>A){
    respuesta = "b es mayor que a y c es el numero medio";
    }
    else{
    if(A<C){respuesta="c es mayor que a";
    }
    if(A<B){respuesta="c es mayor que a y b es el numero medio";
    }
    else{
    if(B<C){
    respuesta="c es mayor que b";
    }
    if (B<A){respuesta = "c es mayor que b y a es el numero medio";
    }
    else{respuesta="";}
    }
    }  
    }
    return respuesta;
    }
 int AreaCudrado(int base, int altura){
    int AreaCuadrado;
    int lado1=base;
    int lado2=altura;
    AreaCuadrado= lado1*lado2;
    return AreaCuadrado;  

    }
double calcularDistancia(){
double x1;
double y1;
double x2; 
double y2; 
double distancia;
Scanner entrada = new Scanner(System.in);
System.out.println("\nPor favor introduzca la coordenada x del primer punto: ");
x1 = entrada.nextDouble();
System.out.println("\nPor favor introduzca la coordenada y del primer punto: "); 
y1 = entrada.nextDouble(); 
System.out.println("\nPor favor introduzca la coordenada x del segundo punto: ");
x2 = entrada.nextDouble(); 
System.out.println("\nPor favor introduzca la coordenada y del segundo punto: "); 
y2 = entrada.nextDouble(); 
distancia = Math.sqrt( (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1) ); 
System.out.printf("\nLa distancia entre los puntos es: %.2f\n", distancia);
return calcularDistancia();
} 
public double calcularCuadrante(){
    
    Scanner cuadrante= new Scanner(System.in);
    int x, y; 
    System.out.println("Ingrese un valor para el punto X (Distinto de 0)");
    x= cuadrante.nextInt(); 
    System.out.println("Ingrese un valor para el punto Y (Distinto de 0)"); 
    y = cuadrante.nextInt();
    if(x > 0 && y > 0){ System.out.println("El punto (" + x + "," + y + ") esta en el primer cuadrante");
    } else if(x < 0 && y > 0){ System.out.println("El punto (" + x + "," + y + ") esta en el segundo cuadrante"); 
     } else if(x < 0 && y < 0){ System.out.println("El punto (" + x + "," + y + ") esta en el tercer cuadrante");
    } else if(x > 0 && y < 0){ System.out.println("El punto (" + x + "," + y + ") esta en el cuarto cuadrante");
    } 
    return calcularCuadrante();
}

}




   
