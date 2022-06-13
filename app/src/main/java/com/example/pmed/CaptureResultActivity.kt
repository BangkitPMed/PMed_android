package com.example.pmed

import android.Manifest
import android.graphics.BitmapFactory
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.pmed.databinding.BeforeCameraLayoutBinding
import com.example.pmed.databinding.CaptureScanBinding
import java.io.File

class CaptureResultActivity : AppCompatActivity() {

    private lateinit var binding: BeforeCameraLayoutBinding

    companion object {
        const val CAMERA_X_RESULT = 200
    }

    private lateinit var getFile: File
    private val launcherIntentCameraX = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        if (it.resultCode == CAMERA_X_RESULT) {
            val myFile = it.data?.getSerializableExtra("picture") as File
            val isBackCamera = it.data?.getBooleanExtra("isBackCamera", true) as Boolean
            getFile = myFile
            val result = rotateBitmap(
                BitmapFactory.decodeFile(myFile.path),
                isBackCamera
            )
            binding.imageView8.setImageBitmap(result)
        }
    }
}