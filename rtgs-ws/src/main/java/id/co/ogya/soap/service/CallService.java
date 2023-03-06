package id.co.ogya.soap.service;

import javax.jws.WebService;

import id.co.ogya.ebanking.ejb.EbankingService;
import id.co.ogya.ebanking.ejb.util.ServiceFactory;
import id.co.ogya.soap.TransferRequest;
import id.co.ogya.soap.TransferResponse;
import id.co.ogya.soap.TransferService;

@WebService(endpointInterface = "id.co.ogya.soap.TransferService")
public class CallService implements TransferService {
	public TransferResponse transferDana(TransferRequest transferRequest) {
		TransferResponse response = new TransferResponse();
		id.co.ogya.ebanking.ejb.request.TransferRequest data = new id.co.ogya.ebanking.ejb.request.TransferRequest();
		id.co.ogya.ebanking.ejb.response.TransferResponse dataResponse = new id.co.ogya.ebanking.ejb.response.TransferResponse();
		String simpleDataSourceAccessJNDIName = "EbankingServiceImpl#id.co.ogya.ebanking.ejb.EbankingService";
		if(transferRequest.getBankCode() != 1L) {
			try {
				ServiceFactory serviceFactory = new ServiceFactory();
				EbankingService ebankingService = (EbankingService) serviceFactory
						.getService(simpleDataSourceAccessJNDIName);
				data.setAccountFrom(100L);
				data.setAccountTo(transferRequest.getAccountNo());
				data.setAmount(transferRequest.getAmount());
				data.setNotes(transferRequest.getNotes());
				data.setBranchCode(transferRequest.getBankCode());
				dataResponse = ebankingService.transferRtgs(data);
				response.setErrorCode(dataResponse.getErrorCode());
				response.setErrorMessage(dataResponse.getErrorMessage());
				response.setReferenceNumber(dataResponse.getReferenceNumber());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			response.setErrorCode("OGYA-999");
			response.setErrorMessage("nomor bank tidak terdaftar");
		}
		
		return response;
	}
}
