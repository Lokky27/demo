package com.security.demo.service.impl;

import com.security.demo.model.User;
import com.security.demo.repository.UserRepository;
import com.security.demo.service.UserService;
import com.security.demo.service.security.model.PageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public PageResponse<User> getPage(int pageNumber, int pageSize) {
        return new PageResponse<>(userRepository.findSpecified(PageRequest.of(pageNumber, pageSize)));
    }
}
