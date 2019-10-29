package top.liujingyanghui.assignmentupload.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.liujingyanghui.assignmentupload.dao.ProvinceMapper;
import top.liujingyanghui.assignmentupload.entity.Province;
import top.liujingyanghui.assignmentupload.service.ProvinceService;

@Service
public class ProvinceServiceImpl extends ServiceImpl<ProvinceMapper, Province> implements ProvinceService {
}
