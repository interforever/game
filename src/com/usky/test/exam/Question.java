/**
 * 
 */
package com.usky.test.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class Question
{

	private String question;

	private String answer;

	private String options;

	public String getQuestion()
	{
		return question;
	}

	public void setQuestion(String question)
	{
		this.question = question;
	}

	public String getAnswer()
	{
		return answer;
	}

	public void setAnswer(String answer)
	{
		this.answer = answer;
	}

	public String getOptions()
	{
		return options;
	}

	public void setOptions(String options)
	{
		this.options = options;
	}

	public static Question toQuestion(String context)
	{
		if (context.trim().length() == 0)
		{
			return null;
		}
		String[] lines = context.split("\n");
		int count = lines.length;
		Question question = new Question();
		question.setQuestion(lines[0].trim());
		String options = "";
		for (int i = 1; i < count - 1; i++)
		{
			options += lines[i] + "\n";
		}
		question.setOptions(options.trim());
		question.setAnswer(lines[count - 1].split(" ")[1].trim());
		return question;
	}

	public static List<Question> toQuestionList(String context)
	{
		String[] contextAry = context.split("\n\\d+.");
		List<Question> list = new ArrayList<Question>();
		for (String text : contextAry)
		{
			Question question = toQuestion(text);
			if (question != null)
			{
				list.add(question);
			}
		}
		return list;
	}

}
