#Invoke-WebRequest `
#    -OutFile openapi-generator-cli.jar `
#    https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/6.6.0/openapi-generator-cli-6.6.0.jar

java -jar openapi-generator-cli.jar generate `
    -i "https://stoplight.io/api/v1/projects/spacetraders/spacetraders/nodes/reference/SpaceTraders.json" `
    -o ".." `
    -g scala-sttp `
    --additional-properties=jsonLibrary=circe `
    --additional-properties=sourceFolder=sdk\src\main\scala\ `
    --additional-properties=mainPackage=spacetraders `
    --additional-properties=apiPackage=spacetraders.api `
    --additional-properties=modelPackage=spacetraders.model 
