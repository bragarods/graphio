## 1. Best Pratice

```groovy
graph = ConfiguredGraphFactory.open (graph_name)
graph.tx(). rollback()
```

## 2. Open Management Instance

```groovy
mgmt = graph. openManagement()
```

## 3. Creating vertex w/ properties

```groovy
pessoa = mgmt.makeVertexLabel('pessoa').make()
cpf_cnpj = mgmt.makePropertyKey('cpf_cnpj').dataType(Long.class).cardinality(Cardinality.SINGLE).make()
tipo_pessoa = mgmt.makePropertyKey('tipo_pessoa').dataType(String, class).cardinality(Cardinality.SINGLE).make()
nome = mgmt.makePropertyKey('nome').dataType(String.class).cardinality(Cardinality.SINGLE).make()

mgmt.addProperties(pessoa, cpf_cnpj, tipo_pessoa, nome)
```

## 4. Creating edges w/ properties

```groovy
transacao = mgmt.makeEdgeLabel ('transacao').multiplicity(MULTI).make()
valor = mgmt.makePropertyKey('valor').dataType(Float.class).cardinality(Cardinality.LIST).make()
modalidade = mgmt.makePropertyKey('modalidade').dataType(String.class).cardinality(Cardinality.SET).make()

mgmt.addProperties(transacao, valor, modalidade)
```