package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ymd extends mh8<bnd> {
    public final bnd h;

    public ymd(List<lh8<bnd>> list) {
        super(list);
        this.h = new bnd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z91
    public final Object f(lh8 lh8Var, float f) {
        T t;
        T t2 = lh8Var.b;
        if (t2 == 0 || (t = lh8Var.c) == 0) {
            r6.g("Missing values for keyframe.");
            return null;
        }
        bnd bndVar = (bnd) t2;
        bnd bndVar2 = (bnd) t;
        float fE = du9.e(bndVar.a, bndVar2.a, f);
        float fE2 = du9.e(bndVar.b, bndVar2.b, f);
        bnd bndVar3 = this.h;
        bndVar3.a = fE;
        bndVar3.b = fE2;
        return bndVar3;
    }
}
