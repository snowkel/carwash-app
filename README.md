# Carwash Application

An unfinished carwash application that will be
finished in the future at some point.

Only two endpoints exist so far. One for creating
the bay in the carwash and one for using a bay, if
avaiable, in the carwash.

## Getting Started

Not much to it. Clone the repo into your preferred directory.

### Prerequisites

- Java SDK, Maven, and that's it really.

### Installing

Once the project is cloned, run maven package from
the command line from the root folder. Or use some
type of GUI for Maven if you prefer.

```
mvn package
```

## Running the application

Run the jar file in the target folder

```
java -jar targer/build-image.jar
```

### Using the application

The two endpoints are fairly straightforward.

```
localhost:8085/api/addBay
```

GET request with not parametrs.
This adds a bay to the carwash. That's it. It will return
the ID of the bay created which is going in positive order 
starting from 1.

```
localhost:8085/api/useBay
```

POST request with one parameter called "action"
that takes three types, "WAX", "WASH", or "AIR".
Each of those three take different times to occupy
a bay. That endpoint will return the first available
bay it finds.


## Deployment

Once you have the image built from Maven, you could containerize this application and run it however you want. I personally used docker and kubernetes to run it in a cluster on the Google Cloud platform. They have nifty guides to build and deploy the image [here](https://cloud.google.com/cloud-build/docs/quickstart-docker) and [here](https://cloud.google.com/kubernetes-engine/docs/tutorials/hello-app) rescepectively.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [JAVA 8](https://www.oracle.com/technetwork/java/javase/downloads/index.html) - Java runtime environment and compiler.

## Contributing

Really just me.

## Versioning

No versioning in place currently.

## Authors

* Myself 👌

## License

\[none\]

## Acknowledgments

* \[none\]
