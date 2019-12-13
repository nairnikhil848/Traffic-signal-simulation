import java.applet.*;
import java.awt.*;
public class PBL extends Applet implements Runnable
{   Thread t;Image img,pic;
    int c,count;
    String s;
    Font f;
    public void init()
    {   this.resize(1366, 766);
        s=new String(); 
        img = getImage(getCodeBase(),"car.png");      
        s="STOP";
        c=1;
        count=0;
        f=new Font("Arial",Font.BOLD,50);
        t=new Thread(this);   
    }   
   public void start()
   {   t.start();
   }        
   public void run()
   {    for(int i=1;i<=50;i++)
        {   try
            {   if(c==1)
                {    t.sleep(2000);
                    repaint();
                    c=2;
                    s="READY";
                    
                }
              else if(c==2)
                   {    
                        t.sleep(2000);
                        repaint();
                        c=3;
                        s="GO";
                   }
                    else if(c==3)
                         {        
                            t.sleep(1);
                            repaint();
                            c=1;
                            s="STOP";
                         }
            }
            catch(Exception e)
                {
                }
        }          
   }   
 
   public void paint(Graphics g)
   {      g.setFont(f);
          g.drawImage(pic, 0, 0, 1366, 766, this);
          g.setColor(Color.black);
          g.fillOval(645, 10, 112, 112);
          g.fillPolygon(new int[]{750,650,780},new int[]{93,30,30},3);       
          g.fillPolygon(new int[]{750,650,780},new int[]{156,93,93},3);
          g.fillPolygon(new int[]{749,650,780},new int[]{225,156,156},3);  
          g.fillPolygon(new int[]{650,620,750},new int[]{93,30,30},3);
          g.fillPolygon(new int[]{650,620,750},new int[]{156,93,93},3);
          g.fillPolygon(new int[]{650,620,750},new int[]{225,156,156},3);
          g.fillRoundRect(650, 30, 100, 200, 10, 10);
          g.setColor(Color.gray);
          g.fillRect(675, 230, 50,150);
          g.setColor(Color.black);
          g.drawLine(10,380,1377,380);
          g.setColor(Color.black);
          g.drawLine(10,682,1377,682);
         if(c==1)
         {    g.drawString(s,200,80);
              g.setColor(Color.red);
              g.fillOval(675, 40, 50, 50);
              if(count%2==0)
              { 
                       g.drawImage(img, 0, 462, this);
                        try{                                  
                           t.sleep(2);                         
                           }
                       catch(Exception e)
                       {
                       }                                 
              }
              if(count%2==1)
              {
                  g.drawImage(img, 390, 462, this);
                  try{                                  
                      t.sleep(2);                         
                     }
                 catch(Exception e)
                       {
                       }                 
              }

         }
         if(c==2)
         {    g.drawString(s,200,145);              
              g.setColor(Color.yellow);
              g.fillOval(675, 100, 50, 50);
              if(count%2==0)
              { 
                       g.drawImage(img, 0, 462, this);
                        try{                                  
                           t.sleep(2);                         
                           }
                       catch(Exception e)
                       {
                       }                                 
              }
              if(count%2==1)
              {
                  g.drawImage(img, 390, 462, this);
                  try{                                  
                      t.sleep(2);                         
                     }
                 catch(Exception e)
                       {
                       }                 
              }
         }
         if(c==3)
         {    g.drawString(s,200,215);
              g.setColor(Color.green);
              g.fillOval(675, 165, 50, 50);
              if(count%2==0)
              { 
                  for( int j=0;j<390;j++)
                    {   g.drawImage(img, j, 462, this);
                        try{                                  
                                t.sleep(2);
                           }
                       catch(Exception e)
                       {
                       }   
                    
                    }
                  
               
              }
              if(count%2==1)
              { 
                  for( int j=390;j<1000;j++)
                    {   g.drawImage(img, j, 462, this);
                        try{                                  
                           t.sleep(2);                         
                           }
                       catch(Exception e)
                       {
                       }   
                    
                    }
                  
                
              }
              count++;
          }      
    }   
}