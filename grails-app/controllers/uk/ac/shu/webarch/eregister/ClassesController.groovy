package uk.ac.shu.webarch.eregister

import grails.converters.*

class ClassesController {

  def index() {

    println(request)

    def result=[:]

    result.classList = []

	RegClass.findAll().each { cls ->
	result.classList.add([instructorName:cls.classInstructor.name, courseName:cls.course.courseName, className:cls.name])
}

    withFormat {
      html result
      xml { render result as XML }
      json { render result as JSON }
    }
  }
}
