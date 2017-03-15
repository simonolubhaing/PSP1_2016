package controller;

import java.io.File;

public class Controller {

	public int findNoOfFilesInDirectory(String directoryPath)
	{
		int fileCounter = 0;
		//Create a File object which points at the directory supplied from the view(i.e. The user)
		//To actually refer to a single slash in Java we need to use \\. This is because \ alone before alot of characters has a special meaning. e.g. \t means tab.
				
		File f = new File(directoryPath.replace("\\", "\\\\"));
		//Check that what is supplied by the user exists and is a directory.
		if(f.exists() && f.isDirectory())
		{
			//Get a list of all the files (and directories) in the directory we are interested in.
			File[] directoryContents = f.listFiles();
						
			//Use this variable to point at each individual file in the array as we visit it using the for loop.
			File currentFile = null;
			for(int i=0; i<directoryContents.length; i++)
			{
				currentFile = directoryContents[i];
				if(currentFile.isFile())
				{
					fileCounter++;
				}
			}			
		}
		
		return fileCounter;
	}
	
}
