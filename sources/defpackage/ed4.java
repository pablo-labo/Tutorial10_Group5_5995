package defpackage;

import com.wlproctor.common.model.Payload;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ed4 extends yob<ad4> implements xh8 {
    public final nm0 b;
    public final g3a<Integer> c;
    public final g3a d;
    public final ra8 e;
    public final d2f f;

    public ed4(ad4 ad4Var, nm0 nm0Var) {
        this.a = ad4Var;
        this.b = nm0Var;
        g3a<Integer> g3aVar = new g3a<>(0);
        this.c = g3aVar;
        this.d = g3aVar;
        this.e = sa8.a(new nf(8));
        this.f = new d2f(new cn0(4));
    }

    @Override // defpackage.yob
    public final k2 a() {
        return this.a;
    }

    @Override // defpackage.yob
    public final Payload b(String str) {
        str.getClass();
        String strK = this.b.k("override_" + str + "_payload");
        if (strK == null) {
            return null;
        }
        ra8 ra8Var = this.e;
        ra8Var.getClass();
        return (Payload) ra8Var.c(Payload.INSTANCE.serializer(), strK);
    }

    @Override // defpackage.yob
    public final Integer c(String str) {
        str.getClass();
        Integer numL = this.b.l("override_".concat(str));
        if (numL != null) {
            return numL;
        }
        Integer num = (Integer) ((Map) this.f.getValue()).get(str);
        if (num != null) {
            ArrayList arrayList = lz2.a;
            lz2.d("DroidProctorHolder", "Build-time proctor override: " + str + " = " + num, false, null);
        }
        return num;
    }

    @Override // defpackage.yob
    public final void e(String str, Payload payload) {
        str.getClass();
        String str2 = "override_" + str + "_payload";
        nm0 nm0Var = this.b;
        if (payload == null) {
            nm0Var.remove(str2);
            return;
        }
        ra8 ra8Var = this.e;
        ra8Var.getClass();
        nm0Var.b(str2, ra8Var.b(Payload.INSTANCE.serializer(), payload));
    }

    @Override // defpackage.yob
    public final void f(Integer num, String str) {
        str.getClass();
        String strConcat = "override_".concat(str);
        nm0 nm0Var = this.b;
        if (num == null) {
            nm0Var.remove(strConcat);
        } else {
            nm0Var.d(num.intValue(), strConcat);
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
