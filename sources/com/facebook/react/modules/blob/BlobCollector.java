package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/modules/blob/BlobCollector;", "", "blobModule", "", "jsContext", "Lj6g;", "nativeInstall", "(Ljava/lang/Object;J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlobCollector {
    public static final BlobCollector a = new BlobCollector();

    static {
        SoLoader.l("reactnativeblob");
    }

    public static void a(ReactApplicationContext reactApplicationContext, BlobModule blobModule) {
        JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
        if (javaScriptContextHolder == null || javaScriptContextHolder.getContext() == 0) {
            return;
        }
        a.nativeInstall(blobModule, javaScriptContextHolder.getContext());
    }

    private final native void nativeInstall(Object blobModule, long jsContext);
}
