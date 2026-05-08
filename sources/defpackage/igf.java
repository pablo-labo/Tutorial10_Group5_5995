package defpackage;

import androidx.compose.runtime.g;
import androidx.compose.runtime.p;
import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class igf {
    public static final ko2 g = pnb.H(new c10(16), new xi(15));
    public final x2a a;
    public final x2a b;
    public final c3a c;
    public qtc d;
    public long e;
    public final g4a f;

    public igf(dwa dwaVar, float f) {
        this.a = g.a(f);
        this.b = g.a(0.0f);
        this.c = p.a(0);
        this.d = qtc.e;
        this.e = kjf.b;
        this.f = r.e(dwaVar, wab.a0);
    }

    public final void a(dwa dwaVar, qtc qtcVar, int i, int i2) {
        float f = i2 - i;
        ((cme) this.b).q(f);
        float f2 = qtcVar.a;
        float f3 = qtcVar.b;
        qtc qtcVar2 = this.d;
        float f4 = qtcVar2.a;
        x2a x2aVar = this.a;
        if (f2 != f4 || f3 != qtcVar2.b) {
            boolean z = dwaVar == dwa.a;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? qtcVar.d : qtcVar.c;
            cme cmeVar = (cme) x2aVar;
            float fG = cmeVar.g();
            float f6 = i;
            float f7 = fG + f6;
            ((cme) x2aVar).q(cmeVar.g() + ((f5 <= f7 && (f2 >= fG || f5 - f2 <= f6)) ? (f2 >= fG || f5 - f2 > f6) ? 0.0f : f2 - fG : f5 - f7));
            this.d = qtcVar;
        }
        ((cme) x2aVar).q(nic.B(((cme) x2aVar).g(), 0.0f, f));
        ((dme) this.c).h(i);
    }

    public /* synthetic */ igf(dwa dwaVar) {
        this(dwaVar, 0.0f);
    }

    public igf() {
        this(dwa.a);
    }
}
