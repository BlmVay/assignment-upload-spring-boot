package top.liujingyanghui.assignmentupload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.liujingyanghui.assignmentupload.service.ProvinceService;
import top.liujingyanghui.assignmentupload.vo.Result;

/**
 * 省份
 */
@RestController
@RequestMapping("api/province")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    /**
     * 获取省份列表
     * @return
     */
    @GetMapping("list")
    public Result list() {
        return Result.success(provinceService.list());
    }
}
