# Spring Boot Application Google App Engine Standard with Java 11

This sample shows how to deploy a [Spring Boot](https://spring.io/projects/spring-boot)
application to Google App Engine stadndard.

## Setup

See [Prerequisites](../README.md#Prerequisites).

## Deploying

```bash
gcloud app deploy
```

To view your app, use command:
```
gcloud app browse
```
Or navigate to `https://scratchi9project.ew.r.appspot.com`.

## Local datastore
```
gcloud beta emulators datastore start
```

## Postman

Import JSON file as a project to Postman to test datastore endpoints.