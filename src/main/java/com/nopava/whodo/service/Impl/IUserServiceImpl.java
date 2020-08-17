package com.nopava.whodo.service.Impl;

import com.nopava.whodo.entity.IUser;
import com.nopava.whodo.mapper.IUserMapper;
import com.nopava.whodo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author ruanjiewei
 * @since 2020-08-10
 */
@Service
public class IUserServiceImpl extends ServiceImpl<IUserMapper, IUser> implements IUserService {

}
