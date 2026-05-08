package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.fr;
import defpackage.hj4;
import defpackage.mj;
import defpackage.szc;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xi implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ xi(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new mj.f();
            case 1:
                ((m74) obj).getClass();
                return new fr.b();
            case 2:
                ((m74) obj).getClass();
                return new cz();
            case 3:
                ((m74) obj).getClass();
                return new xi4(i);
            case 4:
                ((m74) obj).getClass();
                return new hj4.b();
            case 5:
                zf8 zf8Var = (zf8) obj;
                zf8Var.getClass();
                return zf8Var.toString();
            case 6:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                return j6g.a;
            case 7:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.f(s5eVar, "");
                o5e.l(s5eVar, 0.0f);
                return j6g.a;
            case 8:
                return Boolean.TRUE;
            case DatadogLogGenerator.CRASH /* 9 */:
                return j6g.a;
            case 10:
                je9 je9Var = (je9) obj;
                je9Var.getClass();
                Integer numB = vve.B(16, je9Var.a().get(1));
                if (numB == null) {
                    return je9Var.getValue();
                }
                char[] chars = Character.toChars(numB.intValue());
                chars.getClass();
                return new String(chars);
            case 11:
                r2c r2cVar = r2c.c;
                qf8<Object>[] qf8VarArr = o5e.a;
                r5e<r2c> r5eVar = k5e.c;
                qf8<Object> qf8Var = o5e.a[1];
                ((s5e) obj).a(r5eVar, r2cVar);
                return j6g.a;
            case 12:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                p5e.a(s5eVar2);
                return j6g.a;
            case 13:
                ((m74) obj).getClass();
                return new szc.b();
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                y98 y98Var2 = (y98) obj;
                y98Var2.getClass();
                y98Var2.b = true;
                return j6g.a;
            case 15:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                dwa dwaVar = ((Boolean) obj2).booleanValue() ? dwa.a : dwa.b;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new igf(dwaVar, ((Float) obj3).floatValue());
            default:
                y98 y98Var3 = (y98) obj;
                y98Var3.getClass();
                y98Var3.b = true;
                y98Var3.c = true;
                return j6g.a;
        }
    }
}
