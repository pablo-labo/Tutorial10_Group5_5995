package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.wle;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l03 {

    public static final class a implements toa {
        public final /* synthetic */ long a;

        public a(long j) {
            this.a = j;
        }

        @Override // defpackage.toa
        public final long a() {
            return this.a;
        }
    }

    public static final class b implements PointerInputEventHandler {
        public final /* synthetic */ udf a;
        public final /* synthetic */ rgf b;

        @uh3(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ rgf $manager;
            final /* synthetic */ udf $observer;
            final /* synthetic */ efb $this_pointerInput;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: l03$b$a$a, reason: collision with other inner class name */
            @uh3(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1094}, m = "invokeSuspend")
            public static final class C0303a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                final /* synthetic */ udf $observer;
                final /* synthetic */ efb $this_pointerInput;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0303a(efb efbVar, udf udfVar, lu2<? super C0303a> lu2Var) {
                    super(2, lu2Var);
                    this.$this_pointerInput = efbVar;
                    this.$observer = udfVar;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0303a(this.$this_pointerInput, this.$observer, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                    return ((C0303a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        r7d.b(obj);
                        efb efbVar = this.$this_pointerInput;
                        udf udfVar = this.$observer;
                        this.label = 1;
                        Object objA = n59.a(efbVar, udfVar, this);
                        g13 g13Var = g13.a;
                        if (objA == g13Var) {
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

            /* JADX INFO: renamed from: l03$b$a$b, reason: collision with other inner class name */
            @uh3(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1097}, m = "invokeSuspend")
            public static final class C0304b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                final /* synthetic */ rgf $manager;
                final /* synthetic */ efb $this_pointerInput;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0304b(efb efbVar, rgf rgfVar, lu2<? super C0304b> lu2Var) {
                    super(2, lu2Var);
                    this.$this_pointerInput = efbVar;
                    this.$manager = rgfVar;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0304b(this.$this_pointerInput, this.$manager, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                    return ((C0304b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        r7d.b(obj);
                        efb efbVar = this.$this_pointerInput;
                        yh yhVar = new yh(this.$manager, 5);
                        this.label = 1;
                        Object objE = i8f.e(efbVar, yhVar, this);
                        g13 g13Var = g13.a;
                        if (objE == g13Var) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(efb efbVar, udf udfVar, rgf rgfVar, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$this_pointerInput = efbVar;
                this.$observer = udfVar;
                this.$manager = rgfVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.$this_pointerInput, this.$observer, this.$manager, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                e13 e13Var = (e13) this.L$0;
                C0303a c0303a = new C0303a(this.$this_pointerInput, this.$observer, null);
                i13 i13Var = i13.d;
                u63.Y(e13Var, null, i13Var, c0303a, 1);
                u63.Y(e13Var, null, i13Var, new C0304b(this.$this_pointerInput, this.$manager, null), 1);
                return j6g.a;
            }
        }

        public b(udf udfVar, rgf rgfVar) {
            this.a = udfVar;
            this.b = rgfVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
            Object objD = f13.d(new a(efbVar, this.a, this.b, null), lu2Var);
            return objD == g13.a ? objD : j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05a2 A[PHI: r14 r22 r27
  0x05a2: PHI (r14v14 t37) = (r14v6 t37), (r14v15 t37) binds: [B:271:0x05a0, B:268:0x0591] A[DONT_GENERATE, DONT_INLINE]
  0x05a2: PHI (r22v10 int) = (r22v7 int), (r22v12 int) binds: [B:271:0x05a0, B:268:0x0591] A[DONT_GENERATE, DONT_INLINE]
  0x05a2: PHI (r27v4 int) = (r27v2 int), (r27v5 int) binds: [B:271:0x05a0, B:268:0x0591] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x064f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x082a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0959  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.jhf r61, final kotlin.jvm.functions.Function1 r62, final androidx.compose.ui.e r63, final defpackage.tjf r64, final defpackage.ftg r65, final kotlin.jvm.functions.Function1 r66, final defpackage.d3a r67, final defpackage.kne r68, final boolean r69, final int r70, final int r71, final defpackage.t37 r72, final defpackage.yg8 r73, final boolean r74, final boolean r75, final defpackage.wu5 r76, androidx.compose.runtime.b r77, final int r78, final int r79) {
        /*
            Method dump skipped, instruction units count: 2516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l03.a(jhf, kotlin.jvm.functions.Function1, androidx.compose.ui.e, tjf, ftg, kotlin.jvm.functions.Function1, d3a, kne, boolean, int, int, t37, yg8, boolean, boolean, wu5, androidx.compose.runtime.b, int, int):void");
    }

    public static final void b(e eVar, rgf rgfVar, ah2 ah2Var, androidx.compose.runtime.b bVar, int i) {
        c cVarH = bVar.h(2036174316);
        int i2 = (cVarH.K(eVar) ? 4 : 2) | i | (cVarH.x(rgfVar) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            ag9 ag9VarD = hl1.d(c20.a.a, true);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            cu2.b(rgfVar, ah2Var, cVarH, (i2 >> 3) & 126);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ch(i, 1, eVar, rgfVar, ah2Var);
        }
    }

    public static final void c(final rgf rgfVar, final boolean z, androidx.compose.runtime.b bVar, final int i) {
        nif nifVarD;
        mif mifVar;
        c cVarH = bVar.h(626339208);
        int i2 = (cVarH.x(rgfVar) ? 4 : 2) | i | (cVarH.a(z) ? 32 : 16);
        if (!cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            cVarH.D();
        } else if (z) {
            cVarH.L(1529773841);
            lu8 lu8Var = rgfVar.d;
            mif mifVar2 = null;
            if (lu8Var != null && (nifVarD = lu8Var.d()) != null && (mifVar = nifVarD.a) != null) {
                lu8 lu8Var2 = rgfVar.d;
                if (!(lu8Var2 != null ? lu8Var2.p : true)) {
                    mifVar2 = mifVar;
                }
            }
            if (mifVar2 == null) {
                cVarH.L(1530097387);
            } else {
                cVarH.L(1530097388);
                if (kjf.c(rgfVar.m().b)) {
                    cVarH.L(2110860558);
                    cVarH.U(false);
                } else {
                    cVarH.L(2109807302);
                    int iC = rgfVar.b.c((int) (rgfVar.m().b >> 32));
                    int iC2 = rgfVar.b.c((int) (rgfVar.m().b & 4294967295L));
                    b5d b5dVarA = mifVar2.a(iC);
                    b5d b5dVarA2 = mifVar2.a(Math.max(iC2 - 1, 0));
                    lu8 lu8Var3 = rgfVar.d;
                    if (lu8Var3 == null || !((Boolean) ((gme) lu8Var3.m).getValue()).booleanValue()) {
                        cVarH.L(2110490542);
                        cVarH.U(false);
                    } else {
                        cVarH.L(2110225306);
                        wgf.a(true, b5dVarA, rgfVar, cVarH, ((i2 << 6) & 896) | 6);
                        cVarH.U(false);
                    }
                    lu8 lu8Var4 = rgfVar.d;
                    if (lu8Var4 == null || !((Boolean) ((gme) lu8Var4.n).getValue()).booleanValue()) {
                        cVarH.L(2110838734);
                        cVarH.U(false);
                    } else {
                        cVarH.L(2110574459);
                        wgf.a(false, b5dVarA2, rgfVar, cVarH, ((i2 << 6) & 896) | 6);
                        cVarH.U(false);
                    }
                    cVarH.U(false);
                }
                lu8 lu8Var5 = rgfVar.d;
                if (lu8Var5 != null) {
                    g4a g4aVar = lu8Var5.l;
                    if (!wl7.b(rgfVar.u.a.b, rgfVar.m().a.b)) {
                        ((gme) g4aVar).setValue(Boolean.FALSE);
                    }
                    if (lu8Var5.b()) {
                        if (((Boolean) ((gme) g4aVar).getValue()).booleanValue()) {
                            rgfVar.q();
                        } else {
                            rgfVar.n();
                        }
                    }
                    j6g j6gVar = j6g.a;
                }
            }
            cVarH.U(false);
            cVarH.U(false);
        } else {
            cVarH.L(1989076778);
            cVarH.U(false);
            rgfVar.n();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, i) { // from class: wz2
                public final /* synthetic */ boolean b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    l03.c(this.a, this.b, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(rgf rgfVar, androidx.compose.runtime.b bVar, int i) {
        le0 le0VarL;
        c cVarH = bVar.h(-1436003720);
        int i2 = (cVarH.x(rgfVar) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            lu8 lu8Var = rgfVar.d;
            if (lu8Var == null || !((Boolean) ((gme) lu8Var.o).getValue()).booleanValue() || (le0VarL = rgfVar.l()) == null || le0VarL.b.length() <= 0) {
                cVarH.L(-2111021718);
                cVarH.U(false);
            } else {
                cVarH.L(-2112330600);
                boolean zK = cVarH.K(rgfVar);
                Object objV = cVarH.v();
                b.a.C0020a c0020a = b.a.a;
                if (zK || objV == c0020a) {
                    objV = new ngf(rgfVar);
                    cVarH.p(objV);
                }
                udf udfVar = (udf) objV;
                iy3 iy3Var = (iy3) cVarH.M(um2.h);
                roa roaVar = rgfVar.b;
                long j = rgfVar.m().b;
                int i3 = kjf.c;
                int iC = roaVar.c((int) (j >> 32));
                lu8 lu8Var2 = rgfVar.d;
                nif nifVarD = lu8Var2 != null ? lu8Var2.d() : null;
                nifVarD.getClass();
                mif mifVar = nifVarD.a;
                qtc qtcVarC = mifVar.c(nic.C(iC, 0, mifVar.a.a.b.length()));
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((iy3Var.t1(2.0f) / 2.0f) + qtcVarC.a)) << 32) | (((long) Float.floatToRawIntBits(qtcVarC.d)) & 4294967295L);
                boolean zE = cVarH.e(jFloatToRawIntBits);
                Object objV2 = cVarH.v();
                if (zE || objV2 == c0020a) {
                    objV2 = new a(jFloatToRawIntBits);
                    cVarH.p(objV2);
                }
                toa toaVar = (toa) objV2;
                boolean zX = cVarH.x(udfVar) | cVarH.x(rgfVar);
                Object objV3 = cVarH.v();
                if (zX || objV3 == c0020a) {
                    objV3 = new b(udfVar, rgfVar);
                    cVarH.p(objV3);
                }
                e eVarB = f1f.b(e.a.b, udfVar, (PointerInputEventHandler) objV3);
                boolean zE2 = cVarH.e(jFloatToRawIntBits);
                Object objV4 = cVarH.v();
                if (zE2 || objV4 == c0020a) {
                    objV4 = new Function1() { // from class: uz2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((s5e) obj).a(t3e.a, new s3e(jf6.a, jFloatToRawIntBits, r3e.b, true));
                            return j6g.a;
                        }
                    };
                    cVarH.p(objV4);
                }
                y60.a(toaVar, b5e.b(eVarB, false, (Function1) objV4), 0L, cVarH, 0);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new vz2(rgfVar, i, 0);
        }
    }

    public static final void e(lu8 lu8Var) {
        whf whfVar = lu8Var.e;
        if (whfVar != null) {
            lu8Var.v.invoke(jhf.a((jhf) lu8Var.d.a, null, 0L, 3));
            rhf rhfVar = whfVar.a;
            AtomicReference<whf> atomicReference = rhfVar.b;
            while (true) {
                if (atomicReference.compareAndSet(whfVar, null)) {
                    rhfVar.a.c();
                    break;
                } else if (atomicReference.get() != whfVar) {
                    break;
                }
            }
        }
        lu8Var.e = null;
    }

    public static final void f(lu8 lu8Var, jhf jhfVar, roa roaVar) {
        wle.e.getClass();
        wle wleVarA = wle.a.a();
        Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
        wle wleVarB = wle.a.b(wleVarA);
        try {
            nif nifVarD = lu8Var.d();
            if (nifVarD == null) {
                return;
            }
            whf whfVar = lu8Var.e;
            if (whfVar == null) {
                return;
            }
            sl8 sl8VarC = lu8Var.c();
            if (sl8VarC == null) {
                return;
            }
            jef.a(jhfVar, lu8Var.a, nifVarD.a, sl8VarC, whfVar, lu8Var.b(), roaVar);
            j6g j6gVar = j6g.a;
        } finally {
            wle.a.e(wleVarA, wleVarB, function1E);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Object, whf] */
    public static final void g(rhf rhfVar, lu8 lu8Var, jhf jhfVar, t37 t37Var, roa roaVar) {
        j04 j04Var = lu8Var.d;
        pq pqVar = lu8Var.v;
        or orVar = lu8Var.w;
        luc lucVar = new luc();
        t2d t2dVar = new t2d(j04Var, pqVar, lucVar);
        scb scbVar = rhfVar.a;
        scbVar.g(jhfVar, t37Var, t2dVar, orVar);
        ?? whfVar = new whf(rhfVar, scbVar);
        rhfVar.b.set((whf) whfVar);
        lucVar.element = whfVar;
        lu8Var.e = whfVar;
        f(lu8Var, jhfVar, roaVar);
    }
}
