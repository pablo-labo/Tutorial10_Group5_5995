package defpackage;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ox0 {
    public static final ox0 h = new ox0(0, 0, 1, 1, 0, false);
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public c g;

    public static final class a {
        @SuppressLint({"WrongConstant"})
        public static void a(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    public static final class b {
        public static void a(AudioAttributes.Builder builder, boolean z) {
            builder.setIsContentSpatialized(z);
        }

        @SuppressLint({"WrongConstant"})
        public static void b(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    public static final class c {
        public final AudioAttributes a;

        public c(ox0 ox0Var) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(ox0Var.a).setFlags(ox0Var.b).setUsage(ox0Var.c);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                a.a(usage, ox0Var.d);
            }
            if (i >= 32) {
                b.b(usage, ox0Var.e);
                b.a(usage, ox0Var.f);
            }
            this.a = usage.build();
        }
    }

    static {
        String str = vjg.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
    }

    public ox0(int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = z;
    }

    public static ox0 a(Bundle bundle) {
        String str = i;
        int i2 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = j;
        int i3 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = k;
        int i4 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = l;
        int i5 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = m;
        int i6 = bundle.containsKey(str5) ? bundle.getInt(str5) : 0;
        String str6 = n;
        return new ox0(i2, i3, i4, i5, i6, bundle.containsKey(str6) ? bundle.getBoolean(str6) : false);
    }

    public final c b() {
        if (this.g == null) {
            this.g = new c(this);
        }
        return this.g;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(i, this.a);
        bundle.putInt(j, this.b);
        bundle.putInt(k, this.c);
        bundle.putInt(l, this.d);
        bundle.putInt(m, this.e);
        bundle.putBoolean(n, this.f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ox0.class == obj.getClass()) {
            ox0 ox0Var = (ox0) obj;
            if (this.a == ox0Var.a && this.b == ox0Var.b && this.c == ox0Var.c && this.d == ox0Var.d && this.e == ox0Var.e && this.f == ox0Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0);
    }
}
