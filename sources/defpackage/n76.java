package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class n76 {

    @uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugScreenKt$DebugScheduleApplyJobs$1$1$1", f = "GhostwriterDebugScreen.kt", l = {368}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Function1<lu2<? super j6g>, Object> $onRefreshJobs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super lu2<? super j6g>, ? extends Object> function1, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$onRefreshJobs = function1;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$onRefreshJobs, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                Function1<lu2<? super j6g>, Object> function1 = this.$onRefreshJobs;
                this.label = 1;
                Object objInvoke = function1.invoke(this);
                g13 g13Var = g13.a;
                if (objInvoke == g13Var) {
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

    @uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugScreenKt$DebugScheduleApplyJobs$2$1$1$1", f = "GhostwriterDebugScreen.kt", l = {376}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Function1<lu2<? super j6g>, Object> $onRefreshJobs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super lu2<? super j6g>, ? extends Object> function1, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$onRefreshJobs = function1;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$onRefreshJobs, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                Function1<lu2<? super j6g>, Object> function1 = this.$onRefreshJobs;
                this.label = 1;
                Object objInvoke = function1.invoke(this);
                g13 g13Var = g13.a;
                if (objInvoke == g13Var) {
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

    public static final void a(final int i, final gu5 gu5Var, androidx.compose.runtime.b bVar, final e eVar, final String str) {
        int i2;
        c cVarH = bVar.h(-108653111);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            gt6.h(str, gu5Var, eVar, null, false, false, null, null, null, cVarH, ((i2 >> 3) & 126) | ((i2 << 6) & 896), DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: k76
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n76.a(ka2.L(i | 1), gu5Var, (b) obj, eVar, str);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final int i, final gu5 gu5Var, androidx.compose.runtime.b bVar, e eVar, final String str, boolean z) {
        int i2;
        final e eVar2;
        final boolean z2;
        c cVarH = bVar.h(-1510396972);
        if ((i & 48) == 0) {
            i2 = (cVarH.x(gu5Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 3456;
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            boolean z3 = (i3 & 112) == 32;
            Object objV = cVarH.v();
            if (z3 || objV == b.a.a) {
                objV = new nt(3, gu5Var);
                cVarH.p(objV);
            }
            a(48, (gu5) objV, cVarH, eVarF, str);
            eVar2 = aVar;
            z2 = true;
        } else {
            cVarH.D();
            eVar2 = eVar;
            z2 = z;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: b76
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n76.b(ka2.L(i | 1), gu5Var, (b) obj, eVar2, str, z2);
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(ah2 ah2Var, androidx.compose.runtime.b bVar, int i) {
        c cVarH = bVar.h(1987397471);
        int i2 = 1;
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            e eVarI = f.i(e.a.b, 16.0f, 8.0f, 16.0f, 8.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarI);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            ah2Var.q(qb2.a, cVarH, 54);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xa3(ah2Var, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final defpackage.gu5 r22, final defpackage.gu5 r23, boolean r24, final java.lang.String r25, final defpackage.ah2 r26, androidx.compose.runtime.b r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n76.d(gu5, gu5, boolean, java.lang.String, ah2, androidx.compose.runtime.b, int, int):void");
    }

    public static final void e(final List<vnd> list, final Function1<? super lu2<? super j6g>, ? extends Object> function1, final boolean z, final Function1<? super vnd, j6g> function12, final Function1<? super vnd, j6g> function13, androidx.compose.runtime.b bVar, final int i) {
        c cVarH = bVar.h(1436302953);
        int i2 = i | (cVarH.x(list) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function13) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objV;
            boolean zX = cVarH.x(e13Var) | cVarH.x(function1);
            Object objV2 = cVarH.v();
            int i3 = 6;
            if (zX || objV2 == c0020a) {
                objV2 = new gq0(i3, e13Var, function1);
                cVarH.p(objV2);
            }
            o7c.a(z, (gu5) objV2, g.d(e.a.b, 1.0f), null, null, null, bh2.c(1735452611, new wu5() { // from class: g76
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ml1) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        List list2 = list;
                        boolean zIsEmpty = list2.isEmpty();
                        int i4 = 2;
                        b.a.C0020a c0020a2 = b.a.a;
                        if (zIsEmpty) {
                            bVar2.L(-1947539636);
                            e13 e13Var2 = e13Var;
                            boolean zX2 = bVar2.x(e13Var2);
                            Function1 function14 = function1;
                            boolean zX3 = zX2 | bVar2.x(function14);
                            Object objV3 = bVar2.v();
                            if (zX3 || objV3 == c0020a2) {
                                objV3 = new oa0(i4, e13Var2, function14);
                                bVar2.p(objV3);
                            }
                            b86.a((gu5) objV3, bVar2, 0);
                            bVar2.F();
                        } else {
                            bVar2.L(-1947352551);
                            ss8 ss8VarA = us8.a(bVar2);
                            Function1 function15 = function12;
                            boolean zK = bVar2.K(function15);
                            Object objV4 = bVar2.v();
                            if (zK || objV4 == c0020a2) {
                                objV4 = new t9(function15, i4);
                                bVar2.p(objV4);
                            }
                            f86.a(list2, ss8VarA, null, (Function1) objV4, function13, bVar2, 0, 4);
                            bVar2.F();
                        }
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, ((i2 >> 6) & 14) | 1573248, 56);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(list, function1, z, function12, function13, i) { // from class: i76
                public final /* synthetic */ List a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(3073);
                    n76.e(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final void f(final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final gu5 gu5Var4, final Function2 function2, final xu5 xu5Var, gu5 gu5Var5, gu5 gu5Var6, final gu5 gu5Var7, final Function2 function22, androidx.compose.runtime.b bVar, final int i) {
        final gu5 gu5Var8;
        gu5 gu5Var9;
        c cVar;
        Object obj;
        int i2;
        final g4a g4aVar;
        ?? r0;
        final g4a g4aVar2;
        c cVar2;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        function2.getClass();
        xu5Var.getClass();
        gu5Var5.getClass();
        gu5Var6.getClass();
        gu5Var7.getClass();
        c cVarH = bVar.h(-753181147);
        int i3 = i | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.x(gu5Var2) ? 32 : 16) | (cVarH.x(gu5Var3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var4) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(xu5Var) ? 131072 : 65536) | (cVarH.x(function22) ? 536870912 : 268435456);
        if (cVarH.o(i3 & 1, (306775187 & i3) != 306775186)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            Object objV = cVarH.v();
            Object obj2 = b.a.a;
            Object obj3 = objV;
            if (objV == obj2) {
                Object objF = r.f(zr4.a);
                cVarH.p(objF);
                obj3 = objF;
            }
            final g4a g4aVar3 = (g4a) obj3;
            Object objV2 = cVarH.v();
            Object objB = objV2;
            if (objV2 == obj2) {
                m74 m74Var = to4.a;
                objB = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objB;
            Object objV3 = cVarH.v();
            Object obj4 = objV3;
            if (objV3 == obj2) {
                Object objF2 = r.f(Boolean.FALSE);
                cVarH.p(objF2);
                obj4 = objF2;
            }
            final g4a g4aVar4 = (g4a) obj4;
            Object objV4 = cVarH.v();
            Object obj5 = objV4;
            if (objV4 == obj2) {
                Object objF3 = r.f(w74.c);
                cVarH.p(objF3);
                obj5 = objF3;
            }
            final g4a g4aVar5 = (g4a) obj5;
            Object objV5 = cVarH.v();
            Object obj6 = objV5;
            if (objV5 == obj2) {
                Object objF4 = r.f(qi3.a);
                cVarH.p(objF4);
                obj6 = objF4;
            }
            g4a g4aVar6 = (g4a) obj6;
            Object objV6 = cVarH.v();
            Object obj7 = objV6;
            if (objV6 == obj2) {
                Object objF5 = r.f(kre.a);
                cVarH.p(objF5);
                obj7 = objF5;
            }
            final g4a g4aVar7 = (g4a) obj7;
            int iOrdinal = ((qi3) g4aVar6.getValue()).ordinal();
            if (iOrdinal == 0) {
                gu5Var8 = gu5Var5;
                gu5Var9 = gu5Var6;
                obj = obj2;
                i2 = 1;
                g4aVar = g4aVar4;
                r0 = 0;
                g4aVar2 = g4aVar5;
                cVarH.L(-1108984603);
                Object objV7 = cVarH.v();
                Object obj8 = objV7;
                if (objV7 == obj) {
                    Object mrVar = new mr(4, g4aVar6, g4aVar7);
                    cVarH.p(mrVar);
                    obj8 = mrVar;
                }
                d(gu5Var, (gu5) obj8, true, "Ghostwriter Debug Screen", bh2.c(112195379, new ro0(2, g4aVar6), cVarH), cVarH, (i3 & 14) | 28080, 0);
                cVarH.U(false);
                j6g j6gVar = j6g.a;
            } else if (iOrdinal != 1) {
                int i4 = 6;
                if (iOrdinal != 2) {
                    int i5 = 3;
                    if (iOrdinal != 3) {
                        cVarH.L(2042439543);
                        cVarH.U(false);
                        l.g();
                        return;
                    }
                    cVarH.L(-1106259610);
                    Object objV8 = cVarH.v();
                    Object obj9 = objV8;
                    if (objV8 == obj2) {
                        Object qvVar = new qv(i5, g4aVar6, g4aVar7);
                        cVarH.p(qvVar);
                        obj9 = qvVar;
                    }
                    gu5 gu5Var10 = (gu5) obj9;
                    Object objV9 = cVarH.v();
                    Object obj10 = objV9;
                    if (objV9 == obj2) {
                        Object ejVar = new ej(i4, g4aVar6, g4aVar7);
                        cVarH.p(ejVar);
                        obj10 = ejVar;
                    }
                    g4aVar2 = g4aVar5;
                    g4aVar = g4aVar4;
                    r0 = 0;
                    d(gu5Var10, (gu5) obj10, false, "View Auto Applies", bh2.c(-857322901, new Function2() { // from class: w66
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj11, Object obj12) {
                            b bVar2 = (b) obj11;
                            int iIntValue = ((Integer) obj12).intValue();
                            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Object objV10 = bVar2.v();
                                b.a.C0020a c0020a = b.a.a;
                                if (objV10 == c0020a) {
                                    objV10 = r.f(Boolean.FALSE);
                                    bVar2.p(objV10);
                                }
                                g4a g4aVar8 = (g4a) objV10;
                                final gu5 gu5Var11 = gu5Var2;
                                List list = (List) gu5Var11.invoke();
                                final g4a g4aVar9 = g4aVar3;
                                g4aVar9.setValue(list);
                                List list2 = (List) g4aVar9.getValue();
                                boolean zK = bVar2.K(gu5Var11);
                                Object objV11 = bVar2.v();
                                if (zK || objV11 == c0020a) {
                                    objV11 = new p76(gu5Var11, g4aVar8, g4aVar9, null);
                                    bVar2.p(objV11);
                                }
                                Function1 function1 = (Function1) objV11;
                                boolean zBooleanValue = ((Boolean) g4aVar8.getValue()).booleanValue();
                                Object objV12 = bVar2.v();
                                final g4a g4aVar10 = g4aVar;
                                final g4a g4aVar11 = g4aVar2;
                                if (objV12 == c0020a) {
                                    objV12 = new ed1(3, g4aVar10, g4aVar11);
                                    bVar2.p(objV12);
                                }
                                Function1 function12 = (Function1) objV12;
                                final e13 e13Var2 = e13Var;
                                boolean zX = bVar2.x(e13Var2);
                                final Function2 function23 = function22;
                                boolean zX2 = bVar2.x(function23) | zX | bVar2.K(gu5Var11);
                                Object objV13 = bVar2.v();
                                if (zX2 || objV13 == c0020a) {
                                    Function1 function13 = new Function1() { // from class: y66
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj13) {
                                            final vnd vndVar = (vnd) obj13;
                                            vndVar.getClass();
                                            final g4a g4aVar12 = g4aVar10;
                                            n76.g(g4aVar12, true);
                                            final e13 e13Var3 = e13Var2;
                                            final Function2 function24 = function23;
                                            final gu5 gu5Var12 = gu5Var11;
                                            final g4a g4aVar13 = g4aVar9;
                                            g4aVar11.setValue(new ah2(577668029, new wu5() { // from class: c76
                                                @Override // defpackage.wu5
                                                public final Object q(Object obj14, Object obj15, Object obj16) {
                                                    b bVar3 = (b) obj15;
                                                    int iIntValue2 = ((Integer) obj16).intValue();
                                                    ((pb2) obj14).getClass();
                                                    if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        final e13 e13Var4 = e13Var3;
                                                        boolean zX3 = bVar3.x(e13Var4);
                                                        final Function2 function25 = function24;
                                                        boolean zX4 = zX3 | bVar3.x(function25);
                                                        final gu5 gu5Var13 = gu5Var12;
                                                        boolean zK2 = zX4 | bVar3.K(gu5Var13);
                                                        Object objV14 = bVar3.v();
                                                        if (zK2 || objV14 == b.a.a) {
                                                            final g4a g4aVar14 = g4aVar12;
                                                            final g4a g4aVar15 = g4aVar13;
                                                            Function1 function14 = new Function1() { // from class: j76
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj17) {
                                                                    String str = (String) obj17;
                                                                    str.getClass();
                                                                    u63.Y(e13Var4, null, null, new q76(function25, str, gu5Var13, g4aVar14, g4aVar15, null), 3);
                                                                    return j6g.a;
                                                                }
                                                            };
                                                            bVar3.p(function14);
                                                            objV14 = function14;
                                                        }
                                                        nx7.a(vndVar, (Function1) objV14, bVar3, 0);
                                                    } else {
                                                        bVar3.D();
                                                    }
                                                    return j6g.a;
                                                }
                                            }, true));
                                            return j6g.a;
                                        }
                                    };
                                    bVar2.p(function13);
                                    objV13 = function13;
                                }
                                n76.e(list2, function1, zBooleanValue, function12, (Function1) objV13, bVar2, 3072);
                            } else {
                                bVar2.D();
                            }
                            return j6g.a;
                        }
                    }, cVarH), cVarH, 27702, 4);
                    cVarH.U(false);
                    j6g j6gVar2 = j6g.a;
                    gu5Var8 = gu5Var5;
                    gu5Var9 = gu5Var6;
                    obj = obj2;
                    i2 = 1;
                } else {
                    r0 = 0;
                    boolean z = false;
                    cVarH.L(-1108361286);
                    Object objV10 = cVarH.v();
                    Object obj11 = objV10;
                    if (objV10 == obj2) {
                        Object x9Var = new x9(i4, g4aVar7, g4aVar6, z ? 1 : 0);
                        cVarH.p(x9Var);
                        obj11 = x9Var;
                    }
                    gu5 gu5Var11 = (gu5) obj11;
                    Object objV11 = cVarH.v();
                    Object obj12 = objV11;
                    if (objV11 == obj2) {
                        Object qjVar = new qj(7, g4aVar6, g4aVar7);
                        cVarH.p(qjVar);
                        obj12 = qjVar;
                    }
                    obj = obj2;
                    Function2 function23 = new Function2() { // from class: m76
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj13, Object obj14) {
                            b bVar2 = (b) obj13;
                            int iIntValue = ((Integer) obj14).intValue();
                            int i6 = 2;
                            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                                List list = (List) gu5Var3.invoke();
                                List list2 = (List) gu5Var4.invoke();
                                g4a g4aVar8 = g4aVar7;
                                kre kreVar = (kre) g4aVar8.getValue();
                                e13 e13Var2 = e13Var;
                                boolean zX = bVar2.x(e13Var2);
                                xu5 xu5Var2 = xu5Var;
                                boolean zX2 = zX | bVar2.x(xu5Var2);
                                Object objV12 = bVar2.v();
                                b.a.C0020a c0020a = b.a.a;
                                if (zX2 || objV12 == c0020a) {
                                    objV12 = new qa3(i6, e13Var2, xu5Var2);
                                    bVar2.p(objV12);
                                }
                                Function2 function24 = (Function2) objV12;
                                Object objV13 = bVar2.v();
                                if (objV13 == c0020a) {
                                    objV13 = new qu(3, g4aVar8);
                                    bVar2.p(objV13);
                                }
                                gu5 gu5Var12 = (gu5) objV13;
                                Object objV14 = bVar2.v();
                                g4a g4aVar9 = g4aVar4;
                                g4a g4aVar10 = g4aVar5;
                                if (objV14 == c0020a) {
                                    objV14 = new nm1(4, g4aVar9, g4aVar10);
                                    bVar2.p(objV14);
                                }
                                Function1 function1 = (Function1) objV14;
                                Object objV15 = bVar2.v();
                                if (objV15 == c0020a) {
                                    objV15 = new ud(g4aVar9, g4aVar10, i6);
                                    bVar2.p(objV15);
                                }
                                Function1 function12 = (Function1) objV15;
                                Object objV16 = bVar2.v();
                                if (objV16 == c0020a) {
                                    objV16 = new su(2, g4aVar8);
                                    bVar2.p(objV16);
                                }
                                oi3.a(list, list2, function24, kreVar, gu5Var12, function1, function12, (gu5) objV16, bVar2, 14376960);
                            } else {
                                bVar2.D();
                            }
                            return j6g.a;
                        }
                    };
                    g4aVar = g4aVar4;
                    g4aVar2 = g4aVar5;
                    i2 = 1;
                    d(gu5Var11, (gu5) obj12, false, "Start Auto Apply", bh2.c(1274342186, function23, cVarH), cVarH, 27702, 4);
                    cVarH.U(false);
                    j6g j6gVar3 = j6g.a;
                    gu5Var8 = gu5Var5;
                    gu5Var9 = gu5Var6;
                }
            } else {
                obj = obj2;
                i2 = 1;
                g4aVar = g4aVar4;
                r0 = 0;
                g4aVar2 = g4aVar5;
                cVarH.L(-1104477606);
                Object objV12 = cVarH.v();
                Object obj13 = objV12;
                if (objV12 == obj) {
                    Object zaVar = new za(g4aVar6, g4aVar7);
                    cVarH.p(zaVar);
                    obj13 = zaVar;
                }
                gu5 gu5Var12 = (gu5) obj13;
                Object objV13 = cVarH.v();
                Object obj14 = objV13;
                if (objV13 == obj) {
                    Object piVar = new pi(4, g4aVar6, g4aVar7);
                    cVarH.p(piVar);
                    obj14 = piVar;
                }
                gu5Var8 = gu5Var5;
                gu5Var9 = gu5Var6;
                d(gu5Var12, (gu5) obj14, false, "Ghostwriter Navigation", bh2.c(1305979308, new uf(i2, gu5Var8, gu5Var9, gu5Var7), cVarH), cVarH, 27702, 4);
                cVarH.U(false);
                j6g j6gVar4 = j6g.a;
            }
            if (((Boolean) g4aVar.getValue()).booleanValue()) {
                cVarH.L(-1103473454);
                hee heeVar = new hee((iy3) cVarH.M(um2.h), 28);
                Object objV14 = cVarH.v();
                Object obj15 = objV14;
                if (objV14 == obj) {
                    Object qg4Var = new qg4(i2, g4aVar);
                    cVarH.p(qg4Var);
                    obj15 = qg4Var;
                }
                nx6.a((gu5) obj15, null, heeVar, null, true, null, bh2.c(1995841924, new h76(g4aVar2, r0), cVarH), cVarH, 1597446, 42);
                cVar2 = cVarH;
            } else {
                cVarH.L(-1112889859);
                cVar2 = cVarH;
            }
            cVar2.U(r0);
            cVar = cVar2;
        } else {
            gu5Var8 = gu5Var5;
            gu5Var9 = gu5Var6;
            cVarH.D();
            cVar = cVarH;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            final gu5 gu5Var13 = gu5Var9;
            iVarW.d = new Function2(gu5Var2, gu5Var3, gu5Var4, function2, xu5Var, gu5Var8, gu5Var13, gu5Var7, function22, i) { // from class: l76
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ gu5 X;
                public final /* synthetic */ Function2 Y;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ Function2 e;
                public final /* synthetic */ xu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj16, Object obj17) {
                    ((Integer) obj17).getClass();
                    int iL = ka2.L(114819073);
                    n76.f(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, (b) obj16, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void g(g4a<Boolean> g4aVar, boolean z) {
        g4aVar.setValue(Boolean.valueOf(z));
    }

    public static final void h(g4a<qi3> g4aVar, g4a<kre> g4aVar2) {
        g4aVar.setValue(qi3.a);
        g4aVar2.setValue(kre.a);
    }

    public static final void i(int i, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(-1065074589);
        if (cVarH.o(i & 1, i != 0)) {
            a84.b(0.0f, 6, 6, 0L, cVarH, g.h(g.f(e.a.b, 1.0f), 1.0f));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new kk2(i, 5);
        }
    }
}
