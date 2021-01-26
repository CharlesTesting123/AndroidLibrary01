package com.example

import android.content.Context
import android.widget.Toast

class LogMsg {
    fun showMsg(context:Context,s:String) {
        Toast.makeText(context,"$s",Toast.LENGTH_LONG).show()
    }
}