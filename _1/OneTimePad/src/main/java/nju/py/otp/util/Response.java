package nju.py.otp.util;

/**
 * Web Response
 * @param <T>
 */
public class Response<T> {

    private boolean success = false;

    private T data;

    private String message;

    public Response() {
    }

    public Response(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public Response(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
