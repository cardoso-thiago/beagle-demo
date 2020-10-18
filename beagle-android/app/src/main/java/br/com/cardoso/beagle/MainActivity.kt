package br.com.cardoso.beagle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.cardoso.beagle.activity.AppBeagleActivity
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.view.ScreenRequest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = this.newServerDrivenIntent<AppBeagleActivity>(ScreenRequest("/builder"))
        startActivity(intent)
        finish()
    }
}
