package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.qu2;
import defpackage.v03;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lpu2;", "Lx81;", "Llu2;", "", "completion", "Lv03;", "_context", "<init>", "(Llu2;Lv03;)V", "(Llu2;)V", "intercepted", "()Llu2;", "Lj6g;", "releaseIntercepted", "()V", "Lv03;", "Llu2;", "getContext", "()Lv03;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class pu2 extends x81 {
    private final v03 _context;
    private transient lu2<Object> intercepted;

    public pu2(lu2<Object> lu2Var) {
        this(lu2Var, lu2Var != null ? lu2Var.getContext() : null);
    }

    @Override // defpackage.lu2
    public v03 getContext() {
        v03 v03Var = this._context;
        v03Var.getClass();
        return v03Var;
    }

    public final lu2<Object> intercepted() {
        lu2<Object> lu2VarK0 = this.intercepted;
        if (lu2VarK0 == null) {
            qu2 qu2Var = (qu2) getContext().h1(qu2.a.a);
            lu2VarK0 = qu2Var != null ? qu2Var.K0(this) : this;
            this.intercepted = lu2VarK0;
        }
        return lu2VarK0;
    }

    @Override // defpackage.x81
    public void releaseIntercepted() {
        lu2<?> lu2Var = this.intercepted;
        if (lu2Var != null && lu2Var != this) {
            v03.a aVarH1 = getContext().h1(qu2.a.a);
            aVarH1.getClass();
            ((qu2) aVarH1).B0(lu2Var);
        }
        this.intercepted = qf2.a;
    }

    public pu2(lu2<Object> lu2Var, v03 v03Var) {
        super(lu2Var);
        this._context = v03Var;
    }
}
