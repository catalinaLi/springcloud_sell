package top.catalinali.product.server.utils;

import top.catalinali.product.server.vo.ResultVo;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 17:19 2018/6/1
 * @Modefied by:
 */
public class ResultVoUtil {

    public static ResultVo success(Object object) {
        ResultVo resultVO = new ResultVo();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
