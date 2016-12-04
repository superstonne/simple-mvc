package org.mvc.framework.bean;

import sun.jvm.hotspot.oops.ObjectHeap;

import java.util.Map;

/**
 * Created by nick on 04/12/2016.
 */
public class View {

    private String path;

    private Map<String, Object> model;

    public View(String path, Map<String, Object> model) {
        this.path = path;
        this.model = model;
    }
    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
