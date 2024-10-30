package com.example.androidviewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameTV: TextView = view.findViewById(R.id.nameTV)
        val imageIV: ImageView = view.findViewById(R.id.imageIV)
        val authorTV: TextView = view.findViewById(R.id.authorTV)
        val viewPagerItems = arguments?.getSerializable("vp") as Items
        nameTV.text = viewPagerItems.name
        imageIV.setImageResource(viewPagerItems.image)
        authorTV.text = viewPagerItems.author
    }
}