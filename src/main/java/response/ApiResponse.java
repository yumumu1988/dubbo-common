package response;

import enums.ApiResponseEnum;

import java.io.Serializable;

public class ApiResponse<T> implements Serializable {
    private static final long serialVersionUID = 1662564644489751089L;

    private ApiResponseEnum status;
    private String message;
    private T body;

    public ApiResponse(T body) {
        this.body = body;
    }

    public ApiResponseEnum getStatus() {
        return status;
    }

    public void setStatus(ApiResponseEnum status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
