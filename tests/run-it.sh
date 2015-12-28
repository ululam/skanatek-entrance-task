#!/usr/bin/env bash
# todo Implement
cd ../application
php artisan serve &
cd ../tests
mvn integration-test
