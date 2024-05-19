package com.stardroidKs.mytestapplication

import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.google.android.stardroid.activities.DynamicStarMapActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val queryIntent = Intent()
        queryIntent.action = Intent.ACTION_SEARCH
        queryIntent.putExtra(SearchManager.QUERY, "περσεύς")
        queryIntent.setClass(this, DynamicStarMapActivity::class.java)
        startActivity(queryIntent)
    }
}