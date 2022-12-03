package LKTFastFoods.DAO;

import LKTFastFoods.Models.Account;

public interface iRegisterDAO {
 void insert(Account account);
 boolean checkExistEmail(String email);
 boolean checkExistUsername(String username);
 boolean checkExistPhone(String Phone);
}
