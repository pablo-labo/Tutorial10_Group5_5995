package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class lha implements lx1 {
    public final wxf a;
    public gu5<? extends List<? extends p7g>> b;
    public final lha c;
    public final rxf d;
    public final Lazy e;

    public lha() {
        throw null;
    }

    public lha(wxf wxfVar, gu5<? extends List<? extends p7g>> gu5Var, lha lhaVar, rxf rxfVar) {
        wxfVar.getClass();
        this.a = wxfVar;
        this.b = gu5Var;
        this.c = lhaVar;
        this.d = rxfVar;
        this.e = boa.E(qt8.b, new h14(this, 4));
    }

    @Override // defpackage.kwf
    public final Collection b() {
        Collection collection = (List) this.e.getValue();
        if (collection == null) {
            collection = zr4.a;
        }
        return collection;
    }

    @Override // defpackage.lx1
    public final wxf c() {
        return this.a;
    }

    @Override // defpackage.kwf
    public final v62 d() {
        return null;
    }

    @Override // defpackage.kwf
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lha.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        lha lhaVar = (lha) obj;
        lha lhaVar2 = this.c;
        if (lhaVar2 != null) {
            this = lhaVar2;
        }
        lha lhaVar3 = lhaVar.c;
        if (lhaVar3 != null) {
            obj = lhaVar3;
        }
        return this == obj;
    }

    @Override // defpackage.kwf
    public final List<rxf> getParameters() {
        return zr4.a;
    }

    public final int hashCode() {
        lha lhaVar = this.c;
        return lhaVar != null ? lhaVar.hashCode() : super.hashCode();
    }

    @Override // defpackage.kwf
    public final ei8 l() {
        ui8 type = this.a.getType();
        type.getClass();
        return boa.t(type);
    }

    public final String toString() {
        return "CapturedType(" + this.a + ')';
    }

    public /* synthetic */ lha(wxf wxfVar, i14 i14Var, rxf rxfVar, int i) {
        this(wxfVar, (i & 2) != 0 ? null : i14Var, (lha) null, (i & 8) != 0 ? null : rxfVar);
    }
}
