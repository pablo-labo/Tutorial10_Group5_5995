package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class v64<T> extends x64<T> implements h13, lu2<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater W = AtomicReferenceFieldUpdater.newUpdater(v64.class, Object.class, "_reusableCancellableContinuation$volatile");
    public final Object V;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final y03 d;
    public final pu2 e;
    public Object f;

    public v64(y03 y03Var, pu2 pu2Var) {
        super(-1);
        this.d = y03Var;
        this.e = pu2Var;
        this.f = mh2.V;
        this.V = rkf.b(pu2Var.getContext());
    }

    @Override // defpackage.x64
    public final lu2<T> c() {
        return this;
    }

    @Override // defpackage.h13
    public final h13 getCallerFrame() {
        pu2 pu2Var = this.e;
        if (pu2Var != null) {
            return pu2Var;
        }
        return null;
    }

    @Override // defpackage.lu2
    public final v03 getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.x64
    public final Object i() {
        Object obj = this.f;
        this.f = mh2.V;
        return obj;
    }

    @Override // defpackage.lu2
    public final void resumeWith(Object obj) {
        v03 context;
        Object objC;
        Throwable thA = o7d.a(obj);
        Object rf2Var = thA == null ? obj : new rf2(thA, false);
        pu2 pu2Var = this.e;
        v03 context2 = pu2Var.getContext();
        y03 y03Var = this.d;
        if (mh2.z(y03Var, context2)) {
            this.f = rf2Var;
            this.c = 0;
            mh2.y(y03Var, pu2Var.getContext(), this);
            return;
        }
        d05 d05VarA = ukf.a();
        if (d05VarA.c >= 4294967296L) {
            this.f = rf2Var;
            this.c = 0;
            d05VarA.L1(this);
            return;
        }
        d05VarA.O1(true);
        try {
            context = pu2Var.getContext();
            objC = rkf.c(context, this.V);
        } finally {
            try {
            } finally {
            }
        }
        try {
            pu2Var.resumeWith(obj);
            j6g j6gVar = j6g.a;
            while (d05VarA.S1()) {
            }
        } finally {
            rkf.a(context, objC);
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + pi3.l(this.e) + ']';
    }
}
