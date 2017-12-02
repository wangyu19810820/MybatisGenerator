package wangyu1981;

import com.dao.SysAreaMapper;
import com.model.SysArea;
import com.model.SysAreaCriteria;
import com.service.CompanyService;
import com.service.SysAreaService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ServiceTest {

    @Autowired
    private SysAreaService sysAreaService;

    @Autowired
    private CompanyService companyService;

    @Test
    public void testCountByExample() {
        long count1 = sysAreaService.count();
        System.out.println(count1);

        long count2 = companyService.count();
        System.out.println(count2);
    }
}
