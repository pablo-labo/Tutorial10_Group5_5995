package defpackage;

import defpackage.m3f;
import defpackage.n3f;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mj4 implements gu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mj4(n3f n3fVar, Function1 function1, String str, Function1 function12, String str2) {
        this.e = n3fVar;
        this.b = function1;
        this.c = str;
        this.f = function12;
        this.d = str2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.f;
        Function1 function1 = this.b;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-language", "refresh", null, null, 12));
                function1.invoke(new wj8(33, (String) null, this.c, this.d, (String) obj2, (String) obj));
                return j6g.a;
            default:
                n3f n3fVar = (n3f) obj2;
                Function1 function12 = (Function1) obj;
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
                } else if (n3fVar != null) {
                    l.g();
                    return null;
                }
                String str = this.c;
                if (str != null) {
                    function12.invoke("tel-" + this.d + "-" + str);
                }
                return j6g.a;
        }
    }

    public /* synthetic */ mj4(Function1 function1, String str, String str2, String str3, String str4) {
        this.b = function1;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }
}
