package com.pethouse.service.impl;

import com.pethouse.entity.UserInfo;
import com.pethouse.mapper.UserInfoMapper;
import com.pethouse.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Daven
 * @since 2021-10-05
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
