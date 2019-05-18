package saha.com.data.db

import kotlinx.coroutines.withContext
import saha.com.data.api.response.JobListResponse
import saha.com.data.db.dao.JobListDao
import saha.com.data.db.entity.JobInfoEntity
import saha.com.data.db.entity.mapper.toJobInfoEntities
import javax.inject.Inject
import kotlin.coroutines.coroutineContext

/**
 * Created by chinmoy-saha on 2019-05-18.
 */

class RoomDatabase @Inject constructor(
    private val database: CacheDatabase,
    private val jobListDao: JobListDao
): JobListDatabase {
    override suspend fun jobs(): List<JobInfoEntity> {
        return jobListDao.allJobs()
    }

    override suspend fun save(apiResponse: JobListResponse) {
        withContext(coroutineContext) {
            database.runInTransaction {
                jobListDao.deleteAll()
                val jobList = apiResponse.jobList
                val jobInfoEntities = jobList.toJobInfoEntities()
                jobListDao.insert(jobInfoEntities)
            }
        }
    }

}