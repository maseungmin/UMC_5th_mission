package UMC.springmission8.service.TempService;

import UMC.springmission8.apiPayload.code.exception.handler.TempHandler;
import UMC.springmission8.apiPayload.code.status.ErrorStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{
    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
}
