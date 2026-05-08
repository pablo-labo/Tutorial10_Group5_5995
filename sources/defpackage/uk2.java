package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.k;
import androidx.navigation.p;
import androidx.navigation.s;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@s.b("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Luk2;", "Landroidx/navigation/s;", "Luk2$a;", "<init>", "()V", "a", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class uk2 extends s<a> {
    public final g4a<Boolean> c = r.f(Boolean.FALSE);

    public static final class a extends k {
        public final xu5<bd0, d, b, Integer, j6g> a0;
        public hs b0;
        public iq0 c0;
        public vg d0;
        public kd e0;

        public a(uk2 uk2Var, ah2 ah2Var) {
            super(uk2Var);
            this.a0 = ah2Var;
        }
    }

    @Override // androidx.navigation.s
    public final k a() {
        return new a(this, wh2.a);
    }

    @Override // androidx.navigation.s
    public final void d(List list, p pVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().h((d) it.next());
        }
        ((gme) this.c).setValue(Boolean.FALSE);
    }

    @Override // androidx.navigation.s
    public final void i(d dVar, boolean z) {
        b().e(dVar, z);
        ((gme) this.c).setValue(Boolean.TRUE);
    }
}
