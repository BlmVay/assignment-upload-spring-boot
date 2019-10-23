package top.liujingyanghui.assignmentupload.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtil {
    // 秘钥
    private static final String secret = "sds15644er1rr2gcge3r4ytxgwetwets";
    // 过期时间
    private static final int timeout = 86400000;//一天86400000  一周604800000

    /**
     * 根据token验证获取用户信息
     */
    public static Claims getClaim(String token) {
        try {
            Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
            return claims;
        } catch (Exception e) {
            return null;
        }
    }

//    /**
//     * 设置用户信息进jwt
//     */
//    public static String setClaim(String subject){
//        String token = Jwts
//                .builder()
//                .setSubject(subject)
//                .setIssuedAt(new Date())
//                .signWith(SignatureAlgorithm.HS256, secret)
//                .compact();
//        return token;
//    }

    /**
     * 创建token
     *
     * @return token
     */
    public static String setClaim(Map<String, Object> claim, String subject) {
        return Jwts.builder().setClaims(claim).setSubject(subject) // 设置token主题
                .setIssuedAt(new Date()) // 设置token发布时间
                .setExpiration(new Date(System.currentTimeMillis() + timeout)) // 设置token过期时间
                .signWith(SignatureAlgorithm.HS256, secret).compact();
    }

    /**
     * 解密token
     *
     */
    public static Claims getClaimsFromToken(String token) throws Exception {
        Claims claims = Jwts.parser() // 得到DefaultJwtParser
                .setSigningKey(secret) // 设置签名的秘钥
                .parseClaimsJws(token).getBody(); // 设置需要解析的jwt
        return claims;
    }
}
