package com.yzx.delegate.items;

import com.yzx.delegate.holder.ViewHolder;

/**
 * Author: yangzhenxiang
 * Time: 2018/5/15
 * Description: 固定布局，需要数据源的，比如永远只有一个头部banner 而且需要 数据源给 Viewpager设置数据
 * E-mail: yzxandroid981@163.com
 */

public abstract class FixItemT<T> extends DelegateItem {

    private T t;

    public FixItemT(int layoutResId) {
        super(layoutResId);
    }

    public FixItemT(int layoutResId, int count) {
        super(layoutResId, count);
    }

    public void setData(T t) {
        this.t = t;
    }

    public T getData() {
        return t;
    }

    @Override
    public void convert(ViewHolder holder, int position, int positionAtTotal) {
        convert(holder, position, positionAtTotal, t);
    }

    protected abstract void convert(ViewHolder holder, int position, int positionAtTotal, T t);
}
