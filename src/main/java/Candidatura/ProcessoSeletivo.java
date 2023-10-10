package Candidatura;


import static Candidatura.Analisar.*;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);

        }
    }
}
