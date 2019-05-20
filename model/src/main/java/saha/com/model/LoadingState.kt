package saha.com.model

/**
 * Created by chinmoy-saha on 2019-05-20.
 */
enum class LoadingState {
    INITIALIZED,
    LOADING,
    LOADED;

    val isInitialized: Boolean get() = this == INITIALIZED
    val isLoading get() = this == LOADING
    val isLoaded: Boolean get() = this == LOADED
}
