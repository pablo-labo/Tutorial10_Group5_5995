package defpackage;

import android.net.Uri;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.ij9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ba {
    public static final ba f = new ba(new a[0], 0, -9223372036854775807L, 0);
    public static final a g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final a[] e;

    public static final class a {
        public static final String l;
        public static final String m;
        public static final String n;
        public static final String o;
        public static final String p;
        public static final String q;
        public static final String r;
        public static final String s;
        public static final String t;
        public static final String u;
        public static final String v;
        public final long a;
        public final int b;
        public final int c;

        @Deprecated
        public final Uri[] d;
        public final ij9[] e;
        public final int[] f;
        public final long[] g;
        public final String[] h;
        public final long i;
        public final boolean j;
        public final boolean k;

        static {
            String str = vjg.a;
            l = Integer.toString(0, 36);
            m = Integer.toString(1, 36);
            n = Integer.toString(2, 36);
            o = Integer.toString(3, 36);
            p = Integer.toString(4, 36);
            q = Integer.toString(5, 36);
            r = Integer.toString(6, 36);
            s = Integer.toString(7, 36);
            t = Integer.toString(8, 36);
            u = Integer.toString(9, 36);
            v = Integer.toString(10, 36);
        }

        public a(long j, int i, int i2, int[] iArr, ij9[] ij9VarArr, long[] jArr, long j2, boolean z, String[] strArr, boolean z2) {
            Uri uri;
            int i3 = 0;
            ka2.l(iArr.length == ij9VarArr.length);
            this.a = j;
            this.b = i;
            this.c = i2;
            this.f = iArr;
            this.e = ij9VarArr;
            this.g = jArr;
            this.i = j2;
            this.j = z;
            this.d = new Uri[ij9VarArr.length];
            while (true) {
                Uri[] uriArr = this.d;
                if (i3 >= uriArr.length) {
                    this.h = strArr;
                    this.k = z2;
                    return;
                }
                ij9 ij9Var = ij9VarArr[i3];
                if (ij9Var == null) {
                    uri = null;
                } else {
                    ij9.f fVar = ij9Var.b;
                    fVar.getClass();
                    uri = fVar.a;
                }
                uriArr[i3] = uri;
                i3++;
            }
        }

        public final int a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f;
                if (i3 >= iArr.length || this.j || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f) && Arrays.equals(this.g, aVar.g) && this.i == aVar.i && this.j == aVar.j && Arrays.equals(this.h, aVar.h) && this.k == aVar.k) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = ((this.b * 31) + this.c) * 31;
            long j = this.a;
            int iHashCode = (Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
            long j2 = this.i;
            return ((((((iHashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.j ? 1 : 0)) * 31) + Arrays.hashCode(this.h)) * 31) + (this.k ? 1 : 0);
        }
    }

    static {
        a aVar = new a(0L, -1, -1, new int[0], new ij9[0], new long[0], 0L, false, new String[0], false);
        int[] iArr = aVar.f;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.g;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        g = new a(aVar.a, 0, aVar.c, iArrCopyOf, (ij9[]) Arrays.copyOf(aVar.e, 0), jArrCopyOf, aVar.i, aVar.j, (String[]) Arrays.copyOf(aVar.h, 0), aVar.k);
        String str = vjg.a;
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public ba(a[] aVarArr, long j2, long j3, int i2) {
        this.b = j2;
        this.c = j3;
        this.a = aVarArr.length + i2;
        this.e = aVarArr;
        this.d = i2;
    }

    public final a a(int i2) {
        int i3 = this.d;
        return i2 < i3 ? g : this.e[i2 - i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ba.class != obj.getClass()) {
            return false;
        }
        ba baVar = (ba) obj;
        return this.a == baVar.a && this.b == baVar.b && this.c == baVar.c && this.d == baVar.d && Arrays.equals(this.e, baVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.e;
            if (i2 >= aVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(aVarArr[i2].a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < aVarArr[i2].f.length; i3++) {
                sb.append("ad(state=");
                int i4 = aVarArr[i2].f[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append(TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR);
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(aVarArr[i2].g[i3]);
                sb.append(')');
                if (i3 < aVarArr[i2].f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < aVarArr.length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }
}
