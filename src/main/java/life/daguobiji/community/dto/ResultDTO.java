package life.daguobiji.community.dto;

import life.daguobiji.community.exception.CustomizeErrorCode;
import life.daguobiji.community.exception.CustomizeException;

public class ResultDTO<T>{

    private Integer code;
    private String message;
    private T data;

    public static ResultDTO errorOf(Integer code, String message){
        ResultDTO resuluDTO=new ResultDTO();
        resuluDTO.setCode(code);
        resuluDTO.setMessage(message);
        return resuluDTO;
    }

    public static ResultDTO errorOf(CustomizeErrorCode errorCode){
        return errorOf(errorCode.getCode(),errorCode.getMessage());
    }
    public static ResultDTO errorOf(CustomizeException e){
        return errorOf(e.getCode(),e.getMessage());
    }


    public static ResultDTO okOf(){
        ResultDTO resultDto=new ResultDTO();
        resultDto.setCode(200);
        resultDto.setMessage("请求成功！");
        return resultDto;
    }
    public static <T> ResultDTO okOf(T t){
        ResultDTO resultDto=new ResultDTO();
        resultDto.setCode(200);
        resultDto.setMessage("请求成功！");
        resultDto.setData(t);
        return resultDto;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
