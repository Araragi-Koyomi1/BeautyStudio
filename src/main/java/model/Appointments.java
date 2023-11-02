package model;

import java.util.Calendar;

public class Appointments {

    long users_id;
    long masters_id;
    long service_id;
    long schedule_id;
    Calendar data;
    String status;




    public long getUsers_id() {
        return users_id;
    }

    public void setUsers_id(long users_id) {
        this.users_id = users_id;
    }

    public long getMasters_id() {
        return masters_id;
    }

    public void setMasters_id(long masters_id) {
        this.masters_id = masters_id;
    }

    public long getService_id() {
        return service_id;
    }

    public void setService_id(long service_id) {
        this.service_id = service_id;
    }

    public long getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(long schedule_id) {
        this.schedule_id = schedule_id;
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
