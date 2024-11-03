package com.example.androidviewpager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.androidviewpager.service.CommonFun
import com.example.androidviewpager.R
import com.example.androidviewpager.data.User

class SignUpFragment : Fragment() {

//    private lateinit var nameET: EditText
//    private lateinit var passwordET: EditText
//    private lateinit var signUpBTN: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameET: EditText = view.findViewById(R.id.nameET)
        val passwordET: EditText = view.findViewById(R.id.passwordET)
        val signUpBTN: Button = view.findViewById(R.id.signUpBTN)
        val allET = arrayListOf(
            nameET,
            passwordET
        )
        signUpBTN.setOnClickListener {
            if (CommonFun.allETIsNotEmpty(allET)){
                val name = nameET.text.toString()
                val password = passwordET.text.toString()
                val bundle = Bundle()
                val signInFragment = SignInFragment()

                bundle.putSerializable(
                    User::class.java.simpleName,
                    User(name, password)
                )
                signInFragment.arguments = bundle
                fragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.containerFragment, signInFragment)
                    ?.commit()
            }
        }
    }

//    private fun allETIsNotEmpty(allET:ArrayList<EditText>): Boolean {
//        var flag = true
//        allET.forEach{
//            if(it.text.isEmpty()) {
//                flag = false
//                it.setHint(R.string.isDoNotEmpty)
//            }
//        }
//        return flag
//    }
}