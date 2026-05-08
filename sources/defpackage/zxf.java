package defpackage;

import com.datadog.android.core.internal.CoreFeature;
import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zxf implements zf8 {
    public final oe8 a;
    public final List<gg8> b;
    public final int c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ig8.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public zxf(oe8 oe8Var, List<gg8> list, boolean z) {
        oe8Var.getClass();
        list.getClass();
        this.a = oe8Var;
        this.b = list;
        this.c = z ? 1 : 0;
    }

    @Override // defpackage.zf8
    public final oe8 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zxf)) {
            return false;
        }
        zxf zxfVar = (zxf) obj;
        return wl7.b(this.a, zxfVar.a) && wl7.b(this.b, zxfVar.b) && this.c == zxfVar.c;
    }

    @Override // defpackage.zf8
    public final List<gg8> g() {
        return this.b;
    }

    @Override // defpackage.td8
    public final List<Annotation> getAnnotations() {
        return zr4.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ia.g(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.zf8
    public final boolean i() {
        return (this.c & 1) != 0;
    }

    public final String j(boolean z) {
        String name;
        oe8 oe8Var = this.a;
        yd8 yd8Var = oe8Var instanceof yd8 ? (yd8) oe8Var : null;
        Class clsP = yd8Var != null ? jh2.p(yd8Var) : null;
        if (clsP == null) {
            name = oe8Var.toString();
        } else if (clsP.isArray()) {
            name = clsP.equals(boolean[].class) ? "kotlin.BooleanArray" : clsP.equals(char[].class) ? "kotlin.CharArray" : clsP.equals(byte[].class) ? "kotlin.ByteArray" : clsP.equals(short[].class) ? "kotlin.ShortArray" : clsP.equals(int[].class) ? "kotlin.IntArray" : clsP.equals(float[].class) ? "kotlin.FloatArray" : clsP.equals(long[].class) ? "kotlin.LongArray" : clsP.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else if (z && clsP.isPrimitive()) {
            oe8Var.getClass();
            name = jh2.q((yd8) oe8Var).getName();
        } else {
            name = clsP.getName();
        }
        List<gg8> list = this.b;
        return z3.m(name, list.isEmpty() ? "" : z92.W0(list, ", ", "<", ">", new lt(this), 24), i() ? CoreFeature.DEFAULT_APP_VERSION : "");
    }

    public final String toString() {
        return j(false).concat(" (Kotlin reflection is not available)");
    }
}
