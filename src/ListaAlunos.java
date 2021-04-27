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
}
