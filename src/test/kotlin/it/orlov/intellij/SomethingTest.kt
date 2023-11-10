package it.orlov.intellij

import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.intellij.util.io.lastModified
import java.nio.file.Path

class SomethingTest : BasePlatformTestCase() {

    fun testSomething() {
        Path.of(".").lastModified()
    }

}