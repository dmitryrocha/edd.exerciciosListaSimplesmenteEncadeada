package listaDeExercicios03;

public class Lista {

    Aluno inicioAluno = null;
    Aluno fimAluno = null;

    //Método feito apenas para testar a classe aluno em uma lista simplesmente encadeada
    public void inserirAluno(int matricula, String nome, float media){
        Aluno novoAluno = new Aluno();
        novoAluno.matricula = matricula;
        novoAluno.nome = nome;
        novoAluno.mediaDisciplina = media;

        if(inicioAluno == null) {
            inicioAluno = novoAluno;
        } else {
            Aluno auxAluno = inicioAluno;
            while(auxAluno.proxAluno != null) {
                auxAluno = auxAluno.proxAluno;
            }

            auxAluno.proxAluno = novoAluno;
            fimAluno = novoAluno;
        }
    }

    public Aluno ins_ordenado(Aluno inicio, Aluno fim, int mat, String nome, float nota) {

        Aluno novoAluno = new Aluno();
        novoAluno.matricula = mat;
        novoAluno.nome = nome;
        novoAluno.mediaDisciplina = nota;

        if(inicioAluno == null) {
            //A lista está vazia, colocando o primeiro aluno na lista
            inicioAluno = new Aluno();
            inicioAluno.matricula = mat;
            inicioAluno.nome = nome;
            inicioAluno.mediaDisciplina = nota;
            return inicioAluno;
        } else {
            Aluno auxAluno = inicioAluno;
            Aluno antAluno = new Aluno();

            while(auxAluno.proxAluno!=null && auxAluno.matricula < mat) {
                antAluno = auxAluno;
                auxAluno = auxAluno.proxAluno;
            }

            if(antAluno == null && novoAluno.matricula > auxAluno.matricula) {
                novoAluno.proxAluno = inicioAluno;
                inicioAluno = novoAluno;
            } else if(auxAluno.proxAluno == null && novoAluno.matricula > auxAluno.matricula) {
                auxAluno.proxAluno = novoAluno;
                fimAluno = novoAluno;
            } else {
                antAluno.proxAluno = novoAluno;
                novoAluno.proxAluno = auxAluno;
            }

        }
        return novoAluno;
    }

    public void imprimirAlunos() {

        if(inicioAluno == null) {
            System.out.println("Lista vazia!");
        }else {


            Aluno auxAluno = inicioAluno;

            String linhas = "-------------------------------------";
            System.out.println("Lista de Alunos");
            while(auxAluno!=null) {
                System.out.println("Matrícula: "+auxAluno.matricula);
                System.out.println("Nome: "+auxAluno.nome);
                System.out.println("Média: "+auxAluno.mediaDisciplina);
                System.out.println(linhas);

                auxAluno=auxAluno.proxAluno;

            }
        }
        System.out.println(" ");
    }

}

