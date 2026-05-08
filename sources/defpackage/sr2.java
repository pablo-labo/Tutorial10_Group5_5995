package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sr2 implements gu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sr2(b5g b5gVar, Function1 function1, gu5 gu5Var) {
        this.c = b5gVar;
        this.b = function1;
        this.d = gu5Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                gu5 gu5Var = (gu5) obj;
                if (((b5g) obj2) != b5g.b) {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-contact-info-screen", "save", null, null, 12));
                    function1.invoke(gu5Var);
                }
                break;
            default:
                hz1 hz1Var = (hz1) obj2;
                ((g4a) obj).setValue(Boolean.FALSE);
                function1.invoke(hz1Var != null ? hz1Var.a : null);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ sr2(Function1 function1, hz1 hz1Var, g4a g4aVar) {
        this.b = function1;
        this.c = hz1Var;
        this.d = g4aVar;
    }
}
