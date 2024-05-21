package entidades;

import java.util.ArrayList;
import java.util.List;

//Ex1
public class Paciente {

    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double pressaoArterial;
    private double frequenciaCardiaca;
    private String dietaAlimentar;
    private List<String> atividadesFisicas;

    // Construtor
    public Paciente(String nome, int idade, double peso, double altura, double pressaoArterial, double frequenciaCardiaca, String dietaAlimentar) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.pressaoArterial = pressaoArterial;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.dietaAlimentar = dietaAlimentar;
        this.atividadesFisicas = new ArrayList<>();
    }
//Ex3
    // Métodos
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String monitorarPaciente() {
        double imc = calcularIMC();
        return "Nome: " + nome + "\n" +
                "Idade: " + idade + " anos\n" +
                "Peso: " + peso + " kg\n" +
                "Altura: " + altura + " m\n" +
                "Pressão Arterial: " + pressaoArterial + "\n" +
                "Frequência Cardíaca: " + frequenciaCardiaca + " bpm\n" +
                "Dieta Alimentar: " + dietaAlimentar + "\n" +
                "IMC: " + imc;
    }

    public void registrarAtividadeFisica(String atividade) {
        atividadesFisicas.add(atividade);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(double pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public double getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(double frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public String getDietaAlimentar() {
        return dietaAlimentar;
    }

    public void setDietaAlimentar(String dietaAlimentar) {
        this.dietaAlimentar = dietaAlimentar;
    }
}
