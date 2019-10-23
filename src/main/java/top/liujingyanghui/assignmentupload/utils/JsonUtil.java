package top.liujingyanghui.assignmentupload.utils;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class JsonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 将 Java 对象转为 JSON 字符串
     */
    public static <T> String toJSON(T obj) {
        String jsonStr;
        try {
            jsonStr = objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            log.info("Java 转 JSON 出错！", obj.toString());
            throw new RuntimeException(e);
        }
        return jsonStr;
    }

    /**
     * 将 JSON 字符串转为 Java 对象
     */
    public static <T> T fromJSON(String json, Class<T> type) {
        T obj;
        try {
            obj = objectMapper.readValue(json, type);
        } catch (Exception e) {
            log.info("JSON 转 Java 出错！", json);
            throw new RuntimeException(e);
        }
        return obj;
    }

    /**
     * 将json转化成List
     */
    public static <T> List<T> toList(String json, Class<? extends List> collectionClass, Class<T> elementClass) {
        JavaType javaType = objectMapper.getTypeFactory().constructCollectionType(collectionClass, elementClass);
        try {
            return objectMapper.readValue(json, javaType);
        } catch (Exception e) {
            log.info("JSON 转 List 出错！", json);
            throw new RuntimeException(e);
        }
    }
}
