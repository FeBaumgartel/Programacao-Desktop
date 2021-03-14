package dataservices;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;


public class Persistencia {

    private static List<Aluno> listaDeAluno = new ArrayList<>();

    public static List<Aluno> list() {

        return listaDeAluno;
    }

    public static void save(Aluno a) {
        if (!listaDeAluno.isEmpty()){
            if (verificarExistenciaDeAluno(a)){
                delete(a);
                listaDeAluno.add(a);
            }else{
                listaDeAluno.add(a);
            }
        }else
            listaDeAluno.add(a);
    }
    
    public static boolean verificarExistenciaDeAluno(Aluno a){
        for (int i = 0; i < listaDeAluno.size(); i++) {
            if (a.equals(listaDeAluno.get(i))){
                return true;
            }
        }
        return false;
    }
    
    public static void delete(Aluno a) {
        if (!listaDeAluno.isEmpty()) {
            for (int i = 0; i < listaDeAluno.size(); i++) {
                Aluno aluno = (Aluno) listaDeAluno.get(i);
                if (aluno.equals(a)) {
                    listaDeAluno.remove(a);
                }
            }
        }
    }
}