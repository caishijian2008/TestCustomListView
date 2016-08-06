package com.csj.testcustomlistview;

/**
 * Created by caishijian on 16-8-5.
 */
public interface OnRefreshListener {
    /**
     * 下拉刷新
     */
    void onDownPullRefresh();

    /**
     * 上拉加载更多
     */
    void onLoadingMore();

}
