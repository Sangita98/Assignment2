#!/bin/bash

read -p "enter the file : " filename

if [ -e $filename ]
then
  echo "files exixts"
else
 echo "file not exists"
fi

echo checking the read permission

if [ -r $filename ]
then
echo "file has read permission"
else 
echo "file does not have read permission"
fi
