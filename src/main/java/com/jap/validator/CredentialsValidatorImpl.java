package com.jap.validator;

public class CredentialsValidatorImpl {
    public String validateUser(String name, String password){
        CredentialsValidator c1 = (o1, o2) -> {
            if (o1.equals("admin") && o2.equals("1234")) {
                return "valid user";
            }else {
                return "invalid user";
            }
        };

        return c1.validator(name,password);
    }



}
