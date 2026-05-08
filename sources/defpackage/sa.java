package defpackage;

import defpackage.vb;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ sa(iba ibaVar, int i) {
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
                sb sbVar = new sb();
                ibaVar.b(sbVar);
                return new vb.a(ibaVar, sbVar);
            default:
                m74Var.getClass();
                qc qcVar = new qc(0);
                ibaVar.b(qcVar);
                return new xc(ibaVar, qcVar);
        }
    }
}
