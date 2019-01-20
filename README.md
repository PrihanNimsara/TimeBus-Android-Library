# TimeBus-Android-Library      ![alt tag](https://bintray.com/prihannimsara/TimeBusRepo/timebus/1.1.0/link)

This is an android library. Using this library you can convert String to Date and vise versa. It's may be reduce a code complexity of your android project.


![alt tag](https://user-images.githubusercontent.com/29063580/51429858-4651f280-1c39-11e9-97dc-84d1d94c82bc.png)

For the android project just include the following dependency inside you build.gradle's depedency list.

## Gradle

```java
repositories{
   jcenter()
 }
```

```java
 dependencies {
   ...
   compile 'com.developer.prihann:time_bus:1.1.0'
 }
```

#### if you using maven use following Maven

```java
<dependency>
  <groupId>com.developer.prihann</groupId>
  <artifactId>time_bus</artifactId>
  <version>1.1.0</version>
  <type>pom</type>
</dependency>
```

After setup installing lib to your project you just need only to call it using just few lines of code. It will return you a string with the results.

## Usage

#### To use Kokis Android Libarary

Add this code segment inside  your Application class or Activity class

```java
TimeBus.setContext(this);
or
TimeBus.setContext(context);
or
TimeBus.setContext(getApplicationContext());
```

#### These are the list of time formats which you need to use (otherwise you can use your own formats)

```java
"yyyy-MM-dd";//2009-12-31
"dd-MM-YYYY";//31-12-2009
"yyyy-MM-dd HH:mm:ss";//2009-12-31 23:59:59
"HH:mm:ss.SSS";//23:59.59.999
"yyyy-MM-dd HH:mm:ss.SSS";//2009-12-31 23:59:59.999
"yyyy-MM-dd HH:mm:ss.SSS Z";//2009-12-31 23:59:59.999 +0100
"MM/dd/yyyy";//01/02/2018
"dd-M-yyyy hh:mm:ss";//02-1-2018 06:07:59
"dd MMMM yyyy";//02 January 2018
"dd MMMM yyyy zzzz";//02 January 2018 India Standard Time
"E, dd MMM yyyy HH:mm:ss z";//Tue, 02 Jan 2018 18:07:59 IST
"a";//AM or PM
```

#### Convert String to Date

```java
Date date = new Date();
String stringDate = TimeBus.convertDateToString(date,"yyyy-MM-dd HH:mm:ss");
```

#### Convert Date to String

```java
String stringDate = "2009-12-31 23:59:59";
Date date = TimeBus.convertStringToDate(stringDate,"yyyy-MM-dd HH:mm:ss");
```

## Limitations

- Currently min SDK is set to 17

## Changelog

- 1.1.0
    - Stable the release with sample code
    
## Author

Prihan Nimsara,

Checkout my other contributions, https://github.com/PrihanNimsara?tab=repositories

## License

Copyright 2019 Prihan Nimsara

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

