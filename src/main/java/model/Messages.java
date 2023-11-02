package model;

import java.util.Calendar;

public class Messages {

    long from_whom_user_id;
    long whom_user_id;
    long message;
    Calendar data_tame;



    public long getFrom_whom_user_id() {
        return from_whom_user_id;
    }

    public void setFrom_whom_user_id(long from_whom_user_id) {
        this.from_whom_user_id = from_whom_user_id;
    }

    public long getWhom_user_id() {
        return whom_user_id;
    }

    public void setWhom_user_id(long whom_user_id) {
        this.whom_user_id = whom_user_id;
    }

    public long getMessage() {
        return message;
    }

    public void setMessage(long message) {
        this.message = message;
    }

    public Calendar getData_tame() {
        return data_tame;
    }

    public void setData_tame(Calendar data_tame) {
        this.data_tame = data_tame;
    }
}
