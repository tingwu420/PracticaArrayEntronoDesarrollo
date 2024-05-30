package app;
import java.util.Random;
import clases.Punto;
import clases.Segmento;

public class Principal {
	public static void main(String[] args) {

	 Random rand = new Random();
     Punto punto1 = new Punto(rand.nextInt(11), rand.nextInt(11));
     Punto punto2 = new Punto(rand.nextInt(11), rand.nextInt(11));
     Punto punto3 = new Punto(rand.nextInt(11), rand.nextInt(11));
     Punto punto4 = new Punto(rand.nextInt(11), rand.nextInt(11));

     // Crear 2 segmentos con los primeros 2 puntos y los siguientes 2 puntos
     Segmento segmento1 = new Segmento(punto1, punto2);
     Segmento segmento2 = new Segmento(punto3, punto4);

     // Calcular la distancia entre los puntos de cada segmento
      segmento1.distancia();
      segmento2.distancia();

	}  
}
