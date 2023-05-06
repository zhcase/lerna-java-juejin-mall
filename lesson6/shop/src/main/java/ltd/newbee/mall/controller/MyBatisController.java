package ltd.newbee.mall.controller;

import ltd.newbee.mall.dao.UserDao;
import ltd.newbee.mall.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MyBatisController {

    @Resource
    UserDao userDao;

    //查询所有记录
    @GetMapping("/users/mybatis/queryAll")
    public List<User> queryAll(){
        return userDao.findAllUsers();
    }

//    新增一条记录

    @GetMapping("/users/mybatis/insert")
    public Boolean insert(String name,String password){
            if(StringUtils.isEmpty(name)||StringUtils.isEmpty(password)){
                return false;
            }
            User user=new User();
            user.setName(name);
            user.setPassword(password);
            return userDao.insertUser(user)>0;
    }

//    修改一条记录

    @GetMapping("/users/mybatis/update")
    public  Boolean

}