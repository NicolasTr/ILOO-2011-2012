#!/bin/bash

group_type=$1
group=$2
old_hash=`git rev-parse HEAD`

if [ $# -ne 2 ]
then
    echo "Usage : " 
    echo "   ./push_jar.sh Game groupxx"
    echo "   ./push_jar.sh GUI  groupxx"
fi

git reset
ant jar
rm -f lib/$group_type/$group.jar
cp "build/jar/Projet ILOO 2011-2012.jar" lib/$group_type/$group.jar
git add lib/$group_type/$group.jar
git commit -m $group

new_hash=`git rev-parse HEAD`
if [ "$old_hash" != "$new_hash" ]
then
    git push iloo `git rev-parse HEAD`:master
fi
