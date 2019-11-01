package top.liujingyanghui.assignmentupload.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.liujingyanghui.assignmentupload.entity.City;
import top.liujingyanghui.assignmentupload.service.CityService;
import top.liujingyanghui.assignmentupload.vo.Result;

/**
 * 城市
 */
@RestController
@RequestMapping("api/city")
public class CityController {

    @Autowired
    private CityService cityService;

    /**
     * 根据省份获取城市列表
     *
     * @return
     */
    @GetMapping("list")
    public Result list(@RequestParam Integer provinceId) {
        if (-1 == provinceId) {
            return Result.success(cityService.list());
        } else {
            return Result.success(cityService.list(Wrappers.<City>lambdaQuery().eq(City::getProvinceId, provinceId)));
        }
    }
}
