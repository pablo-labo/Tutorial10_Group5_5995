package defpackage;

import androidx.media3.common.a;
import defpackage.m8a;
import defpackage.vuf;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class pe6 implements jp4 {
    public final lzd a;
    public String b;
    public zpf c;
    public a d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final l8a g = new l8a(32);
    public final l8a h = new l8a(33);
    public final l8a i = new l8a(34);
    public final l8a j = new l8a(39);
    public final l8a k = new l8a(40);
    public long m = -9223372036854775807L;
    public final g4b n = new g4b();

    public static final class a {
        public final zpf a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public a(zpf zpfVar) {
            this.a = zpfVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(int i) {
            long j = this.l;
            if (j != -9223372036854775807L) {
                long j2 = this.b;
                long j3 = this.k;
                if (j2 == j3) {
                    return;
                }
                int i2 = (int) (j2 - j3);
                this.a.a(j, this.m ? 1 : 0, i2, i, null);
            }
        }
    }

    public pe6(lzd lzdVar) {
        this.a = lzdVar;
    }

    @Override // defpackage.jp4
    public final void a(g4b g4bVar) {
        int i;
        ka2.r(this.c);
        String str = vjg.a;
        while (g4bVar.a() > 0) {
            int i2 = g4bVar.b;
            int i3 = g4bVar.c;
            byte[] bArr = g4bVar.a;
            this.l += (long) g4bVar.a();
            this.c.f(g4bVar.a(), g4bVar);
            while (i2 < i3) {
                int iB = m8a.b(bArr, i2, i3, this.f);
                if (iB == i3) {
                    g(i2, bArr, i3);
                    return;
                }
                int i4 = (bArr[iB + 3] & 126) >> 1;
                if (iB <= 0 || bArr[iB - 1] != 0) {
                    i = 3;
                } else {
                    iB--;
                    i = 4;
                }
                int i5 = iB;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    g(i2, bArr, i5);
                }
                int i8 = i3 - i5;
                long j = this.l - ((long) i8);
                b(i8, i7 < 0 ? -i7 : 0, j, this.m);
                h(i8, i4, j, this.m);
                i2 = i5 + i6;
            }
        }
    }

    @RequiresNonNull({"output", "sampleReader"})
    public final void b(int i, int i2, long j, long j2) {
        a2d a2dVar = this.a.c;
        a aVar = this.d;
        boolean z = this.e;
        if (aVar.j && aVar.g) {
            aVar.m = aVar.c;
            aVar.j = false;
        } else if (aVar.h || aVar.g) {
            if (z && aVar.i) {
                aVar.a(i + ((int) (j - aVar.b)));
            }
            aVar.k = aVar.b;
            aVar.l = aVar.e;
            aVar.m = aVar.c;
            aVar.i = true;
        }
        if (!this.e) {
            l8a l8aVar = this.g;
            l8aVar.b(i2);
            l8a l8aVar2 = this.h;
            l8aVar2.b(i2);
            l8a l8aVar3 = this.i;
            l8aVar3.b(i2);
            if (l8aVar.c && l8aVar2.c && l8aVar3.c) {
                String str = this.b;
                int i3 = l8aVar.e;
                byte[] bArr = new byte[l8aVar2.e + i3 + l8aVar3.e];
                System.arraycopy(l8aVar.d, 0, bArr, 0, i3);
                System.arraycopy(l8aVar2.d, 0, bArr, l8aVar.e, l8aVar2.e);
                System.arraycopy(l8aVar3.d, 0, bArr, l8aVar.e + l8aVar2.e, l8aVar3.e);
                m8a.h hVarH = m8a.h(l8aVar2.d, 3, l8aVar2.e, null);
                m8a.c cVar = hVarH.b;
                String strA = cVar != null ? d92.a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f) : null;
                a.C0036a c0036a = new a.C0036a();
                c0036a.a = str;
                c0036a.l = st9.p("video/mp2t");
                c0036a.m = st9.p("video/hevc");
                c0036a.j = strA;
                c0036a.t = hVarH.e;
                c0036a.u = hVarH.f;
                c0036a.v = hVarH.g;
                c0036a.w = hVarH.h;
                c0036a.C = new ha2(hVarH.k, hVarH.l, hVarH.m, hVarH.c + 8, hVarH.d + 8, null);
                c0036a.z = hVarH.i;
                c0036a.o = hVarH.j;
                c0036a.D = hVarH.a + 1;
                c0036a.p = Collections.singletonList(bArr);
                androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0036a);
                this.c.d(aVar2);
                int i4 = aVar2.p;
                if (i4 == -1) {
                    bg.h();
                    return;
                } else {
                    a2dVar.c(i4);
                    this.e = true;
                }
            }
        }
        l8a l8aVar4 = this.j;
        boolean zB = l8aVar4.b(i2);
        g4b g4bVar = this.n;
        if (zB) {
            g4bVar.H(m8a.l(l8aVar4.e, l8aVar4.d), l8aVar4.d);
            g4bVar.K(5);
            a2dVar.a(j2, g4bVar);
        }
        l8a l8aVar5 = this.k;
        if (l8aVar5.b(i2)) {
            g4bVar.H(m8a.l(l8aVar5.e, l8aVar5.d), l8aVar5.d);
            g4bVar.K(5);
            a2dVar.a(j2, g4bVar);
        }
    }

    @Override // defpackage.jp4
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        m8a.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.a.c.b(0);
        a aVar = this.d;
        if (aVar != null) {
            aVar.f = false;
            aVar.g = false;
            aVar.h = false;
            aVar.i = false;
            aVar.j = false;
        }
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
        ka2.r(this.c);
        String str = vjg.a;
        if (z) {
            this.a.c.b(0);
            b(0, 0, this.l, this.m);
            h(0, 48, this.l, this.m);
        }
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        this.b = cVar.e;
        cVar.b();
        zpf zpfVarO = o55Var.o(cVar.d, 2);
        this.c = zpfVarO;
        this.d = new a(zpfVarO);
        this.a.a(o55Var, cVar);
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        this.m = j;
    }

    @RequiresNonNull({"sampleReader"})
    public final void g(int i, byte[] bArr, int i2) {
        a aVar = this.d;
        if (aVar.f) {
            int i3 = aVar.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                aVar.g = (bArr[i4] & 128) != 0;
                aVar.f = false;
            } else {
                aVar.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(i, bArr, i2);
            this.h.a(i, bArr, i2);
            this.i.a(i, bArr, i2);
        }
        this.j.a(i, bArr, i2);
        this.k.a(i, bArr, i2);
    }

    @RequiresNonNull({"sampleReader"})
    public final void h(int i, int i2, long j, long j2) {
        a aVar = this.d;
        boolean z = this.e;
        aVar.g = false;
        aVar.h = false;
        aVar.e = j2;
        aVar.d = 0;
        aVar.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (aVar.i && !aVar.j) {
                if (z) {
                    aVar.a(i);
                }
                aVar.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                aVar.h = !aVar.j;
                aVar.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        aVar.c = z2;
        aVar.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }
}
