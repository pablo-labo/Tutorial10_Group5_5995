package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import defpackage.je;
import defpackage.mj;
import defpackage.st;
import defpackage.yn4;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kd implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ kd(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new je.c();
            case 1:
                ((m74) obj).getClass();
                return new mj.b();
            case 2:
                ((m74) obj).getClass();
                return new st.d();
            case 3:
                ((m74) obj).getClass();
                return new lw();
            case 4:
                ((m74) obj).getClass();
                return new wi4(i2);
            case 5:
                ((m74) obj).getClass();
                return new yc(i);
            case 6:
                ((m74) obj).getClass();
                return new yn4.a();
            case 7:
                return j6g.a;
            case 8:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.i(s5eVar, 0);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 10:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.g(s5eVar2, 0);
                return j6g.a;
            case 11:
                ((DisplayToastData) obj).getClass();
                ArrayList arrayList = lz2.a;
                lz2.h("IndeedApplyWebViewFragment", "onDisplayToast called unexpectedly", null, 12);
                return j6g.a;
            case 12:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("records");
                return j6g.a;
            case 13:
                ((Long) obj).longValue();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                return j6g.a;
            case 15:
                String str = (String) obj;
                hvb hvbVar = hvb.f;
                if (str != null) {
                    m2c.b(hvbVar, str);
                } else {
                    m2c.a(hvbVar);
                }
                return j6g.a;
            case 16:
                return new zrd(((Integer) obj).intValue());
            case 17:
                ((dd0) obj).getClass();
                return r25.a;
            case 18:
                yd8 yd8Var = (yd8) obj;
                yd8Var.getClass();
                KSerializer kSerializerO = awd.o(yd8Var);
                if (kSerializerO != null) {
                    return kSerializerO;
                }
                if (jh2.p(yd8Var).isInterface()) {
                    return new mfb(yd8Var);
                }
                return null;
            default:
                de0 de0Var = (de0) obj;
                float f = de0Var.a;
                return new ooa((((long) Float.floatToRawIntBits(de0Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        }
    }
}
