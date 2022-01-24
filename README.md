# LeapYear

use kotlin to learn test driven development

## original thinking

```kotlin
fun isLeapYear(year: Int): Boolean {
    return (year % 400 === 0) || ((year % 100 !== 0) && (year % 4 === 0))
}
```
## reference my teacher

[reccachao's kotlin kata ](https://gitpage.reccachao.net/kotlin/kata/leap-years/)

```kotlin
fun isLeapYear(year: Int): Boolean {
    return when {
        year % 400 === 0 -> true
        year % 100 === 0 -> false
        else -> year % 4 === 0
    }
}
```

在語法上更簡潔且更好懂

不必再陷入 100 與 4 的必要條件思考