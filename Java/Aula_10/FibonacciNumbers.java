//Figura 23.25: Fibonacci Numbers.java
// Usando SwingWorker para realizar um calculo longo com
// resultados exibidos em uma GUI
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.util.concurrent.ExecutionException;



public class FibonacciNumbers extends JFrame
{
    //Componentes para calcular o número de Fibonacci inserido pelo usuário
    private final JPanel workerJpanel = 
        new JPanel(new GridLayout(2,2,5,5));
    private final JTextField numberJTextField = new JTextField();
    private final JButton gJButton= new JButton();
    private final JLabel fibonacciJLabel = new JLabel();

    //Componentes e variaveis para obter o proximo numero de Fibonacci
    private final JPanel eventThreadJPanel =
        new JPanel(new GridLayout(2,2,5,5));
    private long n1 = 0; //Inicializa com o primeiro numero ed Fibonacci
    private long n2 = 1; //Inicializa com o segundo numero ed Fibonacci
    private int count = 1;
    private final JLabel nJLabel = new JLabel("Fibonacci of 1: ");
    private final JLabel nFibonacciJLabel = 
        new JLabel(String.valueOf(n2));
    private final JButton nextNumberJButton = 
        new JButton("Next Number");
    
    //construtor
    public FibonacciNumbers()
    {
        super("Fibonacci Numbers");
        setLayout(new GridLayout(2,1,10,10));
        
        //adiciona componentes GUI ao painel SwingWorker
        workerJpanel.setBorder(new TitledBorder(
            new LineBorder(Color.BLACK), "With SwingWorker"));
        workerJpanel.add(new JLabel("Get Fibonacci of:"));
        workerJpanel.add(numberJTextField);
        gJButton.addActionListener(
            new ActionListener() 
            {
                public void actionPerformed(ActionEvent event)
                {
                    int n;

                    try
                    {
                        // recupera a entrado do usuario com um inteiro
                        n = Integer.parseInt(numberJTextField.getText());
                    }
                    catch(NumberFormatException ex)
                    {
                        // Exibe uma mensagem de erro se o usuario nao inseriu
                        // um numero inteiro
                        fibonacciJLabel.setText("Eneter a integer.");
                        return;
                    }

                    //indica que o calculo começou
                    fibonacciJLabel.setText("Calculating...");

                    //cria uma tarefa para realizar o calculo em segundo plano
                    BackgroundCalculator task =
                        new BackgroundCalculator(n, fibonacciJLabel);
                        task.execute(); //executa a tarefa
                }
            }//fim da classe interna anonima
        ); // fim da chamada para addActionListener
        workerJpanel.add(gJButton);
        workerJpanel.add(fibonacciJLabel);

        //adciona componentes GUI ao painel da thread de despacho de eventos
        eventThreadJPanel.setBorder(new TitledBorder(
            new LineBorder(Color.BLACK), "Without SwingWorker"));
        eventThreadJPanel.add(nJLabel);
        eventThreadJPanel.add(nFibonacciJLabel);
        nextNumberJButton.addActionListener(
            new ActionListener() 
            {
                public void actionPerformed(ActionEvent event)
                {
                    // calcula o numero de Fibonacci apos n2
                    long temp = n1 + n2;
                    n1 = n2;
                    n2 = temp;
                    ++count;

                    //exibe o proximo numero de Fibonacci
                    nJLabel.setText("Fibonacci of " + count + ": ");
                    nFibonacciJLabel.setText(String.valueOf(n2));
                }    
            } // fim da classe interna anonima
        ); //fim da chamada para addActionListener
        eventThreadJPanel.add(nextNumberJButton);

        add(workerJpanel);
        add(eventThreadJPanel);
        setSize(275,200);
        setVisible(true);
    } //fim do construtor
    // metodo main inicia a execução de programa
    public static void main(String[] args) 
    {
        FibonacciNumbers application = 
            new FibonacciNumbers();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
} //fim da classe Fibonacci Numbers
