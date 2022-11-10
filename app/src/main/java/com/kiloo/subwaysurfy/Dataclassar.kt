package com.kiloo.subwaysurfy

import android.app.Application
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import java.util.*

class Dataclassar : Application() {
    companion object {
        const val SDK_KEY = "84460737665679725018"
        const val jsoupCheck = "1v4b"
        const val ONESIGNAL_APP_ID = "965824bc-d266-4a9b-b28c-fc25ab6a7b5e"

        val linkFilterPart1 = "http://tit"
        val linkFilterPart2 = "aniumgem.xyz/go.php?to=1&"
        var MYID: String? = "myID"
        var INSTID: String? = "instID"

    }
    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
        Hawk.init(this).build()

        val trackerParams = MyTracker.getTrackerParams()
        val trackerConfig = MyTracker.getTrackerConfig()
        val instID = MyTracker.getInstanceId(this)
        trackerConfig.isTrackingLaunchEnabled=true
        val ID = UUID.randomUUID().toString()
        trackerParams.setCustomUserId(ID)
        Hawk.put(MYID, ID)
        Hawk.put(INSTID, instID)
        MyTracker.initTracker(SDK_KEY, this)
    }
}