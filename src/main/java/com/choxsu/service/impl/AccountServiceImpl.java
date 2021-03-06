package com.choxsu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.choxsu.common.entity.Account;
import com.choxsu.common.mapper.AccountMapper;
import com.choxsu.service.AccountService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author choxsu
 * @since 2019-07-14
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Cacheable(cacheNames = "account", key = "#username")
    @Override
    public Account findAccountByUsername(String username) {
        LambdaQueryWrapper<Account> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Account::getUserName, username);
        wrapper.last("limit 1");
        return baseMapper.selectOne(wrapper);
    }
}
