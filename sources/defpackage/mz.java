package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.tare.broadcast.FormCompletionResult;
import com.wlappdebug.r;
import defpackage.qn0;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mz implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ mz(w0g w0gVar) {
        this.a = 16;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return bs0.Companion.serializer();
            case 1:
                return j6g.a;
            case 2:
                return new gt0(qn0.a.a, 0);
            case 3:
                yd8 yd8VarB = fwc.a.b(o09.class);
                p09 p09Var = p09.a;
                return new iu2(yd8VarB, new KSerializer[0]);
            case 4:
                return FormCompletionResult._init_$_anonymous_();
            case 5:
                return new gt0(mve.a, 0);
            case 6:
                return new gt0(mve.a, 0);
            case 7:
                return new gt0(ni1.a, 0);
            case 8:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case DatadogLogGenerator.CRASH /* 9 */:
                return w49.Companion.serializer();
            case 10:
                return bg3.a();
            case 11:
                return j6g.a;
            case 12:
                return ib8.b;
            case 13:
                epa epaVar = epa.a;
                return epa.a().a();
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                List listA = r.a();
                int iV = kc9.V(t92.r0(listA, 10));
                if (iV < 16) {
                    iV = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
                for (Object obj : listA) {
                    ((r.a) obj).getClass();
                    linkedHashMap.put(null, obj);
                }
                return linkedHashMap;
            case 15:
                try {
                    return aa2.a(a7e.W(v6e.L(Arrays.asList(new ek3[0]).iterator())));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case 16:
                return Boolean.FALSE;
            case 17:
                return j6g.a;
            default:
                return new gt0(mve.a, 0);
        }
    }

    public /* synthetic */ mz(int i) {
        this.a = i;
    }
}
