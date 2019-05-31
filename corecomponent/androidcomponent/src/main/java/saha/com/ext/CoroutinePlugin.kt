package saha.com.ext

/**
 * Created by chinmoy-saha on 2019-06-01.
 */

import androidx.annotation.VisibleForTesting
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

object CoroutinePlugin {

    private val defaultIoDispatcher: CoroutineContext = Dispatchers.IO
    val ioDispatcher: CoroutineContext
        get() = ioDispatcherHandler?.invoke(
            defaultIoDispatcher
        ) ?: defaultIoDispatcher
    @set:VisibleForTesting
    var ioDispatcherHandler: ((CoroutineContext) -> CoroutineContext)? = null

    private val defaultComputationDispatcher: CoroutineContext = Dispatchers.Default
    val defaultDispatcher: CoroutineContext
        get() = computationDispatcherHandler?.invoke(
            defaultComputationDispatcher
        )
            ?: defaultComputationDispatcher
    @set:VisibleForTesting
    var computationDispatcherHandler: ((CoroutineContext) -> CoroutineContext)? = null

    private val defaultMainDispatcher: CoroutineContext = Dispatchers.Main
    val mainDispatcher: CoroutineContext
        get() = mainDispatcherHandler?.invoke(
            defaultMainDispatcher
        ) ?: defaultMainDispatcher
    @set:VisibleForTesting
    var mainDispatcherHandler: ((CoroutineContext) -> CoroutineContext)? = null

    @VisibleForTesting @JvmStatic fun reset() {
        ioDispatcherHandler = null
        computationDispatcherHandler = null
        mainDispatcherHandler = null
    }
}
