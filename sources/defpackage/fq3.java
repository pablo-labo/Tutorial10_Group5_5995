package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class fq3 implements fod {
    public static final Logger f = Logger.getLogger(etf.class.getName());
    public final p3h a;
    public final Executor b;
    public final k71 c;
    public final q05 d;
    public final c2f e;

    public fq3(Executor executor, k71 k71Var, p3h p3hVar, q05 q05Var, c2f c2fVar) {
        this.b = executor;
        this.c = k71Var;
        this.a = p3hVar;
        this.d = q05Var;
        this.e = c2fVar;
    }

    @Override // defpackage.fod
    public final void a(v31 v31Var, y21 y21Var, htf htfVar) {
        this.b.execute(new cq3(this, v31Var, htfVar, y21Var));
    }
}
