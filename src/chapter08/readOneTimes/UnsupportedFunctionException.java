package chapter08.readOneTimes;

public class UnsupportedFunctionException extends RuntimeException {
    final private int ERR_CODE = 100; // 에러코드

    public UnsupportedFunctionException(String message) {
        super(message);
    }

    // 에러코드를 반환한다.
    public int getErrorCode() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "[" + ERR_CODE + "] 지원하지 않는 기능입니다.";
    }
}
