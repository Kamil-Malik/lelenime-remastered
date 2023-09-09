pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Lelenime Remastered"
include(":app")
include(":feature:anime")
include(":feature:anime-image")
include(":core:theme")
include(":core:common")
include(":core:data")
include(":feature:settings")
