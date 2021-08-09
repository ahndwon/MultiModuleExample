listOf(
    ":app",

    ":features:home",
    ":features:launch",
    ":features:detail",
//    ":features:activity_feature",
//    ":features:fragment_feature",
//
//    ":navigation",
    ":design",
    ":core"
).forEach {
    include(it)
}
