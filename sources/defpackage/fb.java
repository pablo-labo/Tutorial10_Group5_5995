package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ fb(iba ibaVar, g4a g4aVar, int i) {
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
                ibaVar.p("LOCATION");
                break;
            default:
                str.getClass();
                g4aVar.setValue(str);
                ibaVar.p("PROFICIENCY");
                break;
        }
        return j6g.a;
    }
}
