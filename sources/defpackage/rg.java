package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.ax1;
import defpackage.ei4;
import defpackage.m2c;
import defpackage.mj;
import defpackage.uh;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rg implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ rg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 2;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new uh.c();
            case 1:
                ((m74) obj).getClass();
                return new mj.d();
            case 2:
                return j6g.a;
            case 3:
                ((Boolean) obj).booleanValue();
                return j6g.a;
            case 4:
                ((m74) obj).getClass();
                return new ei4.b();
            case 5:
                ((m74) obj).getClass();
                return new fz(i);
            case 6:
                ((Boolean) obj).booleanValue();
                return j6g.a;
            case 7:
                List list = (List) obj;
                return new so8(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 8:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                y98 y98Var2 = (y98) obj;
                y98Var2.getClass();
                y98Var2.b = true;
                y98Var2.c = true;
                return j6g.a;
            case 10:
                k38 k38Var = (k38) obj;
                lr5 lr5Var = m2c.e;
                if (lr5Var != null) {
                    int i2 = k38Var == null ? -1 : m2c.a.a[k38Var.ordinal()];
                    if (i2 == 1) {
                        ((i1g) cr8.p(i1g.class)).a(lr5Var, new ra());
                    } else if (i2 == 2) {
                        ((i1g) cr8.p(i1g.class)).a(lr5Var, new dt());
                    } else if (i2 == 3) {
                        ((i1g) cr8.p(i1g.class)).a(lr5Var, new jg());
                    }
                }
                return j6g.a;
            case 11:
                hvb hvbVar = hvb.c0;
                String str = (String) obj;
                if (str != null) {
                    m2c.b(hvbVar, str);
                } else {
                    m2c.a(hvbVar);
                }
                return j6g.a;
            case 12:
                ss2 ss2Var = (ss2) obj;
                ax1.b bVarW1 = ss2Var.w1();
                long jD = bVarW1.d();
                bVarW1.a().o();
                try {
                    bVarW1.a.d(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    ss2Var.N1();
                    g7.k(bVarW1, jD);
                    return j6g.a;
                } catch (Throwable th) {
                    g7.k(bVarW1, jD);
                    throw th;
                }
            case 13:
                ((xmc) obj).getClass();
                return null;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((Float) obj).floatValue();
                return j6g.a;
            case 15:
                JavaScriptTypedArray javaScriptTypedArray = (JavaScriptTypedArray) obj;
                javaScriptTypedArray.getClass();
                return javaScriptTypedArray;
            default:
                return new ce0(((j94) obj).a);
        }
    }
}
