package me.iwf.PhotoPickerDemo

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import me.iwf.photopicker.customui.ICustomMadeUi
import me.iwf.photopicker.customui.ISelectedAction


/**
 * created at 2018/11/29
 * author wangxiangle
 * email wang_x_le@163.com
 **/

class CustomMade : ICustomMadeUi {
    var tvRight: TextView? = null
    var tvTitle: TextView? = null
    var ivImage: ImageView? = null
    override fun titleLayout(context: Context,mSelectedAction: ISelectedAction): View? {
        var view = LayoutInflater.from(context).inflate(R.layout.item_title, null)
        tvRight = view.findViewById<TextView>(R.id.tv_right)
        tvTitle = view.findViewById<TextView>(R.id.tv_title)
        ivImage = view.findViewById<ImageView>(R.id.iv_back)

        tvTitle?.text = "自定义标题"
        ivImage?.setOnClickListener { mSelectedAction?.back() }
        tvRight?.setOnClickListener { mSelectedAction?.done() }
        return view
    }

    override fun setTitleCount(coutDes: String) {
        tvRight?.text = coutDes
    }

 }