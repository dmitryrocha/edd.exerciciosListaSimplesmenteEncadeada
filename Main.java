package listaDeExercicios03;

public class Main {
    public static void main(String[] args) {
        executa(new LSE());
        executaQ5(new Lista());
    }

    private static void executa(LSE lista) {

        lista.inserir(3);
        lista.inserir(17);
        lista.inserir(5);
        lista.inserir(12);
        lista.inserir(1);
        lista.inserir(14);
        lista.imprimir();

        LSE lista2 = new LSE();
        lista2.inserir(3);
        lista2.inserir(4);
        lista2.inserir(67);
        lista2.inserir(34);
        lista2.inserir(12);
        lista2.inserir(88);
        lista2.inserir(2);
        lista2.inserir(1);
        lista2.imprimir();


        System.out.println("Questão 01");
        LSE listaRetorno = lista2.questao01(lista, 67);
        listaRetorno.imprimir();
        System.out.println("\nQuestão 02");
        listaRetorno = lista.questao02(lista,lista2);
        listaRetorno.imprimir();

        System.out.println("\nQuestão 03");
        int[] vetor = {24, 5, 36, 12, 55, 2, 9};
        listaRetorno = listaRetorno.questao03(vetor);
        listaRetorno.imprimir();

        System.out.println("\nQuestão 04:");
        listaRetorno = listaRetorno.questao04(lista2, 4);
        listaRetorno.imprimir();

    }

    public static void executaQ5 (Lista lista3) {


        System.out.println("\nQuestão 5:");

//        lista3.inserirAluno(1,"Dmitry", 9.5f);
//        lista3.inserirAluno(3,"Isabel", 9.75f);
//        lista3.inserirAluno(2,"Sabrina",8.2f);
        Aluno aluno1 = lista3.ins_ordenado(null,null,1,"Janeway",9.5f);
        Aluno aluno2 = lista3.ins_ordenado(aluno1, null, 3,"Paris", 9.75f);
        Aluno aluno3 = lista3.ins_ordenado(aluno1,aluno2,2,"The Doctor",8.2f);
        Aluno aluno4 = lista3.ins_ordenado(aluno1, aluno2,5,"Tuvok",4.3f);
        Aluno aluno5 = lista3.ins_ordenado(aluno1,aluno2,4,"Chakotey",8.32f);
        lista3.imprimirAlunos();

    }


}
