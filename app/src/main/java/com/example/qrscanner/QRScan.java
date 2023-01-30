package com.example.qrscanner;

import android.Manifest;
import android.content.pm.PackageManager;

import androidx.core.content.ContextCompat;

public class QRScan {
    if (ContextCompat.checkSelfPermission(
    CONTEXT, Manifest.permission.REQUESTED_PERMISSION) ==
    PackageManager.PERMISSION_GRANTED) {
        // You can use the API that requires the permission.
        performAction(...);
    } else if (shouldShowRequestPermissionRationale(...)) {
        // In an educational UI, explain to the user why your app requires this
        // permission for a specific feature to behave as expected, and what
        // features are disabled if it's declined. In this UI, include a
        // "cancel" or "no thanks" button that lets the user continue
        // using your app without granting the permission.
        showInContextUI(...);
    } else {
        // You can directly ask for the permission.
        requestPermissions(CONTEXT,
                new String[] { Manifest.permission.REQUESTED_PERMISSION },
                REQUEST_CODE);
    }
}
