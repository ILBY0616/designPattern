package Client;
import Target.ClassCar;
import Target.ObjectCar;
import Util.AMXMLUtil;
import java.util.List;
public class AMClient {
    public static void main(String[] args) {
        List<Object> beans = AMXMLUtil.getBeans();

        // 获取第一个对象
        System.out.println("类适配器模式");
        ClassCar classCar = (ClassCar) beans.get(0);
        classCar.run();


        // 获取第二个对象
        System.out.println("对象适配器模式");
        ObjectCar objectCar = (ObjectCar) beans.get(1);
        objectCar.run();
    }
}
