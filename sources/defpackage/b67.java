package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b67 implements gu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b67(e13 e13Var, gu5 gu5Var, hee heeVar) {
        this.c = e13Var;
        this.d = heeVar;
        this.b = gu5Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        gu5 gu5Var = this.b;
        switch (i) {
            case 0:
                hee heeVar = (hee) obj;
                u63.Y((e13) obj2, null, null, new p67(heeVar, null), 3).d0(new mt(6, heeVar, gu5Var));
                break;
            default:
                vje.f(gu5Var, (g4a) obj, (Function1) obj2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ b67(gu5 gu5Var, g4a g4aVar, Function1 function1) {
        this.b = gu5Var;
        this.c = function1;
        this.d = g4aVar;
    }
}
