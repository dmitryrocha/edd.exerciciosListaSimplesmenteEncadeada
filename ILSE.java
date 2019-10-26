package listaDeExercicios03;

public interface ILSE {
    void inserir(int valor);
    void remover(int valor);
    No buscar(int chave);
    void alterar(int chave, int novoValor);
    void imprimir();
}
