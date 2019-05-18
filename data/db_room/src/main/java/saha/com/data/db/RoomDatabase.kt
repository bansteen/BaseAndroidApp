package saha.com.data.db

import kotlinx.coroutines.withContext
import saha.com.data.api.response.JobListResponse
import saha.com.data.db.dao.JobListDao
import saha.com.data.db.entity.JobInfoEntity
import javax.inject.Inject
import kotlin.coroutines.coroutineContext

/**
 * Created by chinmoy-saha@dmm.com on 2019-05-18.
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
            //TODO use entity mapper to convert api response
            jobListDao.deleteAll()
            //TODO insert
        }
    }

}