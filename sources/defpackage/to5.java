package defpackage;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.core.internal.system.DefaultAndroidInfoProvider;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class to5 implements Comparable<to5> {
    public static final to5 V;
    public static final to5 W;
    public static final to5 X;
    public static final to5 Y;
    public static final to5 Z;
    public static final to5 a0;
    public static final to5 b;
    public static final to5 b0;
    public static final to5 c;
    public static final to5 c0;
    public static final to5 d;
    public static final to5 d0;
    public static final to5 e;
    public static final to5 e0;
    public static final to5 f;
    public static final List<to5> f0;
    public final int a;

    static {
        to5 to5Var = new to5(100);
        b = to5Var;
        to5 to5Var2 = new to5(UiRumDebugListener.DEFAULT_ALPHA);
        c = to5Var2;
        to5 to5Var3 = new to5(300);
        d = to5Var3;
        to5 to5Var4 = new to5(DataOkHttpUploader.HTTP_BAD_REQUEST);
        e = to5Var4;
        to5 to5Var5 = new to5(500);
        f = to5Var5;
        to5 to5Var6 = new to5(600);
        V = to5Var6;
        to5 to5Var7 = new to5(700);
        W = to5Var7;
        to5 to5Var8 = new to5(DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP);
        X = to5Var8;
        to5 to5Var9 = new to5(900);
        Y = to5Var9;
        Z = to5Var;
        a0 = to5Var3;
        b0 = to5Var4;
        c0 = to5Var5;
        d0 = to5Var7;
        e0 = to5Var9;
        f0 = u63.a0(to5Var, to5Var2, to5Var3, to5Var4, to5Var5, to5Var6, to5Var7, to5Var8, to5Var9);
    }

    public to5(int i) {
        this.a = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        be7.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(to5 to5Var) {
        return wl7.c(this.a, to5Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof to5) {
            return this.a == ((to5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return k6.h(new StringBuilder("FontWeight(weight="), this.a, ')');
    }
}
