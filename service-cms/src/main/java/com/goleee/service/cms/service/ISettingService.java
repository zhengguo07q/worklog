package com.goleee.service.cms.service;

import com.goleee.service.cms.entity.param.SettingQueryParam;
import com.goleee.service.cms.entity.po.Setting;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Set;


public interface ISettingService extends IService<Setting> {

    /**
     * 获取设置
     *
     * @param id
     * @return
     */
    Setting get(String id);

    /**
     * 新增设置
     *
     * @param setting
     * @return
     */
    boolean add(Setting setting);

    /**
     * 更新设置
     *
     * @param setting
     * @return
     */
    boolean update(Setting setting);

    /**
     * 根据ID删除设置
     *
     * @param id
     * @return
     */
    boolean delete(String id);

    /**
     * 查询设置
     *
     * @param settingQueryParam
     * @return
     */
    List<Setting> query(SettingQueryParam settingQueryParam);
}
