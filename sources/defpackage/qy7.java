package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class qy7 extends d78 implements ae2 {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy7(ex7 ex7Var) {
        super(true);
        boolean z = true;
        K(ex7Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d78.b;
        d42 d42Var = (d42) atomicReferenceFieldUpdater.get(this);
        e42 e42Var = d42Var instanceof e42 ? (e42) d42Var : null;
        if (e42Var == null) {
            z = false;
            break;
        }
        d78 d78VarH = e42Var.h();
        while (!d78VarH.E()) {
            d42 d42Var2 = (d42) atomicReferenceFieldUpdater.get(d78VarH);
            e42 e42Var2 = d42Var2 instanceof e42 ? (e42) d42Var2 : null;
            if (e42Var2 == null) {
                z = false;
                break;
            }
            d78VarH = e42Var2.h();
        }
        this.c = z;
    }

    @Override // defpackage.d78
    public final boolean E() {
        return this.c;
    }

    @Override // defpackage.d78
    public final boolean F() {
        return true;
    }
}
