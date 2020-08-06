import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Veiculo> listaVeiculos = new ArrayList<>();
    List<Aluno> listaAlunos = new ArrayList<>();
    List<Aula> listaAulas = new ArrayList<>();

    void main(String[] args) {
        Veiculo veiculoUno = new Veiculo();
        veiculoUno.modelo = "Uno";
        veiculoUno.quantidadeAulas = 0;
        listaVeiculos.add(veiculoUno);

        Aluno alunoDaniel = new Aluno();
        alunoDaniel.nome = "Dan";
        alunoDaniel.idade = 45;
        alunoDaniel.valorDevido = 0;
        listaAlunos.add(alunoDaniel);

        Aula aula = new Aula();
        aula.veiculo = veiculoUno;
        aula.aluno = alunoDaniel;
        aula.data = "06/08/2020";
        listaAulas.add(aula);
    }

    boolean verificarVeiculo(Veiculo veiculo) {
        for (Veiculo v : listaVeiculos) {
            if (v == veiculo) {
                return true;
            }
        }
        return false;
    }

    boolean verificarValorDevido(Aluno aluno) {
        for (Aluno a : listaAlunos) {
            if (a == aluno) {
                if (a.valorDevido > 200) {
                    return true;
                }
            }
        }
        return false;
    }

    void listarAlunosJovens() {
        for (Aluno a : listaAlunos) {
            if (a.idade >= 18 && a.idade <= 25) {
                System.out.println(a.nome);
                System.out.println(a.idade);
                System.out.println(a.valorDevido);
            }
        }
    }

    void removerAluno(Aluno aluno) {
        for (Aluno a : listaAlunos) {
            if (a == aluno) {
                listaAlunos.remove(a);
            }
        }
    }
}
