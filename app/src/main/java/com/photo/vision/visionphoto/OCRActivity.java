package com.photo.vision.visionphoto;

import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.vision.CameraSource;
import com.photo.vision.visionphoto.ocr.CameraSourcePreview;

/**
 * Created by Hongd on 2017/1/21.
 */

public class OCRActivity extends AppCompatActivity{
    private static final int RC_HANDLE_GMS = 9001;

    private static final String TAG = "OcrCaptureActivity";

    private static final int RC_HANDLE_VAMERA_PERM = 2;

    public static final String AutoFocus = "AutoFocus";
    public static final String UseFlash  = "UseFlash";

    private CameraSource mCameraSource;
    private CameraSourcePreview mCameraSourcePreView;

}