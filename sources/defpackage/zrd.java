package defpackage;

import androidx.compose.runtime.p;
import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zrd implements nsd {
    public static final ko2 i = new ko2(new fn0(13, 0), new kd(16));
    public final c3a a;
    public float e;
    public final c3a b = p.a(0);
    public final e3a c = new e3a();
    public final c3a d = p.a(Integer.MAX_VALUE);
    public final hq3 f = new hq3(new k1(this, 15));
    public final az3 g = r.c(new le(this, 17));
    public final az3 h = r.c(new qr(this, 19));

    public zrd(int i2) {
        this.a = p.a(i2);
    }

    @Override // defpackage.nsd
    public final Object a(n4a n4aVar, Function2<? super xrd, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super j6g> lu2Var) {
        Object objA = this.f.a(n4aVar, function2, lu2Var);
        return objA == g13.a ? objA : j6g.a;
    }

    @Override // defpackage.nsd
    public final boolean b() {
        return this.f.b();
    }

    @Override // defpackage.nsd
    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.nsd
    public final boolean d() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // defpackage.nsd
    public final float e(float f) {
        return this.f.e(f);
    }

    public final int f() {
        return ((dme) this.d).e();
    }
}
