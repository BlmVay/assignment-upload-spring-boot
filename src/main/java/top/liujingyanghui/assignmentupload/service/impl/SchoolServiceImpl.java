package top.liujingyanghui.assignmentupload.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.liujingyanghui.assignmentupload.dao.SchoolMapper;
import top.liujingyanghui.assignmentupload.entity.School;
import top.liujingyanghui.assignmentupload.service.SchoolService;

@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements SchoolService {
}
