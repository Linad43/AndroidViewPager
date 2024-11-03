package com.example.androidviewpager.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.example.androidviewpager.data.ItemsPageBank
import com.example.androidviewpager.R
import com.example.androidviewpager.activity.BankActivity

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    @SuppressLint("CutPasteId")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameTV: TextView = view.findViewById(R.id.nameTV)
        val imageIV: ImageView = view.findViewById(R.id.imageIV)
        val viewPagerItems = this.arguments?.getSerializable("vp") as ItemsPageBank
        nameTV.text = viewPagerItems.name
        imageIV.setImageResource(viewPagerItems.image)
        val main = view.findViewById<ConstraintLayout>(R.id.main)
        main.setOnClickListener {
            if (viewPagerItems.name == ItemsPageBank.listItems.last().name) {
                startActivity(Intent(activity, BankActivity::class.java))
            }
        }
    }
}