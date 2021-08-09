listOf(
    ":app",

    ":features:home",
    ":features:launch",
//    ":features:activity_feature",
//    ":features:fragment_feature",
//
//    ":navigation",
    ":design",
    ":core"
).forEach {
    include(it)
}
