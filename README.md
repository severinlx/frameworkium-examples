# Frameworkium Examples [![Build Status][status-svg]][status]

This is a *sample project* which utilises [frameworkium-core][frameworkium-core], 
a framework for writing maintainable Selenium and REST API tests that also makes 
integrating with other test things (e.g. JIRA) much easier.

Please see the [Frameworkium usage guide][guidance] for more details.

As a result:
* Please [raise issues][core-issues] against the [frameworkium-core][frameworkium-core] project, not this one
* See the [frameworkium-core releases page][core-releases] for information about changes and new features
* This example project is not updated as regularly as the [core project][frameworkium-core]
* To keep up to date with the latest releases of core, modify the following block in the `pom.xml`:
```xml
<dependencies>
  <dependency>
    <groupId>com.github.frameworkium</groupId>
    <artifactId>frameworkium-core</artifactId>
    <!-- Update this with the latest from the frameworkium-core releases page -->
    <version>3.0.0</version>
  </dependency>
</dependencies>
```

The Frameworkium project is based on Ardesco's [Selenium-Maven-Template][ardesco] and 
Joe VDW's [Bootstrapium][bootstrapium]. We have extended it with some handy extras
for getting started quickly with Selenium, Appium and [Rest Assured][rest-assured].

## Getting Started

After setting up [apache maven][mvn], open the `frameworkium-examples` directory in a 
terminal/command prompt and run `mvn clean verify` to run the example tests using Firefox.

You will need the [geckodriver][geckodriver] on your path if you are using 
Firefox version 48 or above.

### Browsers

You can provide the `-Dbrowser` argument to chose a browser to run the tests in.

#### Drivers

Each browser requires a "driver".

For chrome, [ChromeDriver][chromedriver] needs to be on your path or specified
as an argument:
```
mvn clean verify -Dbrowser=chrome -Dwebdriver.chrome.driver=c:\path\to\chromedriver.exe
```
mvn clean verify -Dbrowser=chrome -Dwebdriver.chrome.driver=C:\Users\aseverin\IdeaProjects\frameworkium-examples\src\test\resources\geckodriver.exe


For Firefox 48 and above, [geckodriver][geckodriver] needs to be on your path or specified
as an argument:
```
mvn clean verify -Dbrowser=firefox -Dwebdriver.gecko.driver=c:\path\to\geckodriver.exe
```

### Selenium Grid

Want to run tests using a grid and in parallel?
```
mvn clean verify -Dbrowser=chrome -DgridURL=http://localhost:4444/wd/hub -Dthreads=4
```

All you need to do is ensure the browser is installed in the default location
and that the driver is on the path.

### Sauce Labs

Running mobile web tests using Appium on Sauce Labs is only slightly more involved:

```bash
export SAUCE_USERNAME=username
export SAUCE_ACCESS_KEY=access_key
mvn clean verify -Dplatform=ios -Dbrowser=safari -Dsauce=true 
```

### BrowserStack

Running mobile web tests using Appium on BrowserStack:

```bash
export BROWSER_STACK_USERNAME=username
export BROWSER_STACK_ACCESS_KEY=access_key
mvn clean verify -Dplatform=ios -Dbrowser=safari -DbrowserStack=true 
```

A full list of arguments can be found on the [guidance page][guidance].

### Reporting

After running your tests, you can generate an [Allure][allure] test report by 
simply running:

```
mvn allure:report 
```

## Further Information

Frameworkium sets you up for other stuff too - check out the
[guidance page][guidance] for further info.

[status-svg]: https://travis-ci.org/Frameworkium/frameworkium-examples.svg?branch=master
[status]: https://travis-ci.org/Frameworkium/frameworkium-examples
[ardesco]: https://github.com/Ardesco/Selenium-Maven-Template
[bootstrapium]: https://github.com/jvanderwee/bootstrapium
[rest-assured]: http://rest-assured.io/
[frameworkium-core]: https://github.com/Frameworkium/frameworkium-core
[core-issues]: https://github.com/Frameworkium/frameworkium-core/issues
[core-releases]: https://github.com/Frameworkium/frameworkium-core/releases
[mvn]: https://maven.apache.org/download.cgi
[geckodriver]: https://github.com/mozilla/geckodriver/releases
[chromedriver]: https://sites.google.com/a/chromium.org/chromedriver/home
[guidance]: https://frameworkium.github.io
[allure]: https://docs.qameta.io/allure/
