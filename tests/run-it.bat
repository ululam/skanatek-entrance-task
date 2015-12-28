cd ../application
php artisan migrate
start php artisan serve
cd ../tests
mvn clean integration-test && taskkill /IM php* /F && for %%f in (target\site\serenity\*.html) do start target\site\serenity\%%~nxf
