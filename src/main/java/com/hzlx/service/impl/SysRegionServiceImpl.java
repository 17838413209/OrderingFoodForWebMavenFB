package com.hzlx.service.impl;

import com.google.gson.Gson;
import com.hzlx.dao.SysRegionDao;
import com.hzlx.dao.impl.SysRegionDaoImpl;
import com.hzlx.entity.RespBean;
import com.hzlx.entity.SysRegion;
import com.hzlx.service.SysRegionService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Description:三级联动 serviceImpl
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/4/11 10:46
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
public class SysRegionServiceImpl implements SysRegionService {
    //在service层 引入 数据访问层（DAO）
    private SysRegionDao sysRegionDao = new SysRegionDaoImpl();

    /**
     * 业务层 查询地理位
     *
     * @param req
     * @return
     */
    @Override
    public String queryAddress(HttpServletRequest req) {
        RespBean resp;//数据组装成RespBean
        //获取请求参数
        String parentId = req.getParameter("parentId");
        //根据parentId查询对应的地理位置集合
        List<SysRegion> addressList = sysRegionDao.getAddressByParentId(parentId);
        if (addressList != null && addressList.size() > 0) {
            //查到数据了，设置响应码为200，message为success data为 addressList
            resp=RespBean.success(addressList);
        }else {
            //查不到数据 设置响应码为 10086 message为 查询失败
            resp=RespBean.error(10086,"查询失败");
        }
        //将组装好的 RespBean对象转成JSON字符串
        return new Gson().toJson(resp);
    }
}
