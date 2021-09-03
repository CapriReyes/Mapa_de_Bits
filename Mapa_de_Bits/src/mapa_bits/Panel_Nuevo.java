package mapa_bits;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Panel_Nuevo extends JPanel{
	public int[][][] colores;
	public BufferedImage img;
	public Panel_Nuevo(int[][][] colores, BufferedImage img) {
		this.colores=colores;
		this.img=img;
		cambioColor();
	}
	
	public void cambioColor() {
		Color nuevo;
		int Ra=(int) (Math.random()*255);
		int Ga=(int) (Math.random()*255);
		int Ba=(int) (Math.random()*255);
		Color ColorAuxiliar=new Color(Ra,Ga,Ba);
		for(int i=0;i<img.getWidth();i++) {
			for(int j=0;j<img.getHeight();j++) {
				if(colores[i][j][0]>240
					&&colores[i][j][1]>240
					&&colores[i][j][2]>240) {
						nuevo=new Color(0,0,0);
				}else if(colores[i][j][0]<15
					&&colores[i][j][1]<15
					&&colores[i][j][2]<15){
						nuevo=new Color(255,255,255);
				}else if((colores[i][j][0]==colores[i][j][1]
					&&colores[i][j][0]==colores[i][j][2])){
					nuevo=ColorAuxiliar;
				}else {
					nuevo=new Color(colores[i][j][1]
									,colores[i][j][2]
									,colores[i][j][0]);
				}
				img.setRGB(i, j, nuevo.getRGB());
			}
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0;i<img.getWidth();i++) {
			for(int j=0;j<img.getHeight();j++) {
				g.setColor(new Color(img.getRGB(i, j)));
				g.fillRect(i, j, i, j);	
			}
		}
	}
}
