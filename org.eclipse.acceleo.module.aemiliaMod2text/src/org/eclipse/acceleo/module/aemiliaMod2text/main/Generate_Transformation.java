
package org.eclipse.acceleo.module.aemiliaMod2text.main;

import java.io.File;


public class Generate_Transformation {
   
	 
		public static void main (String[] args){

			// checks for first argument
			if(args.length == 0)
		    {
		        System.out.println("The proper usage is to pass as first argument the type of transformation (aem or rew)");
		        System.exit(0);
		    }
			else
			{
				// checks for the type of desired transformation	
				switch(args[0]) 
				{
				
				// aem transformation
			    case "aem":
			    	new Transformation().GenerateAEMTransformation();
			        break;
			 
			    // rew transformation    
			    case "rew":
			    	new Transformation().GenerateREWTransformation();
			        break;
			     
			    // error in passing argument 
			    default:
			    	System.out.println("Only aem or rew strings are valid");
			    	System.exit(0);
				}
				
			}
		}
}

// class that exposes two methods corresponding to the transformations
class Transformation{

	// relative path of transformation results
	 private static String outFolder = "./output";
	
	
	 public void GenerateAEMTransformation() {
		 
		// relative path
		 File baseFolderFile = new File("./m2t/");
			for (File file : baseFolderFile.listFiles()) {
				
				if (file.getName().startsWith("readme")) {
				       continue;
				}
				
				Generate.run(file.getAbsolutePath(), outFolder);
				
			}  
	 }
	 
	 public void GenerateREWTransformation() {
		 
		// relative path
		 File baseFolderFile = new File("./m2t/");
			for (File file : baseFolderFile.listFiles()) {
				
				if (file.getName().startsWith("readme")) {
				       continue;
				}
				
				Generaterew.run(file.getAbsolutePath(), outFolder);
				
			}
	 }
	 
	}

