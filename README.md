# Build
```
./gradlew build
```

# Run Daemon
```
ln -s JAR_FULL_PATH /etc/init/java_ibeta
/etc/init/java_ibeta start
```

# Print Daemon Status
```
/etc/init/java_ibeta status
```

# API

### /articles
return article list

Request
```
curl http://api.ibeta.me/articles
```

Response
```
[{"id":4,"url":"url4","author":"author4","title":"title4","summary":"summary4"},{"id":0,"url":null,"author":null,"title":null,"summary":null},{"id":0,"url":null,"author":null,"title":null,"summary":null},{"id":0,"url":null,"author":null,"title":null,"summary":null}]
```
