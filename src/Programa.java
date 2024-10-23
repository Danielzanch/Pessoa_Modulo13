public class Programa {
    public static void main(String args[]) {
        PessoaFisica pessoaFis = new PessoaFisica();
        pessoaFis.setNome("João");
        pessoaFis.setSobrenome("Pedro");
        pessoaFis.setCpf("546.832.864-75");

        System.out.println("");
        System.out.println("**** Pessoa Fisica ****");
        System.out.println("Nome: " + pessoaFis.getNome());
        System.out.println("Sobrenome: " + pessoaFis.getSobrenome());
        System.out.println("CPF: " + pessoaFis.getCpf());


        System.out.println("");
        System.out.println("**** Pessoa Juridica ****");
        PessoaJuridica pessoaJur = new PessoaJuridica();
        pessoaJur.setNome("Lucas");
        pessoaJur.setNomefantasia("Indústria Brasileira de Alimentos e Chocolates");
        pessoaJur.setCnpj("66.509.327/0001-00");

        System.out.println("Nome: " + pessoaJur.getNome());
        System.out.println("Nome Fantasia: " + pessoaJur.getNomefantasia());
        System.out.println("CPF: " + pessoaJur.getCnpj());
        System.out.println("");
    }
}

