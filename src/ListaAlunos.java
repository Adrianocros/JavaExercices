import java.util.ArrayList;

public class ListaAlunos {

    static  final int QUANTIDADE_LISTA = 1;

        Alunos[] lista = new Alunos[QUANTIDADE_LISTA];

    int tamanhoLista = 0;

    Alunos obter(int indice){
        return lista[indice];
    }
    int tamanho(){
     return  tamanhoLista;
    }
    //Tratando para lamtentar o tamanho do array.
    void  adicionar(Alunos alunos){
        if(lista.length == tamanhoLista){
            Alunos[] newLista = new Alunos[QUANTIDADE_LISTA + lista.length];

            for(int i=0; i<lista.length;i++){
                newLista[i] = lista[i];
            }
            lista = newLista;
        }
        lista[tamanhoLista] = alunos;
        tamanhoLista++;

    }

    void  remover (Alunos alunos){
        for(int i=0; i<tamanhoLista;i++){
            Alunos a = lista[i];
            //Não deixa o valor null no array
            if(a != null && a.equals(alunos)){
                remover(i);
                break;
                //Verifica se a variavel tem valor
            }else if(a == null && alunos == null){
                remover(i);
                break;
            }

        }
    }
    //remove o nome e nao deixa null sobe e ocupa o espaço do removio
    void  remover(int indice){
        int indiceInicial = indice + 1;
        for(int i=indiceInicial; i<tamanhoLista; i++){
            lista[i - 1] = lista[i];
        }
        tamanhoLista --;
        //limpando a posição apagada
        lista[tamanhoLista] = null;

    }
    //Metodo para ordenar o vetor de alunos
    void ordenar() {
        System.out.println("Inicio da ordenação *******************************");
        for (int i = 1; i < tamanhoLista; i++) {
            System.out.println("Inicio do FOR");
            Alunos alunoPosicaoBase = lista[i];
            System.out.println("Posição " + i + " : " + alunoPosicaoBase.nome);
            int indicePosicaoBase = i;

            while (indicePosicaoBase > 0) {
                System.out.println("Inicio while");
                int indicePosicaoAnterior = indicePosicaoBase - 1;
                Alunos alunoPosicaoAnterior = lista[indicePosicaoAnterior];
                System.out.println("Posição Anterior  " + indicePosicaoAnterior + " : " + alunoPosicaoAnterior.nome);
                Boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null
                        || alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase);
                if (alunoPosicaoAnteriorVemDepoisDe) {
                    System.out.println("Iniciio do IF");
                    lista[indicePosicaoBase] = lista[indicePosicaoAnterior];
                    indicePosicaoBase--;
                } else {
                    break;
                }
                lista[indicePosicaoBase] = alunoPosicaoBase;

            }
            System.out.println("Fim ******************************************");
        }

    }

}
