#!/bin/bash

countlines()
{
filename=$1

if [ -e $filename ]
then
	echo "file is present"
	lines=$(wc -l < "$filename")
	echo "number of lines present in the file $lines"
else
	echo "no file present"
fi
}
countlines "assignment1_exists.sh"
