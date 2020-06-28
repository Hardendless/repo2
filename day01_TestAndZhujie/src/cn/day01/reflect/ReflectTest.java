package cn.day01.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {


        /*
        * 步骤：
			1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
			2. 在程序中加载读取配置文件
			3. 使用反射技术来加载类文件进内存
			4. 创建对象
			5. 执行方法
			* */
        Properties pro = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //2.获取配置文件中的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");


        //

        Class<?> cls = Class.forName(className);

        Object o = cls.newInstance();

        Method method = cls.getMethod(methodName);

        method.invoke(o);


    }
}
