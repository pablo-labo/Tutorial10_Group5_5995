package defpackage;

import com.facebook.react.views.view.WindowUtilKt;

/* JADX INFO: loaded from: classes3.dex */
public final class mf4 {
    public static final boolean a;

    static {
        boolean z;
        if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            z = true;
        } else {
            try {
                Class.forName("com.zoontek.rnedgetoedge.EdgeToEdgePackage");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
        }
        a = z;
    }
}
