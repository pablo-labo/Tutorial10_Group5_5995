package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lub implements wu5 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ oub d;

    public /* synthetic */ lub(boolean z, gu5 gu5Var, String str, oub oubVar) {
        this.a = z;
        this.b = gu5Var;
        this.c = str;
        this.d = oubVar;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        e eVar = (e) obj;
        b bVar = (b) obj2;
        ((Integer) obj3).getClass();
        eVar.getClass();
        bVar.L(-1751539962);
        boolean z = this.a;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zA = bVar.a(z);
        gu5 gu5Var = this.b;
        boolean zK = zA | bVar.K(gu5Var);
        String str = this.c;
        boolean zK2 = zK | bVar.K(str);
        oub oubVar = this.d;
        boolean zD = bVar.d(oubVar.ordinal()) | zK2;
        Object objV = bVar.v();
        if (zD || objV == b.a.a) {
            objV = new mub(z, gu5Var, str, oubVar, null);
            bVar.p(objV);
        }
        to4.d(bVar, boolValueOf, (Function2) objV);
        bVar.F();
        return eVar;
    }
}
