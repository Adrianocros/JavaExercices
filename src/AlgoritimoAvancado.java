public class AlgoritimoAvancado {
    public static void main(String[] args) {
        ListaAlunos listaAlunos = new ListaAlunos();

        Alunos alunos1 = new Alunos();
        alunos1.nome = "Renato";
        listaAlunos.adicionar(alunos1);

        Alunos alunos2 = new Alunos();
        alunos2.nome = "Adriano";
        listaAlunos.adicionar(alunos2);

        Alunos alunos3 = new Alunos();
        alunos3.nome = "Zeferino";
        listaAlunos.adicionar(alunos3);

        Alunos alunos4 = new Alunos();
        alunos4.nome = "Lucio";
        listaAlunos.adicionar(alunos4);

        Alunos alunos5 = new Alunos();
        alunos5.nome = "Lilian";
        listaAlunos.adicionar(alunos5);

        Alunos alunos6 = new Alunos();
        alunos6.nome = "Yasmin";
        listaAlunos.adicionar(alunos6);

        Alunos alunos7 = new Alunos();
        alunos7.nome = "Tamires";
        listaAlunos.adicionar(alunos7);

        Alunos alunos8 = new Alunos();
        alunos8.nome = "Marcos";
        listaAlunos.adicionar(alunos8);

        interar(listaAlunos);

        //Remove o aluno
        listaAlunos.remover(alunos3);

        interar(listaAlunos);

        listaAlunos.ordenar();

        interar(listaAlunos);
    }
    //metodo para ordenar criado para organizar
    static  void  interar(ListaAlunos listaAlunos){
        for(int i=0; i<listaAlunos.tamanho();i++){
            Alunos a = listaAlunos.obter(i);
            if( a != null) {
                System.out.println("Aluno: " + a.nome);
            }else{
                System.out.println("Aluno sem nome !!");
            }
        }
        System.out.println("-----------------------");
    }

}
