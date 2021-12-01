import java.awt.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.*;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Prog {
    public static void main(String[] arguments) {
        /*StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(',');
        builder.append("World!");
        System.out.println(builder.toString());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getClass().getCanonicalName());*/

     /*   class CloneObj implements Cloneable{

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return new CloneObj();
            }
        }

        CloneObj obj = new CloneObj();
        try {
            CloneObj pattern = (CloneObj) obj.clone();
        }catch (CloneNotSupportedException exception){}

      */

      /*  final Map<String, String> original = new HashMap<>();
        InvocationHandler proxy = (obj, method, args) -> {
            System.out.println("Invoked: "+ method.getName());
            return method.invoke(original, args);
        };
        Map <String, String> proxyInstance = (Map) Proxy.newProxyInstance(original.getClass().getClassLoader(), original.getClass().getInterfaces(), proxy);
        proxyInstance.put("key", "value");
        System.out.println(proxyInstance.get("key"));*/

        /*List<String> list = new ArrayList<>();
        List<String> decorator = Collections.checkedList(list, String.class);
        decorator.add("2");
        list.add("3");
        System.out.println(decorator);*/

        /*String[] array = {"One", "Two", "Three"};
        List<String> strings = Arrays.asList(array);
        strings.set(0, "1");
        System.out.println(Arrays.toString(array));*/

        /*
        Container container = new Container();
        Component component = new Component() {
        };
        System.out.println(component.getComponentOrientation().isLeftToRight());
        container.add(component);
        container.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        System.out.println(component.getComponentOrientation().isLeftToRight());
        */

      /*  List<String> data = Arrays.asList("Moscow", "Paris", "NYC");
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        Set dataSet = new TreeSet(comparator);
        dataSet.addAll(data);
        System.out.println("Dataset :"+ dataSet);*/

        /*Runnable command = () -> {
            System.out.println("Command action");
        };

        Thread thread = new Thread(command);
        thread.start();*/
        Logger logger = Logger.getLogger(Prog.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler(){

            @Override
            public void publish(LogRecord record) {
                System.out.println("LogRecord обработан");
            }
        };
        logger.addHandler(consoleHandler);
        logger.info("test");
    }
}
