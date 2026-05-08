package defpackage;

import androidx.compose.runtime.b;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l49 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l49(int i, String str, String str2, Function1 function1) {
        this.b = str;
        this.e = function1;
        this.d = str2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.e;
        String str = this.b;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ie7.e(str, (Function1) obj3, (String) obj4, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                m4f.a((tg2) obj4, str, (ArrayList) obj3, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ l49(tg2 tg2Var, String str, ArrayList arrayList, int i) {
        this.d = tg2Var;
        this.b = str;
        this.e = arrayList;
        this.c = i;
    }
}
