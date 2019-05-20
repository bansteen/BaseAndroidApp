package saha.com.template.di

import android.app.Application
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import saha.com.data.db.DbComponent
import saha.com.data.db.JobListDatabase
import javax.inject.Singleton

/**
 * Created by chinmoy-saha@dmm.com on 2019-05-20.
 */
@Module
object DbComponentModule {
    @JvmStatic @Provides @Singleton fun provideJobListStore(
        application: Application
    ): JobListDatabase {
        return DbComponent.builder()
            .context(application)
            .coroutineContext(Dispatchers.IO)
            .filename("sahabaseapp.db")
            .build()
            .jobListDatabase()
    }
}