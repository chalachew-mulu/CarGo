package Car.Cargo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
class Cargo extends Frame implements KeyListener{
int x = 140;
int y = 0;
final String Chalie = "I Am Going To Gonder";
@Override
public void paint(Graphics g )
{    
g.setColor(Color.red);
g.fillRect(56+x,203+y,200, 100);
g.setColor(Color.blue);
g.fillOval(80+x,300+y, 30, 30);
g.fillOval(190+x,300+y, 30, 30);
g.setColor(Color.GREEN);
g.fillArc(150+x,60+y,200, 200, 150, 150);
g.setColor(Color.WHITE);
g.setFont(new Font("",Font.BOLD,12));
g.drawString(Chalie,65+x, 260+y);
g.setColor(Color.BLACK);
g.fillOval(500,270, 60, 60);
g.fillOval(600,270, 60, 60);
g.fillOval(700,270, 60, 60);

g.setColor(Color.BLUE);
g.drawLine(0,330,x+2000,330);
g.setColor(Color.RED);
g.drawLine(0,331,x+2000,331);
g.setColor(Color.PINK);
g.drawLine(0,332,x+2000,332);
g.setColor(Color.ORANGE);
g.drawLine(0,333,x+2000,333);
g.setColor(Color.MAGENTA);
g.drawLine(0,334,x+2000,334);
g.setColor(Color.LIGHT_GRAY);
g.drawLine(0,335,x+2000,335);
g.setColor(Color.GREEN);
g.drawLine(0,336,x+2000,336);
g.setColor(Color.GRAY);
g.drawLine(0,337,x+2000,337);
g.setColor(Color.DARK_GRAY);
g.drawLine(0,338,x+2000,338);
g.setColor(Color.CYAN);
g.drawLine(0,339,x+2000,339);
g.setColor(Color.BLUE);
g.drawLine(0,340,x+2000,340);
g.setColor(Color.BLACK);
g.drawLine(0,341,x+2000,341);
g.setColor(Color.white);
g.drawLine(0,342,x+2000,342);



}
Cargo()
{
 this.setBounds(0,0,800,800);
 this.setTitle("Java Key Event Program ");
this.addKeyListener(this);
this.setBackground(Color.GREEN);
}
public static void main(String a[])
{ Cargo f1 =new Cargo();
 f1.setVisible(true);
      }
    @Override
    public void keyTyped(KeyEvent e) {
    }
@Override
public void keyPressed(KeyEvent e) {
if(e.getKeyCode()==KeyEvent.VK_Z){
x=x-10;
}
else if (e.getKeyCode()==KeyEvent.VK_X){
x=x+10;
}
else if(e.getKeyCode()==KeyEvent.VK_A){
y = y-10;    
}
else if(e.getKeyCode()==KeyEvent.VK_S){
y=y+10;    
}
else if(e.getKeyCode()==KeyEvent.VK_0){
System.exit(0);
}
repaint();
}
@Override
public void keyReleased(KeyEvent e) {
 }
    
}