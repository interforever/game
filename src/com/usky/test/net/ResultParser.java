package com.usky.test.net;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResultParser
{
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		File lastFile = new File("G:/log.txt");
//		if(lastFile.getTotalSpace())
		List<File> fileList = new ArrayList<File>();
		for (int i = 1;; i++)
		{
			File file = new File("G:/log" + i + ".txt");
			if (file.exists())
			{
				fileList.add(file);
			}
			else
			{
				break;
			}
		}
		fileList.add(lastFile);
		boolean flag = false;
		long lastTime = 0;
		long currentTime;
		long difference;
		String sign = "*";
		for (File file : fileList)
		{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			String[] elements = line.split("\\|");
			for (String element : elements)
			{
				String[] pair = element.split(":");
				currentTime = Long.parseLong(pair[0]);
				difference = (currentTime - lastTime) / 60000;
				lastTime = currentTime;
				if (difference > 1)
				{
					System.out.println(difference / 1440 + "天\t" + difference % 1440 / 60 + "小时\t" + difference % 60
					        + "分钟");
				}
				if (!sign.equals(pair[1]))
				{
					sign = pair[1];
					if (flag)
					{
						flag = false;
						System.out.println(DateFormat.getDateTimeInstance().format(new Date(Long.parseLong(pair[0])))
						        + ":下线");
					}
					else
					{
						flag = true;
						System.out.println(DateFormat.getDateTimeInstance().format(new Date(Long.parseLong(pair[0])))
						        + ":上线");
					}
				}
			}
		}
	}
}
