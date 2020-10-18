package br.com.cardoso.beagle.activity

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import br.com.cardoso.beagle.R
import br.com.zup.beagle.android.view.BeagleActivity
import br.com.zup.beagle.android.view.ServerDrivenState

class AppBeagleActivity : BeagleActivity() {

    private val progressBar: ProgressBar by lazy { findViewById<ProgressBar>(R.id.progress_bar) }
    private val mToolbar: Toolbar by lazy { findViewById<Toolbar>(R.id.custom_toolbar) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_beagle)
    }

    override fun getServerDrivenContainerId() = R.id.server_driven_container
    override fun getToolbar() = mToolbar

    override fun onServerDrivenContainerStateChanged(state: ServerDrivenState) {
        when (state) {
            is ServerDrivenState.Started -> progressBar.visibility = View.VISIBLE
            is ServerDrivenState.Finished -> progressBar.visibility = View.GONE
            is ServerDrivenState.Error -> Toast.makeText(this, "Erro ao criar a tela.", Toast.LENGTH_LONG).show()
        }
    }
}
