package edu.nf.Git_hw.dao;

import edu.nf.Git_hw.entity.Users;

import java.util.List;

/**
 * @author Jason
 */
public interface UserDao {
    /**
     * 查询所有
     * @return
     */
    List<Users> listUser();

    /**
     * 注册用户(批量添加)
     * @param users
     * @return
     */
    void register(List<Users> users);

}
