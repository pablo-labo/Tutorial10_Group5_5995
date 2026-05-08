package defpackage;

import defpackage.hj4;
import defpackage.st;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class et implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ et(iba ibaVar, int i) {
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
                rt rtVar = new rt();
                ibaVar.b(rtVar);
                return new st.a(ibaVar, rtVar);
            default:
                m74Var.getClass();
                zq zqVar = new zq(2);
                ibaVar.b(zqVar);
                return new hj4.a(ibaVar, zqVar);
        }
    }
}
