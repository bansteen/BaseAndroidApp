package saha.com.template.di

import dagger.Module
import dagger.Provides
import saha.com.data.api.JobApi
import saha.com.data.db.JobListDatabase
import saha.com.data.repository.JobListRepository
import saha.com.data.repository.RepositoryComponent
import javax.inject.Singleton

/**
 * Created by chinmoy-saha@dmm.com on 2019-05-20.
 */
@Module
object RepositoryComponentModule {
    @JvmStatic @Provides @Singleton fun provideJobListRepository(
        repositoryComponent: RepositoryComponent
    ): JobListRepository {
        return repositoryComponent.jobListRepository()
    }

    @JvmStatic @Provides @Singleton fun provideRepositoryComponent(
        jobApi: JobApi,
        jobListDatabase: JobListDatabase
    ): RepositoryComponent {
        return RepositoryComponent.builder()
            .jobApi(jobApi)
            .jobListDatabase(jobListDatabase)
            .build()
    }
}