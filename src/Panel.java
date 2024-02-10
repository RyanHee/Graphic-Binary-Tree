import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Panel extends JPanel implements ActionListener {

    private BinarySearchTree tree;
    private JTextField input;
    private String s, display;
    private BufferedImage img, top, bottom, node;
    private JButton addB, delB;
    public Panel(){
        tree = new BinarySearchTree();
        input = new JTextField(4);
        addB = new JButton("add");
        delB = new JButton("delete");
        addB.addActionListener(this);
        delB.addActionListener(this);
        s="";
        display="BINARY SEARCH TREE";

        try{
            img = ImageIO.read(Panel.class.getResource("Image/TreeLines.png"));
            top = ImageIO.read(Panel.class.getResource("Image/TreeLineTop4.png"));
            bottom = ImageIO.read(Panel.class.getResource("Image/TreeLineBottom.png"));
            node = ImageIO.read(Panel.class.getResource("Image/node.png"));
        }
        catch (Exception e){
            System.out.println("error");
        }




        /*
        tree.add(10);
        tree.add(130);
        tree.add(170);
        tree.add(-1);
        tree.add(122);
        tree.add(-10);
        tree.add(-20);
        tree.add(4);
        tree.add(-15);
        tree.add(-30);
        tree.add(2);
        tree.add(1);
        tree.add(3);
        tree.add(-7);
        tree.add(-9);
        tree.add(-6);
        tree.add(6);
        tree.add(5);
        tree.add(7);
        tree.add(100);
        tree.add(110);
        tree.add(99);
        tree.add(128);
        tree.add(126);
        tree.add(129);
        tree.add(160);
        tree.add(150);
        tree.add(165);
        tree.add(180);
        tree.add(190);
        tree.add(178);
        */
    }


    public void paint(Graphics g) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w= screenSize.width;
        int h= screenSize.height;
        w=getWidth();
        h=getHeight();
        super.paint(g);
        setBackground(Color.BLACK);
        //g.drawImage(img, );

        int i3 = 3200;
        int i4 = i3*9/16;
        System.out.println(w);
        System.out.println(h);
        System.out.println(i4);
        g.drawImage(top, 255*w/ i3, 530*h/ i4, 2700*w/ i3, 450*h/ i4, null);
        g.drawImage(bottom, 130*w/ i3, 1020*h/ i4, 2960*w/ i3, 530*h/ i4, null);
        g.setColor(new Color(0, 100, 40));
        int[]xlst=new int[63];
        int[]ylst=new int[63];
        int i1 = 3000;
        int i2 = 1500;
        xlst[0]=1570*w/i1;
        ylst[0]=20*h/i2;

        xlst[1]=840*w/ i1;

        ylst[1]=140*h/ i2;
        xlst[2]=2300*w/ i1;
        ylst[2]=140*h/ i2;
        xlst[3]=490*w/ i1;
        ylst[3]=270*h/ i2;
        xlst[4]=1190*w/ i1;
        ylst[4]=270*h/ i2;
        xlst[5]=1950*w/ i1;
        ylst[5]=270*h/ i2;
        xlst[6]=2650*w/ i1;
        ylst[6]=270*h/ i2;
        xlst[7]=310*w/ i1;
        ylst[7]=430*h/ i2;
        xlst[8]=670*w/ i1;
        ylst[8]=430*h/ i2;
        xlst[9]=1010*w/ i1;
        ylst[9]=430*h/ i2;
        xlst[10]=1370*w/ i1;
        ylst[10]=430*h/ i2;
        xlst[11]=1770*w/ i1;
        ylst[11]=430*h/ i2;
        xlst[12]=2130*w/ i1;
        ylst[12]=430*h/ i2;
        xlst[13]=2470*w/ i1;
        ylst[13]=430*h/ i2;
        xlst[14]=2830*w/ i1;
        ylst[14]=430*h/ i2;
        xlst[15]=230*w/ i1;
        ylst[15]=690*h/ i2;
        xlst[16]=390*w/ i1;
        ylst[16]=690*h/ i2;
        xlst[17]=590*w/ i1;
        ylst[17]=690*h/ i2;
        xlst[18]=750*w/ i1;
        ylst[18]=690*h/ i2;
        xlst[19]=930*w/ i1;
        ylst[19]=690*h/ i2;
        xlst[20]=1090*w/ i1;
        ylst[20]=690*h/ i2;
        xlst[21]=1290*w/ i1;
        ylst[21]=690*h/ i2;
        xlst[22]=1450*w/ i1;
        ylst[22]=690*h/ i2;
        xlst[23]=1690*w/ i1;
        ylst[23]=690*h/ i2;
        xlst[24]=1850*w/ i1;
        ylst[24]=690*h/ i2;
        xlst[25]=2050*w/ i1;
        ylst[25]=690*h/ i2;
        xlst[26]=2210*w/ i1;
        ylst[26]=690*h/ i2;
        xlst[27]=2390*w/ i1;
        ylst[27]=690*h/ i2;
        xlst[28]=2550*w/ i1;
        ylst[28]=690*h/ i2;
        xlst[29]=2750*w/ i1;
        ylst[29]=690*h/ i2;
        xlst[30]=2910*w/ i1;
        ylst[30]=690*h/ i2;
        xlst[31]=190*w/ i1;
        ylst[31]=900*h/ i2;
        xlst[32]=270*w/ i1;
        ylst[32]=900*h/ i2;
        xlst[33]=350*w/ i1;
        ylst[33]=900*h/ i2;
        xlst[34]=430*w/ i1;
        ylst[34]=900*h/ i2;
        xlst[35]=550*w/ i1;
        ylst[35]=900*h/ i2;
        xlst[36]=630*w/ i1;
        ylst[36]=900*h/ i2;
        xlst[37]=710*w/ i1;
        ylst[37]=900*h/ i2;
        xlst[38]=790*w/ i1;
        ylst[38]=900*h/ i2;
        xlst[39]=890*w/ i1;
        ylst[39]=900*h/ i2;
        xlst[40]=970*w/ i1;
        ylst[40]=900*h/ i2;
        xlst[41]=1050*w/ i1;
        ylst[41]=900*h/ i2;
        xlst[42]=1130*w/ i1;
        ylst[42]=900*h/ i2;
        xlst[43]=1250*w/ i1;
        ylst[43]=900*h/ i2;
        xlst[44]=1330*w/ i1;
        ylst[44]=900*h/ i2;
        xlst[45]=1410*w/ i1;
        ylst[45]=900*h/ i2;
        xlst[46]=1490*w/ i1;
        ylst[46]=900*h/ i2;
        xlst[47]=1650*w/ i1;
        ylst[47]=900*h/ i2;
        xlst[48]=1730*w/ i1;
        ylst[48]=900*h/ i2;
        xlst[49]=1810*w/ i1;
        ylst[49]=900*h/ i2;
        xlst[50]=1890*w/ i1;
        ylst[50]=900*h/ i2;
        xlst[51]=2010*w/ i1;
        ylst[51]=900*h/ i2;
        xlst[52]=2090*w/ i1;
        ylst[52]=900*h/ i2;
        xlst[53]=2170*w/ i1;
        ylst[53]=900*h/ i2;
        xlst[54]=2250*w/ i1;
        ylst[54]=900*h/ i2;
        xlst[55]=2350*w/ i1;
        ylst[55]=900*h/ i2;
        xlst[56]=2430*w/ i1;
        ylst[56]=900*h/ i2;
        xlst[57]=2510*w/ i1;
        ylst[57]=900*h/ i2;
        xlst[58]=2590*w/ i1;
        ylst[58]=900*h/ i2;
        xlst[59]=2710*w/ i1;
        ylst[59]=900*h/ i2;
        xlst[60]=2790*w/ i1;
        ylst[60]=900*h/ i2;
        xlst[61]=2870*w/ i1;
        ylst[61]=900*h/ i2;
        xlst[62]=2950*w/ i1;
        ylst[62]=900*h/ i2;

        g.setFont(new Font("Sans",Font.BOLD,40));
        FontMetrics fontMetrics=g.getFontMetrics();
        int width = fontMetrics.stringWidth(display);
        g.drawString(display,w/2-width*w/4800,50);
        g.setFont(new Font("Sans",Font.BOLD,10));

        String[] lst= tree.forDraw();
        for (int i=0;i<63;i++){
            g.drawOval(xlst[i]-50*2*w/i3, 200*w/i2+ylst[i], 60*w/i3, 45*h/i2);
            fontMetrics=g.getFontMetrics();
            width = fontMetrics.stringWidth(lst[i]);
            g.drawString(lst[i],xlst[i]-275*w/i3/4-width*w/ i3,215*w/i2+ylst[i]);
        }




        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));



        add(addB);
        add(delB);
        add(input);
        input.setBounds(0*w/ i3,1700*h/ i4,200*w/ i3,100*h/ i4);
        addB.setBounds(200*w/ i3,1700*h/ i4,200*w/ i3,100*h/ i4);
        delB.setBounds(400*w/ i3,1700*h/ i4,200*w/ i3,100*h/ i4);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==addB){
            s=input.getText();

            if (tree.contains(Integer.parseInt(s))){
                display=s+" is already in there!";
            }
            else{
                tree.add(Integer.parseInt(s));
                display=s+" added!";
                if (tree.getLevel(Integer.parseInt(s))>5){
                    display=s+" exceeds level limits!";
                    tree.remove(Integer.parseInt(s));
                }
                
            }

            input.setText("");
            repaint();
        }
        if (e.getSource()==delB){
            s=input.getText();
            BinaryNode b = tree.remove(Integer.parseInt(s));
            input.setText("");
            display=s+" removed!";
            if (b==null){
                display=s+" don't exist!";
            }
            repaint();
        }
    }
}
