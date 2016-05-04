

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;

public class main extends JPanel implements ActionListener, KeyListener {
	Timer t = new Timer(1, this);
int x = 0, y = 0, velx =0, vely =0; int personttest = getWidth();
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
int width = (int) screenSize.getWidth();
int height = (int) screenSize.getHeight();
int speed = 5;
int l=0;
int shopx = 0;
int shopy=0;
int shopheight= 50;
int shoplength=50;
int flowerdraw =0;
int flowernumber =0;
int qx=-100;
int qy=-100;
int loopb=0;
int money=50;
int loopt=0;
int choose=0;
int seeds=0;
int corn=0;
int shopopen=0;
int pickordrop=0;
int plantdrop = 0;
int plantnumber=1000;
int[] plantlocations = new int[plantnumber*2];
int[] plantgrowth = new int [plantnumber];
int[] plantstage = new int [plantnumber];

public main() {
	Arrays.fill ( plantlocations,-100);
	Arrays.fill ( plantgrowth,0);
	t.start();
	addKeyListener(this);
	setFocusable(true);
	setFocusTraversalKeysEnabled(false);
}

public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setFont(new Font("Arial",1,20));
	
	BufferedImage backgroundoutside = null;
	BufferedImage shopbackground = null;
	BufferedImage man = null;
	try {
	    backgroundoutside = ImageIO.read(new File("background.jpg"));
	    shopbackground = ImageIO.read(new File("tiles.jpg"));
	    man = ImageIO.read(new File("man.png"));
	} catch (IOException e) {
	}
	BufferedImage corn1 = null;
	BufferedImage corn2 = null;
	BufferedImage corn3 = null;
	BufferedImage corn4 = null;
	BufferedImage corn5 = null;
	BufferedImage corn6 = null;
	BufferedImage corn7 = null;
	BufferedImage corn8 = null;
	BufferedImage corn9 = null;
	BufferedImage corn10 = null;
	BufferedImage corn11 = null;
	BufferedImage corn12 = null;
	BufferedImage corn13 = null;
	BufferedImage corn14 = null;

	

	try {
	    corn1 = ImageIO.read(new File("corn1.png"));
	} catch (IOException e) {
	}
	try {
	    corn2 = ImageIO.read(new File("corn2.png"));
	} catch (IOException e) {
	}
	try {
	    corn3 = ImageIO.read(new File("corn3.png"));
	} catch (IOException e) {
	}
	try {
	    corn4 = ImageIO.read(new File("corn4.png"));
	} catch (IOException e) {
	}
	try {
	    corn5 = ImageIO.read(new File("corn5.png"));
	} catch (IOException e) {
	}
	try {
	    corn6 = ImageIO.read(new File("corn6.png"));
	} catch (IOException e) {
	}
	try {
	    corn7 = ImageIO.read(new File("corn7.png"));
	} catch (IOException e) {
	}
	try {
	    corn8 = ImageIO.read(new File("corn8.png"));
	} catch (IOException e) {
	}
	try {
	    corn9 = ImageIO.read(new File("corn9.png"));
	} catch (IOException e) {
	}
	try {
	    corn10 = ImageIO.read(new File("corn10.png"));
	} catch (IOException e) {
	}
	try {
	    corn11 = ImageIO.read(new File("corn11.png"));
	} catch (IOException e) {
	}
	try {
	    corn12 = ImageIO.read(new File("corn12.png"));
	} catch (IOException e) {
	}
	try {
	    corn13 = ImageIO.read(new File("corn13.png"));
	} catch (IOException e) {
	}
	try {
	    corn14 = ImageIO.read(new File("corn14.png"));
	} catch (IOException e) {
	}


	Color squarecolor = new Color(0,0,0);	
	g.setColor(squarecolor);

