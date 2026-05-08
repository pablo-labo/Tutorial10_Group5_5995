package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.ecc;
import defpackage.f8b;
import defpackage.fcc;
import defpackage.nmc;
import defpackage.ot2;
import defpackage.r6;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = NativeRNCWebViewModuleSpec.NAME)
public class RNCWebViewModule extends NativeRNCWebViewModuleSpec {
    private final fcc mRNCWebViewModuleImpl;

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRNCWebViewModuleImpl = new fcc(reactApplicationContext);
    }

    public void downloadFile(String str) {
        this.mRNCWebViewModuleImpl.b(str);
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeRNCWebViewModuleSpec.NAME;
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        fcc fccVar = this.mRNCWebViewModuleImpl;
        ReactApplicationContext reactApplicationContext = fccVar.a;
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z = ot2.a(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (z) {
            return z;
        }
        ComponentCallbacks2 currentActivity2 = reactApplicationContext.getCurrentActivity();
        if (currentActivity2 == null) {
            r6.g("Tried to use permissions API while not attached to an Activity.");
            return false;
        }
        if (currentActivity2 instanceof f8b) {
            ((f8b) currentActivity2).x(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, new ecc(fccVar, str, str2));
            return z;
        }
        r6.g("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        return false;
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec
    public void isFileUploadSupported(Promise promise) {
        this.mRNCWebViewModuleImpl.getClass();
        promise.resolve(Boolean.TRUE);
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.mRNCWebViewModuleImpl.b = request;
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec
    public void shouldStartLoadWithLockIdentifier(boolean z, double d) {
        AtomicReference<fcc.b.a> atomicReference;
        this.mRNCWebViewModuleImpl.getClass();
        fcc.b bVar = fcc.V;
        Double dValueOf = Double.valueOf(d);
        synchronized (bVar) {
            atomicReference = bVar.b.get(dValueOf);
        }
        if (atomicReference != null) {
            synchronized (atomicReference) {
                try {
                    atomicReference.set(z ? fcc.b.a.c : fcc.b.a.b);
                    atomicReference.notify();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean startPhotoPickerIntent(android.webkit.ValueCallback<android.net.Uri[]> r9, java.lang.String[] r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewModule.startPhotoPickerIntent(android.webkit.ValueCallback, java.lang.String[], boolean, boolean):boolean");
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        String mimeTypeFromExtension;
        Intent intentF;
        Intent intentG;
        fcc fccVar = this.mRNCWebViewModuleImpl;
        fccVar.c = valueCallback;
        Activity currentActivity = fccVar.a.getCurrentActivity();
        String mimeTypeFromExtension2 = str.isEmpty() ? fcc.a.DEFAULT.value : str;
        if (str.matches("\\.\\w+")) {
            String strReplace = str.replace(".", "");
            mimeTypeFromExtension2 = strReplace != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace) : null;
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(mimeTypeFromExtension2);
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        ArrayList arrayList = new ArrayList();
        if (str.matches("\\.\\w+")) {
            String strReplace2 = str.replace(".", "");
            mimeTypeFromExtension = strReplace2 != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace2) : null;
        } else {
            mimeTypeFromExtension = str;
        }
        if ((mimeTypeFromExtension.isEmpty() || mimeTypeFromExtension.toLowerCase().contains(fcc.a.IMAGE.value)) && (intentF = fccVar.f()) != null) {
            arrayList.add(intentF);
        }
        if (str.matches("\\.\\w+")) {
            String strReplace3 = str.replace(".", "");
            str = strReplace3 != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace3) : null;
        }
        if ((str.isEmpty() || str.toLowerCase().contains(fcc.a.VIDEO.value)) && (intentG = fccVar.g()) != null) {
            arrayList.add(intentG);
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intentCreateChooser.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intentCreateChooser, 3);
        } else {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Activity to handle this Intent");
        }
    }
}
