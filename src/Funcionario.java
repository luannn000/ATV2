public class Funcionario {
    private static int geraMatricula = 0;

    public String name;
    public String cpf;
    public String rg;
    private int matricula;
    private double salario;
    public String dataContratacao;
    private double salarioBase;
    private int horasTrabalhadas;

    public Funcionario(String name, double salarioBase, int horasTrabalhadas, String dataContratacao, int matricula) {
        this.name = name;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataContratacao = dataContratacao;
        geraMatricula++;
        this.matricula = geraMatricula;
    }

    public void calculaSalario() {
        Calculo calculo = new Calculo();

        calculo.calculaSalario(this.salarioBase, this.horasTrabalhadas);

        this.salario = calculo.getTotalSalario();
    }

    public void imprimeDados() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.rg);
        System.out.println(this.matricula);
        System.out.println(this.salario);
        System.out.println(this.dataContratacao);
        System.out.println(this.salarioBase);
        System.out.println(this.horasTrabalhadas);
    }
}
