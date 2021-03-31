package com.exception.example.main.controller;

import com.exception.example.main.error.ErrorCode;
import com.exception.example.main.error.NotFoundException;
import com.exception.example.main.utils.ApiUtils;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static com.exception.example.main.utils.ApiUtils.success;

@RestController
public class testController {

    @GetMapping("/")
    public ApiUtils.ApiResult<?> root(){
        System.out.println("여기요");
        List<String> ret = new ArrayList<>();
        ret.add("sdf");
        ret.add("sdf");
        ret.add("sdf");
        ret.add("sdf");
        ret.add("sdf");
        return success(ret);
    }

    @GetMapping("/test")
    public ApiUtils.ApiResult<?> index(){
        System.out.println("여기요");
        JSONObject obj = new JSONObject();
        return success(obj);
    }

    @GetMapping("/exception")
    public ResponseEntity<?> exception(){
        throw new NotFoundException(ErrorCode.AUTHENTICATION_FAILED);
    }
}
