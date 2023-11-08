package UMC.springmission8.apiPayload.code.exception.handler;
import UMC.springmission8.apiPayload.code.BaseErrorCode;
import UMC.springmission8.apiPayload.code.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
