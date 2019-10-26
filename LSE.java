package listaDeExercicios03;

public class LSE implements ILSE {
    No inicio = null;

    public void inserir(int valor) {

        No novo = new No();
        novo.valor = valor;

        if(inicio==null) {
            inicio = novo;
        }else {
            No aux = inicio;
            while(aux.prox != null) {
                aux = aux.prox;
            }

            aux.prox = novo;

        }

    }


    public void remover(int valor) {

        if(inicio==null) {
            System.out.println("Lista vazia!");
        }else {
            No ant = null;
            No aux = inicio;
            while(aux.prox!=null&&aux.valor!=valor) {
                ant=aux;
                aux=aux.prox;
            }
            if(aux.valor==valor) {
                if(ant==null) {
                    inicio=inicio.prox;
                }else if(aux.prox==null) {
                    ant.prox=null;
                    aux=null;
                }else {
                    ant.prox=aux.prox;
                    aux=null;
                }
            }else {
                System.out.println("Elemento não encontrado!");
            }

        }

    }


    public No buscar(int chave) {

        if(inicio==null) {
            System.out.println("Lista vazia!");
        }else {
            No aux = inicio;
            while(aux.prox!=null&&aux.valor!=chave) {
                aux=aux.prox;
            }
            if(aux.valor==chave) {
                return aux;
            }
        }

        return null;
    }

    public void alterar(int chave, int novoValor) {

        if(inicio==null) {
            System.out.println("Lista vazia!");
        }else {
            No aux = inicio;
            while(aux.prox!=null&&aux.valor!=chave) {
                aux=aux.prox;
            }
            if(aux.valor==chave) {
                aux.valor=novoValor ;
            }

        }

    }

    public void imprimir() {

        if(inicio==null) {
            System.out.println("Lista vazia!");
        }else {
            No aux = inicio;
            while(aux!=null) {
                System.out.print(aux.valor + " ");
                aux=aux.prox;
            }
        }
        System.out.println("");
    }

    public LSE questao01(LSE l, int n) {
        int count = 0;
        LSE listaRetorno = new LSE();
        boolean inseriu = false;
        if(inicio == null) {
            System.out.println("A lista está vazia");
        }else {
            No aux = inicio;
            while (aux != null) {
                if(aux.valor == n){
                    inseriu = true;
                    aux = aux.prox;
                    while(aux != null) {
                        listaRetorno.inserir(aux.valor);
                        aux = aux.prox;
                    }
                }
                if(!inseriu) {
                    aux = aux.prox;
                }
            }
        }
        if(!inseriu){
            System.out.println("O número escolhido não estava na lista");
            listaRetorno.inicio = null;

        }
            return listaRetorno;
    }

    public LSE questao02(LSE l1, LSE l2){
        LSE listaRetorno = new LSE();
        No aux = new No();
        if (l1.inicio == null && l2.inicio == null){
            System.out.println("As duas listas estão vazias");
            listaRetorno.inicio = null;
            return listaRetorno;
        } else if (l1.inicio == null) {
            listaRetorno = l2;
        } else if (l2.inicio == null) {
            listaRetorno = l1;
        } else {
            aux = l1.inicio;
            while(aux!= null){
                listaRetorno.inserir(aux.valor);
                aux = aux.prox;
            }
            aux = l2.inicio;
            while(aux!= null){
                listaRetorno.inserir(aux.valor);
                aux = aux.prox;
            }
        }


        return listaRetorno;
    }

    public LSE questao03 (int[] vetor) {
        LSE lista = new LSE();

        if(vetor.length == 0){
            lista.inicio = null;
            return lista;
        } else {
            for(int i=0;i<vetor.length;i++) {
                for(int j=i; j>0 && vetor[j]<vetor[j-1];j--) {

                    int temp=vetor[j-1];
                    vetor[j-1]=vetor[j];
                    vetor[j]=temp;

                }
            }
        }
        for(int i=0; i<vetor.length;i++){
            lista.inserir(vetor[i]);
        }
        return lista;
    }

    public LSE questao04(LSE listaInicio, int n) {
        LSE listaRetorno = new LSE();
        int tamanho = listaInicio.tamanho();
        int count = 0;
        if(tamanho < n) {
            System.out.println("O número passado foi maior que o tamanho da lista");
            listaRetorno.inicio = null;
            return listaRetorno;
        } else {
            No aux = listaInicio.inicio;
            while(aux!=null){
                if(count >= n) {
                    listaRetorno.inserir(aux.valor);
                }
                count++;
                aux = aux.prox;
            }
        }
        return listaRetorno;
    }

    public int tamanho() {
        int count = 0;
        if(inicio == null) {
            System.out.println("A lista está vazia");
            return -1;
        } else {
            No aux = inicio;
            while(aux!=null){
                count++;
                aux=aux.prox;
            }
        }
        return count;
    }
}
