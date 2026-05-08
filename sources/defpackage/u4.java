package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u4 implements kwf {
    public final /* synthetic */ v4 a;

    public u4(v4 v4Var) {
        this.a = v4Var;
    }

    @Override // defpackage.kwf
    public final Collection<ui8> b() {
        Collection<ui8> collectionB = ((s14) this.a).t0().M0().b();
        collectionB.getClass();
        return collectionB;
    }

    @Override // defpackage.kwf
    public final v62 d() {
        return this.a;
    }

    @Override // defpackage.kwf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kwf
    public final List<rxf> getParameters() {
        return this.a.L0();
    }

    @Override // defpackage.kwf
    public final ei8 l() {
        return b04.e(this.a);
    }

    public final String toString() {
        return "[typealias " + this.a.getName().c() + ']';
    }
}
