package ru.job4j.bank;

import java.util.*;

//Банковские переводы.[#202885]
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (users.putIfAbsent(user, new ArrayList<>()) != null) {
            throw new UserExistException("Такой пользователь уже существует!");
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user == null) {
            throw new UserNotExistException("Пользователя не существует");
        } else {
            ArrayList<Account> temp = (ArrayList<Account>) users.get(findByPassport(passport));
            if (temp.indexOf(account) > -1) {
                throw new AccountExistException("Такой счет существует");
            } else {
                temp.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
//        for (User user : users.keySet()) {
//            if (user.getPassport().equals(passport)) ;
//            return user;
//        }
//        6. Тестовое задание из модуля коллекции Lite переделать на Stream API.[#202766]
        Optional<User> search = this.users.keySet().stream().filter(e -> e.getPassport().equals(passport)).findAny();
        if (!search.isPresent()) {
            throw new UserNotExistException("Пользователя не существует");
        }
        return search.get();
    }

    public Account findByRequisite(String passport, String requisite) {
        for (Account account : this.users.get(findByPassport(passport))) {
            if (account.getRequisite().equals(requisite)) {
                return account;
            }
        }
        throw new AccountNotExistException("У пользователя нет требуемого счета");
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account accountFrom = findByRequisite(srcPassport, srcRequisite);
        Account accountTo = findByRequisite(destPassport, dеstRequisite);
        if (accountFrom.getBalance() > 0 & accountFrom.getBalance() >= amount) {
            accountFrom.setBalance(accountFrom.getBalance() - amount);
            accountTo.setBalance(accountTo.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}