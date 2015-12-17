
package com.usky.test.velocity;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.util.StringUtils;

public class VelocityTest {
	
	private static Properties props = new Properties();
	
	static {
//		props.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
//		props.setProperty(Velocity.RESOURCE_LOADER, "class");
//		props.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
	}
	
	/** * 测试字符串模板替换 */
	private static void testStringVelocity() {
		// 初始化并取得Velocity引擎
		VelocityEngine engine = new VelocityEngine(props);
		// 字符串模版 
		String template = "${owner}：您的${type} : ${bill} 在 ${date} 日已支付成功";
		// 取得velocity的上下文context
		VelocityContext context = new VelocityContext();
		// 把数据填入上下文 
		context.put("owner", "nassir");
		context.put("bill", "201203221000029763");
		context.put("type", "订单");
		context.put("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		context.put("xFactor", "${typeName}已生效");
		StringWriter writer = new StringWriter();
		engine.evaluate(context, writer, "", template);
		System.out.println(writer.toString());
	}
	
	/** * 测试模板静态方法使用 */
	private static void testCommonsStringUtils() {
		VelocityEngine engine = new VelocityEngine();
		engine.init();
		VelocityContext ctx = new VelocityContext();
		ctx.put("stringUtils", new StringUtils());
		ctx.put("comments", "this is a \n newline test");
		ctx.put("newline", "\n");
		ctx.put("break", "<br/>");
		String template = "#set($comments = $stringUtils.replace($comments,$newline,$break))";
		template += "$comments";
		StringWriter writer = new StringWriter();
		engine.evaluate(ctx, writer, "", template);
		System.out.println(writer.toString()); // assertEquals("this is a <br /> newline test", writer.toString()); }
	}
	
	public static void main(String[] args) {
		testStringVelocity();
//		testCommonsStringUtils();
		//		VelocityEngine ve = new VelocityEngine();
		//		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		//		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		//		ve.getTemplate(name);
	}
	
}
