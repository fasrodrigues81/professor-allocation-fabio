package com.project.professor.allocation.entity;

import java.time.DayOfWeek;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Allocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private DayOfWeek day;

	@Temporal(TemporalType.TIME)
	@Column(nullable = false)
	private Date start;

	@Temporal(TemporalType.TIME)
	@Column(nullable = false)
	private Date end;

	@Column(name = "course_id", nullable = false)
	private Long courseId;

	@ManyToOne(optional = false)
	@JoinColumn(name = "course_id", updatable = false, insertable = false, nullable = false)
	private Course course;

	@Column(name = "professor_id", nullable = false)
	private Long professorId;

	@ManyToOne(optional = false)
	@JoinColumn(name = "professor_id", updatable = false, insertable = false, nullable = false)
	private Professor prof;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Long getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Long professorId) {
		this.professorId = professorId;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	@Override
	public String toString() {
		return "Allocation [id=" + id + ", day=" + day + ", start=" + start + ", end=" + end + ", courseId=" + courseId
				+ ", course=" + course + ", professorId=" + professorId + ", prof=" + prof + ", getId()=" + getId()
				+ ", getDay()=" + getDay() + ", getStart()=" + getStart() + ", getEnd()=" + getEnd()
				+ ", getCourseId()=" + getCourseId() + ", getCourse()=" + getCourse() + ", getProfessorId()="
				+ getProfessorId() + ", getProf()=" + getProf() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
