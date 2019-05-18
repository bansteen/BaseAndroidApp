package saha.com.data.db

import android.content.Context
import androidx.room.Room
import dagger.Binds
import dagger.Module
import dagger.Provides
import saha.com.data.db.dao.JobListDao
import javax.inject.Singleton

/**
 * Created by chinmoy-saha@dmm.com on 2019-05-18.
 */

@Module(includes = [DbModule.Providers::class])
internal abstract class DbModule {
    @Binds abstract fun jobListDatabase(impl: RoomDatabase): JobListDatabase

    @Module
    internal object Providers {
        @Singleton @JvmStatic @Provides fun database(
            context: Context,
            fileName: String?
        ): CacheDatabase {
            return Room.databaseBuilder(
                context,
                CacheDatabase::class.java,
                fileName ?: "sahabaseapp.db"
            )
                .fallbackToDestructiveMigration()
                .build()
        }

        @JvmStatic @Provides fun jobListDao(databaseJobList: CacheDatabase) : JobListDao {
            return databaseJobList.jobListDao()
        }
    }

}