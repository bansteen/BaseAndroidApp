package saha.com.data.db

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton
import kotlin.coroutines.CoroutineContext

/**
 * Created by chinmoy-saha on 2019-05-18.
 */

@Singleton
@Component(
    modules = [
        DbModule::class
    ]
)
interface DbComponent {
    fun jobListDatabase(): JobListDatabase

    @Component.Builder
    interface Builder {
        @BindsInstance fun context(context: Context): Builder

        @BindsInstance fun coroutineContext(coroutineContext: CoroutineContext): Builder

        @BindsInstance fun filename(filename: String?): Builder

        fun build(): DbComponent
    }

    companion object {
        fun builder(): Builder = DaggerDbComponent.builder()
    }
}
