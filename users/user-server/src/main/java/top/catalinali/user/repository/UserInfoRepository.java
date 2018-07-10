package top.catalinali.user.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import top.catalinali.user.dataobject.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    UserInfo findByOpenid(String openid);

    UserInfo findByUsername(String username);
}
