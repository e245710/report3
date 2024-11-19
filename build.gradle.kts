plugins {
    kotlin("jvm") version "1.8.0" // Kotlin プラグイン
    application
}

repositories {
    mavenCentral() // 依存関係のリポジトリ
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8") // Kotlin 標準ライブラリ
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0") // JUnit5 など
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

application {
    // 実行するメインクラスを指定
    mainClass.set("jp.ac.uryukyu.ie.e245710.App")  // 必ずこの行を含める
}

tasks.test {
    useJUnitPlatform() // JUnitプラットフォームを使用
}

kotlin {
    jvmToolchain(17) // KotlinコンパイラのターゲットJVMを17に設定
}
