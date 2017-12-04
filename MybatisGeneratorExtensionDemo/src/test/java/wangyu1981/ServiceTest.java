package wangyu1981;

import com.model.Company;
import com.service.CompanyService;
//import com.service.SysAreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ServiceTest {

//    @Autowired
//    private SysAreaService sysAreaService;

    @Autowired
    private CompanyService companyService;

    @Test
    public void testCountByExample() {
//        long count1 = sysAreaService.();
//        System.out.println(count1);

        Company company = companyService.selectByPrimaryKey(1);
        System.out.println(company);
//
//        List<Company> list = companyService.selectByExample(null);
//        System.out.println(list);
    }
}
