package com.multiclientwebsite.merchantandproduct.service;

import com.multiclientwebsite.merchantandproduct.entity.Merchant;
import com.multiclientwebsite.merchantandproduct.entity.MerchantDTO;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchMerchantExistsException;

import java.util.List;


public interface MerchantService {
    Merchant addMerchant(MerchantDTO merchantDTO);

    Merchant getMerchant(Long merchantId) throws NoSuchMerchantExistsException;

    String updateMerchant(Long merchantId, MerchantDTO merchantDTO) throws NoSuchMerchantExistsException;

    String deleteMerchant(Long merchantId) throws NoSuchMerchantExistsException;

    List<Merchant> getAllMerchants();
}
