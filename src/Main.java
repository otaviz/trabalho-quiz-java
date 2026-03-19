    public class Main {
        public static void main(String[] args) {


            Cabecalho c = new Cabecalho();
            c.faculdade = "Centro Universitário Alfredo Nasser - UNIFAN";
            c.aluno = "Otávio Augusto dos Reis Nascente e Costa";
            c.professor = "Brenno Pimenta da Costa";
            c.disciplina = "Algoritmos e Programação II";
            c.tema = "Quiz De Conhecimentos Gerais Básicos";


            c.escrevaCabecalho();

            System.out.println("////////////////////////////////////////////////////////");
            System.out.println("    BEM-VINDO(A)cAO QUIZ CONHECIMENTOS GERAIS BÁSICOS!    ");
            System.out.println("////////////////////////////////////////////////////////");

            int totalAcertos = 0;


            Questao q1 = new Questao();
            q1.pergunta = "1) Qual é o maior animal terrestre?";
            q1.opcaoA = "A) Cavalo";
            q1.opcaoB = "B) Girafa";
            q1.opcaoC = "C) Elefante";
            q1.opcaoD = "D) Leão";
            q1.opcaoE = "E) Urso";
            q1.correta = "C";


            q1.escrevaQuestao();
            if (q1.isCorreta(q1.leiaResposta())) {
                totalAcertos++;
            }


            Questao q2 = new Questao();
            q2.pergunta = "2) Quanto é 12 + 8?";
            q2.opcaoA = "A) 18";
            q2.opcaoB = "B) 20";
            q2.opcaoC = "C) 19";
            q2.opcaoD = "D) 21";
            q2.opcaoE = "E) 24";
            q2.correta = "B";


            q2.escrevaQuestao();
            if (q2.isCorreta(q2.leiaResposta())) {
                totalAcertos++;
            }

            Questao q3 = new Questao();
            q3.pergunta = "3) Qual desses é um planeta do Sistema Solar?";
            q3.opcaoA = "A) Sol";
            q3.opcaoB = "B) Lua";
            q3.opcaoC = "C) Terra";
            q3.opcaoD = "D) Estrela";
            q3.opcaoE = "E) Cometa";
            q3.correta = "C";


            q3.escrevaQuestao();
            if (q3.isCorreta(q3.leiaResposta())) {
                totalAcertos++;
            }

            Questao q4 = new Questao();
            q4.pergunta = "4) Qual é a capital da França?";
            q4.opcaoA = "A) Roma";
            q4.opcaoB = "B) Madri";
            q4.opcaoC = "C) Berlim";
            q4.opcaoD = "D) Lisboa";
            q4.opcaoE = "E) Paris";
            q4.correta = "E";

            q4.escrevaQuestao();
            if (q4.isCorreta(q4.leiaResposta())) {
                totalAcertos++;
            }

            Questao q5 = new Questao();
            q5.pergunta = "5) Quantas horas tem um dia?";
            q5.opcaoA = "A) 24";
            q5.opcaoB = "B) 18";
            q5.opcaoC = "C) 12";
            q5.opcaoD = "D) 30";
            q5.opcaoE = "E) 36";
            q5.correta = "A";

            q5.escrevaQuestao();
            if (q5.isCorreta(q5.leiaResposta())) {
                totalAcertos++;
            }

            Questao q6 = new Questao();
            q6.pergunta = "6) Qual desses animais vive na água?";
            q6.opcaoA = "A) Cachorro";
            q6.opcaoB = "B) Peixe";
            q6.opcaoC = "C) Gato";
            q6.opcaoD = "D) Cavalo";
            q6.opcaoE = "E) Leão";
            q6.correta = "B";

            q6.escrevaQuestao();
            if (q6.isCorreta(q6.leiaResposta())) {
                totalAcertos++;
            }

            Questao q7 = new Questao();
            q7.pergunta = "7) Qual o resultado de 9 x 5?";
            q7.opcaoA = "A) 40";
            q7.opcaoB = "B) 50";
            q7.opcaoC = "C) 60";
            q7.opcaoD = "D) 45";
            q7.opcaoE = "E) 55";
            q7.correta = "D";

            q7.escrevaQuestao();
            if (q7.isCorreta(q7.leiaResposta())) {
                totalAcertos++;
            }

            Questao q8 = new Questao();
            q8.pergunta = "8) Qual desses é um país?";
            q8.opcaoA = "A) África";
            q8.opcaoB = "B) América";
            q8.opcaoC = "C) Brasil";
            q8.opcaoD = "D) Europa";
            q8.opcaoE = "E) Ásia";
            q8.correta = "C";

            q8.escrevaQuestao();
            if (q8.isCorreta(q8.leiaResposta())) {
                totalAcertos++;
            }

            Questao q9 = new Questao();
            q9.pergunta = "9) Qual é o oposto de alto?";
            q9.opcaoA = "A) Grande";
            q9.opcaoB = "B) Forte";
            q9.opcaoC = "C) Largo";
            q9.opcaoD = "D) Rápido";
            q9.opcaoE = "E) Baixo";
            q9.correta = "E";

            q9.escrevaQuestao();
            if (q9.isCorreta(q9.leiaResposta())) {
                totalAcertos++;
            }

            Questao q10 = new Questao();
            q10.pergunta = "10) Qual desses é um meio de transporte?";
            q10.opcaoA = "A) Mesa";
            q10.opcaoB = "B) Livro";
            q10.opcaoC = "C) Carro";
            q10.opcaoD = "D) Porta";
            q10.opcaoE = "E) Janela";
            q10.correta = "C";

            q10.escrevaQuestao();
            if (q10.isCorreta(q10.leiaResposta())) {
                totalAcertos++;
            }

            Questao q11 = new Questao();
            q11.pergunta = "11) Quantos lados tem um quadrado?";
            q11.opcaoA = "A) 4";
            q11.opcaoB = "B) 3";
            q11.opcaoC = "C) 5";
            q11.opcaoD = "D) 6";
            q11.opcaoE = "E) 8";
            q11.correta = "A";

            q11.escrevaQuestao();
            if (q11.isCorreta(q11.leiaResposta())) {
                totalAcertos++;
            }

            Questao q12 = new Questao();
            q12.pergunta = "12) Qual desses alimentos é um doce?";
            q12.opcaoA = "A) Arroz";
            q12.opcaoB = "B) Feijão";
            q12.opcaoC = "C) Carne";
            q12.opcaoD = "D) Chocolate";
            q12.opcaoE = "E) Ovo";
            q12.correta = "D";

            q12.escrevaQuestao();
            if (q12.isCorreta(q12.leiaResposta())) {
                totalAcertos++;
            }

            Questao q13 = new Questao();
            q13.pergunta = "13) Qual desses animais voa?";
            q13.opcaoA = "A) Cachorro";
            q13.opcaoB = "B) Hipopótamo";
            q13.opcaoC = "C) Gato";
            q13.opcaoD = "D) Tubarão";
            q13.opcaoE = "E) Pássaro";
            q13.correta = "E";

            q13.escrevaQuestao();
            if (q13.isCorreta(q13.leiaResposta())) {
                totalAcertos++;
            }

            Questao q14 = new Questao();
            q14.pergunta = "14) Qual número vem antes de 50?";
            q14.opcaoA = "A) 67";
            q14.opcaoB = "B) 49";
            q14.opcaoC = "C) 55";
            q14.opcaoD = "D) 45";
            q14.opcaoE = "E) 48";
            q14.correta = "B";

            q14.escrevaQuestao();
            if (q14.isCorreta(q14.leiaResposta())) {
                totalAcertos++;
            }

            Questao q15 = new Questao();
            q15.pergunta = "15) Qual desses é um objeto usado na escola?";
            q15.opcaoA = "A) Lápis";
            q15.opcaoB = "B) Colher";
            q15.opcaoC = "C) Garfo";
            q15.opcaoD = "D) Panela";
            q15.opcaoE = "E) Copo";
            q15.correta = "A";

            q15.escrevaQuestao();
            if (q15.isCorreta(q15.leiaResposta())) {
                totalAcertos++;
            }


            System.out.println("==============================================================");
            System.out.println("QUIZ FINALIZADO!");
            System.out.println("Você acertou " + totalAcertos + " de 15 perguntas.");
            System.out.println("==============================================================");
        }
    }

