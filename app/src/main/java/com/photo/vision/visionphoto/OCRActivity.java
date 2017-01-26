package com.photo.vision.visionphoto;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.vision.CameraSource;
import com.photo.vision.visionphoto.ocr.CameraSourcePreview;

import butterknife.BindView;

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


    @BindView(R.id.tvOcrResult)
    TextView tvOcrResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocr);
    }
}