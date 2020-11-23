import com.djz.pojo.Books;
import com.djz.service.IBookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author djz
 * @date 2020/11/23 -16:27
 */
public class Mytest {

    @Test
    public void test(){
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

         IBookService bookServiceImpl = (IBookService) context.getBean("bookServiceImpl");
         for (Books b: bookServiceImpl.selectAllBooks()){
             System.out.println(b);
         }
    }
}
