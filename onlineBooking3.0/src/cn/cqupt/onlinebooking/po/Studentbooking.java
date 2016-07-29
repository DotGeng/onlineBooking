package cn.cqupt.onlinebooking.po;

import java.util.Date;

public class Studentbooking {
    private Integer studentbookingid;

    private String studentno;

    private Integer batch;

    private Integer classroomid;

    private Integer seatid;

    private Date bookingtime;
    
    private Integer examID;
    
    public Integer getExamID() {
		return examID;
	}

	public void setExamID(Integer examID) {
		this.examID = examID;
	}

	public Integer getStudentbookingid() {
        return studentbookingid;
    }

    public void setStudentbookingid(Integer studentbookingid) {
        this.studentbookingid = studentbookingid;
    }

    public String getStudentno() {
        return studentno;
    }

    public void setStudentno(String studentno) {
        this.studentno = studentno == null ? null : studentno.trim();
    }

    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }

    public Date getBookingtime() {
        return bookingtime;
    }

    public void setBookingtime(Date bookingtime) {
        this.bookingtime = bookingtime;
    }
}