package com.example.logutils

import android.util.Log

object LogUtils {
    fun LogError(tag: String, msg: String) {
        Log.e(tag, msg)
    }
}