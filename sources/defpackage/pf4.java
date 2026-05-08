package defpackage;

import defpackage.eg4;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pf4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ pf4(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        iba ibaVar = this.b;
        switch (i) {
            case 0:
                ((m74) obj).getClass();
                zq zqVar = new zq(1);
                ibaVar.b(zqVar);
                return new eg4.a(ibaVar, zqVar);
            default:
                ((String) obj).getClass();
                qa9.b(ca9.c, "Edit");
                ibaVar.getClass();
                if (ibaVar.t("SKILLS_SET_LIST", false, false)) {
                    ibaVar.c();
                }
                return j6g.a;
        }
    }
}
