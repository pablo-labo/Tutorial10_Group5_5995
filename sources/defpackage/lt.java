package defpackage;

import android.graphics.PointF;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.swmansion.gesturehandler.core.GestureHandler;
import defpackage.rz5;
import defpackage.st;
import defpackage.yn4;
import defpackage.zxf;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lt implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ lt(zxf zxfVar) {
        this.a = 13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new st.e();
            case 1:
                return j6g.a;
            case 2:
                ((m74) obj).getClass();
                return new yn4.b();
            case 3:
                GestureHandler gestureHandler = (GestureHandler) obj;
                gestureHandler.getClass();
                PointF pointF = rz5.m;
                if (rz5.a.a(gestureHandler.f) && !gestureHandler.H) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                r97.a.getClass();
                return Boolean.valueOf(r97.j((String) obj));
            case 5:
                String str = (String) obj;
                hvb hvbVar = hvb.d0;
                if (str != null) {
                    m2c.b(hvbVar, str);
                } else {
                    m2c.a(hvbVar);
                }
                return j6g.a;
            case 6:
                je9 je9Var = (je9) obj;
                je9Var.getClass();
                String str2 = je9Var.a().get(1);
                str2.getClass();
                Integer numB = vve.B(10, str2);
                if (numB == null) {
                    return je9Var.getValue();
                }
                char[] chars = Character.toChars(numB.intValue());
                chars.getClass();
                return new String(chars);
            case 7:
                ((Integer) obj).intValue();
                return j6g.a;
            case 8:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                obj.getClass();
                List list = (List) obj;
                return new lhf(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
            case 10:
                String str3 = obj != null ? (String) obj : null;
                str3.getClass();
                return new bng(str3);
            case 11:
                r6e r6eVar = (r6e) obj;
                r6eVar.getClass();
                return r6eVar.iterator();
            case 12:
                return j6g.a;
            default:
                gg8 gg8Var = (gg8) obj;
                gg8Var.getClass();
                ig8 ig8Var = gg8Var.a;
                if (ig8Var == null) {
                    return "*";
                }
                zf8 zf8Var = gg8Var.b;
                zxf zxfVar = zf8Var instanceof zxf ? (zxf) zf8Var : null;
                String strJ = zxfVar != null ? zxfVar.j(true) : String.valueOf(zf8Var);
                int i = zxf.a.a[ig8Var.ordinal()];
                if (i == 1) {
                    return strJ;
                }
                if (i == 2) {
                    return "in ".concat(strJ);
                }
                if (i == 3) {
                    return "out ".concat(strJ);
                }
                l.g();
                return null;
        }
    }

    public /* synthetic */ lt(int i) {
        this.a = i;
    }
}
