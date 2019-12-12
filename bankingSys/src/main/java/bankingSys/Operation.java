package bankingSys;

import java.util.Calendar;
import java.util.Date;

public class Operation {
	private Date operationTimestamp;
	private String operationType;
	private double operationAmount;
	private double postOperationBalance;
	
	public Operation(String type, double amount, double currentBalance) {
		operationTimestamp = Calendar.getInstance().getTime();
		operationType = type;
		operationAmount = amount;
		postOperationBalance = currentBalance + amount;
	}

	public Operation(Date time, String type, double amount, double currentBalance) {
		operationTimestamp = time;
		operationType = type;
		operationAmount = amount;
		postOperationBalance = currentBalance + amount;
	}

	public Date getDate() {
		// TODO Auto-generated method stub
		return operationTimestamp;
	}

	public String getOperation() {
		// TODO Auto-generated method stub
		return operationType;
	}

	public Double getAmount() {
		// TODO Auto-generated method stub
		return operationAmount;
	}

	public Double getBalance() {
		// TODO Auto-generated method stub
		return postOperationBalance;
	}
	
	
	
}
