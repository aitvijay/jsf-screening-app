package com.ness.screening.entity;

// default package
// Generated Dec 22, 2015 3:05:04 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Candidate generated by hbm2java
 */
@Entity
@Table(name = "candidate", catalog = "Ness_Tech_Screen")
public class Candidate implements java.io.Serializable {

	private Integer candidateId;
	private String candidateFirstName;
	private String candidateLastName;
	private String candidateMiddleName;
	private String candidatePhoneNumber;
	private User candidateHandeledBy;
	private Vendor vendor;
	private String candidateEmail;
	private Set<CandidateScreenDetails> screenHistory= new HashSet<CandidateScreenDetails>(0);
	private Set<DocumentsDetails> documents= new HashSet<DocumentsDetails>(0);
	
	private User createdBy;
	private User updatedBy;
	private Date createdDt;
	private Date updatedDt;
	
	
	public Candidate() {
	}

	public Candidate(String candidateFirstName, String candidateLastName,
			String candidateMiddleName, String candidatePhoneNumber,
			 User candidateHandeledBy,
			Vendor vendor) {
		this.candidateFirstName = candidateFirstName;
		this.candidateLastName = candidateLastName;
		this.candidateMiddleName = candidateMiddleName;
		this.candidatePhoneNumber = candidatePhoneNumber;
		this.candidateHandeledBy = candidateHandeledBy;
		this.vendor = vendor;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Candidate_Id", unique = true, nullable = false)
	public Integer getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}

	@Column(name = "Candidate_First_Name", length = 100)
	public String getCandidateFirstName() {
		return this.candidateFirstName;
	}

	public void setCandidateFirstName(String candidateFirstName) {
		this.candidateFirstName = candidateFirstName;
	}

	@Column(name = "Candidate_Last_Name", length = 100)
	public String getCandidateLastName() {
		return this.candidateLastName;
	}

	public void setCandidateLastName(String candidateLastName) {
		this.candidateLastName = candidateLastName;
	}

	@Column(name = "Candidate_Middle_Name", length = 100)
	public String getCandidateMiddleName() {
		return this.candidateMiddleName;
	}

	public void setCandidateMiddleName(String candidateMiddleName) {
		this.candidateMiddleName = candidateMiddleName;
	}

	@Column(name = "Candidate_Phone_Number", length = 100)
	public String getCandidatePhoneNumber() {
		return this.candidatePhoneNumber;
	}

	public void setCandidatePhoneNumber(String candidatePhoneNumber) {
		this.candidatePhoneNumber = candidatePhoneNumber;
	}

	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="Candidate_handeled_By",insertable=true,
        updatable=true,nullable=true,unique=true)
	public User getCandidateHandeledBy() {
		return this.candidateHandeledBy;
	}

	public void setCandidateHandeledBy(User candidateHandeledBy) {
		this.candidateHandeledBy = candidateHandeledBy;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Candidate_Vendor_id")
	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	@Column(name = "Candidate_email", length = 100)
	public String getCandidateEmail() {
		return candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade={CascadeType.ALL},mappedBy = "candidate")
	public Set<CandidateScreenDetails> getScreenHistory() {
		return screenHistory;
	}

	public void setScreenHistory(Set<CandidateScreenDetails> screenHistory) {
		this.screenHistory = screenHistory;
	}

	@OneToMany(fetch = FetchType.LAZY,cascade={CascadeType.ALL} , mappedBy = "candidate")
	public Set<DocumentsDetails> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<DocumentsDetails> documents) {
		this.documents = documents;
	}

	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="created_By_id",insertable=true,
        updatable=true,nullable=true,unique=true)
	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="updated_by_Id",insertable=true,
        updatable=true,nullable=true,unique=true)
	public User getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_dt")
	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "updated_dt")
	public Date getUpdatedDt() {
		return updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	

}
