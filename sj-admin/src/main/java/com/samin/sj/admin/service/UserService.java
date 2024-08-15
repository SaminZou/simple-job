package com.samin.sj.admin.service;

import com.samin.sj.admin.bean.UserVo;
import com.samin.sj.admin.entity.User;
import com.samin.sj.admin.exception.BusException;
import com.samin.sj.admin.exception.ExceptionEnums;
import com.samin.sj.admin.repository.UserRepository;
import com.samin.sj.sdk.bean.PageReq;
import com.samin.sj.sdk.bean.PageResp;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public PageResp<UserVo> page(PageReq<Void> req) {
        Sort sort = Sort.by(Sort.Direction.DESC, "createTime");
        Pageable pageable = PageRequest.of(req.getPage(), req.getSize(), sort);
        PageResp<User> users = PageResp.success(userRepository.findAll(pageable));

        return users.map(UserVo::getInstance);
    }

    public void disable(Integer id) {
        Optional<User> userOptional = getUser(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setIsEnable(0);
            user.setUpdateTime(LocalDateTime.now());
            userRepository.save(user);
        } else {
            ExceptionEnums.throwException(ExceptionEnums.USER_NOT_EXIST_ERROR);
        }
    }

    private Optional<User> getUser(Integer id) throws BusException {
        return userRepository.findById(id);
    }
}