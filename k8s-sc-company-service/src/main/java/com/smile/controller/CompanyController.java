package com.smile.controller;

import com.google.gson.Gson;
import com.smile.api.CompanyApi;
import com.smile.api.UserApi;
import com.smile.model.qo.UserListQo;
import com.smile.model.vo.UserVo;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController implements CompanyApi {

    @Resource
    UserApi userApi;

    @Override
    public List list() {
        List<UserVo> userVos = userApi.list(null,null);
        userVos.stream().forEach(userVo -> System.out.println(new Gson().toJson(userVo)));
        userVos.remove(0);
        return userVos;
    }
}
