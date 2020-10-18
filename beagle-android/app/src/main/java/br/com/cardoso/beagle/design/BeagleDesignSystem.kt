package br.com.cardoso.beagle.design

import br.com.cardoso.beagle.R
import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem

@BeagleComponent
class BeagleDesignSystem : DesignSystem(){
    override fun buttonStyle(id: String): Int? {
        return R.style.AppTheme_Button
    }

    override fun textStyle(id: String): Int? {
        return R.style.AppTheme_Text
    }
}