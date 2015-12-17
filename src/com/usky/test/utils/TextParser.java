/**
 * 
 */
package com.usky.test.utils;

import java.io.RandomAccessFile;

/**
 * @author Administrator
 */
public class TextParser
{

	public static String loadFile(String fileName)
	{
		String context = "";
		try
		{
			RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
			String line_record = raf.readLine();
			while (line_record != null)
			{
				if (line_record.trim().length() != 0)
				{
					context += "\n" + line_record;
				}
				line_record = raf.readLine();
			}
			return context;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
