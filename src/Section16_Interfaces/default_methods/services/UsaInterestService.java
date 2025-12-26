package Section16_Interfaces.default_methods.services;

// Concrete implementation of InterestService
// Provides the interest rate used by the default payment method
public class UsaInterestService implements InterestService{

    private Double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
