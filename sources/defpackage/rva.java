package defpackage;

import androidx.media3.common.a;
import defpackage.nue;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes.dex */
public final class rva extends nue {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(g4b g4bVar, byte[] bArr) {
        if (g4bVar.a() < bArr.length) {
            return false;
        }
        int i = g4bVar.b;
        byte[] bArr2 = new byte[bArr.length];
        g4bVar.h(0, bArr2, bArr.length);
        g4bVar.J(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.nue
    public final long b(g4b g4bVar) {
        byte[] bArr = g4bVar.a;
        return (((long) this.i) * bf9.c(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.nue
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(g4b g4bVar, long j, nue.a aVar) {
        if (e(g4bVar, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(g4bVar.a, g4bVar.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListA = bf9.a(bArrCopyOf);
            if (aVar.a == null) {
                a.C0036a c0036a = new a.C0036a();
                c0036a.l = st9.p("audio/ogg");
                c0036a.m = st9.p("audio/opus");
                c0036a.E = i;
                c0036a.F = 48000;
                c0036a.p = arrayListA;
                aVar.a = new a(c0036a);
                return true;
            }
        } else {
            if (!e(g4bVar, p)) {
                ka2.r(aVar.a);
                return false;
            }
            ka2.r(aVar.a);
            if (!this.n) {
                this.n = true;
                g4bVar.K(8);
                js9 js9VarA = rtg.a(e47.k(rtg.b(g4bVar, false, false).a));
                if (js9VarA != null) {
                    a.C0036a c0036aA = aVar.a.a();
                    c0036aA.k = js9VarA.b(aVar.a.l);
                    aVar.a = new a(c0036aA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.nue
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
