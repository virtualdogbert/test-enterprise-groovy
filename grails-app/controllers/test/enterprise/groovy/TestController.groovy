/**
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

 package test.enterprise.groovy

import grails.converters.JSON
//import groovy.transform.CompileDynamic
//
//@CompileDynamic
class TestController {

//    def var1
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
