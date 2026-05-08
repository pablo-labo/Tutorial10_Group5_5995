package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class rue extends ka6 implements pa8 {
    public final hl2 d;
    public final s98 e;
    public final d5h f;
    public final pa8[] g;
    public final v1 h;
    public final aa8 i;
    public boolean j;
    public String k;
    public String l;

    public rue(hl2 hl2Var, s98 s98Var, d5h d5hVar, pa8[] pa8VarArr) {
        hl2Var.getClass();
        this.d = hl2Var;
        this.e = s98Var;
        this.f = d5hVar;
        this.g = pa8VarArr;
        this.h = s98Var.b;
        this.i = s98Var.a;
        int iOrdinal = d5hVar.ordinal();
        if (pa8VarArr != null) {
            pa8 pa8Var = pa8VarArr[iOrdinal];
            if (pa8Var == null && pa8Var == this) {
                return;
            }
            pa8VarArr[iOrdinal] = this;
        }
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void A(int i) {
        if (this.j) {
            E(String.valueOf(i));
        } else {
            this.d.e(i);
        }
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void E(String str) {
        str.getClass();
        this.d.h(str);
    }

    @Override // defpackage.ka6
    public final void Y(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        int iOrdinal = this.f.ordinal();
        hl2 hl2Var = this.d;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!hl2Var.a) {
                hl2Var.d(',');
            }
            hl2Var.b();
            return;
        }
        if (iOrdinal == 2) {
            if (hl2Var.a) {
                this.j = true;
                hl2Var.b();
                return;
            }
            if (i % 2 == 0) {
                hl2Var.d(',');
                hl2Var.b();
            } else {
                hl2Var.d(':');
                hl2Var.i();
                z = false;
            }
            this.j = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!hl2Var.a) {
                hl2Var.d(',');
            }
            hl2Var.b();
            wa8.d(this.e, serialDescriptor);
            E(serialDescriptor.e(i));
            hl2Var.d(':');
            hl2Var.i();
            return;
        }
        if (i == 0) {
            this.j = true;
        }
        if (i == 1) {
            hl2Var.d(',');
            hl2Var.i();
            this.j = false;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final v1 a() {
        return this.h;
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final vl2 b(SerialDescriptor serialDescriptor) {
        pa8 pa8Var;
        serialDescriptor.getClass();
        s98 s98Var = this.e;
        d5h d5hVarB = e5h.b(s98Var, serialDescriptor);
        char c = d5hVarB.begin;
        hl2 hl2Var = this.d;
        if (c != 0) {
            hl2Var.d(c);
            hl2Var.a = true;
        }
        String str = this.k;
        if (str != null) {
            String a = this.l;
            if (a == null) {
                a = serialDescriptor.getA();
            }
            hl2Var.b();
            hl2Var.h(str);
            hl2Var.d(':');
            E(a);
            this.k = null;
            this.l = null;
        }
        if (this.f == d5hVarB) {
            return this;
        }
        pa8[] pa8VarArr = this.g;
        return (pa8VarArr == null || (pa8Var = pa8VarArr[d5hVarB.ordinal()]) == null) ? new rue(hl2Var, s98Var, d5hVarB, pa8VarArr) : pa8Var;
    }

    @Override // defpackage.ka6, defpackage.vl2
    public final void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        d5h d5hVar = this.f;
        if (d5hVar.end != 0) {
            hl2 hl2Var = this.d;
            hl2Var.getClass();
            hl2Var.a = false;
            hl2Var.d(d5hVar.end);
        }
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void d(double d) {
        boolean z = this.j;
        hl2 hl2Var = this.d;
        if (z) {
            E(String.valueOf(d));
        } else {
            ((rb8) hl2Var.b).c(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw boa.b(Double.valueOf(d), ((rb8) hl2Var.b).toString());
        }
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void e(byte b) {
        if (this.j) {
            E(String.valueOf((int) b));
        } else {
            this.d.c(b);
        }
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void h(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        E(serialDescriptor.e(i));
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final Encoder i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        boolean zA = sue.a(serialDescriptor);
        d5h d5hVar = this.f;
        s98 s98Var = this.e;
        hl2 jl2Var = this.d;
        if (zA) {
            if (!(jl2Var instanceof kl2)) {
                jl2Var = new kl2((rb8) jl2Var.b, this.j);
            }
            return new rue(jl2Var, s98Var, d5hVar, null);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(la8.a)) {
            if (!(jl2Var instanceof jl2)) {
                jl2Var = new jl2((rb8) jl2Var.b, this.j);
            }
            return new rue(jl2Var, s98Var, d5hVar, null);
        }
        if (this.k != null) {
            this.l = serialDescriptor.getA();
        }
        return this;
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void j(long j) {
        if (this.j) {
            E(String.valueOf(j));
        } else {
            this.d.f(j);
        }
    }

    @Override // defpackage.ka6, defpackage.vl2
    public final <T> void k(SerialDescriptor serialDescriptor, int i, r7e<? super T> r7eVar, T t) {
        serialDescriptor.getClass();
        r7eVar.getClass();
        if (t != null || this.i.c) {
            super.k(serialDescriptor, i, r7eVar, t);
        }
    }

    @Override // defpackage.vl2
    public final boolean m(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return false;
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void n() {
        hl2 hl2Var = this.d;
        hl2Var.getClass();
        ((rb8) hl2Var.b).c("null");
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void o(short s) {
        if (this.j) {
            E(String.valueOf((int) s));
        } else {
            this.d.g(s);
        }
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void p(boolean z) {
        if (this.j) {
            E(String.valueOf(z));
        } else {
            ((rb8) this.d.b).c(String.valueOf(z));
        }
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void s(float f) {
        boolean z = this.j;
        hl2 hl2Var = this.d;
        if (z) {
            E(String.valueOf(f));
        } else {
            ((rb8) hl2Var.b).c(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw boa.b(Float.valueOf(f), ((rb8) hl2Var.b).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> void t(defpackage.r7e<? super T> r5, T r6) {
        /*
            r4 = this;
            r5.getClass()
            s98 r0 = r4.e
            aa8 r1 = r0.a
            boolean r2 = r5 instanceof defpackage.t3
            z52 r1 = r1.g
            if (r2 == 0) goto L12
            z52 r3 = defpackage.z52.a
            if (r1 == r3) goto L44
            goto L3b
        L12:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            r3 = 1
            if (r1 == r3) goto L23
            r0 = 2
            if (r1 != r0) goto L1f
            goto L44
        L1f:
            defpackage.l.g()
            return
        L23:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.get$$serialDesc()
            m7e r1 = r1.f()
            gwe$a r3 = gwe.a.a
            boolean r3 = defpackage.wl7.b(r1, r3)
            if (r3 != 0) goto L3b
            gwe$d r3 = gwe.d.a
            boolean r1 = defpackage.wl7.b(r1, r3)
            if (r1 == 0) goto L44
        L3b:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.get$$serialDesc()
            java.lang.String r0 = defpackage.lfb.c(r0, r1)
            goto L45
        L44:
            r0 = 0
        L45:
            if (r2 == 0) goto L6e
            r1 = r5
            t3 r1 = (defpackage.t3) r1
            if (r6 == 0) goto L62
            r7e r1 = defpackage.ie7.l(r1, r4, r6)
            if (r0 == 0) goto L60
            defpackage.lfb.a(r5, r1, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r1.get$$serialDesc()
            m7e r5 = r5.f()
            defpackage.lfb.b(r5)
        L60:
            r5 = r1
            goto L6e
        L62:
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r1.get$$serialDesc()
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r6 = "Value for serializer "
            defpackage.o6.m(r6, r4, r5)
            return
        L6e:
            if (r0 == 0) goto L7c
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.get$$serialDesc()
            java.lang.String r1 = r1.getA()
            r4.k = r0
            r4.l = r1
        L7c:
            r5.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rue.t(r7e, java.lang.Object):void");
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void u(char c) {
        E(String.valueOf(c));
    }
}
