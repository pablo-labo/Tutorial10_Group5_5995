package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fv2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fv2(String str, String str2, String str3) {
        this.a = 1;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                lx5.b bVar = (lx5.b) obj;
                w40.l(bVar, "subTabName", (String) obj2, "operation", (String) obj4);
                bVar.a("myjobsPageTk", ie7.Z);
                bVar.a("appTk", (String) obj3);
                break;
            default:
                Function1 function1 = (Function1) obj4;
                Function1 function12 = (Function1) obj3;
                Function1 function13 = (Function1) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke(rxb.a);
                } else if (iIntValue == 1) {
                    function12.invoke(rxb.b);
                } else if (iIntValue == 2) {
                    function13.invoke(rxb.c);
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ fv2(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
