package saha.com.data.repository

import dagger.BindsInstance
import dagger.Component
import saha.com.data.api.JobApi
import saha.com.data.db.JobListDatabase
import javax.inject.Singleton

/**
 * Created by chinmoy-saha on 2019-05-20.
 */
@Singleton
@Component(
    modules = [
        RepositoryModule::class
    ]
)
interface RepositoryComponent {
    fun jobListRepository(): JobListRepository

    @Component.Builder
    interface Builder {
        @BindsInstance fun jobApi(api: JobApi): Builder
        @BindsInstance fun jobListDatabase(database: JobListDatabase): Builder

        fun build(): RepositoryComponent

    }

    companion object {
        fun builder(): Builder = DaggerRepositoryComponent.builder()
    }
}