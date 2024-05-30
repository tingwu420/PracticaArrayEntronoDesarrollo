package clases;

public class Segmento {
	
	  /**
	   * Atributo
	   */
	  Punto a;
	  Punto b;

	    /**
	     * Constructor
	     */
	    public Segmento() {
	        this.a = new Punto(0, 0);
	        this.b = new Punto(1, 1);
	    }

	    /**
	     * Constructor que recibe dos puntos como parámetros y crea un segmento entre ellos.
	     * @param a El primer punto del segmento.
	     * @param b El segundo punto del segmento.
	     */
	    public Segmento(Punto a, Punto b) {
	        this.a = a;
	        this.b = b;
	    }

	  
	    public Punto getA() {
	        return a;
	    }

	    
	    public void setA(Punto a) {
	        this.a = a;
	    }

	   
	    public Punto getB() {
	        return b;
	    }

	    
	    public void setB(Punto b) {
	        this.b = b;
	    }

	   
	    @Override
	    public String toString() {
	        return "[" + a + "," + b + "]";
	    }

	    /**
	     * Calcula la distancia entre los dos puntos del segmento.
	     * @return La distancia entre los puntos 'a' y 'b'.
	     */
	    public double distancia() {
	        double x1 = a.getX();
	        double y1 = a.getY();
	        double x2 = b.getX();
	        double y2 = b.getY();
	        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    }
}

	
	

