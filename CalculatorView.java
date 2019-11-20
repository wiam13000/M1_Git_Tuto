
package tpihm;

// Le seul travail de la vue est d'afficher ce que l'utilisateur voit
// La vue n'effectue pas d'opérations

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{
        
	private JTextField firstNumber  = new JTextField(17);
        private JButton Number1JButton = new JButton("1");
        private JButton Number2JButton = new JButton("2");
        private JButton Number3JButton = new JButton("3");
        private JButton additionJButton = new JButton("+");
        
        private JButton Number4JButton = new JButton("4");
        private JButton Number5JButton = new JButton("5");
        private JButton Number6JButton = new JButton("6");
        private JButton SoustractionJButton = new JButton("-");
        
        private JButton Number7JButton = new JButton("7");
        private JButton Number8JButton = new JButton("8");
        private JButton Number9JButton = new JButton("9");
        private JButton MultiplicationJButton = new JButton("*");
        
        private JButton Number0JButton = new JButton("0");
        private JButton EgaliteJButton = new JButton("C");
        private JButton VerguleJButton = new JButton(",");
        private JButton DivisionJButton = new JButton("/");
        
	//private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("=");
	//private JTextField calcSolution = new JTextField(10);
        
	CalculatorView(){

                
		JPanel calcPanel = new JPanel();
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Vue Standard");
                this.setResizable(false);
		this.setSize(220, 260);
                // Ajouter une icone à la fenetre
		ImageIcon imgicon = new ImageIcon(
		new ImageIcon("IconCalculatrice.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
		this.setIconImage(imgicon.getImage());

		calcPanel.add(firstNumber);
                calcPanel.add(Number1JButton);
                calcPanel.add(Number2JButton);
                calcPanel.add(Number3JButton);
		calcPanel.add(additionJButton);

                calcPanel.add(Number4JButton);
                calcPanel.add(Number5JButton);
                calcPanel.add(Number6JButton);
                calcPanel.add(SoustractionJButton);

                calcPanel.add(Number7JButton);
                calcPanel.add(Number8JButton);
                calcPanel.add(Number9JButton);
                calcPanel.add(MultiplicationJButton);
                
                calcPanel.add(Number0JButton);
                calcPanel.add(calculateButton);
                calcPanel.add(VerguleJButton);
                calcPanel.add(DivisionJButton);
                calcPanel.add(EgaliteJButton);

		this.add(calcPanel);


	}

	public String getFirstNumber(){

		return firstNumber.getText();

	}

	

	

	public void setCalcSolution(String solution){

		firstNumber.setText(solution);

	}

	// Si on clique sur le bouton, on execute une méthode dans le controlleur

            void addCalculateListener(ActionListener listenForCalcButton){

		calculateButton.addActionListener(listenForCalcButton);

	}
            void test0(ActionListener listenerTest){
                Number0JButton.addActionListener(listenerTest);
            }
            void test1(ActionListener listenerTest){
                Number1JButton.addActionListener(listenerTest);
            }
            void test2(ActionListener listenerTest){
                Number2JButton.addActionListener(listenerTest);
            }
            void test3(ActionListener listenerTest){
                Number3JButton.addActionListener(listenerTest);
            }
            void test4(ActionListener listenerTest){
                Number4JButton.addActionListener(listenerTest);
            }
            void test5(ActionListener listenerTest){
                Number5JButton.addActionListener(listenerTest);
            }
            void test6(ActionListener listenerTest){
                Number6JButton.addActionListener(listenerTest);
            }
            void test7(ActionListener listenerTest){
                Number7JButton.addActionListener(listenerTest);
            }
            void test8(ActionListener listenerTest){
                Number8JButton.addActionListener(listenerTest);
            }
            void test9(ActionListener listenerTest){
                Number9JButton.addActionListener(listenerTest);
            }
            void test10(ActionListener listenerTest){
                MultiplicationJButton.addActionListener(listenerTest);
            }
            void test11(ActionListener listenerTest){
                EgaliteJButton.addActionListener(listenerTest);
            }
            void test12(ActionListener listenerTest){
                DivisionJButton.addActionListener(listenerTest);
            }
            void test13(ActionListener listenerTest){
                SoustractionJButton.addActionListener(listenerTest);
            }
            void test14(ActionListener listenerTest){
                additionJButton.addActionListener(listenerTest);
            }
            void test15(ActionListener listenerTest){
                VerguleJButton.addActionListener(listenerTest);
            }
            
        public void settypedtext(String s){
                
                 firstNumber.setText(firstNumber.getText()+ s);
	}

	void displayErrorMessage(String errorMessage){

		JOptionPane.showMessageDialog(this, errorMessage);

	}

    void cleartext() {
          firstNumber.setText("");
    }

    void setCalcSolutionbinaire(String calculationValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
