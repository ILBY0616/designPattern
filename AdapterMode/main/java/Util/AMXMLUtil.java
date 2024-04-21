package Util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AMXMLUtil {
    public static List<Object> getBeans() {
        List<Object> beans = new ArrayList<>();
        try {
            // 找到文件
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document;
            document = builder.parse(new File("AdapterMode/main/resource/config.xml"));

            // 找到节点
            NodeList nodeList = document.getElementsByTagName("className");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i).getFirstChild();
                String className = "Adapter." + node.getNodeValue();

                // 创建对象
                Class<?> newClass = Class.forName(className);
                Object object = newClass.newInstance();
                beans.add(object);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return beans;
    }
}