package hu.holnor.accounts.service;

import hu.holnor.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     *
     * @param customerDto - Customer Object
     */


    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return Account Details based on a given mobileNumber
     */
    CustomerDto fetchAccountDetails(String mobileNumber);
}
