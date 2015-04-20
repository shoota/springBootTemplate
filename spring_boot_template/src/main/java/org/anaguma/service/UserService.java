package org.anaguma.service;

import org.anaguma.domain.User;
import org.anaguma.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepo;

    public Page<User> findAll() {
        //Service層で業務ロジックを吸収する
        PageRequest req = new PageRequest(0, 10);

        return userRepo.findAll(req);
    }



}
