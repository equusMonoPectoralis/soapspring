package com.in28minutes.springboot.soap.web.services.example.student;

import java.time.Instant;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import uk.org.siri.wsdl.Answer;
import uk.org.siri.wsdl.CheckStatus;
import uk.org.siri.wsdl.CheckStatusAnswerInfo;
import uk.org.siri.wsdl.CheckStatusResponse;

@Endpoint
public class CheckStatusEndpoint {

	@PayloadRoot(namespace = "http://wsdl.siri.org.uk", localPart = "CheckStatus")
	@ResponsePayload
	@SOAPBinding(style = Style.RPC)
	public CheckStatusResponse processCourseDetailsRequest(@RequestPayload CheckStatus request) {
		CheckStatusResponse response = new CheckStatusResponse();
		System.out.println("resp "+String.valueOf(request.getRequest().getRequestorRef()));
		CheckStatusAnswerInfo studentDetails = new CheckStatusAnswerInfo();
		studentDetails.setResponseTimestamp(Instant.now().toString());
		studentDetails.setProducerRef("MOI");
		studentDetails.setResponseMessageIdentifier("MOI:Message::120250:LOC");
		studentDetails.setRequestMessageRef(request.getRequest().getMessageIdentifier());
		response.setCheckStatusAnswerInfo(studentDetails);
		Answer answer = new Answer();
		answer.setServiceStartedTime(Instant.now().minusSeconds(3600).toString());
		answer.setStatus("true");
		response.setAnswer(answer);
		return response;
	}

}