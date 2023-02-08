
rootProject.name = "gradle-issue-847"

pluginManagement {
    plugins {
        kotlin("jvm") version "1.8.0"
    }
}

include("a:lib")
include("b:lib")
