package com.beerfie.showeralarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beerfie.showeralarm.AlarmStoreGrpcKt.AlarmStoreCoroutineStub

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
