package com.liujinhao1988.phone_store_demo.service.impl;

import com.liujinhao1988.phone_store_demo.entity.BuyerAddress;
import com.liujinhao1988.phone_store_demo.form.AddressForm;
import com.liujinhao1988.phone_store_demo.repository.BuyerAddressRepository;
import com.liujinhao1988.phone_store_demo.service.AddressService;
import com.liujinhao1988.phone_store_demo.vo.AddressVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private BuyerAddressRepository buyerAddressRepository;

    @Override
    public List<AddressVO> findAll() {
        List<AddressVO> list= new ArrayList<>();
        List<BuyerAddress> buyerAddressList = buyerAddressRepository.findAll();
        for (BuyerAddress buyerAddress : buyerAddressList) {
            AddressVO addressVO = new AddressVO();
            addressVO.setId(buyerAddress.getAddressId());
            addressVO.setAreaCode(buyerAddress.getAreaCode());
            addressVO.setName(buyerAddress.getBuyerName());
            addressVO.setTel(buyerAddress.getBuyerPhone());
            addressVO.setAddress(buyerAddress.getBuyerAddress());
            list.add(addressVO);
        }


//        List<AddressVO> list = buyerAddressRepository.findAll().stream()
//                .map(e -> new AddressVO(e.getAddressId(), e.getAreaCode(), e.getBuyerName(), e.getBuyerPhone(), e.getBuyerAddress())).collect(Collectors.toList());

        return list;
    }

    @Override
    public void saveOrUpdate(AddressForm addressForm) {
        BuyerAddress buyerAddress;
        if(addressForm.getId() == null){
            buyerAddress = new BuyerAddress();
        } else {
            buyerAddress = buyerAddressRepository.findById(addressForm.getId()).get();

        }
        buyerAddress.setBuyerName(addressForm.getName());
        buyerAddress.setBuyerPhone(addressForm.getTel());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(addressForm.getProvince())
                .append(addressForm.getCity())
                .append(addressForm.getCounty())
                .append(addressForm.getAddressDetail());
        buyerAddress.setBuyerAddress(stringBuffer.toString());
        buyerAddress.setAreaCode(addressForm.getAreaCode());

        buyerAddressRepository.save(buyerAddress);
    }
}
