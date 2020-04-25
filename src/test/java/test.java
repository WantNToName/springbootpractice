import com.example.demo.DemoApplication;
import com.example.demo.bean.Dog;
import com.example.demo.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = DemoApplication.class)
class test {
    @Autowired
    private Person person;
    private String word="asdfa";
    private Logger log = LoggerFactory.getLogger(test.class);
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    @Autowired
    public Dog dog;
    @Test
    public void contestLoads(){
        System.out.println(person);
    }

    @Test
    public void logtest(){
            log.info("这是第一个log信息");
            log.debug("这是第二个log信息");
            log.warn("warn");
            log.error("this third log error infomation");
            log.info("log name: "+log);
    }

    @Test
    public void beanTest(){
        System.out.println(dog);
    }


}
