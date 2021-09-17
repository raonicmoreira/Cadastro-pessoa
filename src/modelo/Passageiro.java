package modelo;

public class Passageiro extends Pessoa{

    private int codigoCliente;

    public Passageiro(){}

    public Passageiro(String nome, String cpf, int codigoCliente) {
        super(nome, cpf);
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
}
