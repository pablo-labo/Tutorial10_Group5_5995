package defpackage;

import defpackage.c7e;
import defpackage.mnf;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fy3 {

    public static final class a {
        public final en6 a;
        public final int b;
        public final int c;
        public boolean d;
        public boolean e;
        public final char f;
        public int g;

        public a(en6 en6Var, int i, int i2, boolean z, boolean z2, char c) {
            en6Var.getClass();
            this.a = en6Var;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = z2;
            this.f = c;
            this.g = -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            return Integer.hashCode(this.g) + ((Character.hashCode(this.f) + ia.f(ia.f(w40.c(this.c, w40.c(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Info(tokenType=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append(", length=");
            sb.append(this.c);
            sb.append(", canOpen=");
            sb.append(this.d);
            sb.append(", canClose=");
            sb.append(this.e);
            sb.append(", marker=");
            sb.append(this.f);
            sb.append(", closerIndex=");
            return k6.h(sb, this.g, ')');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.Pair a(defpackage.uu8 r6, mnf.a r7, mnf.a r8, boolean r9) {
        /*
            r7.getClass()
            r8.getClass()
            r6 = 1
            boolean r0 = c(r8, r6)
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L23
            boolean r0 = b(r8, r6)
            if (r0 == 0) goto L21
            boolean r0 = c(r7, r2)
            if (r0 != 0) goto L21
            boolean r0 = b(r7, r2)
            if (r0 == 0) goto L23
        L21:
            r0 = r6
            goto L24
        L23:
            r0 = r1
        L24:
            char r3 = r7.b(r2)
            mnf r4 = defpackage.mnf.this
            knf r5 = r7.e(r1)
            int r5 = r5.b
            char r4 = r4.e(r5)
            if (r3 == r4) goto L50
            boolean r3 = c(r7, r2)
            if (r3 != 0) goto L50
            boolean r3 = b(r7, r2)
            if (r3 == 0) goto L4e
            boolean r3 = c(r8, r6)
            if (r3 != 0) goto L4e
            boolean r3 = b(r8, r6)
            if (r3 == 0) goto L50
        L4e:
            r3 = r6
            goto L51
        L50:
            r3 = r1
        L51:
            r4 = 1676673024(0x63f00000, float:8.854437E21)
            java.lang.String r5 = "$^`"
            if (r9 == 0) goto L59
            r7 = r0
            goto L73
        L59:
            if (r0 == 0) goto L72
            if (r3 == 0) goto L70
            char r7 = r7.b(r2)
            boolean r2 = defpackage.zve.M(r5, r7)
            if (r2 != 0) goto L70
            int r7 = java.lang.Character.getType(r7)
            int r7 = r4 >> r7
            r7 = r7 & r6
            if (r7 == 0) goto L72
        L70:
            r7 = r6
            goto L73
        L72:
            r7 = r1
        L73:
            if (r9 == 0) goto L77
            r6 = r3
            goto L90
        L77:
            if (r3 == 0) goto L8f
            if (r0 == 0) goto L90
            char r8 = r8.b(r6)
            boolean r9 = defpackage.zve.M(r5, r8)
            if (r9 != 0) goto L90
            int r8 = java.lang.Character.getType(r8)
            int r8 = r4 >> r8
            r8 = r8 & r6
            if (r8 == 0) goto L8f
            goto L90
        L8f:
            r6 = r1
        L90:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r7, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy3.a(uu8, mnf$a, mnf$a, boolean):kotlin.Pair");
    }

    public static boolean b(mnf.a aVar, int i) {
        aVar.getClass();
        char cB = aVar.b(i);
        return zve.M("$^`", cB) || ((1676673024 >> Character.getType(cB)) & 1) != 0;
    }

    public static boolean c(mnf.a aVar, int i) {
        aVar.getClass();
        char cB = aVar.b(i);
        return cB == 0 || Character.isSpaceChar(cB) || ypd.E(cB);
    }

    public abstract void d(uu8 uu8Var, mnf.b bVar, ArrayList arrayList, c7e.b bVar2);

    public abstract int e(uu8 uu8Var, mnf.a aVar, ArrayList arrayList);
}
