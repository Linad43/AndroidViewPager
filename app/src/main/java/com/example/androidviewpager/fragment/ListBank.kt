package com.example.androidviewpager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.androidviewpager.R
import com.example.androidviewpager.data.User

class ListBank : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_list_bank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val loginTV:TextView = view.findViewById(R.id.loginTV)
        val user = arguments?.getSerializable(User::class.java.simpleName) as User
        loginTV.text = "Добро пожаловать ${user.name}"
    }
}