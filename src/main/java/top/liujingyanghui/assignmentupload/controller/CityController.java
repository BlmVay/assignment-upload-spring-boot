package top.liujingyanghui.assignmentupload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.liujingyanghui.assignmentupload.dao.CityMapper;


@RestController
@RequestMapping("api/city")
public class CityController {

    @Autowired
    private CityMapper cityMapper;


}
