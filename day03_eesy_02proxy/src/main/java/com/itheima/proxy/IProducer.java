package com.itheima.proxy;

/**
 * 对生产厂家要求的接口
 * @author Rosalyn
 * @create 2020-03-13 19:12
 */
public interface IProducer {
    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money);

    /**
     * 售后
     * @param money
     */
    public void afterService(float money);
}
