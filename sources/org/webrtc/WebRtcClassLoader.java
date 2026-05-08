package org.webrtc;

import defpackage.b0;

/* JADX INFO: loaded from: classes3.dex */
class WebRtcClassLoader {
    @CalledByNative
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        b0.o("Failed to get WebRTC class loader.");
        return null;
    }
}
