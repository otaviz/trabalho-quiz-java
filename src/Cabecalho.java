public class Cabecalho {
    String faculdade = "";
    String aluno = "";
    String professor = "";
    String disciplina = "";
    String tema = "";

    public void escrevaCabecalho() {
        System.out.println("==============================================================");
        System.out.println("       " + this.faculdade.toUpperCase());
        System.out.println("==============================================================");
        System.out.println(" ALUNO:      " + this.aluno);
        System.out.println(" PROFESSOR:  " + this.professor);
        System.out.println(" DISCIPLINA: " + this.disciplina);
        System.out.println(" TEMA:       " + this.tema);
        System.out.println("==============================================================");
        System.out.println();
    }
}
