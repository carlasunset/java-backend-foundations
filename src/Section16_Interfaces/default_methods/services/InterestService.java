package Section16_Interfaces.default_methods.services;

import java.security.InvalidParameterException;

// Default methods allow interfaces to have method implementations
// without forcing all implementing classes to override them
public interface InterestService {

    // Each implementation defines its own interest rate logic
    double getInterestRate();

    // payment() is a default method
    // It uses getInterestRate(), which must be implemented by each service
    default double payment(double amount, int months){
        if(months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0 , months);
    }
}
