package cn.liayun.awt.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;

public class frame extends weapon {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame("wrng");
					//frame.setSize(1920, 1080);
					frame.setVisible(true);
					
					
					
					frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public  frame(String wrng) {
		String borderName [] = {"North","South","West","East","Center"};
		String border [] = {BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.WEST,
	            BorderLayout.EAST,BorderLayout.CENTER};
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		Container con=this.getContentPane();
		JPanel jp=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		//jp.setLayout(new BoxLayout(jp,BoxLayout.PAGE_AXIS));
		//jp.setBackground(Color.BLUE);
		jp2.setSize(100,30);
		jp.setSize(100, 30);
		jp3.setSize(100,30);
		jp.setLayout(new FlowLayout(1,10,10));
		jp2.setLayout(new GridLayout(4,3,3,3));
		jp3.setLayout(new BorderLayout());
		JButton []jb1=new JButton[9];
		for(int i=0;i<jb1.length;i++){
			
			jb1[i]=new JButton(i+1+" ");
			jp2.add(jb1[i]);
		}
		JButton[] jb2=new JButton[9];
		for(int i=0;i<jb2.length;i++) {
			jb2[i]=new JButton("手牌");
			jp2.add(jb2[i]);
		}
		JButton []jb3=new JButton[5];
		for(int i=0;i<jb3.length;i++){
			
			//jb3[i]=new JButton(borderName[i]);
			jp3.add(new JButton(borderName[i]),border[i]);
		}
		
		JPanel jp4=new JPanel();
		jp4.setSize(100, 30);
		jp4.setLayout(null);
		JButton []jb4=new JButton[5];
		jb4[1]=new JButton("1");
		jp4.add(jb4[1]);
		con.add(jp4);
		
	

		
		
		
		JLabel jl=new JLabel("Hearthstone!");
		//this.add(jp2);
		//con.add(jp2);
		//this.add(jp);
		//this.add(jp3);
		
		//flow布局
				this.setLayout(new FlowLayout());
				JButton[] btn=new JButton[28];
				for(int i=0;i<28;i++)
				{
					 btn[i]=new JButton("Button"+i);
					//this.add(btn[i]);
				}
			JLabel test=new JLabel("wrng");
				this.add(test);
	

		this.setDefaultCloseOperation(3);
		
		//con.add(jl);
		
		//background
		ImageIcon img=new ImageIcon("C:\\Users\\60988\\Desktop\\Hearthstone Screenshot 03-10-20 16.40.38.png");
		JLabel jlbg=new JLabel(img);
		this.getLayeredPane().add(jlbg,new Integer(Integer.MIN_VALUE));
		jlbg.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		JPanel jpbg= (JPanel)this.getContentPane();
		jpbg.setOpaque(true);
		jpbg.setLayout(new FlowLayout());
		jpbg.add(jlbg);
		
		
		
		
		JButton jb=new JButton("结束回合");
		jb.setBounds(100, 50, 100, 30);
		this.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent e) {
                System.out.println("clicked");
            }
        });
		JSplitPane jSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,false,jp,jp2);
		//JSplitPane jSplitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,false,jp2,jp3);
	jSplitPane.setDividerLocation(200);
	jSplitPane.setDividerSize(2);
	//jSplitPane1.setDividerLocation(200);
	//jSplitPane1.setDividerSize(2);
	jSplitPane.setEnabled(false);
	//con.add(jSplitPane);
	//con.add(jSplitPane1);
	String picture="C:\\Users\\60988\\Desktop\\Hearthstone Screenshot 03-10-20 16.40.38.png";
	JLabel path=new JLabel(new ImageIcon(picture));
	//path.setBounds(0, 0, 160, 90);
		
		//jp.add(jb,BorderLayout.EAST);//panel的east
		//con.add(jb,BorderLayout.EAST);//container的east
		//jp2.add(path,new Integer(Integer.MIN_VALUE));//图画
		btn[0].addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
				method();
			}
			private void method() {
				
				
			btn[0].setLabel("对手回合");
				
			}
			
		});
		
			
		

	}

}
