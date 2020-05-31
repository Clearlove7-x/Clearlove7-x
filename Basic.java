package cn.liayun.awt.frame;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class Basic extends JFrame {
Mionions mi=new Mionions();
int[] mark=new int[10];

public Mionions[] mionion=new Mionions[30];
{

		
mionion[0]=new Mionions();
mionion[0].setatk(1);
mionion[0].setdef(2);
mionion[0].setcost(1);
mionion[0].setname("Goldshire Footman");
mionion[0].ifcharge(false);
mionion[0].ifwindfury(false);
mionion[0].iftaunt(true);
mionion[0].ifdivineshield(false);
mionion[0].setspelldamage(0);

mionion[1]=new Mionions();
mionion[1].setname("Murloc Raider");
mionion[1].setatk(2);
mionion[1].setdef(1);
mionion[1].setcost(1);
mionion[1].ifcharge(false);
mionion[1].iftaunt(false);
mionion[1].ifwindfury(false);
mionion[1].ifdivineshield(false);
mionion[1].setspelldamage(0);

mionion[2]=new Mionions();
mionion[2].setname("Stonetusk Boar");
mionion[2].setatk(1);
mionion[2].setdef(1);
mionion[2].setcost(1);
mionion[2].ifcharge(true);
mionion[2].iftaunt(false);
mionion[2].ifwindfury(false);
mionion[2].ifdivineshield(false);
mionion[2].setspelldamage(0);

mionion[3]=new Mionions();
mionion[3].setname("Bloodfen Raptor");
mionion[3].setatk(3);
mionion[3].setdef(2);
mionion[3].setcost(2);
mionion[3].ifcharge(false);
mionion[3].iftaunt(false);
mionion[3].ifwindfury(false);
mionion[3].ifdivineshield(false);
mionion[3].setspelldamage(0);

mionion[4]=new Mionions();
mionion[4].setname("Bluegill Warrior");
mionion[4].setatk(2);
mionion[4].setdef(1);
mionion[4].setcost(2);
mionion[4].ifcharge(true);
mionion[4].iftaunt(false);
mionion[4].ifwindfury(false);
mionion[4].ifdivineshield(false);
mionion[4].setspelldamage(0);

mionion[5]=new Mionions();
mionion[5].setname("Frostwolf Grunt");
mionion[5].setatk(2);
mionion[5].setdef(2);
mionion[5].setcost(2);
mionion[5].ifcharge(false);
mionion[5].iftaunt(true);
mionion[5].ifwindfury(false);
mionion[5].ifdivineshield(false);
mionion[5].setspelldamage(0);

mionion[6]=new Mionions();
mionion[6].setname("Kobold Geomancer");
mionion[6].setatk(2);
mionion[6].setdef(2);
mionion[6].setcost(2);
mionion[6].ifcharge(false);
mionion[6].iftaunt(false);
mionion[6].ifwindfury(false);
mionion[6].ifdivineshield(false);
mionion[6].setspelldamage(1);

mionion[7]=new Mionions();
mionion[7].setname("River Crocolisk");
mionion[7].setatk(2);
mionion[7].setdef(3);
mionion[7].setcost(2);
mionion[7].ifcharge(false);
mionion[7].iftaunt(false);
mionion[7].ifwindfury(false);
mionion[7].ifdivineshield(false);
mionion[7].setspelldamage(0);

mionion[8]=new Mionions();
mionion[8].setname("Dalaran Mage");
mionion[8].setatk(1);
mionion[8].setdef(4);
mionion[8].setcost(3);
mionion[8].ifcharge(false);
mionion[8].iftaunt(false);
mionion[8].ifwindfury(false);
mionion[8].ifdivineshield(false);
mionion[8].setspelldamage(1);

mionion[9]=new Mionions();
mionion[9].setname("Ironfur Grizzly");
mionion[9].setatk(3);
mionion[9].setdef(3);
mionion[9].setcost(3);
mionion[9].ifcharge(false);
mionion[9].iftaunt(true);
mionion[9].ifwindfury(false);
mionion[9].ifdivineshield(false);
mionion[9].setspelldamage(0);

mionion[10]=new Mionions();
mionion[10].setname("Magma Rager");
mionion[10].setatk(5);
mionion[10].setdef(1);
mionion[10].setcost(3);
mionion[10].ifcharge(false);
mionion[10].iftaunt(false);
mionion[10].ifwindfury(false);
mionion[10].ifdivineshield(false);
mionion[10].setspelldamage(0);

mionion[11]=new Mionions();
mionion[11].setname("Silverback Patriarch");
mionion[11].setatk(1);
mionion[11].setdef(4);
mionion[11].setcost(3);
mionion[11].ifcharge(false);
mionion[11].iftaunt(true);
mionion[11].ifwindfury(false);
mionion[11].ifdivineshield(false);
mionion[11].setspelldamage(0);

mionion[11]=new Mionions();
mionion[11].setname("Silverback Patriarch");
mionion[11].setatk(1);
mionion[11].setdef(4);
mionion[11].setcost(3);
mionion[11].ifcharge(false);
mionion[11].iftaunt(true);
mionion[11].ifwindfury(false);
mionion[11].ifdivineshield(false);
mionion[11].setspelldamage(0);

mionion[11]=new Mionions();
mionion[11].setname("Wolfrider");
mionion[11].setatk(3);
mionion[11].setdef(1);
mionion[11].setcost(3);
mionion[11].ifcharge(true);
mionion[11].iftaunt(false);
mionion[11].ifwindfury(false);
mionion[11].ifdivineshield(false);
mionion[11].setspelldamage(0);

mionion[12]=new Mionions();
mionion[12].setname("Chillwind Yeti");
mionion[12].setatk(4);
mionion[12].setdef(5);
mionion[12].setcost(4);
mionion[12].ifcharge(false);
mionion[12].iftaunt(false);
mionion[12].ifwindfury(false);
mionion[12].ifdivineshield(false);
mionion[12].setspelldamage(0);

mionion[13]=new Mionions();
mionion[13].setname("SOasis Snapjaw");
mionion[13].setatk(2);
mionion[13].setdef(7);
mionion[13].setcost(4);
mionion[13].ifcharge(false);
mionion[13].iftaunt(false);
mionion[13].ifwindfury(false);
mionion[13].ifdivineshield(false);
mionion[13].setspelldamage(0);

mionion[14]=new Mionions();
mionion[14].setname("Ogre Magi");
mionion[14].setatk(4);
mionion[14].setdef(4);
mionion[14].setcost(4);
mionion[14].ifcharge(false);
mionion[14].iftaunt(false);
mionion[14].ifwindfury(false);
mionion[14].ifdivineshield(false);
mionion[14].setspelldamage(1);

mionion[15]=new Mionions();
mionion[15].setname("Sen'jin Shieldmasta ");
mionion[15].setatk(3);
mionion[15].setdef(5);
mionion[15].setcost(4);
mionion[15].ifcharge(false);
mionion[15].iftaunt(true);
mionion[15].ifwindfury(false);
mionion[15].ifdivineshield(false);
mionion[15].setspelldamage(0);

mionion[16]=new Mionions();
mionion[16].setname("Stormwind Knight");
mionion[16].setatk(2);
mionion[16].setdef(5);
mionion[16].setcost(4);
mionion[16].ifcharge(true);
mionion[16].iftaunt(false);
mionion[16].ifwindfury(false);
mionion[16].ifdivineshield(false);
mionion[16].setspelldamage(0);

mionion[17]=new Mionions();
mionion[17].setname("Booty Bay Bodyguard");
mionion[17].setatk(5);
mionion[17].setdef(4);
mionion[17].setcost(5);
mionion[17].ifcharge(false);
mionion[17].iftaunt(true);
mionion[17].ifwindfury(false);
mionion[17].ifdivineshield(false);
mionion[17].setspelldamage(0);

mionion[18]=new Mionions();
mionion[18].setname(" Lord of the Arena");
mionion[18].setatk(6);
mionion[18].setdef(5);
mionion[18].setcost(6);
mionion[18].ifcharge(false);
mionion[18].iftaunt(true);
mionion[18].ifwindfury(false);
mionion[18].ifdivineshield(false);
mionion[18].setspelldamage(0);

mionion[19]=new Mionions();
mionion[19].setname("Reckless Rocketeer ");
mionion[19].setatk(5);
mionion[19].setdef(2);
mionion[19].setcost(6);
mionion[19].ifcharge(true);
mionion[19].iftaunt(false);
mionion[19].ifwindfury(false);
mionion[19].ifdivineshield(false);
mionion[19].setspelldamage(0);

mionion[20]=new Mionions();
mionion[20].setname("War Golem");
mionion[20].setatk(7);
mionion[20].setdef(7);
mionion[20].setcost(7);
mionion[20].ifcharge(false);
mionion[20].iftaunt(false);
mionion[20].ifwindfury(false);
mionion[20].ifdivineshield(false);
mionion[20].setspelldamage(0);

for(int i1=21;i1<30;i1++) {
	mionion[i1]=new Mionions();
	mionion[i1].setname("War Golem");
	mionion[i1].setatk(7);
	mionion[i1].setdef(7);
	mionion[i1].setcost(7);
	mionion[i1].ifcharge(false);
	mionion[i1].iftaunt(false);
	mionion[i1].ifwindfury(false);
	mionion[i1].ifdivineshield(false);
	mionion[i1].setspelldamage(0);

}
















	}

private static int random() {
    double random = Math.random();
   int i = (int)(random*100%30);
 
  
return i;
}

}



