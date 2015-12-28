The project consists of two dirs: application (laravel web app) + tests (cucumber vm java implementaion with selenium and serenity)

To run application, you need:
1. Install php http://php.net/downloads.php
	* Add php installation dir to your PATH system variable
2. Enable sqlite extention in php.ini (located in the root of your php installation dir) - uncomment 'extension=php_pdo_sqlite.dll'

To run tests, you need:
1. Latest JDK http://www.oracle.com/technetwork/java/javase/downloads/index.html
	* Create JAVA_HOME system var = <jdk install dir>
	* Add %JAVA_HOME%/bin to PATH

2. Maven https://maven.apache.org/
	* Create M2_HOME system var = <Maven install dir>
	* Add %M2_HOME%/bin to PATH

Tests contain run-it.bat to automate all the process. It:
	* Updates inner sqlite schema
	* Runs artisan as web server
	* Runs test
	* Kills artisan as php process (BE CAREFUL! If you run other php processes in parallel, they will be possibly killed)
	* Opens test reports

The other way is to run test step-by-step, manually:
	* Open application dir and run migrations: php artisan migrate
	* In the same dir, start artisan: php artisan serve (alternatively, you may use any other we server with php support)
	* Go to tests dir: cd ../tests
	* Run Cucumber tests: mvn clean integration-test. Maven will download several required dependencies on first run, its ok.
	* After it is over, you can go to target\site\serenity\ dir and open <long uid>.html file to view the report
	* Also, you can stop artisian now (just press Ctr+C in console, it does not starve for graceful stop)


Note: 
1) tests expect application to be found at localhost:8000. If you'd like to use another host alias or/and port, please change it in the testcase tests/src/test/resources/features.login/Login.feature
2) run-it.sh has not been done, unfortunately - has problems with VMs, and my machine currently is running Windows only
3) I had problems running firefox driver on my PC (it crashes due to Win10 weird video cards config), so I tested everything with crome driver, and than turned it back to firefox. 

