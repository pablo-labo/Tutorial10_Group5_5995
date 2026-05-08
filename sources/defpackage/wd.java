package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.cyd;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wd implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ wd(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).booleanValue();
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                break;
            case 2:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.c(s5eVar);
                break;
            case 3:
                break;
            case 4:
                String str = (String) obj;
                str.getClass();
                break;
            case 5:
                ((Boolean) obj).booleanValue();
                break;
            case 6:
                break;
            case 7:
                je9 je9Var = (je9) obj;
                je9Var.getClass();
                String str2 = v1c.a.get(je9Var.a().get(1));
                if (str2 == null) {
                    break;
                }
                break;
            case 8:
                r97.a.getClass();
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                sqd sqdVar = (sqd) obj;
                sqdVar.getClass();
                break;
            case 10:
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                break;
            case 11:
                break;
            default:
                cyd cydVar = (cyd) obj;
                long j = cydVar.f;
                ((qme) msf.b.getValue()).d(cydVar, msf.a, cydVar.g);
                long j2 = cydVar.f;
                if (j != j2) {
                    cyd.a aVar = cydVar.n;
                    if (aVar != null) {
                        if (aVar.a > j2) {
                            cydVar.k();
                        } else {
                            aVar.g = j2;
                            if (aVar.b == null) {
                                aVar.h = gf9.c((1.0d - ((double) aVar.e.a(0))) * cydVar.f);
                            }
                        }
                    } else if (j2 != 0) {
                        cydVar.n();
                    }
                }
                break;
        }
        return j6g.a;
    }
}
