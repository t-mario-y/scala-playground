# scala-playground

## develop with IntelliJ IDEA

Initialize this project with "Open or Import" as sbt project (not to start with "New Project")

## build with sbt

### build executable jar file

```shell script
sbt clean assembly

# both works fine.
scala target/scala-2.13/scala-playground-assembly-0.1.jar
java -jar target/scala-2.13/scala-playground-assembly-0.1.jar
```

### build docker image

```shell script
sbt docker
docker run --rm scala-playground:latest
```
