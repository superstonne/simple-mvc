package org.mvc.framework.bean;

import org.mvc.framework.util.CastUtil;

import java.util.Map;

/**
 * Created by nick on 04/12/2016.
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    public Map<String, Object> getParamMap() {
        return paramMap;
    }
}
