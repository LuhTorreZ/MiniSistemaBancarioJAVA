
public class Usuarios {
    String nome;
    String CPF;
    String dataDeNascimento;
    private double saldo; // Usamos 'private' para proteger o acesso direto ao saldo

    // Construtor da classe para inicializar o saldo como 0
    public Usuarios() {
        this.saldo = 0.0;
    }

    // --- MÉTODOS DA CONTA ---

    // Método para adicionar um valor ao saldo
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para retirar um valor do saldo
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true; // Retorna true se o saque foi bem-sucedido
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido.");
            return false; // Retorna false se não foi possível sacar
        }
    }

    // Método para obter o saldo atual (extrato)
    public double getSaldo() {
        return this.saldo;
    }


    // Método toString para imprimir os dados do usuário de forma legível
    @Override
    public String toString() {
        return "Cliente: " + nome + " | CPF: " + CPF;
    }
}