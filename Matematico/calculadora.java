
/**
 * Write a description of class calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calculadora{
 public double ecuasion(double a, double b, double c){
    double respuesta;
    respuesta = -b+-Math.sqrt(Math.pow(b,2)-4*a*c)/2*a;
    return respuesta;
    } 
    public double ubicarCateto(double cateto, double hipotenusa){
     double catetoFaltante;
     catetoFaltante=Math.sqrt(Math.pow(cateto,2)+Math.pow(hipotenusa,2));
     return catetoFaltante;
    } 
    public double encontrarRecta(double x1, double y1, double x2, double y2){
    double resultado;
    resultado=y2-y1/x2-x1;
    return resultado;
    }
    
}
