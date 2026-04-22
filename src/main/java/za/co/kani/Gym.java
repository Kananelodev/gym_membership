package za.co.kani;

public class Gym {
    private String memberName;
    private String planType;
    private int monthlyFee;

    public Gym(String member) {
        this.memberName = member;
        this.planType = "Basic";
        this.monthlyFee = 200;
    }

    public Gym(String member, String plan) {
        this.memberName = member;
        this.planType = plan;
        
        if (plan.equalsIgnoreCase("Gold")) {
            this.monthlyFee = 500;
        } else {
            this.monthlyFee = 200;
        }
    }

    public void upgradeToGold() {
        planType = "Gold";
        monthlyFee = 500;
    }

    public String getSummary() {
        return "Member: " + memberName
                + " Plan: " + planType
                + " Fee: " + monthlyFee;
    }
}
