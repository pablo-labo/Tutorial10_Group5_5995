package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class im4 implements gu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ g4a b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ im4(g4a g4aVar, g4a g4aVar2, Function1 function1, iba ibaVar) {
        this.b = g4aVar;
        this.d = g4aVar2;
        this.c = function1;
        this.e = ibaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Function1 function1 = this.c;
        g4a g4aVar = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                iba ibaVar = (iba) obj;
                g4aVar.setValue(Boolean.FALSE);
                String str = (String) ((g4a) obj2).getValue();
                if (str != null) {
                    function1.invoke(u63.Z(str));
                    qm4.b(in4.c, "");
                    ibaVar.r();
                }
                break;
            default:
                String str2 = (String) obj2;
                gu5 gu5Var = (gu5) obj;
                g4aVar.setValue(Boolean.FALSE);
                if (str2 != null) {
                    function1.invoke(u63.Z(str2));
                    qa9.b(ca9.b, "");
                    gu5Var.invoke();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ im4(String str, g4a g4aVar, Function1 function1, gu5 gu5Var) {
        this.d = str;
        this.b = g4aVar;
        this.c = function1;
        this.e = gu5Var;
    }
}
