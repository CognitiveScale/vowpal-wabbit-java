#!/usr/bin/env bash

set -e

source .env

curl -v --user "${CD_USER}:${CD_PASS}" --data-binary @junit-dep-4.10.pom -X PUT "https://cognitivescale.jfrog.io/artifactory/all-maven/junit/junit-dep/4.10/junit-dep-4.10.pom"
curl -v --user "${CD_USER}:${CD_PASS}" --data-binary @junit-dep-4.10.jar -X PUT "https://cognitivescale.jfrog.io/artifactory/all-maven/junit/junit-dep/4.10/junit-dep-4.10.jar"

mvn clean install
