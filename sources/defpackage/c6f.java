package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc6f;", "Lbrg;", "<init>", "()V", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c6f extends brg {
    public final b6f b = new b6f();
    public final b6f c = new b6f();
    public final b6f d = new b6f();
    public final b6f e = new b6f();
    public final b6f f = new b6f();
    public final b6f V = new b6f();
    public final b6f W = new b6f();
    public final b6f X = new b6f();
    public final b6f Y = new b6f();
    public final b6f Z = new b6f();
    public final b6f a0 = new b6f();
    public final b6f b0 = new b6f();

    public final void g(xj1 xj1Var, gq6 gq6Var) {
        xj1Var.getClass();
        ArrayList arrayList = lz2.a;
        lz2.d("TabEventManagerViewModel", xj1Var + ": fireResetToInitialStateTabEvent", false, null);
        b6f b6fVarL = l(xj1Var);
        b6fVarL.getClass();
        b6fVarL.f.k(new jz2<>(new u4d(gq6Var)));
    }

    public final void h(xj1 xj1Var) {
        xj1Var.getClass();
        ArrayList arrayList = lz2.a;
        lz2.d("TabEventManagerViewModel", xj1Var + ": fireStartInitialLoadEvent", false, null);
        l(xj1Var).d.k(new jz2<>(new nre()));
    }

    public final void i(xj1 xj1Var) {
        xj1Var.getClass();
        ArrayList arrayList = lz2.a;
        lz2.d("TabEventManagerViewModel", xj1Var + ": fireTabFocusEvent", false, null);
        l(xj1Var).a.k(new jz2<>(new d6f()));
    }

    public final void j(xj1 xj1Var) {
        xj1Var.getClass();
        ArrayList arrayList = lz2.a;
        lz2.d("TabEventManagerViewModel", xj1Var + ": fireTabLeaveEvent", false, null);
        l(xj1Var).b.k(new jz2<>(new i6f()));
    }

    public final void k(xj1 xj1Var, boolean z, prd prdVar) {
        xj1Var.getClass();
        l(xj1Var).a(z, prdVar);
        ArrayList arrayList = lz2.a;
        lz2.d("TabEventManagerViewModel", xj1Var + ": fireTabScrolledEvent", false, null);
    }

    public final b6f l(xj1 xj1Var) {
        xj1Var.getClass();
        switch (xj1Var.ordinal()) {
            case 0:
                return this.b;
            case 1:
                return this.c;
            case 2:
                return this.d;
            case 3:
                return this.e;
            case 4:
                return this.f;
            case 5:
                return this.b0;
            case 6:
                return this.V;
            case 7:
                return this.W;
            case 8:
                return this.X;
            case DatadogLogGenerator.CRASH /* 9 */:
                return this.Y;
            case 10:
                return this.Z;
            case 11:
                return this.a0;
            default:
                l.g();
                return null;
        }
    }
}
