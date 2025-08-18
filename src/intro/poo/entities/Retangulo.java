package intro.poo.entities;

public class Retangulo {
    public double base;
    public double altura;

    // Calcular área do retangulo
    public double area() {
        return base * altura;
    }

    public double perimetro(){
        return (base + altura) * 2;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public String toString(){
        return String.format("%.2f", diagonal());
    }
}
