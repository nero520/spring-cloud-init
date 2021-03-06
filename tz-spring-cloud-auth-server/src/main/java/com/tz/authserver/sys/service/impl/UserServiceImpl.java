package com.tz.authserver.sys.service.impl;

import com.tz.authserver.sys.entity.User;
import com.tz.authserver.sys.mapper.UserMapper;
import com.tz.authserver.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 当前系统用户 服务实现类
 * </p>
 *
 * @author tz
 * @since 2019-12-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
