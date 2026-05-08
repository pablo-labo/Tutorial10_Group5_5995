package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mx1 implements lx1 {
    public final wxf a;
    public lha b;

    public mx1(wxf wxfVar) {
        wxfVar.getClass();
        this.a = wxfVar;
        wxfVar.c();
    }

    @Override // defpackage.kwf
    public final Collection<ui8> b() {
        wxf wxfVar = this.a;
        ui8 type = wxfVar.c() == ylg.OUT_VARIANCE ? wxfVar.getType() : l().p();
        type.getClass();
        return u63.Z(type);
    }

    @Override // defpackage.lx1
    public final wxf c() {
        return this.a;
    }

    @Override // defpackage.kwf
    public final /* bridge */ /* synthetic */ v62 d() {
        return null;
    }

    @Override // defpackage.kwf
    public final boolean e() {
        return false;
    }

    @Override // defpackage.kwf
    public final List<rxf> getParameters() {
        return zr4.a;
    }

    @Override // defpackage.kwf
    public final ei8 l() {
        ei8 ei8VarL = this.a.getType().M0().l();
        ei8VarL.getClass();
        return ei8VarL;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }
}
