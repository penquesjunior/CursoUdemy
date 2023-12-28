package ExVetorMatrix.Etities;

/**
 * Altura
 */
public class Altura {

    private String name;
    private int idade;
    private double altura;

    public Altura(String name, int idade, double altura) {
        super();
        this.altura = altura;
        this.idade = idade;
        this.name = name;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getName() {
        return name;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setName(String name) {
        this.name = name;
    }

}