	if (shopopen==0){
	g.drawImage(backgroundoutside, 0, 0, width, height, this);
	Color shopcolor = new Color(50,50,50);
	g.setColor(shopcolor);
	g.fillRect(shopx,shopy,shoplength,shopheight);
	
	
	g.setColor(squarecolor);
	while (loopb<plantnumber*2) {
		if (plantstage[loopb/2]==0){
		g.drawImage(corn14, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==1){
		g.drawImage(corn13, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==2){
		g.drawImage(corn12, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==3){
		g.drawImage(corn11, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==4){
		g.drawImage(corn10, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==5){
		g.drawImage(corn9, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==6){
		g.drawImage(corn8, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==7){
		g.drawImage(corn7, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==8){
		g.drawImage(corn6, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==9){
		g.drawImage(corn5, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==10){
		g.drawImage(corn4, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==11){
		g.drawImage(corn3, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==12){
		g.drawImage(corn2, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}
		if (plantstage[loopb/2]==13){
		g.drawImage(corn1, plantlocations[loopb], plantlocations[loopb+1], 15, 31, this);
		}


		loopb=loopb+2;
	}
	loopb=0;
	
	g.drawImage(man, x+(width/2)-5, y+(height/2)-5, 36, 96, this);
	}
	if (shopopen==1){
		g.drawImage(shopbackground, 50,50,width-100,height-100, this);
		g.drawString("TO BUY SEEDS PRESS 1",width-600,150);
		g.drawString("TO SELL CORN PRESS 2",width-600,200);
	}
	g.drawString("Money : "+ money,width-200,150);
	g.drawString("Seeds : "+ seeds,width-200,150+30);
	g.drawString("Corn  : "+ corn,width-200,150+60);
	
}

public void actionPerformed(ActionEvent e) {
x += velx*speed;
y += vely*speed;
loopb=0;
pickordrop=0;
qx=x+(width/2)-5;
qy=y+(height/2)-5;
if (plantdrop==1) {	

	while (loopb<plantnumber*2){
		if ((qx<(plantlocations [loopb]-50) || qx>(plantlocations[loopb]+50)) || ((qy<(plantlocations [loopb+1]-50) || qy>(plantlocations[loopb+1]+50)))){}
		else {
			pickordrop=1;}
		loopb=loopb+2;		
	}
	loopb=0;
	if (pickordrop==0) {
		if (seeds>0){
		seeds=seeds-1;
		plantlocations [flowernumber] = x+(width/2)-5+36;
		plantlocations [flowernumber+1] = y+(height/2)-5+76;
		flowernumber=flowernumber+2;
		if (flowernumber >(plantnumber*2)-1) {
			flowernumber=0;
		}
		}
	}
	if (pickordrop==1) {
	while (loopb*2<plantnumber*2){
		if (!(((qx<(plantlocations [loopb]-50) || qx>(plantlocations[loopb]+50)) || ((qy<(plantlocations [loopb+1]-50) || qy>(plantlocations[loopb+1]+50)))))) {
			plantlocations [loopb]=-100;
			plantlocations [loopb+1]=-100;
			if (plantstage[loopb/2]==3) {
				corn=corn+1;
			}
		}		
		loopb=loopb+1;
	}
	loopb=0;
	}
	plantdrop=0;
}


if ((x+(width/2)-5)<0) {
	x=5-(width/2);	
}
if ((x+(width/2)-5)>width-10) {
	x=width-10-(width/2)+5;	
}
if ((y+(height/2)-5)<0) {
	y=5-(height/2);	
}
if ((y+(height/2)-5)>height-10){
	y=height-10-(height/2)+5;
}
loopb=0;
while (loopb<plantnumber) {
	
	if (!(plantlocations[loopb*2]==-100)) {
		Random random = new Random();
		choose = random.nextInt(2);
		if (choose == 1) {
			System.out.println(plantgrowth[loopt]);
		plantgrowth[loopb] = plantgrowth [loopb] +1;			}
	}
	while (loopt<15) {
		if (plantgrowth[loopb]==100*(loopt+1)) {
			plantstage[loopb]=(loopt+1);
		}
		loopt=loopt+1;
	}
	loopt=0;

	loopb=loopb+1;
	}

loopb=0;

repaint();

}

public void keyPressed(KeyEvent e) {
	
	int code = e.getKeyCode();	
	if (shopopen==0){
	if (code == KeyEvent.VK_NUMPAD8){
		vely = -1;
		velx = 0;
	}
	if (code == KeyEvent.VK_NUMPAD9){
		vely = -1;
		velx = 1;
	}
	if (code == KeyEvent.VK_NUMPAD7){
		vely = -1;
		velx = -1;
	}
	if (code == KeyEvent.VK_NUMPAD4){
		vely = 0;
		velx = -1;
	}
	if (code == KeyEvent.VK_NUMPAD6){
		vely = 0;
		velx = 1;
	}
	if (code == KeyEvent.VK_NUMPAD1){
		vely = 1;
		velx = -1;
	}
	if (code == KeyEvent.VK_NUMPAD2){
		vely = 1;
		velx = 0;
	}
	if (code == KeyEvent.VK_NUMPAD3){
		vely = 1;
		velx = 1;
	}
	if (code == KeyEvent.VK_SPACE){

		
		plantdrop=1;
		
	}
	if (code == KeyEvent.VK_ENTER){
		if (qx>=shopx && qx<=(shopx+shoplength)) {
			if (qy>=shopy && qy<=(shopy+shopheight)){
				shopopen=1;
			}
		}
	}
	}
	if (shopopen==1){
		if (code == KeyEvent.VK_1){
			if (money>0){
				money=money-1;
				seeds=seeds+1;
			}
		}
		if (code == KeyEvent.VK_2){
			if (corn>0){
				money=money+1;
				corn=corn-1;
			}
		}
		if (code == KeyEvent.VK_SPACE){
			shopopen=0;
		}
	}
	
	
}

public void keyTyped(KeyEvent e) {}
public void keyReleased(KeyEvent e) {
	velx=0;
	vely=0;
}


public static void main (String arge[]){
	JFrame f = new JFrame();
	main s = new main();
	f.add(s);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setExtendedState(Frame.MAXIMIZED_BOTH);
	f.setUndecorated(true);
	f.setVisible(true);
}
} 