package org.indiastack.depa.provider.gateway.services;

import org.indiastack.depa.provider.gateway.models.account.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public Account getAccount(String Id) {
        return new Account();
    }

    public Account createAccount(Account accountRequest) {
        return new Account();
    }
}
