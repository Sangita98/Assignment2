#!/bin/bash

sum()
{
	echo "onside the sum function"
	return 10
}

sum

result=$?
echo "result is $result"

echo "---function Argument---"
greet1()
{
a=$1
echo "value of a $a"

c=$@
echo "value of  c $c"
}

greet1 1
greet1 1 2
greet1 1 2 3
