package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class op8 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ op8(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((qp8) obj3).b.a.h.a((bv7) obj2, (d4c) ((luc) obj).element);
                return null;
            default:
                gn9 gn9Var = (gn9) obj3;
                h04 h04Var = gn9Var.a;
                s5c s5cVarA = gn9Var.a(h04Var.c);
                s5cVarA.getClass();
                re0<af0, up2<?>> re0Var = h04Var.a.e;
                ui8 returnType = ((q14) obj).getReturnType();
                returnType.getClass();
                return re0Var.j(s5cVarA, (g5c) obj2, returnType);
        }
    }
}
