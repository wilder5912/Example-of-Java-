
public class Rectangulo implements Figura{ // La clase implementa la interface Figura
private float lado; private float altura;
public Rectangulo (float lado, float altura) { this.lado = lado; this.altura = altura; }
public float area() { return lado*altura; }
} //Cierre de la clase ejemplo aprenderaprogramar.com