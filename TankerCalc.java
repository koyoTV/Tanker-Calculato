import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TankerCalc
{
	//controls for da app
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	//contructor
	public TankerCalc()
	{
		prepareGUI();
	}

	//entry point
	public static void main(String[] args)
	{
		TankerCalc swingTankerCalc = new TankerCalc();
		swingTankerCalc.showTextField();
	}

	//setup for gui enviroment
	private void prepareGUI()
	{
		//setup app frame
		mainFrame = new JFrame("tank calculator");
		mainFrame.setSize(500,500);
		mainFrame.setLayout(new GridLayout(3,1));

		//setup labels
		headerLabel = new JLabel("",JLabel.CENTER );
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350,100);

		mainFrame.addWindowListender(new WindowsAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
			});
		
		}
		//add controls
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}
		//action listener for button click
		public class ButtonClickListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				String command = e.getActionCommand();

			}
		}
	//display controls
	private void showTextField()
	{
		//set values for controls
		rateLabel = new JLabel("average consumed per day (oz): ");

		final int FIELD_WIDTH = 10;
		rateField = new JTextField(FIELD_WIDTH);
		rateField.setText(" " + DEFAULT_RATE);

	

		//place controls on panels

		//dont forget to set visibilty
	}
}