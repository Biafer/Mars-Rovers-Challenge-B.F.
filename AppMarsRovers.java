package AppMarsRovers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppMarsRovers extends JFrame {

	ImageIcon iconImg = new ImageIcon(getClass().getResource("Img.jpg"));
	ImageIcon iconmars2020 = new ImageIcon(getClass().getResource("mars2020.png"));

	JLabel lImg = new JLabel(iconImg);
	JLabel lmars2020 = new JLabel(iconmars2020);

	int posmars2020X = 300;
	int posmars2020Y = 300;

	public AppMarsRovers() {
		editarJFrame();
		editarComponentes();
		addMovimento();
	}

	public void addMovimento() {
		addKeyListener(new KeyListener() {
			
			public void keyTyped (KeyEvent e) {
				
			}
			
			public void keyReleased (KeyEvent e) {
				
			}
			
			public void keyPressed (KeyEvent e) {
				if (e.getKeyCode()==77) {
					posmars2020Y -=10;
				}
				
				if (e.getKeyCode()==66) {
					posmars2020Y +=10;
				}

				if (e.getKeyCode()==76) {
					posmars2020X -=10;
				}
				
				if (e.getKeyCode()==82) {
					posmars2020X +=10;
				}
				
				lmars2020.setBounds(posmars2020X, posmars2020Y, 225, 139);
				
			}
			
		});
	}

	public void editarComponentes() {
		lImg.setBounds(0, 0, 872, 603);
		lmars2020.setBounds(posmars2020X, posmars2020Y, 225, 139);
	}

	public void editarJFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(872, 603);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		add(lmars2020);
		add(lImg);
	}

	public static void main(String[] args) {
		new AppMarsRovers();

	}

}
