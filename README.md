# MetaG-MetagenomicDatabaseGenerator

**MetaG-MetagenomicDatabaseGenerator** generates artificial databases of digital metagenomic sequencing. These can be analyzed by [MetaG](https://github.com/dluxe0/MetaG) to test functionality.

## Get the app

Prebuilt archives with GUI (graphical user interface) are available:

### Windows

- Java included (recommended): [`MetaG-MetagenomicDatabaseGenerator-2022.1.0-win.zip`](https://github.com/dluxe0/MetaG-MetagenomicDatabaseGenerator/releases/download/2022.1.0/MetaG-MetagenomicDatabaseGenerator-2022.1.0-win.zip)
- Java not included: [`MetaG-MetagenomicDatabaseGenerator-2022.1.0-nojava-win.zip`](https://github.com/dluxe0/MetaG-MetagenomicDatabaseGenerator/releases/download/2022.1.0/MetaG-MetagenomicDatabaseGenerator-2022.1.0-nojava-win.zip)

### Linux

- Java included (recommended): [`MetaG-MetagenomicDatabaseGenerator-2022.1.0-linux.zip`](https://github.com/dluxe0/MetaG-MetagenomicDatabaseGenerator/releases/download/2022.1.0/MetaG-MetagenomicDatabaseGenerator-2022.1.0-linux.zip)
- Java not included: [`MetaG-MetagenomicDatabaseGenerator-2022.1.0-nojava-linux.zip`](https://github.com/dluxe0/MetaG-MetagenomicDatabaseGenerator/releases/download/2022.1.0/MetaG-MetagenomicDatabaseGenerator-2022.1.0-nojava-linux.zip)

### Alternatives

Alternatively you can [build](BUILD.md) the app with the source code.
- Release: [`MetaG-MetagenomicDatabaseGenerator-2022.1.0.zip`](https://github.com/dluxe0/MetaG-MetagenomicDatabaseGenerator/archive/refs/tags/2022.1.0.zip)
- Current: [`MetaG-MetagenomicDatabaseGenerator-main.zip`](https://github.com/dluxe0/MetaG-MetagenomicDatabaseGenerator/archive/refs/heads/main.zip)

## Run the app

> For the non-java version, make sure your JAVA_HOME variable is set to jdk 17+

> For self-built version see [`BUILD.md`](BUILD.md)

### Windows

1. Unzip into a folder of your choice
2. Run `bin/MetaG-MetagenomicDatabaseGenerator.bat`

### Linux

1. Unzip into a folder of your choice
2. Run `bin/MetaG-MetagenomicDatabaseGenerator`

## Settings

| Setting               | Specification                                               |
|-----------------------|-------------------------------------------------------------|
| Directory             | Target path for generation                                  |
| Quantity of Databases | How many data sets will be generated.                       |
| Quantity of Reads     | How many reads each database will contain.                  |
| Create Folder         | Whether or not to create a separate folder for the process. |

## Output

Output files are automatically time-stamped in their names and look like the following:

       ...
       0.8632454772612163
       0.4474359764929482
       0.5169626625910273
       0.9848607471139751
       0.2062112094646345
       ...
