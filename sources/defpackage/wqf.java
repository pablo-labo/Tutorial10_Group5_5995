package defpackage;

import defpackage.e47;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wqf {
    public static final wqf b;
    public static final String c;
    public final e47<a> a;

    public static final class a {
        public static final String f;
        public static final String g;
        public static final String h;
        public static final String i;
        public final int a;
        public final wpf b;
        public final boolean c;
        public final int[] d;
        public final boolean[] e;

        static {
            String str = vjg.a;
            f = Integer.toString(0, 36);
            g = Integer.toString(1, 36);
            h = Integer.toString(3, 36);
            i = Integer.toString(4, 36);
        }

        public a(wpf wpfVar, boolean z, int[] iArr, boolean[] zArr) {
            int i2 = wpfVar.a;
            this.a = i2;
            boolean z2 = false;
            ka2.l(i2 == iArr.length && i2 == zArr.length);
            this.b = wpfVar;
            if (z && i2 > 1) {
                z2 = true;
            }
            this.c = z2;
            this.d = (int[]) iArr.clone();
            this.e = (boolean[]) zArr.clone();
        }

        public final androidx.media3.common.a a(int i2) {
            return this.b.d[i2];
        }

        public final boolean b(int i2) {
            return this.d[i2] == 4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.c == aVar.c && this.b.equals(aVar.b) && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        e47.b bVar = e47.b;
        b = new wqf(qyc.e);
        String str = vjg.a;
        c = Integer.toString(0, 36);
    }

    public wqf(qyc qycVar) {
        this.a = e47.j(qycVar);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            e47<a> e47Var = this.a;
            if (i2 >= e47Var.size()) {
                return false;
            }
            a aVar = e47Var.get(i2);
            boolean[] zArr = aVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (aVar.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wqf.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((wqf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
