import uk.ac.shu.webarch.eregister.*;

class BootStrap {

    def init = { servletContext ->
	println("BootStrap::init");
	

	def chris_instructor = Instructor.findByStaffId('000001s') ?: new Instructor(staffId:'000001s' , name:'Chris Shelley').save();
	def ed_instructor = Instructor.findByStaffId('000002s') ?: new Instructor(staffId:'000002s' , name:'Ed Gunn').save();

def web_arch_course = Course.findByCourseCode('000002c') ?: 
new Course(courseCode:'000002c' , 
courseName:'Web Architectures',
description:'Headache for students').save();

def new_class = new RegClass(name:'WebArch-Mondays' ,
 classInstructor:chris_instructor, 
 course:web_arch_course).save()
}

    def destroy = {
    }
}
