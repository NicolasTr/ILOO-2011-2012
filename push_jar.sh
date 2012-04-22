#!/bin/bash

if [ $# -ne 2 ]
then
    echo "Usage : " 
    echo "   ./push_jar.sh Game groupxx"
    echo "   ./push_jar.sh GUI  groupxx"
    exit
fi

group_type=$1
group=$2

# Copie le dépôt distant
tempdir=`mktemp -d`
git clone git@github.com:NicolasTr/ILOO-2011-2012.git $tempdir

# Ajoute le .jar
ant jar
cp "build/jar/Projet ILOO 2011-2012.jar" $tempdir/lib/$group_type/$group.jar

# Effectue le commit
cd $tempdir
git add .
git commit -m $group
git push

rm -rf $tempdir
