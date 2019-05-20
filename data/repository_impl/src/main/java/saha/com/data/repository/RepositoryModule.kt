package saha.com.data.repository

import dagger.Binds
import dagger.Module

/**
 * Created by chinmoy-saha@dmm.com on 2019-05-20.
 */
@Module(includes = [RepositoryModule.Providers::class])
internal abstract class RepositoryModule {
    @Binds abstract fun jobListDatabase(impl: JobListRepository): JobListRepository

    @Module
    internal object Providers

}
