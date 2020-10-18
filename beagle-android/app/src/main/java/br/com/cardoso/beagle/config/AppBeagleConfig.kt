package br.com.cardoso.beagle.config

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.BeagleConfig
import br.com.zup.beagle.android.setup.Cache
import br.com.zup.beagle.android.setup.Environment

@BeagleComponent
class AppBeagleConfig : BeagleConfig {
    override val baseUrl: String
        get() = "http://10.0.2.2:8080"
    override val cache: Cache
        get() = Cache(
            enabled = true, // If true, we will cache data on disk and memory.
            size = 300, //?
            maxAge = 300, // Time in seconds that memory cache will live.
            memoryMaximumCapacity = 15 // Memory LRU cache size. It represents number of screens that will be in memory.
        )
    override val environment: Environment
        get() = Environment.DEBUG
    override val isLoggingEnabled: Boolean
        get() = true
}