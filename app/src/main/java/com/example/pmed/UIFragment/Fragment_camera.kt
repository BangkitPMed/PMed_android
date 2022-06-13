package com.example.pmed.UIFragment

import android.content.Context
import android.content.Intent
import android.graphics.Camera
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageCapture
import androidx.camera.core.Preview
import androidx.core.app.ActivityCompat
import com.example.pmed.CameraActivity
import com.example.pmed.R
import com.example.pmed.databinding.BeforeCameraLayoutBinding
import com.example.pmed.databinding.FragmentCameraBinding
import java.io.File
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class fragment_camera : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = BeforeCameraLayoutBinding.inflate(layoutInflater)
        bind.buttonpindah.setOnClickListener {
            val intent = Intent (this@fragment_camera.requireContext(), CameraActivity::class.java)
            startActivity(intent)
        }
        return bind.root
    }

}