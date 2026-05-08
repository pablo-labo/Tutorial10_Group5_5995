package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wp8 extends v2 {
    public final mp8 Z;
    public final pw7 a0;

    /* JADX WARN: Illegal instructions before constructor call */
    public wp8(mp8 mp8Var, pw7 pw7Var, int i, cj3 cj3Var) {
        pw7Var.getClass();
        sv7 sv7Var = mp8Var.a;
        super(sv7Var.a, cj3Var, new zo8(mp8Var, pw7Var, false), pw7Var.getName(), ylg.INVARIANT, false, i, sv7Var.m);
        this.Z = mp8Var;
        this.a0 = pw7Var;
    }

    @Override // defpackage.e5
    public final List<ui8> L0(List<? extends ui8> list) {
        wp8 wp8Var;
        bfe bfeVar;
        ui8 ui8Var;
        ui8 ui8VarB;
        mp8 mp8Var = this.Z;
        bfe bfeVar2 = mp8Var.a.r;
        bfeVar2.getClass();
        List<? extends ui8> list2 = list;
        ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
        for (ui8 ui8Var2 : list2) {
            z32 z32Var = z32.d;
            ui8Var2.getClass();
            if (kyf.c(ui8Var2, z32Var, null)) {
                wp8Var = this;
                bfeVar = bfeVar2;
                ui8Var = ui8Var2;
            } else {
                wp8Var = this;
                bfeVar = bfeVar2;
                ui8Var = ui8Var2;
                ui8VarB = bfeVar.b(new dfe(wp8Var, false, mp8Var, ef0.TYPE_PARAMETER_BOUNDS, false), ui8Var, zr4.a, null, false);
                if (ui8VarB == null) {
                }
                arrayList.add(ui8VarB);
                this = wp8Var;
                bfeVar2 = bfeVar;
            }
            ui8VarB = ui8Var;
            arrayList.add(ui8VarB);
            this = wp8Var;
            bfeVar2 = bfeVar;
        }
        return arrayList;
    }

    @Override // defpackage.e5
    public final void M0(ui8 ui8Var) {
        ui8Var.getClass();
    }

    @Override // defpackage.e5
    public final List<ui8> N0() {
        Collection<tu7> upperBounds = this.a0.getUpperBounds();
        boolean zIsEmpty = upperBounds.isEmpty();
        mp8 mp8Var = this.Z;
        if (zIsEmpty) {
            return u63.Z(yi8.a(mp8Var.a.o.l().e(), mp8Var.a.o.l().p()));
        }
        Collection<tu7> collection = upperBounds;
        ArrayList arrayList = new ArrayList(t92.r0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(mp8Var.d.d((tu7) it.next(), wab.A(jyf.b, false, this, 3)));
        }
        return arrayList;
    }
}
