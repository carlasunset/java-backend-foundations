package Section16_Interfaces.default_methods.services;

// Concrete implementation of InterestService
// Provides the interest rate used by the default payment method
public class BrazilInterestService implements InterestService{

    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
