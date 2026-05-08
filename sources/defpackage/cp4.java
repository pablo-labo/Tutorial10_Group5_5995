package defpackage;

import android.util.Log;
import org.webrtc.EglBase;

/* JADX INFO: loaded from: classes3.dex */
public final class cp4 {
    public static EglBase a;

    public static EglBase.Context a() {
        EglBase eglBase;
        RuntimeException e;
        EglBase eglBaseCreateEgl10;
        synchronized (cp4.class) {
            if (a == null) {
                int[] iArr = EglBase.CONFIG_PLAIN;
                try {
                    eglBaseCreateEgl10 = EglBase.createEgl14(iArr);
                    e = null;
                } catch (RuntimeException e2) {
                    e = e2;
                    eglBaseCreateEgl10 = null;
                }
                if (eglBaseCreateEgl10 == null) {
                    try {
                        eglBaseCreateEgl10 = EglBase.createEgl10(iArr);
                    } catch (RuntimeException e3) {
                        e = e3;
                    }
                }
                if (e != null) {
                    Log.e(cp4.class.getName(), "Failed to create EglBase", e);
                } else {
                    a = eglBaseCreateEgl10;
                }
            }
            eglBase = a;
        }
        if (eglBase == null) {
            return null;
        }
        return eglBase.getEglBaseContext();
    }
}
