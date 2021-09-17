import java.util.Scanner;

import modelo.Motorista;
import modelo.Passageiro;

public class App {
    public static void main(String[] args) throws Exception {
        
   
        Scanner ler = new Scanner(System.in);
        int tamanho = 2;
        Passageiro[] passageiros = new Passageiro[tamanho];

        for(int i = 0; i < tamanho; i++){
            Passageiro passageiro = new Passageiro();
            
            ler.nextLine();
            System.out.println("Informe o nome do passageiro : ");
            passageiro.setNome(ler.nextLine());
            ler.nextLine();
        
            System.out.println("Informe o cpf do passageiro : ");
            passageiro.setCpf(ler.nextLine());
            

            System.out.println("Informe o codigo cliente do passageiro : ");
            passageiro.setCodigoCliente(ler.nextInt());

            passageiros[i] = passageiro;

        }

        for(int i = 0; i < passageiros.length; i++){
            System.out.println("O nome do passageiro cadastrado é : " + passageiros[i].getNome());
            System.out.println("O cpf do passageiro cadastrado é : " + passageiros[i].getCpf());
            System.out.println("O codigo Cliente do passageiro cadastrado é : " + passageiros[i].getCodigoCliente());
            System.out.println();
            System.out.println("---------------------------------------------------------------");
            System.out.println();

        }
   
        Motorista motorista = new Motorista();
      
        motorista.setNome("Maria da Silva");
        motorista.setCpf("999.999.998-99");
        motorista.setMatricula(123);
        motorista.setHabilitacao("123659968");

        Passageiro passageiro = new Passageiro("João", "888-888-888.88", 007);

        System.out.println("O nome do motorista é " + motorista.getNome());
        System.out.println("O cpf do motorista é " + motorista.getCpf());
        System.out.println("O matricula do motorista é " + motorista.getMatricula());
        System.out.println("O habilitação do motorista é " + motorista.getHabilitacao());

        System.out.println("---------------------------------");

        System.out.println("O nome do passageiro é " + passageiro.getNome());
        System.out.println("O cpf do passageiro é " + passageiro.getCpf());
        System.out.println("O codigo do cliente do passageiro é " + passageiro.getCodigoCliente());

    }
}
