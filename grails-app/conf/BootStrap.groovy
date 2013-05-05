import uk.ac.shu.webarch.eregister.*;

class BootStrap {

    def init = { servletContext ->
	println("BootStrap::init");
	def chris_instructor = Instructor.findByStaffId('000001a');

	if(chris_instructor == null){
	println("Instructor not found, create...");
	chris_instructor = new Instructor()
	chris_instructor.staffId = '000001a';
	chris_instructor.name = 'Chris Shelley';
	chris_instructor.save();
}
	else{
	println("Result of find by staffId for chris: ${chris_instructor}");
    }
}
    def destroy = {
    }
}
