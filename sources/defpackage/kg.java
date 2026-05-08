package defpackage;

import defpackage.uh;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ kg(iba ibaVar, int i) {
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
                de deVar = new de(1);
                ibaVar.b(deVar);
                return new uh.a(ibaVar, deVar);
            default:
                m74Var.getClass();
                int i2 = 0;
                ew ewVar = new ew(i2);
                ibaVar.b(ewVar);
                return new iw(i2, ibaVar, ewVar);
        }
    }
}
