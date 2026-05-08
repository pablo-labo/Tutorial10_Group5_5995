package defpackage;

import defpackage.gy9;
import defpackage.zsg;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d04 {
    public static final d a;
    public static final e b;
    public static final f c;
    public static final g d;
    public static final h e;
    public static final i f;
    public static final j g;
    public static final k h;
    public static final l i;
    public static final Set<e04> j;
    public static final Map<e04, Integer> k;
    public static final h l;
    public static final a m;
    public static final b n;

    @Deprecated
    public static final c o;
    public static final gy9 p;
    public static final HashMap q;

    public static class a implements jsc {
        @Override // defpackage.jsc
        public final ui8 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class b implements jsc {
        @Override // defpackage.jsc
        public final ui8 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class c implements jsc {
        @Override // defpackage.jsc
        public final ui8 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class d extends ws3 {
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        
            return true;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r4v0, types: [aj3, fj3] */
        /* JADX WARN: Type inference failed for: r4v3, types: [aj3] */
        /* JADX WARN: Type inference failed for: r4v4, types: [aj3] */
        /* JADX WARN: Type inference failed for: r4v7, types: [aj3] */
        @Override // defpackage.e04
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean c(defpackage.jsc r3, defpackage.fj3 r4, defpackage.aj3 r5) {
            /*
                r2 = this;
                r2 = 0
                r3 = 1
                if (r5 == 0) goto L6e
                boolean r0 = defpackage.yz3.s(r4)
                if (r0 == 0) goto L17
                sne r0 = defpackage.yz3.f(r5)
                sne$a r1 = defpackage.sne.a
                if (r0 == r1) goto L17
                boolean r2 = defpackage.d04.d(r4, r5)
                return r2
            L17:
                boolean r0 = r4 instanceof defpackage.uq2
                if (r0 == 0) goto L21
                r0 = r4
                uq2 r0 = (defpackage.uq2) r0
                r0.d()
            L21:
                if (r4 == 0) goto L35
                aj3 r4 = r4.d()
                boolean r0 = r4 instanceof defpackage.t52
                if (r0 == 0) goto L31
                boolean r0 = defpackage.yz3.l(r4)
                if (r0 == 0) goto L35
            L31:
                boolean r0 = r4 instanceof defpackage.lya
                if (r0 == 0) goto L21
            L35:
                if (r4 != 0) goto L38
                goto L6d
            L38:
                if (r5 == 0) goto L6d
                if (r4 != r5) goto L3d
                goto L67
            L3d:
                boolean r0 = r5 instanceof defpackage.lya
                if (r0 == 0) goto L68
                boolean r0 = r4 instanceof defpackage.lya
                if (r0 == 0) goto L6d
                r0 = r4
                lya r0 = (defpackage.lya) r0
                mq5 r0 = r0.h()
                r1 = r5
                lya r1 = (defpackage.lya) r1
                mq5 r1 = r1.h()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L6d
                xx9 r5 = defpackage.yz3.d(r5)
                xx9 r4 = defpackage.yz3.d(r4)
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L6d
            L67:
                return r3
            L68:
                aj3 r5 = r5.d()
                goto L38
            L6d:
                return r2
            L6e:
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r5 = "from"
                r4[r2] = r5
                java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1"
                r4[r3] = r2
                java.lang.String r2 = "isVisible"
                r3 = 2
                r4[r3] = r2
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r2 = java.lang.String.format(r2, r4)
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: d04.d.c(jsc, fj3, aj3):boolean");
        }
    }

    public static class e extends ws3 {
        @Override // defpackage.e04
        public final boolean c(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
            aj3 aj3VarI;
            if (aj3Var == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
            }
            if (d04.a.c(jscVar, fj3Var, aj3Var)) {
                if (jscVar == d04.n) {
                    return true;
                }
                if (jscVar != d04.m && (aj3VarI = yz3.i(fj3Var, t52.class, true)) != null && (jscVar instanceof k47)) {
                    return ((k47) jscVar).a.a().equals(aj3VarI.a());
                }
            }
            return false;
        }
    }

    public static class f extends ws3 {
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
        
            if ((r0.P0() instanceof defpackage.oe4) == false) goto L49;
         */
        @Override // defpackage.e04
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean c(defpackage.jsc r6, defpackage.fj3 r7, defpackage.aj3 r8) {
            /*
                r5 = this;
                r0 = 0
                r1 = 1
                if (r8 == 0) goto L9b
                java.lang.Class<t52> r2 = defpackage.t52.class
                aj3 r3 = defpackage.yz3.i(r7, r2, r1)
                t52 r3 = (defpackage.t52) r3
                aj3 r8 = defpackage.yz3.i(r8, r2, r0)
                t52 r8 = (defpackage.t52) r8
                if (r8 != 0) goto L15
                goto L49
            L15:
                if (r3 == 0) goto L34
                boolean r4 = defpackage.yz3.l(r3)
                if (r4 == 0) goto L34
                aj3 r3 = defpackage.yz3.i(r3, r2, r1)
                t52 r3 = (defpackage.t52) r3
                if (r3 == 0) goto L34
                mge r4 = r8.o()
                t52 r3 = r3.a()
                boolean r3 = defpackage.yz3.r(r4, r3)
                if (r3 == 0) goto L34
                goto L91
            L34:
                boolean r3 = r7 instanceof defpackage.hv1
                if (r3 == 0) goto L40
                r3 = r7
                hv1 r3 = (defpackage.hv1) r3
                hv1 r3 = defpackage.yz3.t(r3)
                goto L41
            L40:
                r3 = r7
            L41:
                aj3 r2 = defpackage.yz3.i(r3, r2, r1)
                t52 r2 = (defpackage.t52) r2
                if (r2 != 0) goto L4a
            L49:
                return r0
            L4a:
                mge r0 = r8.o()
                t52 r2 = r2.a()
                boolean r0 = defpackage.yz3.r(r0, r2)
                if (r0 == 0) goto L92
                d04$c r0 = defpackage.d04.o
                if (r6 != r0) goto L5d
                goto L92
            L5d:
                boolean r0 = r3 instanceof defpackage.hv1
                if (r0 != 0) goto L62
                goto L91
            L62:
                boolean r0 = r3 instanceof defpackage.uq2
                if (r0 == 0) goto L67
                goto L91
            L67:
                d04$b r0 = defpackage.d04.n
                if (r6 != r0) goto L6c
                goto L91
            L6c:
                d04$a r0 = defpackage.d04.m
                if (r6 == r0) goto L92
                if (r6 != 0) goto L73
                goto L92
            L73:
                boolean r0 = r6 instanceof defpackage.bze
                if (r0 == 0) goto L7f
                r0 = r6
                bze r0 = (defpackage.bze) r0
                ui8 r0 = r0.b()
                goto L83
            L7f:
                ui8 r0 = r6.getType()
            L83:
                boolean r2 = defpackage.yz3.r(r0, r8)
                if (r2 != 0) goto L91
                p7g r0 = r0.P0()
                boolean r0 = r0 instanceof defpackage.oe4
                if (r0 == 0) goto L92
            L91:
                return r1
            L92:
                aj3 r8 = r8.d()
                boolean r5 = r5.c(r6, r7, r8)
                return r5
            L9b:
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "from"
                r5[r0] = r6
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3"
                r5[r1] = r6
                java.lang.String r6 = "isVisible"
                r7 = 2
                r5[r7] = r6
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r5 = java.lang.String.format(r6, r5)
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: d04.f.c(jsc, fj3, aj3):boolean");
        }
    }

    public static class g extends ws3 {
        @Override // defpackage.e04
        public final boolean c(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
            if (aj3Var == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
            }
            if (!yz3.d(aj3Var).w(yz3.d(fj3Var))) {
                return false;
            }
            d04.p.a(fj3Var, aj3Var);
            return true;
        }
    }

    public static class h extends ws3 {
        @Override // defpackage.e04
        public final boolean c(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
            if (aj3Var != null) {
                return true;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
        }
    }

    public static class i extends ws3 {
        @Override // defpackage.e04
        public final boolean c(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
            if (aj3Var == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    public static class j extends ws3 {
        @Override // defpackage.e04
        public final boolean c(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
            if (aj3Var == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    public static class k extends ws3 {
        @Override // defpackage.e04
        public final boolean c(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
            if (aj3Var != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
        }
    }

    public static class l extends ws3 {
        @Override // defpackage.e04
        public final boolean c(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
            if (aj3Var != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
        }
    }

    static {
        d dVar = new d(zsg.e.d);
        a = dVar;
        e eVar = new e(zsg.f.d);
        b = eVar;
        f fVar = new f(zsg.g.d);
        c = fVar;
        g gVar = new g(zsg.b.d);
        d = gVar;
        h hVar = new h(zsg.h.d);
        e = hVar;
        i iVar = new i(zsg.d.d);
        f = iVar;
        j jVar = new j(zsg.a.d);
        g = jVar;
        k kVar = new k(zsg.c.d);
        h = kVar;
        l lVar = new l(zsg.i.d);
        i = lVar;
        j = Collections.unmodifiableSet(ut0.I0(new e04[]{dVar, eVar, gVar, iVar}));
        HashMap map = new HashMap(6);
        map.put(eVar, 0);
        map.put(dVar, 0);
        map.put(gVar, 1);
        map.put(fVar, 1);
        map.put(hVar, 2);
        k = Collections.unmodifiableMap(map);
        l = hVar;
        m = new a();
        n = new b();
        o = new c();
        try {
            Iterator it = Arrays.asList(new gy9[0]).iterator();
            p = it.hasNext() ? (gy9) it.next() : gy9.a.a;
            q = new HashMap();
            g(dVar);
            g(eVar);
            g(fVar);
            g(gVar);
            g(hVar);
            g(iVar);
            g(jVar);
            g(kVar);
            g(lVar);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d04.a(int):void");
    }

    public static Integer b(e04 e04Var, e04 e04Var2) {
        if (e04Var == null) {
            a(12);
            throw null;
        }
        if (e04Var2 == null) {
            a(13);
            throw null;
        }
        Integer numR = e04Var.a().r(e04Var2.a());
        if (numR != null) {
            return numR;
        }
        Integer numR2 = e04Var2.a().r(e04Var.a());
        if (numR2 != null) {
            return Integer.valueOf(-numR2.intValue());
        }
        return null;
    }

    public static fj3 c(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
        fj3 fj3VarC;
        if (fj3Var == null) {
            a(8);
            throw null;
        }
        if (aj3Var == null) {
            a(9);
            throw null;
        }
        for (fj3 fj3Var2 = (fj3) fj3Var.a(); fj3Var2 != null && fj3Var2.getVisibility() != f; fj3Var2 = (fj3) yz3.i(fj3Var2, fj3.class, true)) {
            if (!fj3Var2.getVisibility().c(jscVar, fj3Var2, aj3Var)) {
                return fj3Var2;
            }
        }
        if (!(fj3Var instanceof xvf) || (fj3VarC = c(jscVar, ((xvf) fj3Var).R(), aj3Var)) == null) {
            return null;
        }
        return fj3VarC;
    }

    public static boolean d(fj3 fj3Var, aj3 aj3Var) {
        if (aj3Var != null) {
            sne sneVarF = yz3.f(aj3Var);
            return sneVarF != sne.a && sneVarF == yz3.f(fj3Var);
        }
        a(7);
        throw null;
    }

    public static boolean e(e04 e04Var) {
        if (e04Var != null) {
            return e04Var == a || e04Var == b;
        }
        a(14);
        throw null;
    }

    public static boolean f(hv1 hv1Var, aj3 aj3Var) {
        if (hv1Var == null) {
            a(2);
            throw null;
        }
        if (aj3Var != null) {
            return c(n, hv1Var, aj3Var) == null;
        }
        a(3);
        throw null;
    }

    public static void g(ws3 ws3Var) {
        q.put(ws3Var.a, ws3Var);
    }

    public static e04 h(i7 i7Var) {
        if (i7Var == null) {
            a(15);
            throw null;
        }
        e04 e04Var = (e04) q.get(i7Var);
        if (e04Var != null) {
            return e04Var;
        }
        akb.o(i7Var, "Inapplicable visibility: ");
        return null;
    }
}
