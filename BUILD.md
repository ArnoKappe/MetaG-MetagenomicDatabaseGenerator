# Build MetaG-MetagenomicDatabaseGenerator

## Requirements
- IDE [IntellJ IDEA](https://www.jetbrains.com/idea/)
- JDK 17 (e.g. [Eclipse Temurin](https://adoptium.net/))

## Build
1. Download a version:
    - Release: [`MetaG-MetagenomicDatabaseGenerator-2022.1.0.zip`](https://github.com/dluxe0/MetaG-MetagenomicDatabaseGenerator/archive/refs/tags/2022.1.0.zip)
    - Current: [`MetaG-MetagenomicDatabaseGenerator-main.zip`](https://github.com/dluxe0/MetaG-MetagenomicDatabaseGenerator/archive/refs/heads/main.zip)
2. Unzip the cloned code
3. Open in IntellJ
   > check Project SDK is set to 17+ (Project Structure -> Project -> SDK)
4. Set Gradle JVM to Project SDK (Gradle -> Gradle Settings -> Gradle JVM)
5. Gradle -> Tasks -> build -> build

## Run
Gradle -> Tasks -> application -> `run`

## Create executable file
Gradle -> Tasks -> distribution -> (choose)