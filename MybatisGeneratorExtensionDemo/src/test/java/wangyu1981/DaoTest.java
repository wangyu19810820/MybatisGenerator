package wangyu1981;

import com.dao.SysAreaExtendMapper;
import com.dao.SysAreaMapper;
import com.model.SysAreaCriteria;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class DaoTest {

    @Autowired
    private SysAreaExtendMapper sysAreaMapper;

    @Test
    public void testCountByExample() {
        SysAreaCriteria criteria = new SysAreaCriteria();
        criteria.createCriteria().andFatherIdEqualTo("000000");
        long count = sysAreaMapper.countByExample(criteria);
        System.out.println(count);
    }
}
