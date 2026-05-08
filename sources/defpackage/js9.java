package defpackage;

import defpackage.oj9;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class js9 {
    public final a[] a;
    public final long b;

    public interface a {
        default androidx.media3.common.a a() {
            return null;
        }

        default void b(oj9.a aVar) {
        }

        default byte[] c() {
            return null;
        }
    }

    public js9() {
        throw null;
    }

    public js9(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    public final js9 a(a... aVarArr) {
        if (aVarArr.length == 0) {
            return this;
        }
        String str = vjg.a;
        a[] aVarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(aVarArr2, aVarArr2.length + aVarArr.length);
        System.arraycopy(aVarArr, 0, objArrCopyOf, aVarArr2.length, aVarArr.length);
        return new js9(this.b, (a[]) objArrCopyOf);
    }

    public final js9 b(js9 js9Var) {
        return js9Var == null ? this : a(js9Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && js9.class == obj.getClass()) {
            js9 js9Var = (js9) obj;
            if (Arrays.equals(this.a, js9Var.a) && this.b == js9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return u59.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public js9(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public js9(long j, a... aVarArr) {
        this.b = j;
        this.a = aVarArr;
    }
}
