package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zeb {
    public final r59<a> a = new r59<>((Object) null);

    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }
    }

    public final aj7 a(x7 x7Var, AndroidComposeView androidComposeView) {
        int i;
        long jP;
        long j;
        boolean z;
        List list = (List) x7Var.a;
        r59 r59Var = new r59(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            afb afbVar = (afb) list.get(i2);
            long j2 = afbVar.a;
            r59<a> r59Var2 = this.a;
            a aVarD = r59Var2.d(j2);
            if (aVarD == null) {
                i = i2;
                j = afbVar.b;
                jP = afbVar.d;
                z = false;
            } else {
                long j3 = aVarD.a;
                boolean z2 = aVarD.c;
                i = i2;
                jP = androidComposeView.p(aVarD.b);
                j = j3;
                z = z2;
            }
            long j4 = afbVar.a;
            List list2 = list;
            int i3 = size;
            r59Var.h(new yeb(j4, afbVar.b, afbVar.d, afbVar.e, afbVar.f, j, jP, z, afbVar.g, afbVar.i, afbVar.j, afbVar.k), j4);
            boolean z3 = afbVar.e;
            if (z3) {
                r59Var2.h(new a(afbVar.b, afbVar.c, z3), j2);
            } else {
                r59Var2.i(j2);
            }
            i2 = i + 1;
            list = list2;
            size = i3;
        }
        return new aj7(r59Var, x7Var);
    }
}
