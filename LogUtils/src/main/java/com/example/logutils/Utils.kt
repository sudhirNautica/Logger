package com.example.logutils

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

object Utils {
    fun LogError(tag: String, msg: String) {
        Log.e(tag, msg)
    }

    fun LogInfo(tag: String, msg: String) {
        Log.i(tag, msg)
    }

    fun LogDebug(tag: String, msg: String) {
        Log.d(tag, msg)
    }

    fun LogWarning(tag: String, msg: String) {
        Log.w(tag, msg)
    }

    fun Context.printToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    fun Context.hideKeyboard(view: View) {
        val inputMethodManager =
            getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    fun Context.loadCircularProfileImage(imageView: ImageView, uri: String) {
        Glide.with(this)
            .load(uri)
            .apply(RequestOptions().circleCrop())
            .into(imageView)
    }

    fun Context.loadRoundedCornerImage(imageView: ImageView, uri: String, radius: Int) {
        Glide.with(this)
            .load(uri)
            .apply(RequestOptions.bitmapTransform(RoundedCorners(radius)))
            .into(imageView)
    }
}