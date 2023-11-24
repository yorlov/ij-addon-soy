package it.orlov.intellij

import com.google.bamboo.soy.parser.SoyTemplateDefinitionIdentifier
import com.intellij.openapi.util.io.FileUtil.toSystemIndependentName
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import java.io.File

class SoyTemplateReferenceTest : BasePlatformTestCase() {

    fun testTemplate() {
        myFixture.configureByFiles("soy-link.js", "template.soy")
        val element = myFixture.file.findElementAt(myFixture.caretOffset)!!.parent
        assertEquals(".licenseTooltipAllBranches", (element.references[0].resolve() as SoyTemplateDefinitionIdentifier).text)
    }

    override fun getTestDataPath() = toSystemIndependentName(File("src/test/resources/soy").absolutePath)
}