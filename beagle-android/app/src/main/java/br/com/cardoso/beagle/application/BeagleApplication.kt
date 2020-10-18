package br.com.cardoso.beagle.application

import android.app.Application
import br.com.cardoso.beagle.config.BeagleSetup

class BeagleApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}