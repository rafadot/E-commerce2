package com.ecomerce.Ecomerce.V1.service.interfaces;

import com.ecomerce.Ecomerce.V1.dto.account.AccountRequest;
import com.ecomerce.Ecomerce.V1.dto.account.AccountResponse;
import com.ecomerce.Ecomerce.V1.dto.address.AddressRequest;
import com.ecomerce.Ecomerce.V1.model.Account;
import com.ecomerce.Ecomerce.V1.model.Address;
import com.ecomerce.Ecomerce.V1.model.enums.RoleType;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface AccountService {
    AccountResponse create(AccountRequest request);
    Map<String,String> addRole(RoleType type, String nameIfBrand);
    Map<String,String> removeRole(RoleType type) throws IOException;
    Account accountContext();
    Account accountByEmail(String email);
    String accountDelete();
    Address createAddress(AddressRequest addressRequest);
    String removeAddress(UUID addressID);
    List<Address> getAddresses();
}
