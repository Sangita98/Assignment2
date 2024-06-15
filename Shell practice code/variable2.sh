#!/bin/sh

name="sachin"
age=30

echo "name $name & age is $age"
unset age
echo "name is $name & age is $age"

country="india"
echo "$country"
readonly country

country="china"
