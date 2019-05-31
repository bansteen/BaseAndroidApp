package saha.com.store

/**
 * Created by chinmoy-saha on 2019-06-01.
 */

import androidx.lifecycle.ViewModel

open class Store : ViewModel() {
    private val onClearHooks: MutableList<() -> Unit> = mutableListOf()
    fun addHook(hook: () -> Unit) {
        onClearHooks.add(hook)
    }

    override fun onCleared() {
        super.onCleared()
        onClearHooks.forEach { it() }
    }
}
