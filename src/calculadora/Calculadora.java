package calculadora;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Calculadora extends JFrame implements ActionListener{
    private JPanel panel;
    private JLabel label_fondo;
    private JButton boton_0, boton_1, boton_2, boton_3, boton_4, boton_5, boton_6, boton_7, boton_8, boton_9;
    private JButton boton_s, boton_r, boton_d, boton_m, boton_p, boton_i, boton_dell, boton_elim, boton_par1, boton_par2;
    private JTextField field_entrada;
    private int x=50, y=120;
    
    public Calculadora(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src/images/calculadora.png").getImage());
        
        Paneles();
        BotonesNumeros();
        BotonesOperaciones();
        Fields();
        Fondo();
    }
    private void Paneles(){
        panel=new JPanel();
        panel.setSize(500,600);
        this.getContentPane().add(panel);
        panel.setLayout(null);
        add(panel);
    }
    private void BotonesNumeros(){
        boton_0=new JButton("0");
        boton_1=new JButton("1");
        boton_2=new JButton("2");
        boton_3=new JButton("3");
        boton_4=new JButton("4");
        boton_5=new JButton("5");
        boton_6=new JButton("6");
        boton_7=new JButton("7");
        boton_8=new JButton("8");
        boton_9=new JButton("9");
        boton_0.addActionListener(this);
        boton_1.addActionListener(this);
        boton_2.addActionListener(this);
        boton_3.addActionListener(this);
        boton_4.addActionListener(this);
        boton_5.addActionListener(this);
        boton_6.addActionListener(this);
        boton_7.addActionListener(this);
        boton_8.addActionListener(this);
        boton_9.addActionListener(this);
        boton_0.setBounds(x+100  , y+350, 60, 60);
        boton_1.setBounds(x      , y+270, 60, 60);
        boton_2.setBounds(x+100  , y+270, 60, 60);
        boton_3.setBounds(x+100*2, y+270, 60, 60);
        boton_4.setBounds(x      , y+190, 60, 60);
        boton_5.setBounds(x+100  , y+190, 60, 60);
        boton_6.setBounds(x+100*2, y+190, 60, 60);
        boton_7.setBounds(x      , y+110 , 60, 60);
        boton_8.setBounds(x+100  , y+110 , 60, 60);
        boton_9.setBounds(x+100*2, y+110 , 60, 60);
        boton_0.setForeground(Color.WHITE);
        boton_1.setForeground(Color.WHITE);
        boton_2.setForeground(Color.WHITE);
        boton_3.setForeground(Color.WHITE);
        boton_4.setForeground(Color.WHITE);
        boton_5.setForeground(Color.WHITE);
        boton_6.setForeground(Color.WHITE);
        boton_7.setForeground(Color.WHITE);
        boton_8.setForeground(Color.WHITE);
        boton_9.setForeground(Color.WHITE);
        boton_0.setBackground(new Color(100,100,200));
        boton_1.setBackground(new Color(100,100,200));
        boton_2.setBackground(new Color(100,100,200));
        boton_3.setBackground(new Color(100,100,200));
        boton_4.setBackground(new Color(100,100,200));
        boton_5.setBackground(new Color(100,100,200));
        boton_6.setBackground(new Color(100,100,200));
        boton_7.setBackground(new Color(100,100,200));
        boton_8.setBackground(new Color(100,100,200));
        boton_9.setBackground(new Color(100,100,200));
        boton_0.setFont(new Font("Times new Roman",0,24));
        boton_1.setFont(new Font("Times new Roman",0,24));
        boton_2.setFont(new Font("Times new Roman",0,24));
        boton_3.setFont(new Font("Times new Roman",0,24));
        boton_4.setFont(new Font("Times new Roman",0,24));
        boton_5.setFont(new Font("Times new Roman",0,24));
        boton_6.setFont(new Font("Times new Roman",0,24));
        boton_7.setFont(new Font("Times new Roman",0,24));
        boton_8.setFont(new Font("Times new Roman",0,24));
        boton_9.setFont(new Font("Times new Roman",0,24));
        boton_0.setBorder(BorderFactory.createLineBorder(Color.yellow, 10, true));
        boton_1.setBorder(BorderFactory.createLineBorder(Color.yellow, 10, true));
        boton_2.setBorder(BorderFactory.createLineBorder(Color.yellow, 10, true));
        boton_3.setBorder(BorderFactory.createLineBorder(Color.yellow, 10, true));
        boton_4.setBorder(BorderFactory.createLineBorder(Color.yellow, 10, true));
        boton_5.setBorder(BorderFactory.createLineBorder(Color.yellow, 10, true));
        boton_6.setBorder(BorderFactory.createLineBorder(Color.yellow, 10, true));
        boton_7.setBorder(BorderFactory.createLineBorder(Color.yellow, 10, true));
        boton_8.setBorder(BorderFactory.createLineBorder(Color.yellow, 10, true));
        boton_9.setBorder(BorderFactory.createLineBorder(Color.yellow, 10, true));
        panel.add(boton_0); panel.add(boton_1); panel.add(boton_2); panel.add(boton_3);
        panel.add(boton_4); panel.add(boton_5); panel.add(boton_6); panel.add(boton_7);
        panel.add(boton_8); panel.add(boton_9);
    }
    private void BotonesOperaciones(){
        boton_s=new JButton("+");
        boton_r=new JButton("-");
        boton_d=new JButton("÷");
        boton_m=new JButton("x");
        boton_p=new JButton(".");
        boton_i=new JButton("=");
        boton_dell=new JButton("dell");
        boton_elim=new JButton("←");
        boton_par1=new JButton("(");
        boton_par2=new JButton(")");
        boton_s.addActionListener(this);
        boton_r.addActionListener(this);
        boton_d.addActionListener(this);
        boton_m.addActionListener(this);
        boton_p.addActionListener(this);
        boton_i.addActionListener(this);
        boton_dell.addActionListener(this);
        boton_elim.addActionListener(this);
        boton_par1.addActionListener(this);
        boton_par2.addActionListener(this);
        boton_s.setBounds(x+100*3,y+30 ,60,60);
        boton_r.setBounds(x+100*3,y+110,60,60);
        boton_d.setBounds(x+100*3,y+190,60,60);
        boton_m.setBounds(x+100*3,y+270,60,60);
        boton_p.setBounds(x+100*2,y+350,60,60);
        boton_i.setBounds(x+100*3,y+350,60,60);
        boton_dell.setBounds(x+100*0,y+350,60,60);
        boton_elim.setBounds(x+100*0,y+30 ,60,60);
        boton_par1.setBounds(x+100*1,y+30 ,60,60);
        boton_par2.setBounds(x+100*2,y+30 ,60,60);
        boton_s.setForeground(Color.WHITE);
        boton_r.setForeground(Color.WHITE);
        boton_d.setForeground(Color.WHITE);
        boton_m.setForeground(Color.WHITE);
        boton_p.setForeground(Color.WHITE);
        boton_i.setForeground(Color.WHITE);
        boton_dell.setForeground(Color.WHITE);
        boton_elim.setForeground(Color.WHITE);
        boton_par1.setForeground(Color.WHITE);
        boton_par2.setForeground(Color.WHITE);
        boton_s.setBackground(new Color(100,100,200));
        boton_r.setBackground(new Color(100,100,200));
        boton_d.setBackground(new Color(100,100,200));
        boton_m.setBackground(new Color(100,100,200));
        boton_p.setBackground(new Color(100,100,200));
        boton_i.setBackground(new Color(100,100,200));
        boton_dell.setBackground(new Color(100,100,200));
        boton_elim.setBackground(new Color(100,100,200));
        boton_par1.setBackground(new Color(100,100,200));
        boton_par2.setBackground(new Color(100,100,200));
        boton_s.setBorder(BorderFactory.createLineBorder(Color.yellow, 5, true));
        boton_r.setBorder(BorderFactory.createLineBorder(Color.yellow, 5, true));
        boton_d.setBorder(BorderFactory.createLineBorder(Color.yellow, 5, true));
        boton_m.setBorder(BorderFactory.createLineBorder(Color.yellow, 5, true));
        boton_p.setBorder(BorderFactory.createLineBorder(Color.yellow, 5, true));
        boton_i.setBorder(BorderFactory.createLineBorder(Color.yellow, 5, true));
        boton_dell.setBorder(BorderFactory.createLineBorder(Color.yellow,5,true));
        boton_elim.setBorder(BorderFactory.createLineBorder(Color.yellow,5,true));
        boton_par1.setBorder(BorderFactory.createLineBorder(Color.yellow,5,true));
        boton_par2.setBorder(BorderFactory.createLineBorder(Color.yellow,5,true));
        boton_s.setFont(new Font("Times new Roman",0,24));
        boton_r.setFont(new Font("Times new Roman",0,24));
        boton_d.setFont(new Font("Times new Roman",0,24));
        boton_m.setFont(new Font("Times new Roman",0,24));
        boton_p.setFont(new Font("Times new Roman",0,24));
        boton_i.setFont(new Font("Times new Roman",0,24));
        boton_dell.setFont(new Font("Times new Roman",0,24));
        boton_elim.setFont(new Font("Times new Roman",0,24));
        boton_par1.setFont(new Font("Times new Roman",0,24));
        boton_par2.setFont(new Font("Times new Roman",0,24));
        panel.add(boton_s); panel.add(boton_r); panel.add(boton_d);
        panel.add(boton_m); panel.add(boton_p); panel.add(boton_i);
        panel.add(boton_dell); panel.add(boton_elim); 
        panel.add(boton_par1); panel.add(boton_par2);
    }
    private void Fondo(){
        ImageIcon fondo=new ImageIcon("src/images/fondo.png");
        label_fondo=new JLabel(fondo);
        label_fondo.setBounds(0,0,500,600);
        panel.add(label_fondo);
    }
    private void Fields(){
        field_entrada=new JTextField();
        field_entrada.setBounds(x+30, y-50, 300, 50);
        field_entrada.setFont(new Font("Bell MT",0,28));
        field_entrada.setToolTipText("Esctibe operaciones aqui");
        panel.add(field_entrada);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String operacion=field_entrada.getText().trim();
        if(e.getSource()==boton_0){operacion+="0";}
        if(e.getSource()==boton_1){operacion+="1";}
        if(e.getSource()==boton_2){operacion+="2";}
        if(e.getSource()==boton_3){operacion+="3";}
        if(e.getSource()==boton_4){operacion+="4";}
        if(e.getSource()==boton_5){operacion+="5";}
        if(e.getSource()==boton_6){operacion+="6";}
        if(e.getSource()==boton_7){operacion+="7";}
        if(e.getSource()==boton_8){operacion+="8";}
        if(e.getSource()==boton_9){operacion+="9";}
        if(e.getSource()==boton_s){operacion+="+";}
        if(e.getSource()==boton_r){operacion+="-";}
        if(e.getSource()==boton_d){operacion+="/";}
        if(e.getSource()==boton_m){operacion+="*";}
        if(e.getSource()==boton_p){operacion+=".";}
        if(e.getSource()==boton_par1){operacion+="(";}
        if(e.getSource()==boton_par2){operacion+=")";}
        if(e.getSource()==boton_dell){operacion="";}
        if(e.getSource()==boton_i){
            ClaseVerificacion v=new ClaseVerificacion();
            if(v.Verificacion(operacion)){
                ClaseOperaciones o=new ClaseOperaciones(operacion);
                operacion=Double.toString(o.calcular());
            }
            else{
                operacion="ERROR";
            }
            System.out.println(v.Verificacion(operacion));
        }
        if(e.getSource()==boton_elim){
            String aux=operacion;
            operacion="";
            for(int i=0; i<aux.length()-1; i++){
                operacion+=aux.charAt(i);
            }
        }
        field_entrada.setText(operacion);
    }
    
    public static void main(String[] args) {
        Calculadora c=new Calculadora();
        c.setSize(500,600);
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        c.setResizable(false);
    }
    
}
