# sbt test behaviour

1. How to run
```
sbt test:compile
sbt testOnly
```

2. Expected behaviour: `~~ Base created ~~` will print only once because it's action inside of `object Base` initialization

3. Observed behaviour: `~~ Base created ~~` will print twice, one time from every module
