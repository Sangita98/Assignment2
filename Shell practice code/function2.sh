#!/bin/bash


sum()
{
 
a=$1
b=$2
result=$(($a+$b))
eacho "Result : $result
}

sum 2 3

read -p "enter 1st parameter " arg1
read -p "enter 2nd parameter " arg2

sum $agr1 $arg2

#function with return type
sub()
{
  a=$1
  b=$2
	result=$(($a-$b))
	return $result
}
 sub 10 4
