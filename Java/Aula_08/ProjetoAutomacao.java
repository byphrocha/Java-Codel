class Semeadora {
    private int sementesDisponiveis;

    public Semeadora(int quantidadeInicial) {
        this.sementesDisponiveis = quantidadeInicial;
    }

    public void semear(int quantidade) throws SemeadoraException {
        if (quantidade > sementesDisponiveis) {
            throw new SemeadoraException("Não há sementes suficientes para semear!");
        } else {
            sementesDisponiveis -= quantidade;
            System.out.println(quantidade + " sementes semeadas. Sementes restantes: " + sementesDisponiveis);
        }
    }

    public void prepararSolo() throws PreparoSoloException {
        // Simula a preparação do solo
        // Aqui poderiam estar várias etapas de preparo do solo que podem gerar exceções
        System.out.println("Preparação do solo realizada.");
        // Exemplo de exceção simulada
        if (Math.random() < 0.5) {
            throw new PreparoSoloException("Erro na preparação do solo: solo muito úmido!");
        }
    }

    public void colher(int quantidade) throws ColheitaException {
        // Simula a colheita
        // Aqui poderiam estar várias etapas de colheita que podem gerar exceções
        if (quantidade <= 0) {
            throw new ColheitaException("Quantidade inválida para colheita!");
        } else {
            System.out.println(quantidade + " unidades colhidas.");
        }
    }
}

class SemeadoraException extends Exception {
    public SemeadoraException(String mensagem) {
        super(mensagem);
    }
}

class PreparoSoloException extends Exception {
    public PreparoSoloException(String mensagem) {
        super(mensagem);
    }
}

class ColheitaException extends Exception {
    public ColheitaException(String mensagem) {
        super(mensagem);
    }
}

public class ProjetoAutomacao {
    public static void main(String[] args) {
        Semeadora semeadora = new Semeadora(10); // Inicializa a semeadora com 10 sementes

        try {
            semeadora.prepararSolo();
        } catch (PreparoSoloException e) {
            System.out.println("Exceção na preparação do solo: " + e.getMessage());
        }

        try {
            semeadora.semear(7);
        } catch (SemeadoraException e) {
            System.out.println("Exceção na semeadura: " + e.getMessage());
        }

        try {
            semeadora.colher(5);
            semeadora.colher(0); // Tentativa de colher uma quantidade inválida
        } catch (ColheitaException e) {
            System.out.println("Exceção na colheita: " + e.getMessage());
        }
    }
}
