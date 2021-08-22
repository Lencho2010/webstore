import com.geoway.webstore.LenchoProvider8001;
import com.geoway.webstore.entities.ImportResult;
import com.geoway.webstore.entities.Student;
import com.geoway.webstore.service.ImportResultService;
import com.geoway.webstore.service.SqlSessionService;
import com.geoway.webstore.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-08-22 16:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LenchoProvider8001.class)
public class MyBatisDemo {

    @Autowired
    private ImportResultService importResultService;

    @Test
    public void queryImportResults() {
        List<ImportResult> list = importResultService.selectForPage(1, 5);
        for (ImportResult importResult : list) {
            System.out.println(importResult);
        }
    }


    @Resource
    private StudentService studentService;

    @Test
    public void selectForPage1() {
        List<Student> students = studentService.selectForPage1(2, 3);
        System.out.println("-----------------------");
        System.out.println(students);
    }

    @Test
    public void selectForPage2() {
        int currentPage = 1;
        int pageSize = 5;
        Map<String, Object> map = new HashMap<>();
        map.put("startIndex", (currentPage - 1) * pageSize);
        map.put("pageSize", pageSize);
        List<Student> students = studentService.selectForPage2(map);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void selectCount(){
        Integer count = studentService.selectCount();
        System.out.println(count);
        System.out.println("------------end-----------");
    }

    @Test
    public void selectForPage4(){
        List<Student> students = studentService.selectForPage4(0, 2, "h");
        System.out.println(students);
    }
}
