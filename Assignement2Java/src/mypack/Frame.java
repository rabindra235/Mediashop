package mypack;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;





public class Frame implements ActionListener {
	
	// creating an instance variable inorder to make a GUI layout 
	
	JFrame frame;
	JPanel first;
	JPanel second;
	JLabel labelA;
	JLabel labelB;
	JLabel labelC;
	JTextArea output;
	JButton Jbutton;
	
	String[]dropDown={"Select","CD","Book","Movie"};
	JComboBox comboBox=new JComboBox(dropDown);

	
	public void actionPerformed(ActionEvent e)
	{
		String actionCommand = e.getActionCommand();
		if(actionCommand.equalsIgnoreCase("sales"))
		{
			labelA.setText("Select");
			first.add(comboBox);
		}
		
		else if(actionCommand.equalsIgnoreCase("statistics"))
		{
			labelA.setText("Stats For");
		}
		
	}
	
	public void createMenuBar()
	{
		
		JMenuBar menuTab= new JMenuBar();
		frame.setJMenuBar(menuTab);
		
		JMenu menuFile = new JMenu("Menu");
		menuTab.add(menuFile);
		
		//creating three menu itmes i.e Sales,Rating and Statics
		JMenuItem sales =new JMenuItem("Sales");
		menuFile.add(sales);
		sales.addActionListener(this);
		
		JMenuItem rating =new JMenuItem("Rating");
		menuFile.add(rating);
		rating.addActionListener(this);
		
		
		JMenuItem statics =new JMenuItem("statistics");
		menuFile.add(statics);
		statics.addActionListener(this);
				
	}
	
	public void createFrame()
	{
		frame =new JFrame("Welcome To Media Shop");
		labelA=new JLabel("s4963571 hearlty welcomes you to Media Shop online Portal");
		labelB= new JLabel("");
		first=new JPanel();
		second=new JPanel();
		first.add(labelA);
		frame.setSize(700, 700);
		frame.setVisible(true);
		//frame.pack();
		frame.add(first,BorderLayout.PAGE_START);
		frame.add(second,BorderLayout.CENTER);
		//frame.add(second,BorderLayout.CENTER);
		
		comboBox.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				String selecItem=comboBox.getSelectedItem().toString();
				if(selecItem.equalsIgnoreCase("Book"))
				{				
					second.removeAll();
					second.revalidate();
					labelB.setText(selecItem);
					second.repaint();
					second.add(new JScrollPane(bookTable),BorderLayout.CENTER);
					second.add(new JButton("Add to Purchase"),BorderLayout.EAST);
					second.add(new JLabel("Selected Item"),BorderLayout.AFTER_LINE_ENDS);
			        output = new JTextArea(5, 40);
			        output.setEditable(false);
			        second.add(new JScrollPane(output),BorderLayout.AFTER_LAST_LINE);
					
													
				}
			

				else if(selecItem.equalsIgnoreCase("CD"))
				{					
					second.removeAll();
					labelB.setText(selecItem);
					second.repaint();
					second.revalidate();
					second.add(new JScrollPane(cdTable));
					second.add(new JButton("Add to Purchase"),BorderLayout.EAST);
					second.add(new JLabel("Selected rows"));
			        output = new JTextArea(5, 40);
			        output.setEditable(false);
			        second.add(new JScrollPane(output),BorderLayout.SOUTH);
										
				}
				
				
				else if(selecItem.equalsIgnoreCase("Movie"))
				{
					
					second.removeAll();
					labelB.setText(selecItem);
					second.repaint();
					second.revalidate();
					second.add(new JScrollPane(movieTable));
					second.add(new JButton("Add to Purchase"),BorderLayout.EAST);
					second.add(new JLabel("Selected Item"));
			        output = new JTextArea(5, 40);
			        output.setEditable(false);
			        second.add(new JScrollPane(output),BorderLayout.SOUTH);
							
				}
				
			}
			
			
		});
		
			
			bookTable.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        	   
        		outputSelection("MOUSE CLICKED EVENT: ");

        	  }
        	});
		
	}
	
	
	
	//creating table for different media starts here
	
	
	
	BookTable bt=new BookTable();
	
	//System.out.println(tempFrm.comoBoxSelected);
	DefaultTableModel  defaultBook= new DefaultTableModel(bt.rowCol,bt.columnHeader);
	 JTable bookTable = new JTable(defaultBook)
		{
		 
		 
		 
			public TableCellEditor getCellEditor(int row,int column)
			{
				//TemplateFrame tempFrm=new TemplateFrame("Book");
				int newmodel = convertColumnIndexToModel(column);
				if(newmodel==4 && row<6)
					return bt.cellEdit.get(row);
				else
					return super.getCellEditor(row,column);
				
			}
		};
		

		
		CDTable ct=new CDTable();
		//System.out.println(tempFrm.comoBoxSelected);
		DefaultTableModel  defaultCD= new DefaultTableModel(ct.rowCol,ct.columnHeader);
		 JTable cdTable = new JTable(defaultCD)
			{
				public TableCellEditor getCellEditor(int row,int column)
				{
					//TemplateFrame tempFrm=new TemplateFrame("Book");
					int newmodel = convertColumnIndexToModel(column);
					if(newmodel==4 && row<6)
						return bt.cellEdit.get(row);
					else
						return super.getCellEditor(row,column);
					
				}
				
			};
	
			MovieTable mt=new MovieTable();
			//System.out.println(tempFrm.comoBoxSelected);
			DefaultTableModel  defaultMovie= new DefaultTableModel(mt.rowCol,mt.columnHeader);
			 JTable movieTable = new JTable(defaultMovie)
				{
					public TableCellEditor getCellEditor(int row,int column)
					{
						//TemplateFrame tempFrm=new TemplateFrame("Book");
						int newmodel = convertColumnIndexToModel(column);
						if(newmodel==4 && row<6)
							return bt.cellEdit.get(row);
						else
							return super.getCellEditor(row,column);
						
					}
					
				};
			
// creating table for different media ends here.
				
				
				private void outputSelection(String heading) {
			    	
			        for (int c : bookTable.getSelectedRows()) {
			         	String g =String.valueOf(bookTable.getValueAt(c, 4));
			         			int newG=Integer.parseInt(g);
			         			if(newG>0)
			         			{
			         					output.append(heading);        
			         					output.append("Rows:");
			         					output.append(""+ newG);
			         					
			         			}
			        }
			   
			        output.append(".\n");
			    }
				
				
				
	
	public static  void main (String[] args)
	{
		Frame frm= new Frame();
		frm.createFrame();
		frm.createMenuBar();
		
		
	}
	
	
	
	private class RowListener implements ListSelectionListener {
	    public void valueChanged(ListSelectionEvent event) {
	        if (event.getValueIsAdjusting()) {
	            return;
	        }
	        
	        outputSelection("ROW SELECTION EVENT. ");
	    }
	}

}
