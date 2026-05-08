package com.facebook.react.modules.camera;

import android.net.Uri;
import android.util.Base64OutputStream;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.j37;
import defpackage.nmc;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executors;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "ImageStoreManager")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/modules/camera/ImageStoreManager;", "Lcom/facebook/fbreact/specs/NativeImageStoreAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "uri", "Lcom/facebook/react/bridge/Callback;", "success", "error", "Lj6g;", "getBase64ForTag", "(Ljava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageStoreManager extends NativeImageStoreAndroidSpec {
    private static final int BUFFER_SIZE = 8192;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String NAME = "ImageStoreManager";

    /* JADX INFO: renamed from: com.facebook.react.modules.camera.ImageStoreManager$a, reason: from kotlin metadata */
    public static final class Companion {
        public static String a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
            byte[] bArr = new byte[ImageStoreManager.BUFFER_SIZE];
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i > -1) {
                        base64OutputStream.write(bArr, 0, i);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                } finally {
                    try {
                        base64OutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
            }
            String string = byteArrayOutputStream.toString();
            string.getClass();
            return string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStoreManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getBase64ForTag$lambda$0(ImageStoreManager imageStoreManager, String str, Callback callback, Callback callback2) {
        try {
            InputStream inputStreamOpenInputStream = imageStoreManager.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(str));
            inputStreamOpenInputStream.getClass();
            try {
                try {
                    INSTANCE.getClass();
                    callback.invoke(Companion.a(inputStreamOpenInputStream));
                } catch (Throwable th) {
                    INSTANCE.getClass();
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                    throw th;
                }
            } catch (IOException e) {
                callback2.invoke(e.getMessage());
                INSTANCE.getClass();
            }
            try {
                inputStreamOpenInputStream.close();
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException e2) {
            callback2.invoke(e2.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreAndroidSpec
    public void getBase64ForTag(String uri, Callback success, Callback error) {
        uri.getClass();
        success.getClass();
        error.getClass();
        Executors.newSingleThreadExecutor().execute(new j37(this, uri, success, error, 0));
    }
}
