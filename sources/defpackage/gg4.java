package defpackage;

import defpackage.m3f;
import defpackage.n3f;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gg4 implements gu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gg4(n3f n3fVar, Function1 function1, String str, Function1 function12, String str2) {
        this.c = n3fVar;
        this.b = function1;
        this.d = str;
        this.e = function12;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Function1 function1 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                mu0 mu0Var = (mu0) obj4;
                g4a g4aVar = (g4a) obj3;
                g4a g4aVar2 = (g4a) obj2;
                g4a g4aVar3 = (g4a) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-groups", "save", null, null, 12));
                function1.invoke(new lu0(mu0Var != null ? mu0Var.d : null, (String) g4aVar.getValue(), (ig3) g4aVar2.getValue(), (String) g4aVar3.getValue()));
                break;
            default:
                n3f n3fVar = (n3f) obj4;
                String str = (String) obj3;
                Function1 function12 = (Function1) obj2;
                String str2 = (String) obj;
                if (n3fVar instanceof n3f.a) {
                    n3f.a aVar = (n3f.a) n3fVar;
                    function1.invoke(new m3f.a(aVar.b, aVar.c, aVar.d, m3f.a.EnumC0313a.valueOf(aVar.e.name()), aVar.f, aVar.g));
                } else if (n3fVar instanceof n3f.d) {
                    n3f.d dVar = (n3f.d) n3fVar;
                    function1.invoke(new m3f.c(dVar.b, dVar.c, dVar.d));
                } else if (n3fVar instanceof n3f.c) {
                    n3f.c cVar = (n3f.c) n3fVar;
                    function1.invoke(new m3f.b(cVar.b, cVar.c));
                } else if (n3fVar instanceof n3f.e) {
                    n3f.e eVar = (n3f.e) n3fVar;
                    function1.invoke(new m3f.d(eVar.b, eVar.d, eVar.c));
                }
                if (str != null) {
                    function12.invoke("tel-" + str2 + "-" + str);
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ gg4(Function1 function1, mu0 mu0Var, g4a g4aVar, g4a g4aVar2, g4a g4aVar3) {
        this.b = function1;
        this.c = mu0Var;
        this.d = g4aVar;
        this.e = g4aVar2;
        this.f = g4aVar3;
    }
}
