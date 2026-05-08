package defpackage;

import defpackage.yn4;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class on4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ on4(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        iba ibaVar = this.b;
        m74 m74Var = (m74) obj;
        switch (i) {
            case 0:
                m74Var.getClass();
                qc qcVar = new qc(2);
                ibaVar.b(qcVar);
                return new yn4.e(ibaVar, qcVar);
            default:
                m74Var.getClass();
                p99 p99Var = new p99();
                ibaVar.b(p99Var);
                return new z99(ibaVar, p99Var);
        }
    }
}
