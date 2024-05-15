import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class usuario {
    private String nome, cpf;
    private Date data;
    private int id;
    /*nome: String

    cpf: String

    data nascimento: Date

    id: int

    escola (exclusivo do aluno): String

    formação (exclusivo professor): String

    livrosAlugados(2 para morador, 5 para aluno, 10 para professor): Livro[]

    boolean devolverLivro(Livro): deverá fazer a devolução de um livro

    boolean pegarLivro(Livro): deverá pegar um livro para empréstimo

    void imprimirLivros(): deverá imprimir todos os livros que estão em empréstimo pelo usuário*/

    usuario(String nome, String cpf, Date data, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.id = id;
    }

    usuario(){}

    public Date getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void imprimir(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(data);
        System.out.println(id);
    }
}
