import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class aluno extends usuario{
    private String escola;
    private int maxLivros = 5;

    aluno(String nome, String cpf, Date data, int id, String escola){
        super(nome, cpf, data, id);
        this.escola = escola;
    }

    public static aluno cadastrar(){
        try {
            Scanner scan = new Scanner(System.in);
            String nome, cpf, dataTemp, escola;
            int id;

            System.out.println("Nome: ");
            nome = scan.nextLine();

            System.out.println("CPF: ");
            cpf = scan.nextLine();

            System.out.println("Data (dd/MM/yyyy): ");
            dataTemp = scan.next();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data = sdf.parse(dataTemp);

            System.out.println("ID: ");
            id = scan.nextInt();
            scan.nextLine();

            System.out.println("Escola");
            escola = scan.nextLine();

            return new aluno(nome, cpf, data, id, escola);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
