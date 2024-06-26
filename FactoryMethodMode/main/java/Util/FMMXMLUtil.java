package Util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class FMMXMLUtil {
	public static Object getBean() {
		try {
			// 找到文件
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document;
			document = builder.parse(new File("FactoryMethodMode/main/resource/config.xml"));

			// 找到类名
			NodeList nodeList = document.getElementsByTagName("className");
			Node node = nodeList.item(0).getFirstChild();
			String className = "Factory." + node.getNodeValue();

			// 返回对象
			Class<?> newClass = Class.forName(className);
			return newClass.newInstance();
		} catch (Exception e) {
			System.out.println("error:" + e.getMessage());
			return null;
		}
	}
}
