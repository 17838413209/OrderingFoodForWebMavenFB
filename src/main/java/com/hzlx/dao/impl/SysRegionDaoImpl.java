package com.hzlx.dao.impl;

import com.hzlx.dao.BaseDao;
import com.hzlx.dao.SysRegionDao;
import com.hzlx.entity.SysRegion;

import java.util.List;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/4/11 10:44
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
public class SysRegionDaoImpl extends BaseDao<SysRegion> implements SysRegionDao {
    @Override
    public List<SysRegion> getAddressByParentId(String parentId) {
        String sql = "SELECT * FROM sys_region WHERE parent_id=?";
        return executeQuery(sql, SysRegion.class, parentId);
    }
}
