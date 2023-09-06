package ru.aston.gamezo_ag.task1.Exception;

public class PriceSettingException extends Exception{

    private String exceptionId;

    private String errorMessage;

    private int errorCode;


    public PriceSettingException(String exceptionId, String errorMessage, int errorCode){
        this.exceptionId = exceptionId;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public String getExceptionId() {
        return exceptionId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }


    public void setExceptionId(String exceptionId) {
        this.exceptionId = exceptionId;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "Exception Id" + exceptionId + "\nError Code " + errorCode + " \nMessage Exception " + getErrorMessage();
    }
}
