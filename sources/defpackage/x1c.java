package defpackage;

import android.net.Uri;
import androidx.compose.runtime.r;
import androidx.fragment.app.g;
import androidx.navigation.e;
import defpackage.jq7;
import defpackage.ne5;
import defpackage.xh8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x1c extends brg implements xh8 {
    public final g4a V;
    public final g4a W;
    public final g4a X;
    public final g4a Y;
    public final g3a<jz2<String>> Z;
    public final g3a a0;
    public final o8d b;
    public final g4a b0;
    public final zcd c;
    public final g4a c0;
    public final h97 d;
    public final g3a<jz2<Pair<String, Uri>>> d0;
    public final is2 e;
    public final g3a<jz2<Pair<String, Uri>>> e0;
    public final ita f;
    public final g3a f0;
    public final g3a g0;
    public final g3a<jz2<j6g>> h0;
    public final g3a i0;
    public final g3a<jz2<j6g>> j0;
    public final g3a k0;
    public final gse l0;
    public final rqc m0;
    public final g3a<jz2<j6g>> n0;
    public final g3a o0;

    @uh3(c = "com.indeed.android.profile.models.ProfileViewModel$checkShouldShowRdiAlert$1", f = "ProfileViewModel.kt", l = {701}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $currentFileId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$currentFileId = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return x1c.this.new a(this.$currentFileId, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            boolean z = true;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    x1c x1cVar = x1c.this;
                    ((gme) x1cVar.c0).setValue(hjc.a(x1cVar.p(), false, true, 5));
                    zcd zcdVar = x1c.this.c;
                    String str = this.$currentFileId;
                    this.label = 1;
                    obj = zcdVar.B(str, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                if (((ne5.c) obj) != null) {
                    z = false;
                }
                x1c x1cVar2 = x1c.this;
                ((gme) x1cVar2.c0).setValue(hjc.a(x1cVar2.p(), z, false, 4));
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                o6.l("Error checking RDI status: ", e, "ProfileViewModel", false, e);
                x1c x1cVar3 = x1c.this;
                hjc hjcVarP = x1cVar3.p();
                String message = e.getMessage();
                hjcVarP.getClass();
                ((gme) x1cVar3.c0).setValue(new hjc(message, false, false));
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.ProfileViewModel$onRdiWebViewDismissed$1", f = "ProfileViewModel.kt", l = {736, 739}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $currentFileId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$currentFileId = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return x1c.this.new b(this.$currentFileId, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        
            if (r8.n(r0, "jsma-droid", r4, r7) == r6) goto L32;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 0
                java.lang.String r2 = "ProfileViewModel"
                r3 = 2
                r4 = 1
                r5 = 0
                g13 r6 = defpackage.g13.a
                if (r0 == 0) goto L24
                if (r0 == r4) goto L20
                if (r0 != r3) goto L1a
                java.lang.Object r0 = r7.L$0
                ne5$c r0 = (ne5.c) r0
                defpackage.r7d.b(r8)     // Catch: java.lang.Exception -> L18
                goto L68
            L18:
                r7 = move-exception
                goto L7b
            L1a:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r7)
                return r5
            L20:
                defpackage.r7d.b(r8)     // Catch: java.lang.Exception -> L18
                goto L36
            L24:
                defpackage.r7d.b(r8)
                x1c r8 = defpackage.x1c.this     // Catch: java.lang.Exception -> L18
                zcd r8 = r8.c     // Catch: java.lang.Exception -> L18
                java.lang.String r0 = r7.$currentFileId     // Catch: java.lang.Exception -> L18
                r7.label = r4     // Catch: java.lang.Exception -> L18
                java.lang.Object r8 = r8.B(r0, r7)     // Catch: java.lang.Exception -> L18
                if (r8 != r6) goto L36
                goto L67
            L36:
                ne5$c r8 = (ne5.c) r8     // Catch: java.lang.Exception -> L18
                if (r8 == 0) goto L3d
                u8d r0 = r8.c     // Catch: java.lang.Exception -> L18
                goto L3e
            L3d:
                r0 = r5
            L3e:
                u8d r4 = defpackage.u8d.e     // Catch: java.lang.Exception -> L18
                if (r0 == r4) goto L68
                if (r8 == 0) goto L47
                u8d r8 = r8.c     // Catch: java.lang.Exception -> L18
                goto L48
            L47:
                r8 = r5
            L48:
                u8d r0 = defpackage.u8d.f     // Catch: java.lang.Exception -> L18
                if (r8 == r0) goto L68
                java.util.ArrayList r8 = defpackage.lz2.a     // Catch: java.lang.Exception -> L18
                java.lang.String r8 = "RDI DEBUG: User dismissed RDI webview"
                android.util.Log.d(r2, r8, r5)     // Catch: java.lang.Exception -> L18
                x1c r8 = defpackage.x1c.this     // Catch: java.lang.Exception -> L18
                zcd r8 = r8.c     // Catch: java.lang.Exception -> L18
                java.lang.String r0 = r7.$currentFileId     // Catch: java.lang.Exception -> L18
                u8d r4 = defpackage.u8d.d     // Catch: java.lang.Exception -> L18
                r7.L$0 = r5     // Catch: java.lang.Exception -> L18
                r7.label = r3     // Catch: java.lang.Exception -> L18
                java.lang.String r3 = "jsma-droid"
                java.lang.Object r8 = r8.n(r0, r3, r4, r7)     // Catch: java.lang.Exception -> L18
                if (r8 != r6) goto L68
            L67:
                return r6
            L68:
                x1c r7 = defpackage.x1c.this     // Catch: java.lang.Exception -> L18
                hjc r8 = r7.p()     // Catch: java.lang.Exception -> L18
                r0 = 6
                hjc r8 = defpackage.hjc.a(r8, r1, r1, r0)     // Catch: java.lang.Exception -> L18
                g4a r7 = r7.c0     // Catch: java.lang.Exception -> L18
                gme r7 = (defpackage.gme) r7     // Catch: java.lang.Exception -> L18
                r7.setValue(r8)     // Catch: java.lang.Exception -> L18
                goto L82
            L7b:
                java.util.ArrayList r8 = defpackage.lz2.a
                java.lang.String r8 = "Error handling RDI webview dismissal: "
                defpackage.o6.l(r8, r7, r2, r1, r7)
            L82:
                j6g r7 = defpackage.j6g.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: x1c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.profile.models.ProfileViewModel$removeAutoMergeFlag$1", f = "ProfileViewModel.kt", l = {784}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return x1c.this.new c(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                x1c x1cVar = x1c.this;
                zcd zcdVar = x1cVar.c;
                String str = x1cVar.o().h;
                if (str == null) {
                    str = "";
                }
                this.label = 1;
                Serializable serializableJ = zcdVar.J(str, this);
                g13 g13Var = g13.a;
                if (serializableJ == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public x1c(o8d o8dVar, zcd zcdVar) {
        h97 h97VarB = ((ep7) cr8.p(ep7.class)).b();
        exb exbVar = new exb(0);
        eqb eqbVar = new eqb(0);
        is2 is2Var = new is2();
        ita itaVar = new ita();
        o8dVar.getClass();
        zcdVar.getClass();
        this.b = o8dVar;
        this.c = zcdVar;
        this.d = h97VarB;
        this.e = is2Var;
        this.f = itaVar;
        this.V = r.f(exbVar);
        this.W = r.f(eqbVar);
        this.X = r.f(new yz7(16383));
        this.Y = r.f(b5g.a);
        g3a<jz2<String>> g3aVar = new g3a<>();
        this.Z = g3aVar;
        this.a0 = g3aVar;
        this.b0 = r.f(new s88(0));
        this.c0 = r.f(new hjc(0));
        g3a<jz2<Pair<String, Uri>>> g3aVar2 = new g3a<>();
        this.d0 = g3aVar2;
        g3a<jz2<Pair<String, Uri>>> g3aVar3 = new g3a<>();
        this.e0 = g3aVar3;
        this.f0 = g3aVar2;
        this.g0 = g3aVar3;
        g3a<jz2<j6g>> g3aVar4 = new g3a<>();
        this.h0 = g3aVar4;
        this.i0 = g3aVar4;
        g3a<jz2<j6g>> g3aVar5 = new g3a<>();
        this.j0 = g3aVar5;
        this.k0 = g3aVar5;
        gse gseVarE = hh2.e(Boolean.TRUE);
        this.l0 = gseVarE;
        this.m0 = wg2.j(gseVarE);
        g3a<jz2<j6g>> g3aVar6 = new g3a<>();
        this.n0 = g3aVar6;
        this.o0 = g3aVar6;
    }

    public static void D(x1c x1cVar, String str) {
        fv6 fv6Var = fv6.C1;
        x1cVar.getClass();
        str.getClass();
        fv6Var.getClass();
        eqb eqbVarJ = x1cVar.j();
        o91 o91Var = new o91(x1cVar, 17);
        eqbVarJ.getClass();
        ((gme) x1cVar.W).setValue(new eqb(true, str, fv6Var, o91Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        if (r0 == r3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(android.content.Context r23, defpackage.pu2 r24) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.A(android.content.Context, pu2):java.lang.Object");
    }

    public final void B(boolean z) {
        ((gme) this.V).setValue(exb.a(o(), null, null, null, null, false, false, z, null, false, false, false, false, false, false, 65471));
    }

    public final void C(b5g b5gVar) {
        ((gme) this.Y).setValue(b5gVar);
    }

    public final void E(qr2 qr2Var) {
        ((gme) this.V).setValue(exb.a(o(), null, null, null, qr2Var, false, false, false, null, false, false, false, false, false, false, 65527));
    }

    public final void F(String str) {
        ((gme) this.X).setValue(yz7.a(m(), null, null, null, null, null, null, null, null, null, null, str, null, null, null, 15359));
        I();
    }

    public final void G(r48 r48Var) {
        cub cubVar = cub.b;
        if (r48Var != null && r48Var == r48.c) {
            cubVar = cub.a;
        }
        ((gme) this.V).setValue(exb.a(o(), null, cubVar, null, null, false, false, false, null, false, false, false, false, false, false, 65533));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARN: Type inference failed for: r14v5, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r14v9, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [x1c] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(android.content.Context r13, android.net.Uri r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.H(android.content.Context, android.net.Uri, java.lang.String):void");
    }

    public final void I() {
        boolean zH = v1c.h(m().k);
        Set setD1 = z92.D1(m().n);
        er2 er2Var = er2.CityState;
        if (zH) {
            setD1.remove(er2Var);
        } else {
            setD1.add(er2Var);
        }
        ((gme) this.X).setValue(yz7.a(m(), null, null, null, null, null, null, null, null, null, null, null, null, null, z92.E1(setD1), 8191));
    }

    public final void J() {
        Locale locale = m().h;
        Map<String, String> map = v1c.a;
        boolean z = locale != null;
        Set setD1 = z92.D1(m().n);
        er2 er2Var = er2.Country;
        if (z) {
            setD1.remove(er2Var);
        } else {
            setD1.add(er2Var);
        }
        ((gme) this.X).setValue(yz7.a(m(), null, null, null, null, null, null, null, null, null, null, null, null, null, z92.E1(setD1), 8191));
    }

    public final void K() {
        boolean zH = v1c.h(m().b);
        Set setD1 = z92.D1(m().n);
        er2 er2Var = er2.FirstName;
        if (zH) {
            setD1.remove(er2Var);
        } else {
            setD1.add(er2Var);
        }
        ((gme) this.X).setValue(yz7.a(m(), null, null, null, null, null, null, null, null, null, null, null, null, null, z92.E1(setD1), 8191));
    }

    public final void L() {
        boolean zH = v1c.h(m().c);
        Set setD1 = z92.D1(m().n);
        er2 er2Var = er2.LastName;
        if (zH) {
            setD1.remove(er2Var);
        } else {
            setD1.add(er2Var);
        }
        ((gme) this.X).setValue(yz7.a(m(), null, null, null, null, null, null, null, null, null, null, null, null, null, z92.E1(setD1), 8191));
    }

    public final void g() {
        boolean zG = c0h.G();
        g4a g4aVar = this.c0;
        if (!zG || !c0h.B()) {
            ((gme) g4aVar).setValue(hjc.a(p(), false, false, 6));
            return;
        }
        String str = n().b;
        if (str != null && !zve.U(str)) {
            u63.Y(ee3.p(this), null, null, new a(str, null), 3);
        } else {
            ((gme) g4aVar).setValue(hjc.a(p(), false, false, 6));
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.pu2 r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r1 instanceof defpackage.b2c
            if (r2 == 0) goto L17
            r2 = r1
            b2c r2 = (defpackage.b2c) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            b2c r2 = new b2c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L30
            if (r3 != r5) goto L2a
            defpackage.r7d.b(r1)
            goto L40
        L2a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r4
        L30:
            defpackage.r7d.b(r1)
            r2.label = r5
            ita r1 = r0.f
            java.lang.Object r1 = r1.a(r2)
            g13 r2 = defpackage.g13.a
            if (r1 != r2) goto L40
            return r2
        L40:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r15 = r1.booleanValue()
            exb r5 = r0.o()
            r19 = 0
            r20 = 63487(0xf7ff, float:8.8964E-41)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            exb r1 = defpackage.exb.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            g4a r0 = r0.V
            gme r0 = (defpackage.gme) r0
            r0.setValue(r1)
            java.util.ArrayList r0 = defpackage.lz2.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Online status preference fetched: "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ProfileViewModel"
            android.util.Log.d(r1, r0, r4)
            j6g r0 = defpackage.j6g.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.h(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.pu2 r25) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.i(pu2):java.lang.Object");
    }

    public final eqb j() {
        return (eqb) ((gme) this.W).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.pu2 r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            boolean r2 = r0 instanceof defpackage.d2c
            if (r2 == 0) goto L17
            r2 = r0
            d2c r2 = (defpackage.d2c) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            d2c r2 = new d2c
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.result
            g13 r3 = defpackage.g13.a
            int r4 = r2.label
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L32
            if (r4 != r6) goto L2c
            defpackage.r7d.b(r0)
            goto L40
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r5
        L32:
            defpackage.r7d.b(r0)
            zcd r0 = r1.c
            r2.label = r6
            java.io.Serializable r0 = r0.I(r2)
            if (r0 != r3) goto L40
            return r3
        L40:
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r2 = r0.e()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L89
            java.lang.Object r2 = defpackage.z92.Q0(r2)
            e46$o r2 = (e46.o) r2
            if (r2 == 0) goto L89
            monitor-enter(r22)
            exb r6 = r1.o()     // Catch: java.lang.Throwable -> L86
            java.lang.String r14 = r2.a     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r0.d()     // Catch: java.lang.Throwable -> L86
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L86
            boolean r15 = r0.booleanValue()     // Catch: java.lang.Throwable -> L86
            r20 = 0
            r21 = 63999(0xf9ff, float:8.9682E-41)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            exb r0 = defpackage.exb.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L86
            g4a r3 = r1.V     // Catch: java.lang.Throwable -> L86
            gme r3 = (defpackage.gme) r3     // Catch: java.lang.Throwable -> L86
            r3.setValue(r0)     // Catch: java.lang.Throwable -> L86
            j6g r0 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L86
            monitor-exit(r22)
            return r2
        L86:
            r0 = move-exception
            monitor-exit(r22)
            throw r0
        L89:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.k(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.pu2 r24) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.l(pu2):java.lang.Object");
    }

    public final yz7 m() {
        return (yz7) ((gme) this.X).getValue();
    }

    public final s88 n() {
        return (s88) ((gme) this.b0).getValue();
    }

    public final exb o() {
        return (exb) ((gme) this.V).getValue();
    }

    public final hjc p() {
        return (hjc) ((gme) this.c0).getValue();
    }

    public final Locale q() {
        return nn2.E(this.d);
    }

    public final rqc r() {
        return this.m0;
    }

    public final void s(g gVar, e eVar) {
        lr5 lr5VarU;
        eVar.getClass();
        if (gVar != null && (lr5VarU = gVar.u()) != null) {
            ((rq7) cr8.p(rq7.class)).f(lr5VarU, eVar, new jq7.k(j6.c("collectorID", "max-android-profile-options")), "rich-profile-home-screen");
            return;
        }
        ArrayList arrayList = lz2.a;
        w40.n("navigateToProfileReportWebView failed: activity is null", "ProfileViewModel", "navigateToProfileReportWebView failed: activity is null", false);
        ((gme) this.Y).setValue(b5g.c);
    }

    public final void t() {
        ((gme) this.c0).setValue(hjc.a(p(), false, false, 6));
        y(rxb.a);
    }

    public final void u() {
        String str = n().b;
        if (str == null || zve.U(str)) {
            return;
        }
        u63.Y(ee3.p(this), null, null, new b(str, null), 3);
    }

    public final void v() {
        u63.Y(ee3.p(this), null, null, new c(null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(java.lang.String r23, defpackage.gu5 r24, defpackage.gu5 r25, defpackage.pu2 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.w(java.lang.String, gu5, gu5, pu2):java.lang.Object");
    }

    public final void x() {
        ((gme) this.V).setValue(exb.a(o(), null, null, yz7.a(m(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383), null, false, false, false, null, false, false, false, false, false, false, 65531));
    }

    public final void y(rxb rxbVar) {
        ((gme) this.V).setValue(exb.a(o(), rxbVar, null, null, null, false, false, false, null, false, false, false, false, false, false, 65534));
    }

    public final void z(long j) {
        synchronized (this) {
            ((gme) this.b0).setValue(s88.a(n(), null, null, null, null, null, null, null, null, null, null, Long.valueOf(j), null, 24575));
            j6g j6gVar = j6g.a;
        }
    }
}
