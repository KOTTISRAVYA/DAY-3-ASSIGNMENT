
	import java.io.*;
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;


	public class Sample {
	public static void main(String[] args)throws IOException
	{
		File infile =new File("C:\\Users\\Sravya\\Desktop\\Input.txt");
		 File opfile =new File("C:\\Users\\Sravya\\Desktop\\output.txt");
		 FileReader br = new FileReader(infile); 
		 BufferedReader buffer = new BufferedReader(br);
		 FileWriter bw = new FileWriter(opfile); 
		String st;
		while((st=buffer.readLine())!=null)
		{
			bw.write(isSamp(st)+"\n");
		}
		bw.flush();
	}
	public static StringBuilder isSamp(String str)
	{
		StringBuilder sb=new StringBuilder();
		String[] s=str.split(" ");
		for(String i:s)
		{
			if(i.length()>1)
			{
				char t=i.charAt(1);
				if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
				{
					sb.append(i+" ");
					
				}
			}
		}
		return sb;
		
	}
	}


	
