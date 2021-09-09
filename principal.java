import java.util.Scanner;
public class principal{
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        Contas c= new Contas ();
        System.out.println("Digite o nome da conta ");
        c.titular=ler.nextLine();
        System.out.println("Digite o numero da conta ");
        c.numero=ler.nextInt();
        System.out.println("Digite o saldo da conta ");
        c.saldo=ler.nextInt();


}
}
