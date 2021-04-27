public class Alunos {

    String  nome;
    //Se String nome vem depois do nome passado abaixo
    boolean vemDepoisDe(Alunos alunos){
        if(alunos ==null){
            return false;
        }
     return nome.compareTo(alunos.nome)> 0;
    }
}
