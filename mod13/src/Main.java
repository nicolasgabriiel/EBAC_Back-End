public class Main {
    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica();
        PessoaFisica pf = new PessoaFisica();

        pf.setNome("Douglas");
        pf.setCpf("053.457.980-95");
        pj.setNome("Nome da Empresa");
        pj.setCnpj("10.497.732.0001-92");

        System.out.println(" ");
        System.out.println("O nome da Pessoa Fisica é " + pf.getNome() + " e o cpf é: " + pf.getCpf());
        System.out.println(" ");
        System.out.println("O nome da Pessoa Juridica é " + pj.getNome() + " e o cnpj é: " + pj.getCnpj());
    }
}