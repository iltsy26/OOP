package Lab8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Program {

    static Double Z = 0.0;
   
    public static void main(String[] args) {
           JFrame fr = new JFrame();
        fr.setSize(480, 250);  
        fr.setTitle("Приложение 1");  
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        JButton b1 = new JButton("Считать");
        ButtonGroup group = new ButtonGroup();
        JRadioButton c1 = new JRadioButton("Вариант 1", true);
        group.add(c1);
        JRadioButton c2 = new JRadioButton("Вариант 2", false);
        group.add(c2);
        final JTextField f1 = new JTextField(8);
        final JTextField f2 = new JTextField(8);
        final JTextField f3 = new JTextField(8);
        final JTextField f4 = new JTextField(8);
        final JTextField f5 = new JTextField(8);
        final JTextField f6 = new JTextField(8);
        final JTextField f7 = new JTextField(8);
        final JTextField f8 = new JTextField(18);
    	JLabel l1 = new JLabel("N:");
    	JLabel l2 = new JLabel("R:");
    	JLabel l3 = new JLabel("a:");
    	JLabel l4 = new JLabel("b:");
    	JLabel l5 = new JLabel("c:");
    	JLabel l6 = new JLabel("X:");
    	JLabel l7 = new JLabel("Y:");
    	JLabel l8 = new JLabel("Z =");
        fr.add(l1);
        fr.add(f1);
        fr.add(l2);
        fr.add(f2);
        fr.add(l3);
        fr.add(f3);
        fr.add(l4);
        fr.add(f4);
        fr.add(l5);
        fr.add(f5);
        fr.add(l6);
        fr.add(f6);
        fr.add(l7);
        fr.add(f7);
        fr.add(c1);
        fr.add(c2);
        fr.add(b1);
        fr.add(l8);
        fr.add(f8);
 

        c1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer N = Integer.parseInt(f1.getText());
                Double X = Double.parseDouble(f6.getText());
                Double Y = Double.parseDouble(f7.getText());
                 
                Z = Func1(X, Y, N);
            }
        });
        
        c2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer N = Integer.parseInt(f1.getText());
                Integer R = Integer.parseInt(f2.getText());
                Double a = Double.parseDouble(f3.getText());
                Double b = Double.parseDouble(f4.getText());
                Double c = Double.parseDouble(f5.getText());
                 
                Z = Func2(N, R, a, b, c);
            }
        });
        
        b1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            	f8.setText(Double.toString(Z));
            }
        });
        
    }
    
    public static double Func1(double X, double Y, int N) {
		double res = 0, znam = 2, chisl = 0;
		int znak = -1, mn_zn = 3;
		for(int i = 1; i <= N ;i++)
		{
			if(i / 3 == 0)
			{
				chisl = znak * Math.pow(X, i);
			}
			else if(i / 3 != 0)
			{
				chisl = znak * Math.pow(Y, i);
			}
			znam = mn_zn * znam;
			znak *= -1;
			res += chisl / znam;
		}
		return res;
    }
    
    public static double Func2(int N, int R, double a, double b, double c) {
		double res = 0;
		for(int i = 1; i <= N ;i++) {
			for(int j = 1; j <= R ;j++) {
				res += (a * i + b * j)/(c * Math.pow(i, j));
			}
		}
		return res;
    }
}