package saha.com.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import saha.com.data.db.dao.JobListDao
import saha.com.data.db.entity.JobInfoEntityImpl

/**
 * Created by chinmoy-saha on 2019-05-14.
 */
@Database(
    entities = [
        (JobInfoEntityImpl::class)
    ],
    version = 1,
    exportSchema = false
)

abstract class CacheDatabase : RoomDatabase() {
    abstract fun jobListDao(): JobListDao
    fun sqlite(): SupportSQLiteDatabase {
        return mDatabase
    }
}