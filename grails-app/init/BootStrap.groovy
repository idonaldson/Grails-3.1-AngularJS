import myapp.User

class BootStrap {

    def init = { servletContext ->
        def user = new User(passowrd: "test",lastName: "Parikh",dob: new Date(),firstName: "Sapan")
        user.save(failOnError:true)

    }
    def destroy = {
    }
}
