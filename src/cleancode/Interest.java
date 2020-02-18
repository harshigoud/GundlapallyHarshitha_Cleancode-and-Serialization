package cleancode;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

class SimpleInterest extends JFrame implements ActionListener {
	
	
	Label PrincipalAmount,TimePeriod,RateOfInterest,SI,CI;
	TextField Amount,Time,RateOfInterestInput,SimpleInterest,CompoundInterest;
	Button Interest;
	
	
	
SimpleInterest(){
	setLayout(null);
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	PrincipalAmount =new Label("Principal Amount:");
	add(PrincipalAmount);
	PrincipalAmount.setBounds(20, 50, 100, 20);
	Amount=new TextField(20);
	add(Amount);
	Amount.setBounds(120, 50, 150, 20);
	TimePeriod =new Label("Time Period:");
	add(TimePeriod);
	TimePeriod.setBounds(20, 80, 100, 20);
	Time=new TextField(20);
	add(Time);
	Time.setBounds(120, 80, 150, 20);
	
	RateOfInterest =new Label("Rate Of Interest:");
	add(RateOfInterest);
	RateOfInterest.setBounds(20, 110, 100, 20);
	RateOfInterestInput=new TextField(20);
	add(RateOfInterestInput);
	RateOfInterestInput.setBounds(120, 110, 150, 20);
	
	Interest = new Button("Calculate");
	add(Interest);
	Interest.setBounds(20, 140, 100, 20);
	
	SI=new Label("Simple Interest:");
	add(SI);
	SI.setBounds(20, 170, 100, 20);
	SimpleInterest=new TextField(20);
	add(SimpleInterest);
	SimpleInterest.setBounds(120, 170, 150, 20);
	SimpleInterest.setEditable(false);
	
	Interest.addActionListener(this);
	setVisible(true);
	
	CI=new Label("Compound Interest");
	add(CI);
	CI.setBounds(20, 200, 100, 20);
	CompoundInterest=new TextField(20);
	add(CompoundInterest);
	CompoundInterest.setBounds(120, 200, 150, 20);
	CompoundInterest.setEditable(false);
	Interest.addActionListener(this);
	setVisible(true);
}

	

public void actionPerformed(ActionEvent ae) {
	try {
		float amount = Float.parseFloat(Amount.getText());
		float time = Float.parseFloat(Time.getText());
		float rate = Float.parseFloat(RateOfInterestInput.getText());
		float simpleinterest=(amount*time*rate)/100;
		float compound=(float) (amount * Math.pow(1+rate/100,time)-amount);
		SimpleInterest.setText(String.valueOf(simpleinterest));
		CompoundInterest.setText(String.valueOf(compound));
	}catch(NumberFormatException ex) {
		JOptionPane.showMessageDialog(this,ex.getMessage());
	}
	
	
}
}
public class Interest{
	public static void main(String args[]) {
		SimpleInterest si=new SimpleInterest();
	}
}

