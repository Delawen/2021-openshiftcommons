# sightings-kafka-consumer
To deploy in Openshift cluster : 
`mvn clean package -Dquarkus.container-image.push=true -Dquarkus.kubernetes.deploy=true`

For native deployment :
`mvn clean package -Dnative -Dquarkus.container-image.push=true -Dquarkus.kubernetes.deploy=true`

Once the app is deployed in Openshift, you must set the environment value `KAFKA_BOOSTRAP_BROKERS_URL`


