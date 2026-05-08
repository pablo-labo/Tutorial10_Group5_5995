package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oy8 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oy8(String str, String str2, Function1 function1, Function1 function12, e eVar, int i) {
        this.b = str;
        this.c = str2;
        this.d = function1;
        this.e = function12;
        this.f = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                py8.c((String) obj7, (String) obj6, (Function1) obj5, (Function1) obj4, (e) obj3, (b) obj, ka2.L(1));
                break;
            default:
                zie zieVar = (zie) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                zieVar.getClass();
                ((Function2) obj7).invoke(zieVar, bool);
                qa9.b(ca9.c, "Edit");
                ((g4a) obj5).setValue("");
                ((g4a) obj4).setValue(null);
                ((g4a) obj3).setValue("");
                ((iba) obj6).p("SKILLS_LIST");
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ oy8(Function2 function2, iba ibaVar, g4a g4aVar, g4a g4aVar2, g4a g4aVar3) {
        this.b = function2;
        this.c = ibaVar;
        this.d = g4aVar;
        this.e = g4aVar2;
        this.f = g4aVar3;
    }
}
