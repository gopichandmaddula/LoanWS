/**
 * 
 */
/**
 * @author gopichand
 *
 */
package trng.imcs.soap;
import java.util.Date;

import trng.imcs.soap.temp.LoanRequest;
import trng.imcs.soap.temp.LoanResponse;

public class ServiceHelper {
	public static LoanResponse checkLoanEligibility(LoanRequest loanRequest) {
		LoanResponse response = new LoanResponse();
		
		Date dob = loanRequest.getDob().toGregorianCalendar().getTime();
		int yearDiff = getYearDiff(dob);
		
		if(yearDiff < 20) {
			response.setEligibilityCode("0");
			response.setEligibilityResponse("Not Eligible below age 20");
		} else if((yearDiff >=20 && yearDiff <25) && (loanRequest.getAnnualsalary() > 60000) && 
				(loanRequest.getAmount() < 20000)) {
			response.setEligibilityCode("1");
			response.setEligibilityResponse("Eligible");
		} else if((yearDiff >=25 && yearDiff <30) && (loanRequest.getAnnualsalary() > 80000) && 
				(loanRequest.getAmount() < 20000)) {
			response.setEligibilityCode("1");
			response.setEligibilityResponse("Eligible");
		} else if((yearDiff >=30 && yearDiff <50) && (loanRequest.getAnnualsalary() > 100000) && 
				(loanRequest.getAmount() < 50000)) {
			response.setEligibilityCode("1");
			response.setEligibilityResponse("Eligible");
		} else {
			response.setEligibilityCode("0");
			response.setEligibilityResponse("Not Eligible");
		}
		
		return response;
	}
	
	private static int getYearDiff(Date dob) {
		Date now = new Date();
		long diff = now.getTime() - dob.getTime();
		
		return (int)(diff/(1000l * 60 * 60 * 24 * 365));
	}
}
