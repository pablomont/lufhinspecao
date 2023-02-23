# Lufhinspecao
API responsável por gerenciar avaliações de usabilidade a partir do método por inspeção a padrões.


# OpenAPI generated API stub

Spring Framework stub


## Overview
This code was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://openapis.org), you can easily generate an API stub.
This is an example of building API stub interfaces in Java using the Spring framework.


## Pugin para gerar o código fonte a partir do arquivo de especificação openapi.

Para que o código fonte seja refletido a cada nova alteração do arquivo [lufh-avalia-open-api.yaml](src/main/resources/lufh-avalia-open-api.yaml), deve-se sempre adicionar a seguinte configuração no [pom.xml](pom.xml) e depois executar o mvn clean install:
```xml
<build>
    <sourceDirectory>src/main/java</sourceDirectory>
    <plugins>
        <plugin>
            <groupId>org.openapitools</groupId>
            <artifactId>openapi-generator-maven-plugin</artifactId>
            <version>5.3.1</version>
            <executions>
                <execution>
                    <goals>
                        <goal>generate</goal>
                    </goals>
                    <configuration>
                        <inputSpec>
                            ${project.basedir}/src/main/resources/lufh-avalia-open-api.yaml
                        </inputSpec>
                        <output>${project.basedir}</output>
                        <generatorName>spring</generatorName>
                        <apiPackage>com.uepb.lufh.avalia.entrypoint.contract.api</apiPackage>
                        <modelPackage>com.uepb.lufh.avalia.entrypoint.contract.model</modelPackage>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```
