package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sf4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ sf4(iba ibaVar, g4a g4aVar, int i) {
        this.a = i;
        this.b = ibaVar;
        this.c = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.c;
        iba ibaVar = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                g4aVar.setValue(str);
                ibaVar.p("HOME");
                break;
            case 1:
                str.getClass();
                g4aVar.setValue(str);
                ibaVar.r();
                break;
            default:
                str.getClass();
                g4aVar.setValue(str);
                qa9.b(ca9.d, "");
                ibaVar.p("SKILL_EDIT_HOME");
                break;
        }
        return j6g.a;
    }
}
