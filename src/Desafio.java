import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nmUser = "Weslley", tpConta = "Corrente";
        Scanner scan = new Scanner(System.in);
        int vDigitado;
        double vSaldo = 2500.00, vTransf = 0;
        System.out.printf("""
            ************************************
            Nome:             %s
            Tipo conta:       %s
            Saldo inicial:    RS %.2f
            ************************************
            
            """, nmUser, tpConta, vSaldo);
        while(true){
        System.out.println("Operações\n\n1-Consultar saldos\n2-Receber valor\n3-Transferir valor\n4-Sair");
        vDigitado = scan.nextInt();
            switch (vDigitado) {
                case 1:
                    System.out.printf("""
                    ************************************
                    Nome:             %s
                    Tipo conta:       %s
                    Saldo inicial:    RS %.2f
                    ************************************
                    
                    """, nmUser, tpConta, vSaldo);
                    break;
                case 2:
                    System.out.println("Quanto deseja Receber?\n");
                    vTransf = scan.nextDouble();
                    if (vTransf >= 0){vSaldo+=vTransf;System.out.println("Completo!\n");}
                    else System.out.println("Erro!\n");
                    break;
                case 3:
                    System.out.println("Quanto deseja transferir?\n");
                    vTransf = scan.nextDouble();
                    if (vTransf >= 0 && vSaldo >= vTransf){vSaldo -= vTransf;System.out.println("Completo!");}
                    else{System.out.println("Erro!");}
                    break;
                case 4:
                    scan.close();
                    return;
                default:
                    System.out.println("Erro!");
                    return;
            }
        }
    }
}
