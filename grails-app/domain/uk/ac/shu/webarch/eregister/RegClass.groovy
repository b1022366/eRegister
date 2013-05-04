 package uk.ac.shu.webarch.eregister
 

 class RegClass {
 
   String name
   Instructor classInstructor
   Course course
   Set enrolledStudents

 static hasMany = [
	enrolledStudents: Enrollment
 ]

 static mappedBy = [
	enrolledStudents: 'regclass'
 ]

  static constraints = {
  }

  static mapping = {
    classInstructor column:'instructor_fk'
    course column:'course_fk'
  }
 }
