conventions = [
        disableDynamicCompile       : true,
        dynamicCompileWhiteList     : [
                //'Test',
                //'TestController2',
                'UrlMappings',
                'Application',
                'Script1',
                'BootStrap',
                'resources',
                'org.grails.cli'
        ],

        compileStaticExtensions     : [
                'org.grails.compiler.ValidateableTypeCheckingExtension',
                'org.grails.compiler.NamedQueryTypeCheckingExtension',
                'org.grails.compiler.HttpServletRequestTypeCheckingExtension',
                'org.grails.compiler.WhereQueryTypeCheckingExtension',
                'org.grails.compiler.DynamicFinderTypeCheckingExtension',
                'org.grails.compiler.DomainMappingTypeCheckingExtension',
                'org.grails.compiler.RelationshipManagementMethodTypeCheckingExtension'
        ],

        limitCompileStaticExtensions: false,
        defAllowed                  : false,
        skipDefaultPackage          : true,
]
