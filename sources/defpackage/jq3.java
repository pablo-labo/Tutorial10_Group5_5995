package defpackage;

import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class jq3 {
    static {
        new jq3();
    }

    public static final synchronized void a() {
        SoLoader.l("react_newarchdefaults");
        try {
            SoLoader.l("appmodules");
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
