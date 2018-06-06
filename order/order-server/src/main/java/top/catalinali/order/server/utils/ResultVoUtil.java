package top.catalinali.order.server.utils;

import top.catalinali.order.server.vo.ResultVo;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 15:29 2018/6/4
 * @Modefied by:
 */
public class ResultVoUtil {
    public static ResultVo success(Object object) {
        ResultVo resultVO = new ResultVo();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
