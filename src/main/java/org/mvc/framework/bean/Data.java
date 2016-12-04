package org.mvc.framework.bean;

import sun.jvm.hotspot.oops.ObjectHeap;

/**
 * Created by nick on 04/12/2016.
 */
public class Data {

    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}
