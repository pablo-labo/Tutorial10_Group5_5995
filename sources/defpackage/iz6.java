package defpackage;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class iz6 {
    public static final iz6 a;
    public static final iz6 b;
    public static final iz6 c;
    public static final iz6 d;
    public static final iz6 e;
    public static final /* synthetic */ iz6[] f;

    static {
        iz6 iz6Var = new iz6("Contrast", 0);
        a = iz6Var;
        iz6 iz6Var2 = new iz6(ReactProgressBarViewManager.DEFAULT_STYLE, 1);
        b = iz6Var2;
        iz6 iz6Var3 = new iz6("Secondary", 2);
        c = iz6Var3;
        iz6 iz6Var4 = new iz6("Alert", 3);
        d = iz6Var4;
        iz6 iz6Var5 = new iz6("Success", 4);
        e = iz6Var5;
        f = new iz6[]{iz6Var, iz6Var2, iz6Var3, iz6Var4, iz6Var5};
    }

    public iz6() {
        throw null;
    }

    public static iz6 valueOf(String str) {
        return (iz6) Enum.valueOf(iz6.class, str);
    }

    public static iz6[] values() {
        return (iz6[]) f.clone();
    }
}
