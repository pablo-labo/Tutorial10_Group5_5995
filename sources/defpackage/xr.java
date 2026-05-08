package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.oq7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xr implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ xr(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new ys(i);
            case 1:
                ((m74) obj).getClass();
                return new bz(i);
            case 2:
                ls8 ls8Var = (ls8) obj;
                ls8Var.getClass();
                ls8.d(ls8Var, 5, null, bi2.a, 6);
                return j6g.a;
            case 3:
                ls8 ls8Var2 = (ls8) obj;
                ls8Var2.getClass();
                ls8.e(ls8Var2, null, ni2.a, 3);
                ls8.e(ls8Var2, null, ni2.b, 3);
                ls8.e(ls8Var2, null, ni2.c, 3);
                ls8.e(ls8Var2, null, ni2.d, 3);
                return j6g.a;
            case 4:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                return j6g.a;
            case 5:
                y98 y98Var2 = (y98) obj;
                y98Var2.getClass();
                y98Var2.b = true;
                y98Var2.c = true;
                return j6g.a;
            case 6:
                j62 j62Var = (j62) obj;
                j62Var.getClass();
                j62.a(j62Var, "JsonPrimitive", new oa8(new mz(12)));
                j62.a(j62Var, "JsonNull", new oa8(new cp0(12)));
                j62.a(j62Var, "JsonLiteral", new oa8(new dp0(10)));
                j62.a(j62Var, "JsonObject", new oa8(new pl0(8)));
                j62.a(j62Var, "JsonArray", new oa8(new ao0(10)));
                return j6g.a;
            case 7:
                return j6g.a;
            case 8:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.c(s5eVar);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((mq7) obj).getClass();
                return j6g.a;
            case 10:
                y98 y98Var3 = (y98) obj;
                y98Var3.getClass();
                y98Var3.b = true;
                y98Var3.c = true;
                return j6g.a;
            case 11:
                ((mq7) obj).getClass();
                return j6g.a;
            case 12:
                y98 y98Var4 = (y98) obj;
                y98Var4.getClass();
                y98Var4.b = true;
                return j6g.a;
            case 13:
                obj.getClass();
                return new odf(((Integer) obj).intValue());
            default:
                oq7.f fVar = (oq7.f) obj;
                fVar.getClass();
                ((np7) cr8.p(np7.class)).a("TareDebugFragment", "openModal(interviewScheduling): " + fVar);
                return j6g.a;
        }
    }
}
