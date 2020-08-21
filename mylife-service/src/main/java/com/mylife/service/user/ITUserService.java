package com.mylife.service.user;

import com.mylife.bean.qo.user.UserQO;
import com.mylife.bean.vo.user.UserVO;
import com.mylife.entity.user.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author wyh
 * @since 2020-08-20
 */
public interface ITUserService extends IService<TUser> {

    /**
     * @description : 查询 用户
     * @author : wyh
     * @date : 2020/8/21 18:14
     * @params : [qo]
     * @return : java.util.List<com.mylife.bean.vo.user.UserVO>
     **/
    List<UserVO> listUser(UserQO qo);

}
