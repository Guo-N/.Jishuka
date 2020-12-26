package life.daguobiji.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"你找的问题不存在或者已经被删除，换个试试?"),
    TARGET_PARAM_NOT_FOUND(2002,"尚未选择任何问题及评论进行回复！"),
    NO_LOGIN(2003,"当前操作需要登录，请登陆后重试！"),
    SYS_ERROR(2004,"服务器崩了，稍后再回来试试吧......"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在！"),
    COMMENT_NOT_FOUND(2006,"评论不存在或已被删除！"),
    CONTENT_IS_EMPTY(2007,"输入的内容不能为空......"),
    READ_NOTIFICATION_FAIL(2008,"非法操作......"),
    NOTIFICATION_NOT_FOUND(2009,"消息已不存在......"),
    ;


    @Override
    public String getMessage() {
        return message;
    }


    @Override
    public Integer getCode() {
        return code;
    }

    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.code=code;
        this.message=message;
    }





}
