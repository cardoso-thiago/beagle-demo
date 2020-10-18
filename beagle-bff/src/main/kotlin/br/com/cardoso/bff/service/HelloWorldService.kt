package br.com.cardoso.bff.service

import br.com.zup.beagle.core.ServerDrivenComponent
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.core.AlignContent
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.core.TextAlignment
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Text
import org.springframework.stereotype.Service

@Service
class HelloWorldService {

    fun createScreenBuilder(): ScreenBuilder = HelloWorldScreenBuilder(this.createContainer())

    fun createContainer() = Container(children = listOf(createIntroText(), createButton1(), createButton2()))

    fun createIntroText() = Text(
            text = "Exemplo de criação de tela com Beagle",
            alignment = TextAlignment.CENTER
    ).applyStyle(Style(margin = EdgeValue(all = 20.unitReal())))

    fun createButton1() = Button(
            text = "Botão 1",
            onPress = listOf(createActionButton1())
    ).applyStyle(Style(margin = EdgeValue(all = 20.unitReal())))

    fun createButton2() = Button(
            text = "Botão 2",
            onPress = listOf(createActionButton2())
    ).applyStyle(Style(margin = EdgeValue(all = 20.unitReal())))

    fun createActionButton1() = Alert(
            title = "Botão 1",
            message = "Botão 1 pressionado. Esse é um popup nativo",
            labelOk = "Fechar"
    )

    fun createActionButton2() = Alert(
            title = "Botão 2",
            message = "Botão 2 pressionado. Esse é um popup nativo",
            labelOk = "Fechar"
    )
}

private class HelloWorldScreenBuilder(val component: ServerDrivenComponent) : ScreenBuilder {
    override fun build() = Screen(child = this.component)
}