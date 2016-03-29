package mypack;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.TableCellEditor;

public class CDTable {

	final List<TableCellEditor> cellEdit =new ArrayList<TableCellEditor>(100);
	//Frame fram;
	
	public String [] columnHeader;
	
	ArrayList<CD> cdList=Warehouse.getCDs();
	Object[][] rowCol=new Object[cdList.size()][5];
	
	public CDTable()
	{
		//rowCol=new Object[cdList.size()][5];
		String []colHeader= {"Title","Price","Performer","Available","SelectQuantity"};
		 columnHeader= colHeader;
		 for(CD cd:cdList)
			{
				
				rowCol[cdList.indexOf(cd)][0]=cd.getTitle();
				rowCol[cdList.indexOf(cd)][1]=cd.getPrice();
				rowCol[cdList.indexOf(cd)][2]=cd.getPerformer();
				rowCol[cdList.indexOf(cd)][3]=cd.getAvailble();
				rowCol[cdList.indexOf(cd)][4]=0;
				
				
				//creating the an drop down for quanity
			
				String [] qunatityDropDown = new String [cd.getAvailble()+1]; 
				for(int j=0;j<=cd.getAvailble();j++)
					{
						qunatityDropDown[j]=Integer.toString(j);
						
					}
					
					
				JComboBox qunatityComboBox= new JComboBox(qunatityDropDown);
					DefaultCellEditor defaultCell= new DefaultCellEditor(qunatityComboBox);
					cellEdit.add(defaultCell);
					
				
			}
		 
		
	}



}
