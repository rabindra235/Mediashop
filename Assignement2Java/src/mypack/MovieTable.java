package mypack;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.TableCellEditor;

public class MovieTable {
	final List<TableCellEditor> cellEdit =new ArrayList<TableCellEditor>(100);
	//Frame fram;
	
	public String [] columnHeader;
	
	ArrayList<Movie> movieList=Warehouse.getMovies();
	Object[][] rowCol=new Object[movieList.size()][5];
	
	public MovieTable()
	{
		//rowCol=new Object[movieList.size()][5];
		String []colHeader= {"Title","Price","Director","Available","SelectQuantity"};
		 columnHeader= colHeader;
			for(Movie mv:movieList)
			{
				
				rowCol[movieList.indexOf(mv)][0]=mv.getTitle();
				rowCol[movieList.indexOf(mv)][1]=mv.getPrice();
				rowCol[movieList.indexOf(mv)][2]=mv.getDirector();
				rowCol[movieList.indexOf(mv)][3]=mv.getAvailble();
				rowCol[movieList.indexOf(mv)][4]=0;
				
				//creating the an drop down for quanity
				
				String [] qunatityDropDown = new String [mv.getAvailble()+1]; 
				for(int j=0;j<=mv.getAvailble();j++)
					{
						qunatityDropDown[j]=Integer.toString(j);
					}
				
					JComboBox qunatityComboBox= new JComboBox(qunatityDropDown);
					DefaultCellEditor defaultCell= new DefaultCellEditor(qunatityComboBox);
					cellEdit.add(defaultCell);
			
		}
		
	}

}
