#!/bin/bash

display()
{
directory=$1
 if [  -d $path  ]
then
	echo "correct path $directory"
	for file in "$directory/*""
	do
	  if [ -e $file ]
		then
		 echo "$file" 
	fi
	done
	else
	 echo "directory found"
fi
