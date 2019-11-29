package ai.guiji.seata.order.service;

import ai.guiji.seata.order.entity.Order;

import java.math.BigDecimal;

/**
 * @author IT云清
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    void create(Order order);

    /**
     * 修改订单状态
     * @param userId
     * @param money
     * @param status
     */
    void update(Long userId, BigDecimal money, Integer status);
}
