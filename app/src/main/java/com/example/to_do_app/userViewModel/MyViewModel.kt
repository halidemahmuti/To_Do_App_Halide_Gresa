package com.example.to_do_app.userViewModel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.to_do_app.R
import com.example.to_do_app.model.MyData


class MyViewModel : ViewModel() {
    val myDataList = MutableLiveData<List<MyData>>()
}