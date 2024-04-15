package Dgroup.kanri.model;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "TEST")
public class Test {
    @Id
    @Column(name = "STUDEMT_NO", nullable = false, length = 10)
    private String student_no;
    
    @Column(name = "SUBJECT_CD", nullable = false, length = 3)
    private String subject_cd;
    
    @Column(name = "SCHOOL_CD", nullable = false, length = 10)
    private String school_cd;
    
    @Column(name = "NO", nullable = false, length = 10)
    private String no;
    
    @Column(name = "POINT", length = 10)
    private String point;
    
    @Column(name = "CLASS_NUM", length = 5)
    private String class_num;
    
    public String getStudent_no() {
        return student_no;
    }
 
    public void setStudent_no(String student_no) {
        this.student_no = student_no;
    }
    
    public String getSubject_cd() {
        return subject_cd;
    }
 
    public void setSubject_cd(String subject_cd) {
        this.subject_cd = subject_cd;
    }
    
    public String getSchool_cd() {
        return school_cd;
    }
 
    public void setSchool_cd(String school_cd) {
        this.school_cd = school_cd;
    }
    
    public String getNo() {
        return no;
    }
 
    public void setNo(String no) {
        this.no = no;
    }
    
    public String getPoint() {
        return point;
    }
 
    public void setPoint(String point) {
        this.point = point;
    }
    
    public String getClass_num() {
        return class_num;
    }
 
    public void setClass_num(String class_num) {
        this.class_num = class_num;
    }
}