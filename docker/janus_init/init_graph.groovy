:remote connect tinkerpop.server conf/remote.yaml session
:remote console

try {
    println("------------- creating template -------------")
    map = new HashMap<String, Object>()
    map.put('storage.backend','cql')
    map.put('storage.hostname','janusgraph_cassandra')
    map.put('graph.set-vertex-id',true)
    map.put('schema.default','none')
    map.put('schema.default', 'none')
    ConfiguredGraphFactory.createTemplateConfiguration(conf)
} catch(Exception e){
    println("Exception: ${e}")
    println("------------- updating -------------")
    map = new HashMap<String, Object>()
    map.put('storage.backend','cql')
    map.put('storage.hostname','janusgraph_cassandra')
    map.put('graph.set-vertex-id',true)
    map.put('schema.default', 'none')
    conf = new MapConfiguration(map)
    ConfiguredGraphFactory.updateTemplateConfiguration(conf)
    println("------------- current template configuration -------------")
    ConfiguredGraphFactory.getTemplateConfiguration().each{k, v -> println "${k}:${v}"}
    println("------------- current template configuration -------------")
}

try{
    ConfiguredGraphFactory.create("cnxinit")
} catch(Exception e){
    println("------------- cnxinit creation -------------")
    println("${e}")
    println("------------- cnxinit creation -------------")
}

:remote console