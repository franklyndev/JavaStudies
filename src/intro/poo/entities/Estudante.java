package intro.poo.entities;

public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularNota() {
        return nota1 + nota2 + nota3;
    }

    public double notaFinal() {
        if (calcularNota() < 60) {
            return 60 - calcularNota();
        } else {
            return 0.0;
        }
    }
}
