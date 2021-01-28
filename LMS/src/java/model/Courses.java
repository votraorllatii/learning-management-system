/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author VotraOrllati
 */
@Entity
@Table(name = "Courses", catalog = "LMS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Courses.findAll", query = "SELECT c FROM Courses c")
    , @NamedQuery(name = "Courses.findByCourseId", query = "SELECT c FROM Courses c WHERE c.courseId = :courseId")
    , @NamedQuery(name = "Courses.findByCourseTitle", query = "SELECT c FROM Courses c WHERE c.courseTitle = :courseTitle")
    , @NamedQuery(name = "Courses.findByCourseDescription", query = "SELECT c FROM Courses c WHERE c.courseDescription = :courseDescription")
    , @NamedQuery(name = "Courses.findByCourseFee", query = "SELECT c FROM Courses c WHERE c.courseFee = :courseFee")
    , @NamedQuery(name = "Courses.findByCourseDurationDays", query = "SELECT c FROM Courses c WHERE c.courseDurationDays = :courseDurationDays")})
public class Courses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CourseId", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer courseId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CourseTitle", nullable = false, length = 100)
    private String courseTitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "CourseDescription", nullable = false, length = 250)
    private String courseDescription;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "CourseFee", nullable = false, precision = 19, scale = 4)
    private BigDecimal courseFee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CourseDurationDays", nullable = false)
    private int courseDurationDays;
    @JoinColumn(name = "CourseCategoryId", referencedColumnName = "CourseCategoryId", nullable = false)
    @ManyToOne(optional = false)
    private CourseCategories courseCategoryId;
    @JoinColumn(name = "LanguageId", referencedColumnName = "LanguageId", nullable = false)
    @ManyToOne(optional = false)
    private Languages languageId;

    public Courses() {
    }

    public Courses(Integer courseId) {
        this.courseId = courseId;
    }

    public Courses(Integer courseId, String courseTitle, String courseDescription, BigDecimal courseFee, int courseDurationDays) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.courseFee = courseFee;
        this.courseDurationDays = courseDurationDays;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public BigDecimal getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(BigDecimal courseFee) {
        this.courseFee = courseFee;
    }

    public int getCourseDurationDays() {
        return courseDurationDays;
    }

    public void setCourseDurationDays(int courseDurationDays) {
        this.courseDurationDays = courseDurationDays;
    }

    public CourseCategories getCourseCategoryId() {
        return courseCategoryId;
    }

    public void setCourseCategoryId(CourseCategories courseCategoryId) {
        this.courseCategoryId = courseCategoryId;
    }

    public Languages getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Languages languageId) {
        this.languageId = languageId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseId != null ? courseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Courses)) {
            return false;
        }
        Courses other = (Courses) object;
        if ((this.courseId == null && other.courseId != null) || (this.courseId != null && !this.courseId.equals(other.courseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Courses[ courseId=" + courseId + " ]";
    }
    
}
