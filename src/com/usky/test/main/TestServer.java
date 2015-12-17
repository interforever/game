package com.usky.test.main;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class TestServer
{
	private static transient Log                  logger = LogFactory.getLog(TestServer.class);

	private static ClassPathXmlApplicationContext context;

	private static HibernateTemplate              hibernateTemplate;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext(new String[] { "database.xml" });
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run()
			{
				logger.info("Test Server Stopped...");
			}
		});
		process();
		context.registerShutdownHook();
		logger.info("Test Server Started...");
	}

	private static void process()
	{
		hibernateTemplate.find("from TestA");
	}

	public static HibernateTemplate getHibernateTemplate()
	{
		return hibernateTemplate;
	}

	public static void setHibernateTemplate(HibernateTemplate hibernateTemplate)
	{
		TestServer.hibernateTemplate = hibernateTemplate;
	}
}
