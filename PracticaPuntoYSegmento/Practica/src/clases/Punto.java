package clases;

public class Punto {
	 /**
	  * Atributos
	  */
   int x;
   int y;

   /**
    * Constructor
    */
   public Punto() {
       this.x = 0;
       this.y = 0;
   }
   /**
    * Constructor con los parámetros x e y
    * @param x Coordenada del punto x
    * @param y Coordenada del punto y
    */
   public Punto(int x, int y) {
       this.x = x;
       this.y = y;
   }

   public int getX() {
       return x;
   }

 
   public void setX(int x) {
       this.x = x;
   }

  
   public int getY() {
       return y;
   }

   public void setY(int y) {
       this.y = y;
   }


   @Override
   public String toString() {
       return "(" + x + ", " + y + ")";
   }
}
