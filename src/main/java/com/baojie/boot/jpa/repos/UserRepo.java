package com.baojie.boot.jpa.repos;

import com.baojie.boot.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/5/12.
 */

@Repository
public interface UserRepo extends CrudRepository<User,Long>{

    User findByUsernameAndPassword(String username, String password);

}
