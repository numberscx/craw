package com.example.common.messages;


import org.springframework.beans.factory.annotation.Autowired;

public class ShareMess {
    private String share_code;
    private String start_time;
    private String end_time;
    private Boolean update_only;

    public String getShare_code() {
        return share_code;
    }

    public void setShare_code(String share_code) {
        this.share_code = share_code;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public Boolean getUpdate_only() {
        return update_only;
    }

    public void setUpdate_only(Boolean update_only) {
        this.update_only = update_only;
    }
}
