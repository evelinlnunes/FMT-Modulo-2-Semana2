package repositorios;
import entidades.Paciente;

import java.util.ArrayList;
import java.util.List;
//Ex2
public class Lista {

    private static List<Paciente> pacientes = new ArrayList<>();

    public static void adicionar(Paciente paciente) {
        pacientes.add(paciente);
    }

    public static List<Paciente> listar() {
        return pacientes;
    }

    public static Paciente buscarPorId(int id) {
        if (id >= 0 && id < pacientes.size()) {
            return pacientes.get(id);
        }
        return null;
    }

    public static void remover(int id) {
        if (id >= 0 && id < pacientes.size()) {
            pacientes.remove(id);
        }
    }

    public static void alterar(int id, Paciente paciente) {
        if (id >= 0 && id < pacientes.size()) {
            pacientes.set(id, paciente);
        }
    }
}
