package dmo;

public class Student {
    private String studentId;

    private String studentName;

    private String idCard;

    private String year;

    private String classId;

    private String telephoneNumber;

    private String studentOriginBase;

    private String gender;

    private String picPath;

    private Boolean leaveOfAbsence;

    private Boolean leaveSchool;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber == null ? null : telephoneNumber.trim();
    }

    public String getStudentOriginBase() {
        return studentOriginBase;
    }

    public void setStudentOriginBase(String studentOriginBase) {
        this.studentOriginBase = studentOriginBase == null ? null : studentOriginBase.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    public Boolean getLeaveOfAbsence() {
        return leaveOfAbsence;
    }

    public void setLeaveOfAbsence(Boolean leaveOfAbsence) {
        this.leaveOfAbsence = leaveOfAbsence;
    }

    public Boolean getLeaveSchool() {
        return leaveSchool;
    }

    public void setLeaveSchool(Boolean leaveSchool) {
        this.leaveSchool = leaveSchool;
    }
}