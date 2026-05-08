package defpackage;

import defpackage.r78;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bh4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ bh4(iba ibaVar, int i) {
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
                gh4 gh4Var = new gh4(0);
                ibaVar.b(gh4Var);
                return new mh4(0, ibaVar, gh4Var);
            default:
                m74Var.getClass();
                ew ewVar = new ew(1);
                ibaVar.b(ewVar);
                return new r78.c(ibaVar, ewVar);
        }
    }
}
