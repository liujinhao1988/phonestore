package com.liujinhao1988.phone_store_demo.service;


import com.liujinhao1988.phone_store_demo.dto.OrderDTO;
import com.liujinhao1988.phone_store_demo.vo.OrderDetailVO;

public interface OrderService {
    public OrderDTO create(OrderDTO orderDTO);
    public OrderDetailVO findOrderDetailByOrderId(String orderId);
    public String pay(String orderId);
}
