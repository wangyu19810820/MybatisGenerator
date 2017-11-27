package wangyu1981;

import com.dao.SysAreaExtendMapper;
import com.dao.SysAreaMapper;
import com.model.SysArea;
import com.model.SysAreaCriteria;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class DaoTest {

    @Autowired
    private SysAreaMapper sysAreaMapper;

    @Test
    public void testCountByExample() {
        SysAreaCriteria criteria = new SysAreaCriteria();
        criteria.createCriteria();
        RowBounds rowBounds = new RowBounds(10, 10);

        List<SysArea> list = sysAreaMapper.selectByExample(criteria, rowBounds);
        list.forEach(System.out::println);
    }

//    @Test
//    public void testSelectByFatcher() {
//        List<SysArea> list = sysAreaMapper.selectByFatherId();
//        list.forEach(System.out::println);
//    }
}
