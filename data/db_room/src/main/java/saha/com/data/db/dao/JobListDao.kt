package saha.com.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import saha.com.data.db.entity.JobInfoEntityImpl

/**
 * Created by chinmoy-saha on 2019-05-14.
 */
@Dao
abstract class JobListDao {
    @Query("SELECT * FROM joblist ORDER BY createdAt")
    abstract fun allJobs(): List<JobInfoEntityImpl>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(jobs: List<JobInfoEntityImpl>)

    @Query("DELETE FROM joblist")
    abstract fun deleteAll()
}