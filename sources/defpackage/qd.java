package defpackage;

import defpackage.je;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ qd(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        iba ibaVar = this.b;
        m74 m74Var = (m74) obj;
        switch (i) {
            case 0:
                m74Var.getClass();
                de deVar = new de(i2);
                ibaVar.b(deVar);
                return new je.a(ibaVar, deVar);
            default:
                m74Var.getClass();
                qc qcVar = new qc(1);
                ibaVar.b(qcVar);
                return new ev(i2, ibaVar, qcVar);
        }
    }
}
