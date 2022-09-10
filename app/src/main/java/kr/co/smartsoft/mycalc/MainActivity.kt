package kr.co.smartsoft.mycalc

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.co.smartsoft.mycalc.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun setUpEvents() {

    }

    override fun setValues() {

    }
}