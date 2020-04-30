package demo

class DemoController {

    def index() {
        def d = new SomeValidateable(name: 'jeff')
        if(d.validate()) {
            render 'Success'
        } else {
            println d.errors
            render 'Error'
        }

    }
}
