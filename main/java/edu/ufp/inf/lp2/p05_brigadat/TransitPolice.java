package edu.ufp.inf.lp2.p05_brigadat;

import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Date;

import java.util.ArrayList;

public class TransitPolice {

    private ArrayList<PenaltyFee> fees = new ArrayList<>();

    public void addPenaltyFee(PenaltyFee penaltyFee){
        fees.add(penaltyFee);
    }

    public PenaltyFee removePenaltyFee(Date d, String local){
        PenaltyFee fee = new PenaltyFee();
        for(PenaltyFee pf : fees){
            if (pf.getDate().equals(d) && pf.getLocal().equals(local)){
                fee = pf;
                fees.remove(pf);
            }
        }
        return fee;
    }

    public ArrayList<PenaltyFee> lookupPenaltyFees(String motive){
        ArrayList<PenaltyFee> returnFee = new ArrayList<>();
        for (PenaltyFee pf : fees){
            if (pf.getMotive().equals(motive))
                returnFee.add(pf);
        }
        return returnFee;
    }

    public ArrayList<PenaltyFee> lookupPenaltyFees(Date startDate) {
        ArrayList<PenaltyFee> returnFee = new ArrayList<>();
        for (PenaltyFee pf : fees){
            if (pf.getDate().equals(startDate))
                returnFee.add(pf);
        }
        return returnFee;
    }

    public int countPenaltyFees(Driver c){
        int count = 0;
        for (PenaltyFee pf : fees){
            if (pf.getDriver().equals(c))
                count++;
        }
        return count;
    }

    public ArrayList<String> allPenaltyFeeMotiveByDriver(Driver d){
        ArrayList<String> returnAL = new ArrayList<>();
        for (PenaltyFee pf : fees){
            if (pf.getDriver().equals(d))
                returnAL.add(pf.getMotive());
        }
        return returnAL;
    }

    public void seizeLicense(Driver d){
        d.setLicenseApprehended(true);
    }

    public ArrayList<PenaltyFee> lookupPenaltyFeesDriver(Driver d, Date startDate, Date endDate){



        return null;


    }

}
