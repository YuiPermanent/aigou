package cn.itsource.aigou.util;


public class AjaxResult {

    private boolean success;

    private String message;

    private Object returnData;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getReturnData() {
        return returnData;
    }

    public AjaxResult setReturnData(Object returnData) {
        this.returnData = returnData;
        return this;
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }

}
