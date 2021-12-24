apply {
    from("$rootDir/android-library-build.gradle")
}


dependencies {
    "implementation"(project(Modules.heroDomain))
    "implementation"(project(Modules.heroInteractors))

    "implementation"(Coil.coil)
}