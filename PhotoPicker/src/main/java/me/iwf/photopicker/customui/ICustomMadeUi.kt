package me.iwf.photopicker.customui

import android.content.Context
import android.view.View


/**
 * created at 2018/11/29
 * author wangxiangle
 * email wang_x_le@163.com
 **/

interface ICustomMadeUi {

    fun titleLayout(context: Context,selectedAction: ISelectedAction): View?

    fun setTitleCount(coutDes:String)
}


interface ISelectedAction{
    fun done()
    fun back()
}

object ActivityData {
    var customView: ICustomMadeUi? = null
}