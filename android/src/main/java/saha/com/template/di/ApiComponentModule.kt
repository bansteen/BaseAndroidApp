package saha.com.template.di

import android.app.Application
import dagger.Module
import dagger.Provides
import saha.com.data.api.ApiComponent
import saha.com.data.api.JobApi
import javax.inject.Singleton

/**
 * Created by chinmoy-saha on 2019-05-20.
 */

@Module
object ApiComponentModule {
    @JvmStatic @Provides @Singleton
    fun provideJobApi(application: Application): JobApi {
        return ApiComponent.builder()
            .context(application)
            .build()
            .JobApi()
    }
}
