package defpackage;

import android.util.Patterns;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jw6 implements gu5 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jw6(kcf kcfVar, Function1 function1, Function1 function12, jhf jhfVar) {
        this.c = kcfVar;
        this.b = function1;
        this.d = function12;
        this.e = jhfVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Function1 function1 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                kcf kcfVar = (kcf) obj3;
                Function1 function12 = (Function1) obj2;
                jhf jhfVar = (jhf) obj;
                kcf kcfVar2 = kcf.c;
                kcf kcfVar3 = kcf.a;
                if (kcfVar == kcfVar3) {
                    function1.invoke(kcfVar2);
                    qw6.c(function12, jhfVar, kcfVar3, kcfVar2);
                } else {
                    function1.invoke(kcfVar3);
                    qw6.c(function12, jhfVar, kcfVar2, kcfVar3);
                }
                break;
            default:
                String str = (String) obj2;
                g4a g4aVar = (g4a) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-".concat((String) obj3), "save", null, null, 12));
                if (Patterns.WEB_URL.matcher(str).matches()) {
                    g4aVar.setValue(Boolean.FALSE);
                    function1.invoke(str);
                } else {
                    g4aVar.setValue(Boolean.TRUE);
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ jw6(String str, String str2, Function1 function1, g4a g4aVar) {
        this.c = str;
        this.d = str2;
        this.b = function1;
        this.e = g4aVar;
    }
}
