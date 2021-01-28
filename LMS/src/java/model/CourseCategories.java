/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "CourseCategories", catalog = "LMS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CourseCategories.findAll", query = "SELECT c FROM CourseCategories c")
    , @NamedQuery(name = "CourseCategories.findByCourseCategoryId", query = "SELECT c FROM CourseCategories c WHERE c.courseCategoryId = :courseCategoryId")
    , @NamedQuery(name = "CourseCategories.findByCourseCategoryName", query = "SELECT c FROM CourseCategories c WHERE c.courseCategoryName = :courseCategoryName")
    , @NamedQuery(name = "CourseCategories.findByCourseCategoryDiscription", query = "SELECT c FROM CourseCategories c WHERE c.courseCategoryDiscription = :courseCategoryDiscription")})
public class CourseCategories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CourseCategoryId", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer courseCategoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CourseCategoryName", nullable = false, length = 50)
    private String courseCategoryName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "CourseCategoryDiscription", nullable = false, length = 250)
    private String courseCategoryDiscription;

    public CourseCategories() {
    }

    public CourseCategories(Integer courseCategoryId) {
        this.courseCategoryId = courseCategoryId;
    }

    public CourseCategories(Integer courseCategoryId, String courseCategoryName, String courseCategoryDiscription) {
        this.courseCategoryId = courseCategoryId;
        this.courseCategoryName = courseCategoryName;
        this.courseCategoryDiscription = courseCategoryDiscription;
    }

    public Integer getCourseCategoryId() {
        return courseCategoryId;
    }

    public void setCourseCategoryId(Integer courseCategoryId) {
        this.courseCategoryId = courseCategoryId;
    }

    public String getCourseCategoryName() {
        return courseCategoryName;
    }

    public void setCourseCategoryName(String courseCategoryName) {
        this.courseCategoryName = courseCategoryName;
    }

    public String getCourseCategoryDiscription() {
        return courseCategoryDiscription;
    }

    public void setCourseCategoryDiscription(String courseCategoryDiscription) {
        this.courseCategoryDiscription = courseCategoryDiscription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseCategoryId != null ? courseCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CourseCategories)) {
            return false;
        }
        CourseCategories other = (CourseCategories) object;
        if ((this.courseCategoryId == null && other.courseCategoryId != null) || (this.courseCategoryId != null && !this.courseCategoryId.equals(other.courseCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CourseCategories[ courseCategoryId=" + courseCategoryId + " ]";
    }
    
}
