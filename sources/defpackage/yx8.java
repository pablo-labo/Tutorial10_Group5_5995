package defpackage;

import defpackage.hmb;

/* JADX INFO: loaded from: classes.dex */
public final class yx8<T> implements wi5 {
    public final /* synthetic */ p3a<ci7> a;
    public final /* synthetic */ zx8 b;

    public yx8(p3a<ci7> p3aVar, zx8 zx8Var) {
        this.a = p3aVar;
        this.b = zx8Var;
    }

    @Override // defpackage.wi5
    public final Object a(Object obj, lu2 lu2Var) {
        ci7 ci7Var = (ci7) obj;
        boolean z = ci7Var instanceof hk6;
        p3a<ci7> p3aVar = this.a;
        if (z || (ci7Var instanceof zl5) || (ci7Var instanceof hmb.b)) {
            p3aVar.g(ci7Var);
        } else if (ci7Var instanceof ik6) {
            p3aVar.j(((ik6) ci7Var).a);
        } else if (ci7Var instanceof am5) {
            p3aVar.j(((am5) ci7Var).a);
        } else if (ci7Var instanceof hmb.c) {
            p3aVar.j(((hmb.c) ci7Var).a);
        } else if (ci7Var instanceof hmb.a) {
            p3aVar.j(((hmb.a) ci7Var).a);
        }
        Object[] objArr = p3aVar.a;
        int i = p3aVar.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zx8 zx8Var = this.b;
            if (i2 >= i) {
                ((dme) zx8Var.b).h(i3);
                return j6g.a;
            }
            ci7 ci7Var2 = (ci7) objArr[i2];
            if (ci7Var2 instanceof hk6) {
                zx8Var.getClass();
                i3 |= 2;
            } else if (ci7Var2 instanceof zl5) {
                zx8Var.getClass();
                i3 |= 1;
            } else if (ci7Var2 instanceof hmb.b) {
                zx8Var.getClass();
                i3 |= 4;
            }
            i2++;
        }
    }
}
