package com.appsdeveloperblog.app.ws.ui.model.response;

public enum ErrorMessages {
    MISSING_REQUIRED_FIELD("Missing required field."),
    RECORD_ALREADY_EXIStS("record already exsits"),
    INTERNAL_SERVER_ERROR("internal error"),
    NO_RECORD_FOUND("no record"),
    AUTHENTICATION_FAILED("authentication failed"),
    COULD_NOT_UPDATE_RECORD("could not update"),
    COUD_NOTZ_DELETE_RECORD("could not delete"),
    EMAIL_ADDRESS_NOT_VERIFIED("email address not verified");

    private String errorMessage;
    ErrorMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
