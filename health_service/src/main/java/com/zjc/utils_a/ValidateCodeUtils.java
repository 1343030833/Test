

import java.util.Random;

/**
 * 随机生成验证码工具类
 */
public class ValidateCodeUtils {
    /**
     * 随机生成验证码
     * @param length 长度为4位或者6位
     * @return
     */
    public static Integer generateValidateCode(int length){
        int a =4;
        int aa =1000;
        int aaa =100000;


        Integer code =null;
        if(length == a){
            code = new Random().nextInt(9999);//生成随机数，最大为9999
            if(code < aa){
                code = code + 1000;//保证随机数为4位数字
            }
        }else if(length == aaa){
            code = new Random().nextInt(999999);//生成随机数，最大为999999
            if(code < aaa){
                code = code + 100000;//保证随机数为6位数字
            }
        }else{
            throw new RuntimeException("只能生成4位或6位数字验证码");
        }
        return code;
    }

    /**
     * 随机生成指定长度字符串验证码
     * @param length 长度
     * @return
     */
    public static String generateValidateCode4String(int length){
        Random rdm = new Random();
        String hash1 = Integer.toHexString(rdm.nextInt());
        String capstr = hash1.substring(0, length);
        return capstr;
    }
}
