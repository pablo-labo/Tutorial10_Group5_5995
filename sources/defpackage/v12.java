package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class v12<T> extends z12<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(v12.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final dsc<T> d;
    public final boolean e;

    public /* synthetic */ v12(dsc dscVar, boolean z) {
        this(dscVar, z, vr4.a, -3, eo1.a);
    }

    @Override // defpackage.z12, defpackage.vi5
    public final Object e(wi5<? super T> wi5Var, lu2<? super j6g> lu2Var) {
        int i = this.b;
        g13 g13Var = g13.a;
        if (i != -3) {
            Object objE = super.e(wi5Var, lu2Var);
            return objE == g13Var ? objE : j6g.a;
        }
        boolean z = this.e;
        if (z && f.getAndSet(this, 1) == 1) {
            r6.g("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        Object objA = hj5.a(wi5Var, this.d, z, lu2Var);
        return objA == g13Var ? objA : j6g.a;
    }

    @Override // defpackage.z12
    public final String g() {
        return "channel=" + this.d;
    }

    @Override // defpackage.z12
    public final Object j(upb<? super T> upbVar, lu2<? super j6g> lu2Var) {
        Object objA = hj5.a(new q6e(upbVar), this.d, this.e, lu2Var);
        return objA == g13.a ? objA : j6g.a;
    }

    @Override // defpackage.z12
    public final z12<T> k(v03 v03Var, int i, eo1 eo1Var) {
        return new v12(this.d, this.e, v03Var, i, eo1Var);
    }

    @Override // defpackage.z12
    public final vi5<T> l() {
        return new v12(this.d, this.e);
    }

    @Override // defpackage.z12
    public final dsc<T> m(e13 e13Var) {
        if (!this.e || f.getAndSet(this, 1) != 1) {
            return this.b == -3 ? this.d : super.m(e13Var);
        }
        r6.g("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v12(dsc<? extends T> dscVar, boolean z, v03 v03Var, int i, eo1 eo1Var) {
        super(v03Var, i, eo1Var);
        this.d = dscVar;
        this.e = z;
    }
}
