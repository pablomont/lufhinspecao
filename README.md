# Lufhinspecao
API responsável por gerenciar avaliações de usabilidade a partir do método por inspeção a padrões.

## Pugin para gerar o código fonte a partir do arquivo de especificação openapi.

Para que o código fonte seja refletido a cada nova alteração do arquivo [lufh-avalia-open-api.yaml](src/main/resources/lufh-avalia-open-api.yml), deve-se sempre adicionar a seguinte configuração no [pom.xml](pom.xml) e depois executar o mvn clean install:
```xml
 <plugin>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-generator-maven-plugin</artifactId>
    <version>6.4.0</version>
    <executions>
        <execution>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <inputSpec>
                    ${project.basedir}/src/main/resources/lufh-avalia-open-api.yml
                </inputSpec>
                <output>${project.basedir}</output>
                <generatorName>spring</generatorName>
                <apiPackage>com.uepb.lufh.avalia.entrypoint.contract.api</apiPackage>
                <modelPackage>com.uepb.lufh.avalia.entrypoint.contract.model</modelPackage>
                <configOptions>
                    <interfaceOnly>true</interfaceOnly>
                    <basePackage>com.uepb.lufh.avalia</basePackage>
                    <requestMappingMode>api_interface</requestMappingMode>
                    <useTags>true</useTags>
                    <unhandledException>true</unhandledException>
                    <dateLibrary>java8-localdatetime</dateLibrary>
                </configOptions>
            </configuration>
        </execution>
    </executions>
</plugin>
```

## URL para acessar o swagger
http://localhost:8080/swagger-ui/index.html#/
