package top.catalinali.user.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.catalinali.user.dataobject.UserInfo;
import top.catalinali.user.enums.RoleEnum;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:20 2018/7/10
 * @Modefied by:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoRepositoryTest {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void findByOpenid() {
        UserInfo userInfo = userInfoRepository.findByOpenid("abc");
        Assert.assertTrue(userInfo!=null);
        Assert.assertTrue(userInfo.getRole()== RoleEnum.BUYER.getCode());
    }

    @Test
    public void findByUsername() {
        UserInfo userInfo = userInfoRepository.findByUsername("admin");
        Assert.assertTrue(userInfo!=null);
        Assert.assertTrue(userInfo.getRole()== RoleEnum.BUYER.getCode());
    }
}