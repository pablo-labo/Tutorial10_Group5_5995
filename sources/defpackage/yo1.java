package defpackage;

import defpackage.wf8;

/* JADX INFO: loaded from: classes3.dex */
public final class yo1 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ yo1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zo1 zo1Var = (zo1) obj;
                return zo1Var.a.j(zo1Var.b).o();
            case 1:
                v04 v04Var = (v04) obj;
                u4c u4cVar = v04Var.e;
                if (u4cVar.L0()) {
                    v62 v62VarD = v04Var.K0().d(q8a.b(v04Var.a0.b, u4cVar.k0()), dia.V);
                    if (v62VarD instanceof t52) {
                        return (t52) v62VarD;
                    }
                }
                return null;
            default:
                return new wf8.a((wf8) obj);
        }
    }
}
