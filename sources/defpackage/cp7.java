package defpackage;

import androidx.compose.runtime.r;
import defpackage.xh8;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class cp7 implements bp7, xh8 {
    public final g4a a = r.f(Boolean.valueOf(bu8.a.i()));

    @Override // defpackage.bp7
    public final Date a() {
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        long jLongValue = ((Number) bu8.f.a(bu8.b[2], bu8Var)).longValue();
        if (jLongValue > 0) {
            return new Date(jLongValue);
        }
        return null;
    }

    @Override // defpackage.bp7
    public final String b() {
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        return (String) bu8.V.b(bu8.b[3], bu8Var);
    }

    @Override // defpackage.bp7
    public final String c() {
        return bu8.a.a();
    }

    @Override // defpackage.bp7
    public final boolean e() {
        return ((Boolean) ((gme) this.a).getValue()).booleanValue();
    }

    @Override // defpackage.bp7
    public final boolean f() {
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        return ((Boolean) bu8.W.a(bu8.b[4], bu8Var)).booleanValue();
    }

    @Override // defpackage.bp7
    public final String getId() {
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        return (String) bu8.d.b(bu8.b[0], bu8Var);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
