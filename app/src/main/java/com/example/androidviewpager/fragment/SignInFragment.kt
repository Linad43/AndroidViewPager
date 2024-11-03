package com.example.androidviewpager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.androidviewpager.service.CommonFun
import com.example.androidviewpager.R
import com.example.androidviewpager.data.User

class SignInFragment : Fragment() {

    private lateinit var toolbar: Toolbar
    private lateinit var nameET: EditText
    private lateinit var passwordET: EditText
    private lateinit var signInBTN: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val user = arguments?.getSerializable(User::class.java.simpleName) as User

        toolbar = view.findViewById(R.id.toolbar)
        nameET = view.findViewById(R.id.nameET)
        passwordET = view.findViewById(R.id.passwordET)
        signInBTN = view.findViewById(R.id.signInBTN)

        val allET = arrayListOf(
            nameET,
            passwordET
        )

        signInBTN.setOnClickListener {
            if (CommonFun.allETIsNotEmpty(allET)) {
                if (
                    nameET.text.toString() == user.name
                    && passwordET.text.toString() == user.password
                ) {
                    val name = nameET.text.toString()
                    val password = passwordET.text.toString()
                    val bundle = Bundle()
                    val listBank = ListBank()

                    bundle.putSerializable(
                        User::class.java.simpleName,
                        User(name, password)
                    )
                    listBank.arguments = bundle
                    fragmentManager
                        ?.beginTransaction()
                        ?.replace(R.id.containerFragment, listBank)
                        ?.commit()
                }
            }
        }
    }
}