package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hjd<T> extends pu2 implements wi5<T> {
    public final v03 collectContext;
    public final int collectContextSize;
    public final wi5<T> collector;
    private lu2<? super j6g> completion_;
    private v03 lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public hjd(wi5<? super T> wi5Var, v03 v03Var) {
        super(hia.a, vr4.a);
        this.collector = wi5Var;
        this.collectContext = v03Var;
        this.collectContextSize = ((Number) v03Var.j1(0, new jm0(14))).intValue();
    }

    @Override // defpackage.wi5
    public final Object a(T t, lu2<? super j6g> lu2Var) {
        try {
            Object objK = k(lu2Var, t);
            return objK == g13.a ? objK : j6g.a;
        } catch (Throwable th) {
            this.lastEmissionContext = new i94(lu2Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.x81, defpackage.h13
    public final h13 getCallerFrame() {
        lu2<? super j6g> lu2Var = this.completion_;
        if (lu2Var instanceof h13) {
            return (h13) lu2Var;
        }
        return null;
    }

    @Override // defpackage.pu2, defpackage.lu2
    public final v03 getContext() {
        v03 v03Var = this.lastEmissionContext;
        return v03Var == null ? vr4.a : v03Var;
    }

    @Override // defpackage.x81
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Throwable thA = o7d.a(obj);
        if (thA != null) {
            this.lastEmissionContext = new i94(getContext(), thA);
        }
        lu2<? super j6g> lu2Var = this.completion_;
        if (lu2Var != null) {
            lu2Var.resumeWith(obj);
        }
        return g13.a;
    }

    public final Object k(lu2<? super j6g> lu2Var, T t) {
        v03 context = lu2Var.getContext();
        u63.u(context);
        v03 v03Var = this.lastEmissionContext;
        if (v03Var != context) {
            if (v03Var instanceof i94) {
                throw new IllegalStateException(sve.w("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i94) v03Var).b + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.j1(0, new b52(this, 8))).intValue() != this.collectContextSize) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.collectContext + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.lastEmissionContext = context;
        }
        this.completion_ = lu2Var;
        wu5<wi5<Object>, Object, lu2<? super j6g>, Object> wu5Var = ijd.a;
        wi5<T> wi5Var = this.collector;
        wi5Var.getClass();
        Object objQ = wu5Var.q(wi5Var, t, this);
        if (!wl7.b(objQ, g13.a)) {
            this.completion_ = null;
        }
        return objQ;
    }
}
