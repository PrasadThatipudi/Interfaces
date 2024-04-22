// DMart application

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class DMart
{
	public static void main(String[] args) throws Exception 
	{
		// DMart dMart = new DMart();

		String menuFile = "Menu.cfg";

		cruds item = new cruds("138.68.140.83", "Prasad", "Prasad@123", "dbPrasad", "Item");

		while (true)
		{
			showMenu(getMenu(menuFile), item);
		}

	}

	static String getMenu(String pMenuFile)
	{
		// StringBuilder menuBuilder = new StringBuilder();

		String menu = "";

        try
        {
        	BufferedReader reader = new BufferedReader(new FileReader(pMenuFile));

            String menuLine;

            while ((menuLine = reader.readLine()) != null) 
            {
            	menu += menuLine + "\n"; 
            }
        } 
        catch (IOException error) 
        {
            error.printStackTrace();
        }

        // String menu = menuBuilder.toString();

		return menu;
	}

	static void showMenu(String pMenu, cruds item) throws Exception
	{
		System.out.println(pMenu);

		int choice;

		choice = item.getChoice(0, 7);

		// System.out.println("Choice: " + choice);

		switch (choice)
		{
			case 1: item.create();
				break;

			case 2: item.showAllRecords();
				break;
				
			case 3: item.update();
				break;
				
			case 4: item.delete();
				break;
				
			case 5: item.search();
				break;
				
			case 6: item.sort();
				break;
				
			case 0: System.exit(0);
		}
	}
}