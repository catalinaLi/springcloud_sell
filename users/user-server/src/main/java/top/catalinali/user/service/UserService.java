package top.catalinali.user.service;


import top.catalinali.user.dataobject.UserInfo;

public interface UserService {

    /**
     * 通过openid查询
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
