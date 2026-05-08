package defpackage;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class z8e {
    public static final String a;
    public static final String b;

    static {
        byte[] bytes = wnb.b().getBytes(a32.b);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, 10);
        a = l5.m("firebase_session_", strEncodeToString, "_data");
        b = l5.m("firebase_session_", strEncodeToString, "_settings");
    }
}
