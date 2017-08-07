package com.xinyan.channel.rwdb;

/**
 * 数据源的设置类
 * user:zyd.
 * date:2017/8/1.
 * time:16:59.
 * version:1.0.0.
 */
public final class DynamicDataSourceHolder {

    private static final ThreadLocal<DynamicDataSourceGlobal> holder = new ThreadLocal<DynamicDataSourceGlobal>();

    private DynamicDataSourceHolder() {

    }

    public static void putDataSource(DynamicDataSourceGlobal dataSource) {
        holder.set(dataSource);
    }

    public static DynamicDataSourceGlobal getDataSource() {
        return holder.get();
    }

    public static void clearDataSource() {
        holder.remove();
    }

}