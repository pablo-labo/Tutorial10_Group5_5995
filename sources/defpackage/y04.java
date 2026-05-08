package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y04 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ y04(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                v04 v04Var = (v04) obj2;
                return z92.z1(v04Var.a0.a.e.c(v04Var.l0, (z4c) obj));
            case 1:
                rc8 rc8Var = (rc8) obj2;
                yx9 yx9Var = rc8Var.g().a;
                nc8.d.getClass();
                return rc5.c(yx9Var, nc8.h, new cla((j29) obj, rc8Var.g().a)).o();
            default:
                h04 h04Var = ((gxf) obj2).a;
                return h04Var.a.e.a((j5c) obj, h04Var.b);
        }
    }
}
