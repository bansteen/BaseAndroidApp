package saha.com.template

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import saha.com.template.di.createAppComponent

/**
 * Created by chinmoy-saha on 2019-05-08.
 */

open class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return createAppComponent()
    }
}