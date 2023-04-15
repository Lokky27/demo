package com.security.demo.service;

import com.security.demo.model.User;
import com.security.demo.service.security.model.PageResponse;

public interface UserService {

    PageResponse<User> getPage(int pageNumber, int pageSize);
}
