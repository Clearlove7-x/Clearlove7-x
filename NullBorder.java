package cn.liayun.awt.frame;
//法力水晶，嘲讽

import java.awt.BorderLayout;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;



public class NullBorder extends Basic {
	int repeak=0;
//	final double d = Math.random();
	//final int i = (int)(d*100);
	//final int a=(int)(d*100);
	int l=0;
	int weaponhold=0;
	//法力水晶
	int manahold=0;
	int mananow=0;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NullBorder frame = new NullBorder();
				
					frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NullBorder()  {
		JTextArea text = new JTextArea();
		JScrollPane sp = new JScrollPane(text);
		this.getContentPane().add(sp);
		int[] health=new int[2];
		for(int i=0;i<2;i++)
			health[i]=30;
		JLabel hhealth=new JLabel("30");
		JLabel hhealth1=new JLabel("30");
		hhealth.setBounds(800, 750, 30, 20);
		hhealth1.setBounds(800, 250, 30, 20);
		weaponhold=2;
		mananow=10;
		JButton hint=new JButton("hint");
		hint.setBounds(1800, 900, 80, 30);
		hint.setVisible(false);
		
	
		
		//  TestImage testImage = new TestImage();
		
		int[] ifatk=new int[8];
		for(int i=0;i<8;i++) {
			ifatk[i]=0;
		}
		ifatk[7]=1;

		

		
		boolean[] redraw=new boolean[3];
		for(int i=0;i<3;i++)
			redraw[i]=false;
		int[][] eatk=new int[8][2];
		for(int i=0;i<7;i++)
		{
		eatk[i][0]=2;
		eatk[i][1]=3;
		}
		eatk[7][0]=0;
		eatk[7][1]=30;
		int[][] myatk=new int[8][2];
		for(int i=0;i<7;i++)
		{
			myatk[i][0]=0;
			myatk[i][1]=0;
			
			}
		myatk[7][0]=0;

        boolean[] emionion=new boolean[10];
        
        for(int i=0;i<10;i++) {
			emionion[i]=false;
		}
		boolean[] mymionion=new boolean[10];
		for(int i=0;i<10;i++) {
			mymionion[i]=false;
		}
		boolean[] mymiatk=new boolean[8];
		for(int i=0;i<8;i++) {
			mymiatk[i]=false;
		}
		myatk[7][0]=1;
		myatk[7][1]=30;
		boolean[] emiatk=new boolean[8];
		for(int i=0;i<8;i++) {
			emiatk[i]=false;
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		 setBounds(200,200,500,500);
		 Container con = getContentPane(); 
		 con.add(hint);
		 
		 //猎人的吊脸
	/*	 JLabel face=new JLabel();
			ImageIcon img = new ImageIcon("C:\\Users\\60988\\Desktop\\1.PNG");
			  face.setIcon(img);
			  face.setBounds(900, 180, 100, 100);
			  con.add(face);
			  JButton face1=new JButton("脸");
			  face1.setBounds(920, 290, 50,30);
			  con.add(face1);
			  
			  JLabel face2=new JLabel();
				ImageIcon img1 = new ImageIcon("C:\\Users\\60988\\Desktop\\2.PNG");
				  face2.setIcon(img1);
				  face2.setBounds(900,680, 100, 100);
				  con.add(face2);
				  JButton face21=new JButton("脸");
				  face21.setBounds(920, 790, 50,30);
				  con.add(face21);
			  
			 JButton weapon=new JButton();
			  weapon.setBounds(1100, 750, 100, 30);
			  weapon.setText("null");
			  con.add(weapon);*/
			con.add(hhealth);
			con.add(hhealth1);
			
			  
		 
		 
		 JButton[] jb1=new JButton[10];
		 for(int i=0;i<10;i++) {
			 jb1[i]=new JButton(""+i);
			 jb1[i].setBounds(200+80*2*i, 40, 80, 30);
			 con.add(jb1[i]);	
			 jb1[i].setVisible(false);
		 }
		 
		 JButton[] jb2=new JButton[8];
		 JLabel[] jl2=new JLabel[8];
		 JLabel[][] jl21=new JLabel[8][2];
		 
		 int acdefg=0;
		 for(int i=0;i<7;i++) {
			 jb2[i]=new JButton(""+i);
			 jl2[i]=new JLabel("");
			 jl2[i].setBounds(400+80*2*i, 370, 80, 30);
			 
			 jb2[i].setBounds(400+80*2*i, 400, 80, 30);
			 con.add(jb2[i]);	
			 con.add(jl2[i]);
			
			 for(int x=0;x<2;x++)
			 {
				 jl21[i][x]=new JLabel("0");
				 jl21[i][x].setBounds(400+80*(i+x)+80*acdefg, 350, 80, 30);
					 con.add(jl21[i][x]);
			 }
			 acdefg++;
		 }
		 jb2[7]=new JButton();
		 jb2[7].setBounds(900, 250, 100, 30);
		 jb2[7].setText("null");
		 con.add(jb2[7]);
		 
		 JButton[] jb3=new JButton[8];
		 JLabel[] jl3=new JLabel[8];
		 JLabel[][] jl31=new JLabel[8][2];
		 int acdef=0;
		 for(int i=0;i<7;i++) {
			 jb3[i]=new JButton(""+i);
			 jb3[i].setBounds(400+80*2*i, 600, 80, 30);
			 jl3[i]=new JLabel("1");
			 jl3[i].setBounds(400+80*2*i, 630, 80, 20);
			 for(int x=0;x<2;x++)
			 {
				 jl31[i][x]=new JLabel("0");
				 jl31[i][x].setBounds(400+80*(i+x)+80*acdef, 650, 80, 30);
				 con.add(jl31[i][x]);
			
				 
			 }
			 con.add(jb3[i]);	
		     con.add(jl3[i]);	
			 acdef++;
		 }
		 jb3[7]=new JButton();
		 jb3[7].setBounds(900, 750, 100, 30);
		 jb3[7].setText("null");
		 con.add(jb3[7]);
		 
		 JButton[] jb4=new JButton[10];
		 JLabel[] jl4=new JLabel[10];
	
		 for(int i=0;i<10;i++) {
			 jb4[i]=new JButton(""+i);
			 jb4[i].setBounds(200+80*2*i, 900, 80, 30);
			 jl4[i]=new JLabel("1");
			 jl4[i].setBounds(200+80*2*i, 930, 80, 30);
			 con.add(jb4[i]);
			 con.add(jl4[i]);
			 
			
		 }
		 
		 JButton heropower=new JButton();
		 heropower=new JButton("Dagger Mastery");
		 heropower.setBounds(1100, 800, 150, 50);
		 con.add(heropower);
		 JButton heropower1=new JButton();
		 heropower1=new JButton("Fire Blast");
		 heropower1.setBounds(1100, 200, 150, 50);
		 con.add(heropower1);
		 JButton []endturn=new JButton[1];
		 endturn[0]=new JButton("END TURN");
		 endturn[0].setBounds(1470, 470, 150, 30);
		 con.add(endturn[0]);
		 endturn[0].addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
					method();
				}
				private void method() {
					
					 endturn[0].setLabel("ENEMY TURN");
					 for(int i=0;i<8;i++)
					 {
						if(myatk[i][0]!=0)
							ifatk[i]=1;
					 }
					// manahold++;
					 
					 
						
				}
				
			});
		
		 
		 //置入战场
		 JButton into=new JButton();
			into=new JButton("Into Battlefield");
			into.setBounds(1500, 700,150, 30);
			con.add(into);
			
			//法力水晶
			
			
			
			
		
			
			
			//背景图片
	/*ImageIcon img6=new ImageIcon("C:\\Users\\60988\\Desktop\\Hearthstone Screenshot 02-07-20 20.08.44.png");
			JLabel jlbg=new JLabel(img6);
			this.getLayeredPane().add(jlbg,new Integer(Integer.MIN_VALUE));
			jlbg.setBounds(0, 0, img6.getIconWidth(), img6.getIconHeight());
			JPanel jpbg= (JPanel)this.getContentPane();
			jpbg.setOpaque(true);
			jpbg.setLayout(null);
			jpbg.add(jlbg);*/
		
		 JButton start=new JButton();
		 start= new JButton("click to start");
		 start.setBounds(10, 10, 200, 30);
		 con.add(start);
		 
		 JButton btnNewButton = new JButton("New button");
		 contentPane.add(btnNewButton, BorderLayout.CENTER);
		 
		 JButton btnNewButton_1 = new JButton("New button");
		 contentPane.add(btnNewButton_1, BorderLayout.CENTER);
		 
		 JPanel panel = new JPanel();
		 contentPane.add(panel, BorderLayout.WEST);
		 
		 //开始按钮，换牌界面
		 start.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
					method();
				}
				private void method() {
					//manahold=10;
					
					JFrame frame1=new JFrame();
					 frame1.setSize(800,600);
					 frame1.getContentPane().setLayout(null);
		                frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		                frame1.setVisible(true);
		               
		                
		                JButton[] change=new JButton[3];
		               // JLabel[] change1=new JLabel[3];
		                for(int i=0;i<3;i++) {
		                change[i]=new JButton("Redraw");
		                	change[i].setBounds(200+i*150, 300, 100, 50);
		                	jl4[i]=new JLabel();
		                	mark[i]=random();
		                	jl4[i].setText(mionion[mark[i]].getname());
		                	jl4[i].setBounds(200+i*150, 200, 100, 50);
		                	frame1.getContentPane().add(change[i]);		
		                	frame1.getContentPane().add(jl4[i]);	
		                }
		                JButton sure=new JButton();
		                sure=new JButton("confirm");
		                sure.setBounds(400, 500, 100, 50);
		                frame1.getContentPane().add(sure);
		                sure.addActionListener(new ActionListener() {
		       			 public void actionPerformed(ActionEvent e) {
		       					method();
		       				}
		       				private void method() {
		       					for(int i=0;i<10;i++) {
		       					
		       					
		       					 if(i<3) {
		       						 jl4[i].setBounds(200+80*2*i, 850, 80, 30);
		       						 con.add(jl4[i]);
		       					 }
		       					// else {
		       						//jl4[i]=new JLabel("none");
		       					// jl4[i].setBounds(200+80*2*i, 850, 80, 30);
		       						//con.add(jl4[i]);
		       					 //}
		       					
		       						
		       						
		       					}
		       						//mananow=manahold;
		       					frame1.setVisible(false);
		       			
		       					
		       				}
							
		       				});
					change[0].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							method();
						}
						private void method() {
						
							repeak=random();
		                	jl4[0].setText(mionion[repeak].getname());
		                	
							frame1.getContentPane().add(jl4[0]);
							change[0].setVisible(false);
							
						}
						
						
					});
					change[1].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							method();
						}
						private void method() {
							repeak=random();
		                	jl4[1].setText(mionion[repeak].getname());
							frame1.getContentPane().add(jl4[1]);
							change[1].setVisible(false);
							
						}
						
						
					});
					change[2].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							method();
						}
						private void method() {
							repeak=random();
		                	jl4[2].setText(mionion[repeak].getname());
							frame1.getContentPane().add(jl4[2]);
							change[2].setVisible(false);
							
						}
						
						
					});
			
					
				}
				
			});
		
		 
		 
		 //随从上场（bug）
		 for(int use=0;use<10;use++) {
			 int c=use;
		jb4[use].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					method();
				}
				private void method() {					
					mymionion[c]=true;	
					if(mymionion[c]==true) {
					for(int i=0;i<c;i++)mymionion[i]=false;	
					for(int i=c+1;i<10;i++)mymionion[i]=false;	
					}
				}
			
				
				
			});
		}
		 
		 
		try { 
		
		 into.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					method();
					
				}
				private void method() {
				
				
					for(int i=0;i<10;i++)
					{
						
						if(mymionion[i]==true) {
							if(l==7) {
								JOptionPane.showMessageDialog(null,"You cannot have any more minions","", JOptionPane.ERROR_MESSAGE);
								for(int b=0;i<10;i++)
									mymionion[b]=false;
							}
							else if(mionion[mark[i]].getcost1()>mananow)
							{
								JOptionPane.showMessageDialog(null,"You don't have enough mana","", JOptionPane.ERROR_MESSAGE);
								for(int b=0;i<10;i++)
									mymionion[b]=false;
							}
							//String test=String.valueOf(jl4[i]);
							//System.out.println(test);
						
								/*if(mionion[mark[i]].getcost1()>mananow)
								{
									System.out.println("out of cast");
									//JOptionPane.showMessageDialog(null,"You don't have enough mana","", JOptionPane.ERROR_MESSAGE);
									
									//break;
								}*/
								else {
								jl3[l]=jl4[i];
								jl31[l][0].setText(mionion[mark[i]].getatk());
								jl31[l][1].setText(mionion[mark[i]].getdef());
								myatk[l][0]=mionion[mark[i]].getatk1();
								myatk[l][1]=mionion[mark[i]].getdef1();
							
								if(mionion[mark[i]].getwindfury()==true)
									ifatk[l]=2;
								else 	
									ifatk[l]=1;
								mananow=mananow-mionion[mark[i]].getcost1();
								//if(mionion[mark[i]].getcharge()==true)
									//ifatk[l]=1;
								//else
								//	ifatk[l]=0;
							
								//con.add(jl31[l][0]);
								//con.add(jl31[l][1]);
								jl3[l].setBounds(430+80*2*l, 625, 80, 30);
								con.add(jl3[l]);
								for(int b=0;i<10;i++)
									mymionion[b]=false;
								
								l++;
								//mananow-=mionion[mark[i]].getcost1();数组越界
								}
								
							
								
								
						}
					}
					
				}
				
				
			}); 
		}
		catch (Exception e) {
		
			e.printStackTrace();
		}
		 //随从交互boolean数组按钮
		 for(int use=0;use<8;use++) {
			 int c=use;
		jb3[use].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					method();
				}
				private void method() {	
					if(myatk[c][0]==0) {
						JOptionPane.showMessageDialog(null,"Invalid target","", JOptionPane.ERROR_MESSAGE);
					}
					else if(ifatk[c]==0&&myatk[c][0]!=0){ 
						JOptionPane.showMessageDialog(null,"That mionion has attacked this turn","", JOptionPane.ERROR_MESSAGE);
					}
					else  {
					mymiatk[c]=true;	
					//JOptionPane.showMessageDialog(null,""+c,"", JOptionPane.ERROR_MESSAGE);
					if(mymiatk[c]==true) {
					for(int i=0;i<c;i++)mymiatk[i]=false;	
					for(int i=c+1;i<7;i++)mymiatk[i]=false;	
					}
				//for(int i=0;i<7;i++)
				//	if(mymiatk[i]==true)
				//		System.out.println("1");
				//	else
				//		System.out.println("0");
					}
				}	
			});
		}
		 for( int use=0;use<8;use++) {
			 int c=use;
		jb2[use].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					method();
				}
				private void method() {	
					if(eatk[c][1]==0) {
						JOptionPane.showMessageDialog(null,"Invalid target","", JOptionPane.ERROR_MESSAGE);
					                  }
					              else {
					emiatk[c]=true;	
					//JOptionPane.showMessageDialog(null,""+c,"", JOptionPane.ERROR_MESSAGE);
					if(emiatk[0]==true) {
					for(int i=0;i<c;i++)emiatk[i]=false;	
					for(int i=c+1;i<7;i++)emiatk[i]=false;	
					
					                     }
				//	for(int i=0;i<7;i++) {
				//		if(emiatk[i]==false)
				//			System.out.println("1");
				//		else
				//		System.out.println("0");
				//}
				            }	
					                   } 
			});
		}
		 
		 
		
		 JButton attack=new JButton();
		 JLabel select=new JLabel("Select a target");
			select.setBounds(1500, 550, 150, 30);
		con.add(select);
		select.setVisible(false);
		 attack=new JButton("Attack!");
		 attack.setBounds(1500, 600, 80, 30);
		 con.add(attack);
		 attack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					method();
					
				}
				private void method() {
					
					 //int myatk1=0;
					// int eatk1=0;
					 //int mydef=0;
					// int edef=0;
					int mymark=-1;
					int emark=-1;
					for(int i=0;i<8;i++) {
						//eatk1=2;
						//edef=1;
						
						//标记攻击随从
						if(mymiatk[i]==true&&myatk[i][0]!=0) {
							mymark=i;
							
						}
						
						if(emiatk[i]==true&&eatk[i][1]!=0) {
							emark=i;
							
						}
						
						//随从血量计算		
					}
					if(mymark==-1||emark==-1)
						JOptionPane.showMessageDialog(null,"Invalid target","", JOptionPane.ERROR_MESSAGE);
					else {
					//System.out.println(""+myatk[mymark][1]+"   "+myatk[mymark][0]);
					if(mymark!=7&&emark!=7) {
					myatk[mymark][1]=myatk[mymark][1]-eatk[emark][0];
					eatk[emark][1]=eatk[emark][1]-myatk[mymark][0];
					ifatk[mymark]--;
					
					//随从死亡
					if(myatk[mymark][1]<=0) {
						//for(int x=mymark;x<l;x++) 
						//{
						//	myatk[x][0]=myatk[x+1][0];	
						//	myatk[x][1]=myatk[x+1][1];
						//}
						myatk[mymark][0]=0;
						myatk[mymark][1]=0;
						jl31[mymark][0].setText(String.valueOf(myatk[mymark][0]));
						jl3[mymark].setText(null);
						
					}
					if(eatk[emark][1]<=0) {
						//for(int x=mymark;x<l;x++) 
						//{
						//	myatk[x][0]=myatk[x+1][0];	
						//	myatk[x][1]=myatk[x+1][1];
						//}
						eatk[emark][0]=0;
						eatk[emark][1]=0;
						jl21[emark][0].setText(String.valueOf(eatk[emark][0]));
					}
					//if(eatk[emark][1]<=0) {
						//for(int x=emark;x<7;x++) 
						//{
						//	eatk[x][0]=eatk[x+1][0];	
						//	eatk[x][1]=eatk[x+1][1];
						//}
					//	eatk[l][0]=0;
					//	eatk[l][1]=0;
					//}
				
						jl21[emark][1].setText(String.valueOf(eatk[emark][1]));
						jl31[mymark][1].setText(String.valueOf(myatk[mymark][1]));
						//jl3[i]=
						for(int i=0;i<7;i++) {
							mymiatk[i]=false;
							emiatk[i]=false;
						}
					}
					else if(mymark==7 && emark!=7) {
						myatk[7][1]=myatk[7][1]-eatk[emark][0];
						eatk[emark][1]=eatk[emark][1]-myatk[7][0];
						weaponhold--;
						if(weaponhold==0)
							myatk[7][0]=0;
						ifatk[mymark]--;
						hhealth.setText(String.valueOf(myatk[7][1]));
						
					}
					else if(  emark==7) {
					eatk[7][1]=eatk[7][1]-myatk[mymark][0];
						hhealth1.setText(String.valueOf(eatk[7][1]));
						ifatk[mymark]--;
						if(eatk[7][1]<=0)
							JOptionPane.showMessageDialog(null,"Congrats!","", JOptionPane.ERROR_MESSAGE);
							
						
					}
					
					}
					
					
					select.setVisible(true);
					for(int i=0;i<8;i++) {
						mymiatk[i]=false;
						
						emiatk[i]=false;
					}
					
					
				}
				});
		
		 
		 
		 
		
		 heropower.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					method();
					
				}
				private void method() {
					myatk[7][0]=1;
					myatk[7][1]=2;
					
								
				}
			 
		 });
		/* face1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
					method();
					
				}
			 private void method() {
				
					
				}
			 
		 } );*/
			
		 JButton DrDoom=new JButton("DrDoom0");
	     DrDoom.setBounds(100,100,100,50);
	 
	     con.add(DrDoom);
	    
	     //斩杀第一关设计
	    DrDoom.addActionListener(new ActionListener() {
	   
				public void actionPerformed(ActionEvent e) {
					method();
					
				}
				private void method() {
					hint.setVisible(true);
					 hint.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								method();
								
							}
							private void method() {
								JFrame frame1=new JFrame();
								 frame1.setSize(800,600);
								 frame1.getContentPane().setLayout(null);								 
					                frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					                frame1.setVisible(true);
					                JLabel j1=new JLabel();
					                JLabel j2=new JLabel();
					                JLabel j3=new JLabel();
					                j3.setBounds(200, 300, 800, 30);
					                j1.setBounds(200, 100, 800, 30);
					                j2.setBounds(200, 200, 800, 30);
					                j2.setText("Deadly Poison:Give your weapon +2 Attack");
					                j1.setText("Cold Blood:Give a minion +2 Attack.Combo:+4 Attack instead");
					                j3.setText("Dagger Mastery:Equip a 1/2 knife");
					                frame1.add(j1);
					                frame1.add(j2);
					                frame1.add(j3);
					                
							} 
					 });
					
					for(int i=0;i<7;i++)
					{
						jb2[i].setVisible(false);
						jl21[i][0].setVisible(false);
						jl21[i][1].setVisible(false);
					}
					int[] mark=new int[1];
					mark[0]=1;
					
					final JLabel Mana=new JLabel("5/5");
					
					Mana.setBounds(1300, 950, 200, 100);
					con.add(Mana);
					
					mananow=5;
				jl4[0].setText("Cold Blood");
				jl4[1].setText("Deadly Poison");
				for(int i=2;i<10;i++)
				{
					jl4[i].setVisible(false);	
					jb4[i].setVisible(false);
				}
				myatk[7][0]=0;

				 jb4[1].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							method();
							
						}
						private void method() {
							
							if(myatk[7][0]==0)
								JOptionPane.showMessageDialog(null,"Invalid spell","", JOptionPane.ERROR_MESSAGE);
							else if(mananow<1)
								JOptionPane.showMessageDialog(null,"Mana Running out","", JOptionPane.ERROR_MESSAGE);
							else
								{
								myatk[7][0]=myatk[7][0]+2;
							     jb4[1].setVisible(false);
							     jl4[1].setVisible(false);
							     mananow--;
							     Mana.setText(mananow+"/5");
							     mark[0]=2;
							     }		
						} 
				 });
				jb4[0].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							method();
							
						}
						private void method() {
							
							 if(mananow<2)
								JOptionPane.showMessageDialog(null,"Mana Running out","", JOptionPane.ERROR_MESSAGE);
							 else 
								 jb3[0].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										method();
										
									}
									private void method() {
										if(mark[0]==1)
										{
								        myatk[0][0]=myatk[0][0]+2;
										jl31[0][0].setText("4");
										 jb4[0].setVisible(false);
										}
										else if(mark[0]==20)
										{
									        myatk[0][0]=myatk[0][0]+4;
											jl31[0][0].setText("6");
											 jb4[0].setVisible(false);
										}
										  mananow=mananow-2;
										     Mana.setText(mananow+"/5");	
										
									} 
							 });
								 
						}
					 
				 });
				 
				jl3[0].setText("Bluegill Warrior");	
				myatk[0][1]=1;
				myatk[0][0]=2;
				ifatk[0]=1;
				jl31[0][0].setText("2");
				jl31[0][1].setText("1");
				for(int i=1;i<7;i++) {
					jl3[i].setVisible(false);
					jl31[i][0].setVisible(false);
					jl31[i][1].setVisible(false);
					jb3[i].setVisible(false);
							          }
				eatk[7][1]=9;
							
				}
				
			 
		 });
	   
	    JButton DrDoom1=new JButton("DrDoom1");
	     DrDoom1.setBounds(100,200,100,50);
	 
	     con.add(DrDoom1);
	     DrDoom1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					method();
					
				}
				private void method() {
					hint.setVisible(true);
					 hint.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								method();
								
							}
							private void method() {
								JFrame frame1=new JFrame();
								 frame1.setSize(800,600);
								 frame1.getContentPane().setLayout(null);								 
					                frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					                frame1.setVisible(true);
					                JLabel j1=new JLabel();
					                JLabel j2=new JLabel();
					                JLabel j3=new JLabel();
					                j3.setBounds(200, 300, 800, 30);
					                j1.setBounds(200, 100, 800, 30);
					                j2.setBounds(200, 200, 800, 30);
					                j2.setText("Frostbolt:Deal 3 damage to a character and Freeze it");
					                j1.setText("Ice Lance:Freeze a character.If it was already Frozen,deal 3 damage instead");
					                j3.setText("Whenever you cast a spell,gain +1 attack");
					                frame1.add(j1);
					                frame1.add(j2);
					                frame1.add(j3);
					                
							} 
					 });
					for(int i=3;i<9;i++)
					{
						jl4[i].setVisible(false);
						jb4[i].setVisible(false);
						
					}
					for(int i=1;i<7;i++)
					{
						jl3[i].setVisible(false);
						jb3[i].setVisible(false);
						jl31[i][0].setVisible(false);
						jl31[i][1].setVisible(false);
					}
					for(int i=0;i<7;i++)
					{
						jb2[i].setVisible(false);
						jl21[i][0].setVisible(false);
						jl21[i][1].setVisible(false);
					}
					eatk[7][1]=10;
					hhealth1.setText("10");
					int[] frozen=new int[1];
					frozen[0]=0;
					ifatk[0]=1;
					jl4[0].setText("Ice Lance");
					jl4[1].setText("Frostbolt");
					jl4[2].setText("Frostbolt");
					jl3[0].setText("Mana Wyrm");
					jl31[0][0].setText("1");
					jl31[0][1].setText("3");
					myatk[0][0]=1;
					myatk[0][1]=3;
					
					 jb4[1].addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								method();
								
							}
							private void method() {
								
								myatk[0][0]++;
								jl31[0][0].setText(String.valueOf(myatk[0][0]));
								eatk[7][1]=eatk[7][1]-3;
								frozen[0]=1;
								hhealth1.setText(String.valueOf(eatk[7][1]));
								jb4[1].setVisible(false);
								jl4[1].setVisible(false);
							}
							
						 
					 });
					 jb4[2].addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								method();
								
							}
							private void method() {
								
								myatk[0][0]++;
								jl31[0][0].setText(String.valueOf(myatk[0][0]));
								eatk[7][1]=eatk[7][1]-3;
								frozen[0]=1;
								hhealth1.setText(String.valueOf(eatk[7][1]));
								jb4[2].setVisible(false);
								jl4[2].setVisible(false);
							}
							
						 
					 });
					
					jb4[0].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							method();
							
						}
						private void method() {	
							myatk[0][0]++;
							if(frozen[0]==1)
								eatk[7][1]=eatk[7][1]-4;
								else if(frozen[0]!=1)
								frozen[0]=1;
								jb4[0].setVisible(false);
								jl4[0].setVisible(false);
							jl31[0][0].setText(String.valueOf(myatk[0][0]));
							hhealth1.setText(String.valueOf(eatk[7][1]));
						} 
				 });
					
				}
	     });
	     
	     JButton DrDoom2=new JButton("DrDoom2");
	     DrDoom2.setBounds(100,300,100,50);
	 
	     con.add(DrDoom2);
	     DrDoom2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					method();
					
				}
				private void method() {
					hint.setVisible(true);
					 hint.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								method();
								
							}
							private void method() {
								JFrame frame1=new JFrame();
								 frame1.setSize(800,600);
								 frame1.getContentPane().setLayout(null);								 
					                frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					                frame1.setVisible(true);
					                JLabel j1=new JLabel();
					                JLabel j2=new JLabel();
					                JLabel j3=new JLabel();
					                JLabel j4=new JLabel();
					                j3.setBounds(200, 300, 800, 30);
					                j1.setBounds(200, 100, 800, 30);
					                j2.setBounds(200, 200, 800, 30);
					                j4.setBounds(200, 400, 800, 30);
					                j2.setText("Stonetusk Boar: a minion with charge 1/1");
					                j1.setText("Abusive Sergeant:Battlecry:Give a minion +2 Attack this turn");
					                j3.setText("Windfury:Give your minion windfury");
					                j4.setText("Rockbiter Weapon:Give a friendly character +3 Attack this turn");
					                frame1.add(j1);
					                frame1.add(j2);
					                frame1.add(j3);
					                frame1.add(j4);
					                
							} 
					 });
					eatk[7][1]=12;
					hhealth1.setText("12");
					jl4[0].setText("Stonetusk Boar");
					jl4[1].setText("Abusive Sergeant");
					jl4[2].setText("Rockbiter Weapon");
					jl4[3].setText("Rockbiter Weapon");
					jl4[4].setText("Windfury");
					for(int i=5;i<9;i++)
					{
						jl4[i].setVisible(false);
						jb4[i].setVisible(false);
						
					}
					for(int i=2;i<7;i++)
					{
						jl3[i].setVisible(false);
						jb3[i].setVisible(false);
						jl31[i][0].setVisible(false);
						jl31[i][1].setVisible(false);
					}
					for(int i=0;i<7;i++)
					{
						jb2[i].setVisible(false);
						jl21[i][0].setVisible(false);
						jl21[i][1].setVisible(false);
					}
					jb4[0].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							method();
							
						}
						private void method() {
							myatk[0][0]=1;
							myatk[0][1]=1;
							ifatk[0]=1;
							jl3[0].setText("Stonetusk Boar");
							jl31[0][0].setText("1");
							jl31[0][1].setText("1");
							jb4[0].setVisible(false);
							jl4[0].setVisible(false);
						}
				 });
					jb4[1].addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								method();
								
							}
							private void method() {
								
								myatk[1][0]=1;
								myatk[1][1]=1;
								ifatk[1]=0;
								jl3[1].setText("Abusive Sergeant");
								jl31[1][0].setText("1");
								jl31[1][1].setText("1");
								if(myatk[0][0]!=0) {
								jl31[0][0].setText("3");
								myatk[0][0]=myatk[0][0]+2;
								jb4[1].setVisible(false);
								jl4[1].setVisible(false);
								}	
							} 
					 });
					jb4[2].addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								method();
								
							}
							private void method() {
								if(myatk[0][0]!=0) {
							myatk[0][0]=myatk[0][0]+3;
							jl31[0][0].setText(String.valueOf(myatk[0][0]));
							jb4[2].setVisible(false);
							jl4[2].setVisible(false);
							}
								else
									JOptionPane.showMessageDialog(null,"Invalid Target","", JOptionPane.ERROR_MESSAGE);
									
							} 
					 });
					jb4[3].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							method();
							
						}
						private void method() {
							if(myatk[0][0]!=0) {
						myatk[0][0]=myatk[0][0]+3;
						jl31[0][0].setText(String.valueOf(myatk[0][0]));
						jb4[3].setVisible(false);
						jl4[3].setVisible(false);
						}
							else
								JOptionPane.showMessageDialog(null,"Invalid Target","", JOptionPane.ERROR_MESSAGE);
								
						} 
				 });
					jb4[4].addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								method();
								
							}
							private void method() {
								if(myatk[0][0]!=0) 
									ifatk[0]=2;
									else
									JOptionPane.showMessageDialog(null,"Invalid Target","", JOptionPane.ERROR_MESSAGE);
								jb4[4].setVisible(false);
								jl4[4].setVisible(false);
								
									
							} 
					 });
				} 
				
				
				 });
	     
	     JButton DrDoom3=new JButton("DrDoom3");
	     DrDoom3.setBounds(100,500,100,50);
	     con.add(DrDoom3);
	     DrDoom3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					method();
					
				}
				private void method() {
					hint.setVisible(true);
					 hint.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								method();
								
							}
							private void method() {
								JFrame frame1=new JFrame();
								 frame1.setSize(800,600);
								 frame1.getContentPane().setLayout(null);								 
					                frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					                frame1.setVisible(true);
					                JLabel j1=new JLabel();
					                JLabel j2=new JLabel();
					                JLabel j3=new JLabel();
					                JLabel j4=new JLabel();
					                JLabel j5=new JLabel();
					                j3.setBounds(200, 300, 800, 30);
					                j1.setBounds(200, 100, 800, 30);
					                j2.setBounds(200, 200, 800, 30);
					                j4.setBounds(200, 400, 800, 30);
					                j5.setBounds(200, 500, 800, 30);
					                j2.setText("Reincarnate:Destroy aminion,then return it to life with full Health");
					                j1.setText("Bronze Gatekeeper:a minion with taunt 1/5");
					                j3.setText("Ticking Abomination:Deathrattle:Deal 5 damage to your minions");
					                j4.setText("Leeroy Jenkins: a minion with charge 6/2");
					                j5.setText("hint:Reincarnate can trigger Deathrattle and reset a minion's attack status ");
					                
					                frame1.add(j1);
					                frame1.add(j2);
					                frame1.add(j3);
					                frame1.add(j4);
					                frame1.add(j5);
					                
							} 
					 });
					
					eatk[7][1]=12;
					hhealth1.setText("12");
					int[] taunt=new int[3];
					taunt[0]=1;
					taunt[2]=1;
					jl4[0].setText("Reincarnate");
					jl4[1].setText("Reincarnate");
				
					for(int i=2;i<10;i++)
					{
						jl4[i].setVisible(false);
						jb4[i].setVisible(false);
						
					}
					for(int i=1;i<7;i++)
					{
						jl3[i].setVisible(false);
						jb3[i].setVisible(false);
						jl31[i][0].setVisible(false);
						jl31[i][1].setVisible(false);
					}
					for(int i=3;i<7;i++)
					{
						jb2[i].setVisible(false);
						jl21[i][0].setVisible(false);
						jl21[i][1].setVisible(false);
					}
					jl3[0].setText("Leeroy Jenkins");
					myatk[0][0]=6;
					myatk[0][1]=2;
					ifatk[0]=1;
					jl31[0][0].setText("6");
					jl31[0][1].setText("2");
					jl2[2].setText("Bronze Gatekeeper");
					jl2[0].setText("Bronze Gatekeeper");
					jl21[0][0].setText("1");
					jl21[0][1].setText("5");
					jl21[2][0].setText("1");
					jl21[2][1].setText("5");
					eatk[2][1]=5;
					eatk[2][0]=1;
					eatk[0][1]=5;
					eatk[0][0]=1;
					jl2[1].setText("Ticking Abomination");
					eatk[1][0]=5;
					eatk[1][1]=6;
					jl21[1][0].setText("5");
					jl21[1][1].setText("6");
					jb4[0].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							method();
							
						}
						private int method() {
							
								if(emiatk[1]==true)
								{
									eatk[0][0]=0;
									eatk[0][1]=0;
									eatk[2][1]=0;
									eatk[2][0]=0;
									jl2[2].setText("");
									jl2[0].setText("");
									jl21[0][0].setText("");
									jl21[0][1].setText("");
									jl21[2][0].setText("");
									jl21[2][0].setText("");
									taunt[0]=0;
									taunt[2]=0;
									return 0;
									
								}
								
								jb3[0].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										method();
										
									}
									private void method() {
											ifatk[0]=1;		
									} 
							 });
								return 0;
								
								
								
								
						
									
						} 
				 });
					jb3[0].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							method();
							
						}
						private void method() {
							if(taunt[0]==1)
								JOptionPane.showMessageDialog(null,"No way to attack,There's a taunt mionion in front of you.","", JOptionPane.ERROR_MESSAGE);
								
						} 
				 });
					
					
					
					
					
				} 
		 });
	     
	     
	     heropower.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					method();
					
				}
				private void method() {
						
				} 
		 });
	}
	//
	
	
	//test
	/*Mionions mionion=new Mionions();
	Mionions[] mionions=new Mionions[30];{
		mionions[0]=new Mionions();
		mionions[0].setatk(2);
		mionions[0].setdef(1);
		mionions[0].setname("Leper Gnome");
		}*/
	
	

	private static int random() {
        double random = Math.random();
       int i = (int)(random*100%30);
     
      
    return i;
    }
	
	


}
