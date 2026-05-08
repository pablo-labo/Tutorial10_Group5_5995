package defpackage;

import androidx.navigation.d;
import androidx.navigation.k;
import androidx.navigation.p;
import androidx.navigation.s;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@s.b("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ln44;", "Landroidx/navigation/s;", "Ln44$a;", "<init>", "()V", "a", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n44 extends s<a> {

    public static final class a extends k implements ui5 {
        public final o44 a0;
        public final ah2 b0;

        public a() {
            throw null;
        }

        public a(n44 n44Var) {
            ah2 ah2Var = fi2.a;
            o44 o44Var = new o44(7);
            super(n44Var);
            this.a0 = o44Var;
            this.b0 = ah2Var;
        }
    }

    @Override // androidx.navigation.s
    public final k a() {
        ah2 ah2Var = fi2.a;
        return new a(this);
    }

    @Override // androidx.navigation.s
    public final void d(List list, p pVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().g((d) it.next());
        }
    }

    @Override // androidx.navigation.s
    public final void i(d dVar, boolean z) {
        b().e(dVar, z);
        int iS0 = z92.S0((Iterable) b().f.a.getValue(), dVar);
        int i = 0;
        for (Object obj : (Iterable) b().f.a.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                u63.o0();
                throw null;
            }
            d dVar2 = (d) obj;
            if (i > iS0) {
                b().b(dVar2);
            }
            i = i2;
        }
    }
}
