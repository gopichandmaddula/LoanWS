package trng.imcs.soap;
import org.springframework.stereotype.Component;
import trng.imcs.soap.temp.LoanEligibilityService;
import trng.imcs.soap.temp.LoanRequest;
import trng.imcs.soap.temp.LoanResponse;

import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

@WebService(endpointInterface="trng.imcs.soap.temp.LoanEligibilityService")
@MTOM(enabled=true)
@Component("loanWs")
public class ServiceImpl implements LoanEligibilityService 
{
	public LoanResponse testEligibility(LoanRequest inputParams) {
		return ServiceHelper.checkLoanEligibility(inputParams);

	}}
