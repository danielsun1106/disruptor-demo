package com.disruptor.order.base.event;

import com.lmax.disruptor.EventFactory;

/**
 * @author alex.chen
 * @version 1.0.0
 * @date 2017/6/29
 */
public class OrderEventFactory implements EventFactory<OrderEvent> {
    @Override
    public OrderEvent newInstance() {
        return new OrderEvent();
    }
}
