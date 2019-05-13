package saha.com.data.api

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import saha.com.api.JobApi
import javax.inject.Singleton

/**
 * Created by chinmoy-saha on 2019-05-13.
 */
@Singleton
@Component(
    modules = [
        ApiModule::class
    ]
)
interface ApiComponent {
    fun JobApi(): JobApi

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): ApiComponent
    }

    companion object {
        fun builder(): Builder = DaggerApiComponent.builder()
    }
}