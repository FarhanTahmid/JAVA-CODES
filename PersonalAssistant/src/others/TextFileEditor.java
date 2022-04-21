
package others;

import home.Home;
import javax.swing.*; 
import java.io.*; 
import java.awt.event.*; 
import javax.swing.plaf.metal.*; 


public class TextFileEditor extends JFrame implements ActionListener { 
    JTextArea txt; 
    JFrame frame; 
    
    public TextFileEditor(){ 
        frame = new JFrame("Note Editor"); 
  
        try { 
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 
            MetalLookAndFeel.setCurrentTheme(new OceanTheme()); 
        } 
        catch (Exception e) { 
        } 

        txt = new JTextArea(); 
  
        JMenuBar mb = new JMenuBar(); 
        JMenuItem mi1 = new JMenuItem("Open File");
        JMenuItem mi2 = new JMenuItem("New"); 
        JMenuItem mi3 = new JMenuItem("Save"); 
        JMenuItem mi4 = new JMenuItem("Print"); 
        JMenuItem mi5 = new JMenuItem("Close"); 
        
        mi1.addActionListener(this); 
        mi2.addActionListener(this); 
        mi3.addActionListener(this); 
        mi4.addActionListener(this); 
        mi5.addActionListener(this); 
        
        mb.add(mi1); 
        mb.add(mi2); 
        mb.add(mi3); 
        mb.add(mi4);  
        mb.add(mi5); 
  
        frame.setJMenuBar(mb); 
        frame.add(txt); 
        frame.setSize(500, 500); 
        frame.setLocationRelativeTo(null);
        frame.show();
    } 
  
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        
        
        if (s.equals("Save")) { 
            
        JFileChooser j = new JFileChooser("f:"); 
        int r = j.showSaveDialog(null); 
            if (r == JFileChooser.APPROVE_OPTION) { 
                File fi = new File(j.getSelectedFile().getAbsolutePath()); 
                try { 
                    FileWriter wr = new FileWriter(fi, false); 
                    BufferedWriter w = new BufferedWriter(wr); 
                    w.write(txt.getText()); 
                    w.flush(); 
                    w.close(); 
                } 
                catch (Exception ex) { 
                    JOptionPane.showMessageDialog(frame, ex.getMessage()); 
                } 
            } 
            else
                JOptionPane.showMessageDialog(frame, "The File is Not Saved"); 
        } 
        else if (s.equals("Print")) { 
            try { 
                txt.print(); 
            } 
            catch (Exception ex) { 
                JOptionPane.showMessageDialog(frame, ex.getMessage()); 
            } 
        } 
        
        else if (s.equals("Open File")) { 
            JFileChooser j = new JFileChooser("f:"); 
            int r = j.showOpenDialog(null); 

            if (r == JFileChooser.APPROVE_OPTION) { 
                File fi = new File(j.getSelectedFile().getAbsolutePath()); 
                try { 
                    String s1 = "", sl = ""; 
 
                    FileReader fr = new FileReader(fi); 
                    BufferedReader br = new BufferedReader(fr); 

                    sl = br.readLine(); 

                    while ((s1 = br.readLine()) != null) { 
                        sl = sl + "\n" + s1; 
                    } 

                    txt.setText(sl); 
                } 
                catch (Exception ex) { 
                    JOptionPane.showMessageDialog(frame, ex.getMessage()); 
                } 
            } 
            else
                JOptionPane.showMessageDialog(frame, "The File is Not Opened"); 
        } 
        
        
        else if (s.equals("New")) { 
            frame.setVisible(false);
            TextFileEditor ob = new TextFileEditor(); 
        } 
        
        else if (s.equals("Close")) { 
        frame.setVisible(false);
        Home ob=new Home();
        ob.setVisible(true);
        }
    } 
}