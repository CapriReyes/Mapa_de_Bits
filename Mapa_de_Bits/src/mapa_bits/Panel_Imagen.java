package mapa_bits;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Panel_Imagen extends JPanel{
	BufferedImage img;
	public JButton btnGenerar=new JButton("Cambiar Colores------>>");
	Mapa_Panel panel=new Mapa_Panel();
	Panel_Nuevo panel2;
	int Contador=0;
	public JFrame pantalla;
	boolean si=true;
	public Panel_Imagen(JFrame pantalla){
		this.pantalla=pantalla;
		recursos();
	}
	
	private void recursos() {
		try {
			img = ImageIO.read(new File("src/1.bmp"));
			componentes();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
	
	public void componentes(){
		setLayout(null);
		panel.colocarImagen(img);
		panel.setBounds(0, 0, img.getWidth(), img.getHeight());
		btnGenerar.setBounds(img.getWidth(), (img.getHeight()/2)-20, 170, 40);
		btnGenerar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Imprimir();
				Guardar();
			}
		});
		add(panel);
		add(btnGenerar);
	}
	
	public void Imprimir() {
		panel.guardarColores();
		panel2=new Panel_Nuevo(panel.colores,panel.img);
		panel2.setBounds(img.getWidth()+170, 0, img.getWidth(), img.getHeight());
		add(panel2);
		panel2.repaint();
	}
	
	public void Guardar() {
		si=true;
		while(si) {
			try {
				ImageIO.write(img,"bmp", new File("Src/nuevo-"+Contador+".bmp"));
				si=false;
			} catch (IOException e) {
				System.out.print("Error");
			}
			Contador++;
		}
	}
}
