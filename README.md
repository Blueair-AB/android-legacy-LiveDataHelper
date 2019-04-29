# LiveDataHelpers
Extension functions for LiveData

[![CircleCI](https://circleci.com/gh/flatcircle/LiveDataHelper.svg?style=svg)](https://circleci.com/gh/flatcircle/LiveDataHelper) [ ![Download](https://api.bintray.com/packages/flatcircle/LiveDataHelper/livedatahelper/images/download.svg) ](https://bintray.com/flatcircle/LiveDataHelper/livedatahelper/_latestVersion)

This app provides a few extension functions and delegates for LiveData in Kotlin


Installation
--------

```groovy
implementation 'io.flatcircle:livedatahelper:{version}'
```


Usage
-----

| Extension  | Description | Example |
| ------------- | ------------- | ------------- |
| .observe {} | Observes, except you only have to pass a lambda | [Example](https://github.com/flatcircle/LiveDataHelper/blob/master/app/src/main/java/io/flatcircle/livedatahelperexample/MainActivity.kt#L34)  |
| .observeNonNull{} | Observes, but ignores nulls | [Example](https://github.com/flatcircle/LiveDataHelper/blob/master/app/src/main/java/io/flatcircle/livedatahelperexample/MainActivity.kt#L34) |

