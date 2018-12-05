package jp.moongift.keysncmb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jp.moongift.keysncmb.BuildConfig
import com.nifcloud.mbaas.core.NCMB

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NCMB.initialize(applicationContext, BuildConfig.APPLICATION_KEY, BuildConfig.CLIENT_KEY)
    }
}
