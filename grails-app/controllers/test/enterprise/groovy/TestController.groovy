package test.enterprise.groovy

import grails.converters.JSON
//@CompileDynamic
class TestController {

    //def var1
    //private var2


//    def index(def test, String test2) {
//        Object test3 = 'something'
//
//        render test3.startsWith("so")
//    }

//    @CompileStatic(extensions=['org.grails.compiler.ValidateableTypeCheckingExtension',
//                               'org.grails.compiler.NamedQueryTypeCheckingExtension',
//                               'org.grails.compiler.HttpServletRequestTypeCheckingExtension',
//                               'org.grails.compiler.WhereQueryTypeCheckingExtension',
//                               'org.grails.compiler.DynamicFinderTypeCheckingExtension',
//                               'org.grails.compiler.DomainMappingTypeCheckingExtension',
//                               'org.grails.compiler.RelationshipManagementMethodTypeCheckingExtension'])
    Object index(){
        new Sprocket(name:'test').save(flush: true,failOnError: true)
        render 'saved'
    }

    Object list(){
        List<Sprocket> sprocketList = Sprocket.where {name == 'test'}.list()
        render sprocketList as JSON
    }
}
