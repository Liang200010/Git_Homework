package edu.nf.Git_hw.dao.impl;

import edu.nf.Git_hw.dao.UserDao;
import edu.nf.Git_hw.entity.Users;
import edu.nf.Git_hw.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author Jason
 */
public class UserDaoImpl implements UserDao {
    @Override
    public List<Users> listUser() {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser();
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void register(List<Users> users) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).register(users);
        }catch (RuntimeException e){
            throw e;
        }
    }

}
