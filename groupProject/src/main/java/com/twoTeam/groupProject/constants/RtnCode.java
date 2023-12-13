package com.twoTeam.groupProject.constants;

public enum RtnCode {

    // 列舉 200 400 401 403 404
    // 找的到200 找不到404 剩下400
    // 401 403 跟權限有關
    SUCCESSFUL(200, "Successful"), // 成功
    NAMEPARAM_ERROR(400, "Name_Param_error"), // 參數錯誤
    PHONENUMPARAM_ERROR(400, "phone_Param_error"), // 參數錯誤
    ID_ERROR(400,"Id_error"),//id錯誤
    ID_NOTFOUNT(404,"ID_Notfount"),//找不到ID
    NAME_NOTFOUNT(404,"ID_Notfount"),//找不到ID
    UPDATE_ERROR(400,"Update_error"),
    STOREINFOPARM_ERROR(400,"StoreInfo_List_error"),
    STORENAMEPARM_ERROR(400,"StoreInfo_Name_List_error"),
    STOREADRESSPARM_ERROR(400,"StoreInfo_Adress_List_error"),
    LOCATION_CITY_ERROR(400, "Location_City_Param_error"),
    DELETE_ERROR(400, "Delete_error"),
    STOREINFO_NULL_ERROR(400, "StoreInfo_Param_error"),
    STORE_ALREADY_EXISTS(400,"The store already exists"),//參數已經存在

//	ACCOUNT_EXISTED(400,"Account_existed"),//帳號已存在
//	ACCOUNT_NOTFOUNT(404,"Account_Notfount"),//找不到帳號
//	BALANCE_IS_INSUFFICIENT(400,"Balance is insufficient"),//餘額不足
    ;

    private int code;

    private String message;

    // source -->
    private RtnCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    // 只有用到getter
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
