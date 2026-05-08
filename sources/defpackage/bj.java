package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bj implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ bj(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                break;
            case 1:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.d(s5eVar, new i92(2, 1));
                break;
            case 2:
                ((String) obj).getClass();
                break;
            case 3:
                ((Boolean) obj).booleanValue();
                break;
            case 4:
                caa caaVar = (caa) obj;
                caaVar.getClass();
                break;
            case 5:
                lm5 lm5Var = (lm5) obj;
                lm5Var.getClass();
                sm5 sm5Var = sm5.c;
                lm5Var.e(sm5Var);
                lm5Var.f(sm5Var);
                break;
            case 6:
                break;
            case 7:
                ooa ooaVar = (ooa) obj;
                long j = ooaVar.a;
                if ((9223372034707292159L & j) == 9205357640488583168L) {
                }
                break;
            case 8:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                dgf dgfVar = (dgf) obj;
                Integer numD = dgfVar.d();
                if (numD != null) {
                    int iIntValue = numD.intValue();
                    long j2 = dgfVar.f;
                    int i = kjf.c;
                }
                break;
            default:
                ((gu5) obj).invoke();
                break;
        }
        return j6g.a;
    }
}
