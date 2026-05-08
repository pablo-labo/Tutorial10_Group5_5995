package defpackage;

import defpackage.m3f;
import defpackage.n3f;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class md implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ md(n3f n3fVar, Function1 function1, String str, Function1 function12, String str2) {
        this.a = 2;
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
                g4a g4aVar = (g4a) obj4;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-award", "save", null, null, 12));
                g4aVar.setValue(m61.a((m61) g4aVar.getValue(), (tg3) ((g4a) obj2).getValue(), (String) ((g4a) obj).getValue(), (String) ((g4a) obj3).getValue(), 1));
                function1.invoke((m61) g4aVar.getValue());
                break;
            case 1:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-publication", "save", null, null, 12));
                function1.invoke(new p6c((tg3) ((g4a) obj).getValue(), (String) ((g4a) obj2).getValue(), (String) ((g4a) obj4).getValue(), (String) ((g4a) obj3).getValue(), 1));
                break;
            default:
                n3f n3fVar = (n3f) obj4;
                String str = (String) obj3;
                Function1 function12 = (Function1) obj2;
                String str2 = (String) obj;
                if (n3fVar instanceof n3f.c) {
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

    public /* synthetic */ md(Function1 function1, g4a g4aVar, g4a g4aVar2, g4a g4aVar3, g4a g4aVar4, int i) {
        this.a = i;
        this.b = function1;
        this.c = g4aVar;
        this.d = g4aVar2;
        this.e = g4aVar3;
        this.f = g4aVar4;
    }
}
