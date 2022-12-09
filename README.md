# java-rest-junit demo project

It's the same test project as https://github.com/lvasileva/java-rest-cucumber, but this time without cucumber.

This project is configured to run only with GitHub Actions. The test run is scheduled to be started at 09:10 UTC on every Monday. The badge is presented the last state of the run. [![Java CI with Maven](https://github.com/lvasileva/java-rest-junit/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/lvasileva/java-rest-junit/actions/workflows/maven.yml)

Here is the project running API tests for the unsplash site at: https://unsplash.com/. The API documentation can be found here: https://unsplash.com/documentation. Unfortunately, for the demo-apps rate-limit is set to **50 requests per hour**. So please keep it in mind.

The project contains only one test Class for Collections API with the following taks:

Create new collection and verify it appears.
Update user's collection name and verify it changes.
Delete users's collection and verify it deletes.
