package mypack;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.TableCellEditor;

public class BookTable {
	
	final List<TableCellEditor> cellEdit =new ArrayList<TableCellEditor>(100);
	//Frame fram;
	
	public String [] columnHeader;
	
	ArrayList<Book> bookList=Warehouse.getBooks();
	Object[][] rowCol;
	
	public BookTable()
	{
		String []colHeader= {"Title","Price","Author","Available","SelectQuantity"};
		this.columnHeader=colHeader;
		 rowCol=new Object[bookList.size()][5];
		for(Book book:bookList)
		{
			rowCol[bookList.indexOf(book)][0]=book.getTitle();
			rowCol[bookList.indexOf(book)][1]=book.getPrice();
			rowCol[bookList.indexOf(book)][2]=book.getAuthor();
			rowCol[bookList.indexOf(book)][3]=book.getAvailble();
			rowCol[bookList.indexOf(book)][4]=0;
			
			//creating the an drop down for quanity
			
			String [] qunatityDropDown = new String [book.getAvailble()+1]; 
			for(int j=0;j<=book.getAvailble();j++)
				{
					qunatityDropDown[j]=Integer.toString(j);
					
				}
			
			JComboBox qunatityComboBox= new JComboBox(qunatityDropDown);
			DefaultCellEditor defaultCell= new DefaultCellEditor(qunatityComboBox);
			cellEdit.add(defaultCell);
				
			
		}
		
	}

}
