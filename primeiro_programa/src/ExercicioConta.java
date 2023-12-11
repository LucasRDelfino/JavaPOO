import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioConta {
    public static void main(String[] args) {
        String nomeCliente = "Lucas";
        String tipoDeConta = "Corrente";
        double saldo = 2000;

        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);

        int operacao = 0;
        String menu = """
                    Operação:
                    1 - Consultar saldos" 
                    2 - Receber valor" 
                    3 - Tranferir valor" 
                    4 - Sair""";

        Scanner leitura = new Scanner(System.in);

        while (operacao!=4) {
            System.out.println(menu);
            operacao = leitura.nextInt();

            if (operacao==1) {
                System.out.println("Seu saldo é igual a " + saldo);
            }else if (operacao==2){
                System.out.println("Digite o valor a receber ");
                double valorReceber = leitura.nextDouble();
                saldo += valorReceber;
                System.out.println("Seu saldo agora é igual a " + saldo);
            }else if (operacao==3){
                System.out.println("Digite o valor a transferir");
                double valorSaque = leitura.nextDouble();
                if (valorSaque>saldo){
                    System.out.println("Operação bloqueada, saldo insuficiente");
                }else{
                    saldo -= valorSaque;
                    System.out.println("Seu saldo após o saque é igual a " + saldo);
                }
            }else{
                System.out.println("Operação Inválida");
            }
        }



        }
    }

