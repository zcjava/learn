package com.learning.persistence;

import com.learning.domain.FriendDomain;

public interface FriendDomainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FriendDomain record);

    int insertSelective(FriendDomain record);

    FriendDomain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FriendDomain record);

    int updateByPrimaryKey(FriendDomain record);
}