package Iface.Impl;

import domain.UserInfo;

/**
 * Created by dufan on 16/8/1.
 */
public class UserInfoServiceImpl  implements UserInfoService.Iface  {
    public int saveUserInfo(UserInfo userInfo) throws org.apache.thrift.TException
    {
        System.out.println("saveUserInfo");
        return 0;
    }

    public UserInfo getUserInfoByUserName(String userName) throws org.apache.thrift.TException
    {
        return null;

    }

    public int updateUserInfo(String userName) throws org.apache.thrift.TException
    {
        return 0;

    }
}
