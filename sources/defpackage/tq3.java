package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import defpackage.lx5;
import defpackage.yq3;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tq3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tq3(rgf rgfVar, e13 e13Var, Context context) {
        this.a = 2;
        this.b = rgfVar;
        this.d = e13Var;
        this.c = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x72 x72Var;
        int i = this.a;
        Object obj2 = null;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        int i2 = 0;
        int i3 = 6;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                kdf kdfVar = (kdf) obj4;
                vt2 vt2Var = (vt2) obj;
                List<xcf> list = ((ycf) obj5).a;
                int size = list.size();
                while (i2 < size) {
                    xcf xcfVar = list.get(i2);
                    if (xcfVar instanceof edf) {
                        edf edfVar = (edf) xcfVar;
                        vt2.b(vt2Var, new yq3.a(edfVar), edfVar.c == 0 ? null : new ah2(-1930700965, new yq3.b(edfVar), true), new s71(2, edfVar, kdfVar), 6);
                    } else if (xcfVar instanceof ldf) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            ddf.c(vt2Var, context, (ldf) xcfVar);
                        }
                    } else if (xcfVar instanceof jdf) {
                        vt2Var.a.add(yh2.a);
                    }
                    i2++;
                }
                break;
            case 1:
                String str = (String) obj5;
                String str2 = (String) obj3;
                String str3 = (String) obj4;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("subTabName", "Invitations");
                if (str != null) {
                    bVar.a("entityId", str);
                }
                if (str2 != null) {
                    bVar.a("jobKey", str2);
                }
                if (str3 != null) {
                    bVar.a("entityData", str3);
                }
                break;
            default:
                rgf rgfVar = (rgf) obj5;
                e13 e13Var = (e13) obj4;
                Context context2 = (Context) obj3;
                wcf wcfVar = (wcf) obj;
                wcfVar.a();
                p3a<xcf> p3aVar = wcfVar.a;
                fdf fdfVar = fdf.a;
                boolean z = !kjf.c(rgfVar.m().b) && ((Boolean) ((gme) rgfVar.m).getValue()).booleanValue();
                jp0 jp0Var = new jp0(12, e13Var, new xgf(rgfVar, null));
                Resources resources = context2.getResources();
                lr0 lr0Var = new lr0(i3, jp0Var, obj2);
                if (z) {
                    p3aVar.g(new edf(fdfVar.c(), fdfVar.e(resources), fdfVar.a(), lr0Var));
                }
                fdf fdfVar2 = fdf.b;
                boolean zC = kjf.c(rgfVar.m().b);
                jp0 jp0Var2 = new jp0(12, e13Var, new ygf(rgfVar, null));
                Resources resources2 = context2.getResources();
                lr0 lr0Var2 = new lr0(i3, jp0Var2, obj2);
                if (!zC) {
                    p3aVar.g(new edf(fdfVar2.c(), fdfVar2.e(resources2), fdfVar2.a(), lr0Var2));
                }
                fdf fdfVar3 = fdf.c;
                boolean z2 = ((Boolean) ((gme) rgfVar.m).getValue()).booleanValue() && (x72Var = (x72) ((gme) rgfVar.x).getValue()) != null && x72Var.a.getDescription().hasMimeType("text/*");
                jp0 jp0Var3 = new jp0(12, e13Var, new zgf(rgfVar, null));
                Resources resources3 = context2.getResources();
                lr0 lr0Var3 = new lr0(i3, jp0Var3, obj2);
                if (z2) {
                    p3aVar.g(new edf(fdfVar3.c(), fdfVar3.e(resources3), fdfVar3.a(), lr0Var3));
                }
                fdf fdfVar4 = fdf.d;
                boolean z3 = kjf.d(rgfVar.m().b) != rgfVar.m().a.b.length();
                wm1 wm1Var = new wm1(rgfVar, 18);
                cq0 cq0Var = new cq0(rgfVar, 19);
                Resources resources4 = context2.getResources();
                lr0 lr0Var4 = new lr0(i3, cq0Var, wm1Var);
                if (z3) {
                    p3aVar.g(new edf(fdfVar4.c(), fdfVar4.e(resources4), fdfVar4.a(), lr0Var4));
                }
                fdf fdfVar5 = fdf.e;
                if (((Boolean) ((gme) rgfVar.m).getValue()).booleanValue() && kjf.c(rgfVar.m().b)) {
                    i2 = 1;
                }
                o91 o91Var = new o91(rgfVar, 26);
                Resources resources5 = context2.getResources();
                lr0 lr0Var5 = new lr0(i3, o91Var, obj2);
                if (i2 != 0) {
                    p3aVar.g(new edf(fdfVar5.c(), fdfVar5.e(resources5), fdfVar5.a(), lr0Var5));
                }
                wcfVar.a();
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ tq3(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
