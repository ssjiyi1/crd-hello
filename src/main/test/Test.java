import cn.zw.dubbo.dao.DubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administratork
 * on 2016/8/1
 * 13:38.
 */
public class Test {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");

        context.start();

        System.out.println("-----------------------------");
        DubboService dubboService =  context.getBean("demoService", DubboService.class);

        int result = dubboService.add(1,1);
        System.out.println("------ result>" + result);


    }

}
