package defpackage;

import defpackage.jc7;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jc implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jc(lcf lcfVar, Function1 function1, Function1 function12, jhf jhfVar) {
        this.a = 2;
        this.c = lcfVar;
        this.b = function1;
        this.d = function12;
        this.e = jhfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-groups", "refresh", null, null, 12));
                ((Function1) obj3).invoke(new lu0((String) ((g4a) obj4).getValue(), (ig3) ((g4a) obj).getValue(), (String) ((g4a) obj2).getValue(), 1));
                break;
            case 1:
                Number number = (Number) obj3;
                jc7.a aVar = (jc7.a) obj4;
                Number number2 = (Number) obj2;
                ic7 ic7Var = (ic7) obj;
                if (!number.equals(aVar.a) || !number2.equals(aVar.b)) {
                    aVar.a = number;
                    aVar.b = number2;
                    aVar.f = new aaf<>(ic7Var, aVar.c, number, number2, null);
                    ((gme) jc7.this.b).setValue(Boolean.TRUE);
                    aVar.V = false;
                    aVar.W = true;
                }
                break;
            default:
                lcf lcfVar = (lcf) obj4;
                Function1 function1 = (Function1) obj3;
                Function1 function12 = (Function1) obj2;
                jhf jhfVar = (jhf) obj;
                lcf lcfVar2 = lcf.c;
                lcf lcfVar3 = lcf.a;
                if (lcfVar == lcfVar3) {
                    function1.invoke(lcfVar2);
                    pcf.c(function12, jhfVar, lcfVar3, lcfVar2);
                } else {
                    function1.invoke(lcfVar3);
                    pcf.c(function12, jhfVar, lcfVar2, lcfVar3);
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ jc(Object obj, ese eseVar, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = eseVar;
        this.d = obj2;
        this.e = obj3;
    }
}
