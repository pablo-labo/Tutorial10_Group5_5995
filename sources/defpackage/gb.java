package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.le0;
import defpackage.lx5;
import defpackage.ph8;
import defpackage.vb;
import expo.modules.video.records.VideoSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gb implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ gb(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new vb.d();
            case 1:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.k(s5eVar);
                return j6g.a;
            case 2:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 3:
                ((lx5.b) obj).getClass();
                return j6g.a;
            case 4:
                ((String) obj).getClass();
                return j6g.a;
            case 5:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.c(s5eVar2);
                return j6g.a;
            case 6:
                mm2 mm2Var = (mm2) obj;
                int i = e80.a;
                Context context = (Context) mm2Var.c(AndroidCompositionLocals_androidKt.b);
                iy3 iy3Var = (iy3) mm2Var.c(um2.h);
                lxa lxaVar = (lxa) mm2Var.c(mxa.a);
                if (lxaVar == null) {
                    return null;
                }
                return new j70(context, iy3Var, lxaVar.a, lxaVar.b);
            case 7:
                String str = (String) obj;
                hvb hvbVar = hvb.e;
                if (str != null) {
                    m2c.b(hvbVar, str);
                } else {
                    m2c.a(hvbVar);
                }
                return j6g.a;
            case 8:
                ph8.b bVar = (ph8.b) obj;
                bVar.a = 1800;
                bVar.a(Float.valueOf(0.0f), 333).b = c3c.b;
                bVar.a(Float.valueOf(1.0f), 1183);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                return obj;
            case 10:
                obj.getClass();
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj2 = list.get(i2);
                    le0.c cVar = (wl7.b(obj2, Boolean.FALSE) || obj2 == null) ? null : (le0.c) ((Function1) wld.b.b).invoke(obj2);
                    cVar.getClass();
                    arrayList.add(cVar);
                }
                return arrayList;
            case 11:
                qf8<Object>[] qf8VarArr = o5e.a;
                r5e<j6g> r5eVar = k5e.e;
                j6g j6gVar = j6g.a;
                ((s5e) obj).a(r5eVar, j6gVar);
                return j6gVar;
            case 12:
                return j6g.a;
            case 13:
                de0 de0Var = (de0) obj;
                return new lh7((((long) Math.round(de0Var.b)) & 4294967295L) | (((long) Math.round(de0Var.a)) << 32));
            default:
                return VideoSource.toMediaId$lambda$0((String) obj);
        }
    }
}
