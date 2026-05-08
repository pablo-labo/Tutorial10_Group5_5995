package defpackage;

import androidx.media3.common.ParserException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes.dex */
public final class yoa implements m55 {
    public o55 a;
    public nue b;
    public boolean c;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean a(n55 n55Var) {
        boolean zC;
        bpa bpaVar = new bpa();
        if (bpaVar.a(n55Var, true) && (bpaVar.a & 2) == 2) {
            int iMin = Math.min(bpaVar.e, 8);
            g4b g4bVar = new g4b(iMin);
            n55Var.h(0, g4bVar.a, iMin);
            g4bVar.J(0);
            if (g4bVar.a() >= 5 && g4bVar.x() == 127 && g4bVar.z() == 1179402563) {
                this.b = new yg5();
                return true;
            }
            g4bVar.J(0);
            try {
                zC = rtg.c(1, g4bVar, true);
            } catch (ParserException unused) {
                zC = false;
            }
            if (zC) {
                this.b = new qtg();
            } else {
                g4bVar.J(0);
                if (rva.e(g4bVar, rva.o)) {
                    this.b = new rva();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.n55 r21, defpackage.dhb r22) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yoa.b(n55, dhb):int");
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) {
        try {
            return a(n55Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        nue nueVar = this.b;
        if (nueVar != null) {
            apa apaVar = nueVar.a;
            bpa bpaVar = apaVar.a;
            bpaVar.a = 0;
            bpaVar.b = 0L;
            bpaVar.c = 0;
            bpaVar.d = 0;
            bpaVar.e = 0;
            apaVar.b.G(0);
            apaVar.c = -1;
            apaVar.e = false;
            if (j == 0) {
                nueVar.d(!nueVar.l);
                return;
            }
            if (nueVar.h != 0) {
                long j3 = (((long) nueVar.i) * j2) / 1000000;
                nueVar.e = j3;
                cpa cpaVar = nueVar.d;
                String str = vjg.a;
                cpaVar.c(j3);
                nueVar.h = 2;
            }
        }
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.a = o55Var;
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
