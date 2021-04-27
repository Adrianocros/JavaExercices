public class AlgoritimoAvancado {
    public static void main(String[] args) {
        ListaAlunos lista = new ListaAlunos();

        Alunos alunos1 = new Alunos();
        alunos1.nome = "Maria";
        lista.adicionar(alunos1);

        Alunos alunos2 = new Alunos();
        alunos2.nome = "Joao";
        lista.adicionar(null);

        Alunos alunos3 = new Alunos();
        alunos3.nome = "Ricardo";
        lista.adicionar(alunos3);

        Alunos alunos4 = new Alunos();
        alunos4.nome = "Lucio";
        lista.adicionar(alunos4);

        Alunos alunos5 = new Alunos();
        alunos5.nome = "Alexandre";
        lista.adicionar(alunos5);

        for(int i=0; i<lista.tamanho();i++){
            Alunos a = lista.obter(i);
            if( a != null) {
                System.out.println("Aluno: " + a.nome);
            }else{
                System.out.println("Aluno sem nome !!");
            }
        }

        System.out.println("-----------------------");
//Remove o aluno
    lista.remover(alunos3);
        for(int i=0; i<lista.tamanho();i++){
            Alunos a = lista.obter(i);
            if( a != null) {
                System.out.println("Aluno: " + a.nome);
            }else{
                System.out.println("Aluno sem nome !!");
            }
        }


    }

}
