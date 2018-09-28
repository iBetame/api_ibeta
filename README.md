# Build
```
./gradlew build
```

# Run Daemon

####First Time

```
cp JAR_FULL_PATH /data/apps/api_ibeta/
ln -s JAR_FULL_PATH /etc/init.d/api_ibeta 
/etc/init.d/api_ibeta start
```

#### Other Time

```
cp JAR_FULL_PATH /data/apps/api_ibeta/
/etc/init.d/api_ibeta start
```

#### Other Command

```
/etc/init.d/api_ibeta start/restart/stop
```

# Print Daemon Status

```
/etc/init.d/api_ibeta status
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

### /pt

return pricetag list

Request

```
curl http://api.ibeta.me/pt
```

Response

```
[{"app_id":"1273635203","artwork":"https://is2-ssl.mzstatic.com/image/thumb/Purple118/v4/8f/6d/dc/8f6ddc12-99d4-5312-0fd8-418b9adbe4c1/source/512x512bb.jpg","name":"世界征服者4","pricefrom":1.0,"priceTo":0.0,"platform":"iOS","genre":"游戏","rating":"3.5","modified":"1538039221029"},{"app_id":"1371425905","artwork":"https://is2-ssl.mzstatic.com/image/thumb/Purple128/v4/c3/43/01/c343018f-968e-c23b-a28f-5c1264a0d2a6/source/512x512bb.png","name":"Clipboards - Copy & Paste","pricefrom":30.0,"priceTo":12.0,"platform":"macOS","genre":"效率","rating":"","modified":"1538038905352"},{"app_id":"1369275607","artwork":"https://is3-ssl.mzstatic.com/image/thumb/Purple128/v4/79/48/e7/7948e7aa-004a-e494-ebf9-7629c65d6fe6/source/512x512bb.jpg","name":"Grocery/Shopping List Pro","pricefrom":18.0,"priceTo":0.0,"platform":"iOS","genre":"购物","rating":"","modified":"1538036894034"},{"app_id":"869249991","artwork":"https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/2f/29/21/2f292147-1ff9-2654-75b7-870ab4398484/source/512x512bb.png","name":"Mail Detective","pricefrom":18.0,"priceTo":0.0,"platform":"macOS","genre":"工具","rating":"","modified":"1538035776037"},{"app_id":"1364583892","artwork":"https://is4-ssl.mzstatic.com/image/thumb/Purple118/v4/ab/86/fb/ab86fb77-77b2-bd02-676e-db45d227b216/source/512x512bb.jpg","name":"ScheduleMe","pricefrom":18.0,"priceTo":0.0,"platform":"iOS","genre":"效率","rating":"4.5","modified":"1538025180978"},{"app_id":"1342129735","artwork":"https://is5-ssl.mzstatic.com/image/thumb/Purple118/v4/41/59/be/4159be91-45ee-3fe2-1805-cda3a0cf00f3/source/512x512bb.jpg","name":"荧幕判官","pricefrom":18.0,"priceTo":6.0,"platform":"iOS","genre":"游戏","rating":"4","modified":"1538014034905"},{"app_id":"1048026594","artwork":"https://is2-ssl.mzstatic.com/image/thumb/Purple128/v4/f0/54/83/f0548373-9534-3acc-c546-eddb4f6b6cfb/source/512x512bb.jpg","name":"MaxCurve","pricefrom":18.0,"priceTo":6.0,"platform":"iOS","genre":"摄影与录像","rating":"5","modified":"1538014003280"},{"app_id":"1299534713","artwork":"https://is4-ssl.mzstatic.com/image/thumb/Purple118/v4/c8/aa/f0/c8aaf013-ebcf-7aa9-188f-1f627be75f30/source/512x512bb.jpg","name":"Will it ever end?","pricefrom":12.0,"priceTo":6.0,"platform":"iOS","genre":"游戏","rating":"","modified":"1538013994384"},{"app_id":"1315544208","artwork":"https://is1-ssl.mzstatic.com/image/thumb/Purple115/v4/c0/34/fa/c034fad5-4b1c-056f-d913-27a2d22ae979/source/512x512bb.jpg","name":"Death Coming(死神来了)","pricefrom":12.0,"priceTo":6.0,"platform":"iOS","genre":"游戏","rating":"4.5","modified":"1538013951167"},{"app_id":"521633439","artwork":"https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/6a/d4/0f/6ad40fcf-f51e-c8e4-b321-8b95d8022809/source/512x512bb.jpg","name":"Dokuro","pricefrom":12.0,"priceTo":1.0,"platform":"iOS","genre":"游戏","rating":"4.5","modified":"1538012236131"},{"app_id":"1276089451","artwork":"https://is2-ssl.mzstatic.com/image/thumb/Purple118/v4/d7/e2/41/d7e241d4-b97b-051e-204f-f6a9f9455c60/source/512x512bb.jpg","name":"29天","pricefrom":12.0,"priceTo":6.0,"platform":"iOS","genre":"游戏","rating":"4","modified":"1538004089139"},{"app_id":"1076183044","artwork":"https://is4-ssl.mzstatic.com/image/thumb/Purple122/v4/58/1b/a6/581ba64c-75aa-8d44-bb2f-716faabb8919/source/512x512bb.png","name":"Doom & Destiny Advanced","pricefrom":30.0,"priceTo":12.0,"platform":"macOS","genre":"游戏","rating":"","modified":"1538003929052"},{"app_id":"764925064","artwork":"https://is3-ssl.mzstatic.com/image/thumb/Purple128/v4/4c/61/4c/4c614cbb-6353-0a28-7e6a-545438758af6/source/512x512bb.jpg","name":"Waterlogue","pricefrom":30.0,"priceTo":18.0,"platform":"iOS","genre":"摄影与录像","rating":"4.5","modified":"1538003471479"},{"app_id":"1267197755","artwork":"https://is4-ssl.mzstatic.com/image/thumb/Purple115/v4/37/71/49/37714963-7509-7854-fca7-a9ef8254fa92/source/512x512bb.jpg","name":"Another Lost Phone","pricefrom":18.0,"priceTo":12.0,"platform":"iOS","genre":"游戏","rating":"5","modified":"1538001248717"},{"app_id":"867733591","artwork":"https://is1-ssl.mzstatic.com/image/thumb/Purple122/v4/aa/52/c2/aa52c2d3-8ec0-cd2e-82fa-41d393d37b6a/source/512x512bb.jpg","name":"The Blocking Dead","pricefrom":6.0,"priceTo":0.0,"platform":"iOS","genre":"游戏","rating":"5","modified":"1538000793012"},{"app_id":"695516851","artwork":"https://is4-ssl.mzstatic.com/image/thumb/Purple82/v4/5b/07/25/5b0725ee-dd35-022e-f0df-d47c6c0df34a/source/512x512bb.png","name":"Hitman: Absolution - Elite Edition","pricefrom":163.0,"priceTo":68.0,"platform":"macOS","genre":"游戏","rating":"3.5","modified":"1537999317229"},{"app_id":"1132539229","artwork":"https://is5-ssl.mzstatic.com/image/thumb/Purple118/v4/e5/3a/1b/e53a1b07-9161-772e-1206-25eea65bf7d4/source/512x512bb.jpg","name":"Lighten 思维导图-专注头脑风暴灵感记录的极简脑图工具","pricefrom":18.0,"priceTo":8.0,"platform":"iOS","genre":"教育","rating":"3.5","modified":"1537975092538"},{"app_id":"1361473095","artwork":"https://is2-ssl.mzstatic.com/image/thumb/Purple118/v4/04/64/77/046477ec-43ea-795e-22dd-40be6e0ef24c/source/512x512bb.jpg","name":"Muse Dash","pricefrom":18.0,"priceTo":8.0,"platform":"iOS","genre":"游戏","rating":"5","modified":"1537974305353"},{"app_id":"596684220","artwork":"https://is4-ssl.mzstatic.com/image/thumb/Purple118/v4/0e/95/ff/0e95ffd2-d69b-7e42-c3ce-96bc8370eac3/source/512x512bb.jpg","name":"Essential Anatomy 5","pricefrom":128.0,"priceTo":98.0,"platform":"iOS","genre":"报刊杂志","rating":"4.5","modified":"1537972393237"},{"app_id":"1359867779","artwork":"https://is2-ssl.mzstatic.com/image/thumb/Purple125/v4/06/c2/e6/06c2e685-9a04-7390-4869-e998343d1280/source/512x512bb.jpg","name":".day","pricefrom":12.0,"priceTo":6.0,"platform":"iOS","genre":"生活","rating":"4.5","modified":"1537971104043"}]
```