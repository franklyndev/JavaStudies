package IntroduçãoAPOO;

public class AumentoDeSalário {
    public String Name;
    public double SalarioBruto;
    public double Tax;

    public double SalarioLiquido(){
       return SalarioBruto - Tax;
    }
    public void AumentarSalario(double porcentagem){
        porcentagem = SalarioBruto / porcentagem;
        this.SalarioBruto += porcentagem;
    }

    public String toString(){
        return "Employee: " + Name + ", $" + String.format("%.2f", SalarioLiquido());
    }
}
