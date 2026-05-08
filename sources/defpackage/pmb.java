package defpackage;

import android.content.res.Resources;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.layout.u;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import defpackage.ytc;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class pmb {

    public static final class a implements PointerInputEventHandler {
        public final /* synthetic */ zrd a;
        public final /* synthetic */ gu5<j6g> b;
        public final /* synthetic */ g4a<z6h> c;

        /* JADX INFO: renamed from: pmb$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.filepreview.screens.PreviewFileScreenKt$PreviewPdfScreen$3$1$1$1", f = "PreviewFileScreen.kt", l = {120}, m = "invokeSuspend")
        public static final class C0390a extends c1f implements Function2<efb, lu2<? super j6g>, Object> {
            final /* synthetic */ gu5<j6g> $onUserZoom;
            final /* synthetic */ zrd $scrollState;
            final /* synthetic */ g4a<z6h> $zoomState$delegate;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: pmb$a$a$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.filepreview.screens.PreviewFileScreenKt$PreviewPdfScreen$3$1$1$1$1", f = "PreviewFileScreen.kt", l = {122, 125}, m = "invokeSuspend")
            public static final class C0391a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
                final /* synthetic */ gu5<j6g> $onUserZoom;
                final /* synthetic */ zrd $scrollState;
                final /* synthetic */ g4a<z6h> $zoomState$delegate;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0391a(zrd zrdVar, gu5<j6g> gu5Var, g4a<z6h> g4aVar, lu2<? super C0391a> lu2Var) {
                    super(2, lu2Var);
                    this.$scrollState = zrdVar;
                    this.$onUserZoom = gu5Var;
                    this.$zoomState$delegate = g4aVar;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    C0391a c0391a = new C0391a(this.$scrollState, this.$onUserZoom, this.$zoomState$delegate, lu2Var);
                    c0391a.L$0 = obj;
                    return c0391a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
                    return ((C0391a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
                
                    if (r11 == r5) goto L15;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0038 -> B:16:0x003b). Please report as a decompilation issue!!! */
                @Override // defpackage.x81
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = r10.L$0
                        l61 r0 = (defpackage.l61) r0
                        int r1 = r10.label
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        g13 r5 = defpackage.g13.a
                        if (r1 == 0) goto L20
                        if (r1 == r4) goto L1c
                        if (r1 != r3) goto L15
                        defpackage.r7d.b(r11)
                        goto L3b
                    L15:
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.r6.g(r10)
                        r10 = 0
                        return r10
                    L1c:
                        defpackage.r7d.b(r11)
                        goto L2e
                    L20:
                        defpackage.r7d.b(r11)
                        r10.L$0 = r0
                        r10.label = r4
                        java.lang.Object r11 = defpackage.i8f.c(r0, r10, r2)
                        if (r11 != r5) goto L2e
                        goto L3a
                    L2e:
                        r10.L$0 = r0
                        r10.label = r3
                        peb r11 = defpackage.peb.b
                        java.lang.Object r11 = r0.B1(r11, r10)
                        if (r11 != r5) goto L3b
                    L3a:
                        return r5
                    L3b:
                        neb r11 = (defpackage.neb) r11
                        r11.getClass()
                        java.util.List<yeb> r1 = r11.a
                        int r6 = r1.size()
                        if (r6 != r3) goto L80
                        g4a<z6h> r6 = r10.$zoomState$delegate
                        java.lang.Object r7 = r6.getValue()
                        z6h r7 = (defpackage.z6h) r7
                        zrd r8 = r10.$scrollState
                        c3a r8 = r8.a
                        dme r8 = (defpackage.dme) r8
                        int r8 = r8.e()
                        zrd r9 = r10.$scrollState
                        int r9 = r9.f()
                        z6h r11 = r7.d(r11, r8, r9)
                        r6.setValue(r11)
                        gu5<j6g> r11 = r10.$onUserZoom
                        r11.invoke()
                        java.util.Iterator r11 = r1.iterator()
                    L70:
                        boolean r6 = r11.hasNext()
                        if (r6 == 0) goto L9c
                        java.lang.Object r6 = r11.next()
                        yeb r6 = (defpackage.yeb) r6
                        r6.a()
                        goto L70
                    L80:
                        int r6 = r1.size()
                        if (r6 != r4) goto L9c
                        int r6 = r11.e
                        if (r6 != r2) goto L8b
                        goto L8d
                    L8b:
                        if (r6 != r4) goto L9c
                    L8d:
                        g4a<z6h> r6 = r10.$zoomState$delegate
                        java.lang.Object r7 = r6.getValue()
                        z6h r7 = (defpackage.z6h) r7
                        z6h r11 = r7.e(r11)
                        r6.setValue(r11)
                    L9c:
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        boolean r11 = defpackage.z92.F0(r1)
                        if (r11 != 0) goto L2e
                        j6g r10 = defpackage.j6g.a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pmb.a.C0390a.C0391a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0390a(zrd zrdVar, gu5<j6g> gu5Var, g4a<z6h> g4aVar, lu2<? super C0390a> lu2Var) {
                super(2, lu2Var);
                this.$scrollState = zrdVar;
                this.$onUserZoom = gu5Var;
                this.$zoomState$delegate = g4aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0390a c0390a = new C0390a(this.$scrollState, this.$onUserZoom, this.$zoomState$delegate, lu2Var);
                c0390a.L$0 = obj;
                return c0390a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
                return ((C0390a) create(efbVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                efb efbVar = (efb) this.L$0;
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    C0391a c0391a = new C0391a(this.$scrollState, this.$onUserZoom, this.$zoomState$delegate, null);
                    this.L$0 = null;
                    this.label = 1;
                    Object objW0 = efbVar.w0(c0391a, this);
                    g13 g13Var = g13.a;
                    if (objW0 == g13Var) {
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

        public a(zrd zrdVar, gu5<j6g> gu5Var, g4a<z6h> g4aVar) {
            this.a = zrdVar;
            this.b = gu5Var;
            this.c = g4aVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
            Object objD = ap5.d(efbVar, new C0390a(this.a, this.b, this.c, null), lu2Var);
            return objD == g13.a ? objD : j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, final List<? extends m07> list, final gu5<j6g> gu5Var, b bVar, final int i) {
        int i2;
        final List<? extends m07> list2;
        ytc.a aVar;
        boolean z2;
        list.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(1723439848);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (cVarH.x(list) ? 32 : 16);
        if (!cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            list2 = list;
            cVarH.D();
        } else {
            if (z) {
                cVarH.L(957609828);
                la5.a(0, cVarH);
                cVarH.U(false);
                i iVarW = cVarH.W();
                if (iVarW != null) {
                    iVarW.d = new Function2() { // from class: nmb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iL = ka2.L(i | 1);
                            pmb.a(z, list, gu5Var, (b) obj, iL);
                            return j6g.a;
                        }
                    };
                    return;
                }
                return;
            }
            cVarH.L(954626202);
            cVarH.U(false);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(new z6h());
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new ff(2, g4aVar);
                cVarH.p(objV2);
            }
            e.a aVar2 = e.a.b;
            e eVarA = s.a(aVar2, (Function1) objV2);
            ag9 ag9VarD = hl1.d(c20.a.h, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ag9VarD, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            zrd zrdVarL = pnb.L(0, 1, cVarH);
            int i4 = (int) (((z6h) g4aVar.getValue()).c & 4294967295L);
            int i5 = (int) ((Resources.getSystem().getDisplayMetrics().density * 64.0f) + 0.5f);
            int size = list.size();
            zrdVarL.getClass();
            float f = i4 / 2.0f;
            float f2 = i5;
            float f3 = ((zrdVarL.f() + i4) - (2.0f * f2)) / size;
            float fE = (((dme) zrdVarL.a).e() + f) - f2;
            int iMin = fE < 0.0f ? 1 : Math.min(((int) (fE / f3)) + 1, size);
            e eVarD = g.d(aVar2, 1.0f);
            j6g j6gVar = j6g.a;
            boolean zK = cVarH.K(zrdVarL);
            Object objV3 = cVarH.v();
            if (zK || objV3 == c0020a) {
                objV3 = new a(zrdVarL, gu5Var, g4aVar);
                cVarH.p(objV3);
            }
            e eVarC2 = androidx.compose.ui.graphics.a.c(f.i(pnb.M(f1f.b(eVarD, j6gVar, (PointerInputEventHandler) objV3), zrdVarL, true), 16.0f, 64.0f, 16.0f, 64.0f), ((z6h) g4aVar.getValue()).a, ((z6h) g4aVar.getValue()).a, 0.0f, Float.intBitsToFloat((int) (((z6h) g4aVar.getValue()).d >> 32)), Float.intBitsToFloat((int) (((z6h) g4aVar.getValue()).d & 4294967295L)), 0.0f, null, 524260);
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new sy(3, g4aVar);
                cVarH.p(objV4);
            }
            e eVarA2 = u.a(eVarC2, (Function1) objV4);
            ob2 ob2VarA = mb2.a(new vs0.i(16.0f, true, new us0(0)), c20.a.m, cVarH, 6);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarA2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            cVarH.L(-467186599);
            int size2 = list.size();
            int i6 = 0;
            while (true) {
                aVar = ytc.a;
                if (i6 >= size2) {
                    break;
                }
                m07 m07Var = list.get(i6);
                if (m07Var != null) {
                    cVarH.L(-1597763949);
                    f17.b(m07Var, ak2.J(R.string.page_number_content_descriptor, new Object[]{Integer.valueOf(i6 + 1), Integer.valueOf(list.size())}, cVarH), androidx.compose.foundation.a.b(g.f(aVar2, 1.0f), da2.e, aVar), ft2.a.d, cVarH, 24960, 232);
                    z2 = false;
                } else {
                    z2 = false;
                    cVarH.L(-1603835330);
                }
                cVarH.U(z2);
                i6++;
            }
            list2 = list;
            cVarH.U(false);
            cVarH.U(true);
            e eVarI = f.i(androidx.compose.foundation.a.b(ygg.h(f.f(aVar2, 16.0f), ggd.a(32.0f)), eu6.l, aVar), 8.0f, 4.0f, 8.0f, 4.0f);
            ag9 ag9VarD2 = hl1.d(c20.a.a, false);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC4 = androidx.compose.ui.c.c(cVarH, eVarI);
            gl2.j.getClass();
            pm8.a aVar4 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar4);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD2, gl2.a.g);
            ygg.y(cVarH, t8bVarP3, gl2.a.f);
            gl2.a.C0251a c0251a2 = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a2);
            }
            ygg.y(cVarH, eVarC4, gl2.a.d);
            fif.b(iMin + " / " + list2.size(), null, eu6.s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, cVarH, 0, 0, 131066);
            cVarH = cVarH;
            cVarH.U(true);
            cVarH.U(true);
        }
        i iVarW2 = cVarH.W();
        if (iVarW2 != null) {
            iVarW2.d = new Function2() { // from class: omb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    pmb.a(z, list2, gu5Var, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i, gu5 gu5Var, b bVar, String str) {
        String str2 = str;
        c cVarF = q6.f(2125149469, gu5Var, bVar, str2);
        int i2 = i | (cVarF.K(str2) ? 32 : 16);
        if (cVarF.o(i2 & 1, (i2 & 147) != 146)) {
            cVarF.L(-1792116603);
            cVarF.U(false);
            Object objV = cVarF.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(new z6h());
                cVarF.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarF.v();
            if (objV2 == c0020a) {
                objV2 = new nh(6, g4aVar);
                cVarF.p(objV2);
            }
            e.a aVar = e.a.b;
            e eVarA = s.a(aVar, (Function1) objV2);
            ag9 ag9VarD = hl1.d(c20.a.h, false);
            int iHashCode = Long.hashCode(cVarF.T);
            t8b t8bVarP = cVarF.P();
            e eVarC = androidx.compose.ui.c.c(cVarF, eVarA);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarF, ag9VarD, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarF, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarF, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarF, eVarC, eVar);
            zrd zrdVarL = pnb.L(0, 1, cVarF);
            e eVarD = g.d(aVar, 1.0f);
            j6g j6gVar = j6g.a;
            boolean zK = cVarF.K(zrdVarL);
            Object objV3 = cVarF.v();
            if (zK || objV3 == c0020a) {
                objV3 = new qmb(zrdVarL, gu5Var, g4aVar);
                cVarF.p(objV3);
            }
            e eVarC2 = androidx.compose.ui.graphics.a.c(f.i(pnb.M(f1f.b(eVarD, j6gVar, (PointerInputEventHandler) objV3), zrdVarL, true), 16.0f, 64.0f, 16.0f, 64.0f), ((z6h) g4aVar.getValue()).a, ((z6h) g4aVar.getValue()).a, 0.0f, Float.intBitsToFloat((int) (((z6h) g4aVar.getValue()).d >> 32)), Float.intBitsToFloat((int) (((z6h) g4aVar.getValue()).d & 4294967295L)), 0.0f, null, 524260);
            Object objV4 = cVarF.v();
            if (objV4 == c0020a) {
                objV4 = new jg4(7, g4aVar);
                cVarF.p(objV4);
            }
            e eVarA2 = u.a(eVarC2, (Function1) objV4);
            ob2 ob2VarA = mb2.a(new vs0.i(16.0f, true, new us0(0)), c20.a.m, cVarF, 6);
            int iHashCode2 = Long.hashCode(cVarF.T);
            t8b t8bVarP2 = cVarF.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarF, eVarA2);
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            ygg.y(cVarF, ob2VarA, dVar);
            ygg.y(cVarF, t8bVarP2, fVar);
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarF, iHashCode2, c0251a);
            }
            ygg.y(cVarF, eVarC3, eVar);
            str2 = str;
            fif.b(str2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, cVarF, (i2 >> 3) & 14, 0, 131070);
            cVarF = cVarF;
            cVarF.U(true);
            cVarF.U(true);
        } else {
            cVarF.D();
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new fq0(str2, i, 3, gu5Var);
        }
    }
}
