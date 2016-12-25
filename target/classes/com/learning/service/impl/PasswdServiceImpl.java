package com.learning.service.impl;

import com.learning.domain.PasswdDomain;
import com.learning.persistence.PasswdDomainMapper;
import com.learning.service.IPasswdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by lw on 16-12-19.
 */
@Service
public class PasswdServiceImpl implements IPasswdService {
    @Autowired
    private PasswdDomainMapper passwdDomainMapper;

    public List<PasswdDomain> passwdList() {
        return passwdDomainMapper.selectAll();
    }
}
