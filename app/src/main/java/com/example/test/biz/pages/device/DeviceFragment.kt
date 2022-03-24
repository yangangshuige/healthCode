package com.example.test.biz.pages.device

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.test.R
import com.example.test.databinding.FragmentDeviceBinding

class DeviceFragment : Fragment(R.layout.fragment_device) {
    private lateinit var viewBinding: FragmentDeviceBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding = FragmentDeviceBinding.bind(view)
    }

    companion object {
        private const val KEY_DEVICE_DATA = "KEY_DEVICE_DATA"

        @JvmStatic
        fun buildArguments(
            bleDevice: String,
        ): Bundle {
            val bundle = Bundle()
            bundle.putString(KEY_DEVICE_DATA, bleDevice)
            return bundle
        }

    }
}