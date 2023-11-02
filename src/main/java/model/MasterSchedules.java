package model;

import java.util.Calendar;

public class MasterSchedules {

    long master_id;
    Calendar data;
    String status;




    public long getMaster_id() {
        return master_id;
    }

    public void setMaster_id(long master_id) {
        this.master_id = master_id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
