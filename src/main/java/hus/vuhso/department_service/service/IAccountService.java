package hus.vuhso.department_service.service;

import hus.vuhso.department_service.entity.Account;
import hus.vuhso.department_service.form.AccountFilterForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IAccountService {

    public Page<Account> getAllAccounts(Pageable pageable, String search, AccountFilterForm filterForm);

}
