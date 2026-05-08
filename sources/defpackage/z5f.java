package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.z5f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class z5f {

    @uh3(c = "com.indeed.android.myjobs.presentation.components.TabComponentKt$TabBar$1$2$1", f = "TabComponent.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ e2b $pagerState;
        final /* synthetic */ g4a<Integer> $selectedTabIndex$delegate;
        final /* synthetic */ String $switchToNextTabString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2b e2bVar, Context context, String str, g4a<Integer> g4aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$pagerState = e2bVar;
            this.$context = context;
            this.$switchToNextTabString = str;
            this.$selectedTabIndex$delegate = g4aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$pagerState, this.$context, this.$switchToNextTabString, this.$selectedTabIndex$delegate, lu2Var);
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
            if (!this.$pagerState.k.b()) {
                if (this.$selectedTabIndex$delegate.getValue().intValue() != this.$pagerState.k()) {
                    h7g.b(this.$context, this.$switchToNextTabString);
                }
                this.$selectedTabIndex$delegate.setValue(Integer.valueOf(this.$pagerState.k()));
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.components.TabComponentKt$TabBar$2$1", f = "TabComponent.kt", l = {IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ e8a $myJobsViewModel;
        final /* synthetic */ e2b $pagerState;
        int label;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ e2b a;

            public a(e2b e2bVar) {
                this.a = e2bVar;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                Object objV = e2b.v(this.a, ((Number) obj).intValue(), lu2Var);
                return objV == g13.a ? objV : j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e8a e8aVar, e2b e2bVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$myJobsViewModel = e8aVar;
            this.$pagerState = e2bVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$myJobsViewModel, this.$pagerState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
            ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    throw s6.e(obj);
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            nde ndeVar = this.$myJobsViewModel.d;
            a aVar = new a(this.$pagerState);
            this.label = 1;
            ndeVar.getClass();
            nde.o(ndeVar, aVar, this);
            return g13.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.components.TabComponentKt$TabContent$1$1$1$1", f = "TabComponent.kt", l = {215}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ e2b $pagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e2b e2bVar, int i, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$pagerState = e2bVar;
            this.$index = i;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$pagerState, this.$index, lu2Var);
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
                e2b e2bVar = this.$pagerState;
                int i2 = this.$index;
                this.label = 1;
                Object objF = e2bVar.f(i2, zd0.c(0.0f, null, 7), this);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
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

    public static final void a(final int i, final p5f p5fVar, final e2b e2bVar, final e13 e13Var, final boolean z, final Function1<? super Integer, j6g> function1, androidx.compose.runtime.b bVar, final int i2) {
        int i3;
        p5f p5fVar2;
        Function1<? super Integer, j6g> function12;
        e2bVar.getClass();
        e13Var.getClass();
        function1.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(1259585130);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            p5fVar2 = p5fVar;
            i3 |= cVarH.x(p5fVar2) ? 32 : 16;
        } else {
            p5fVar2 = p5fVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.K(e2bVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cVarH.x(e13Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i2 & 24576) == 0) {
            i3 |= cVarH.a(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function12 = function1;
            i3 |= cVarH.x(function12) ? 131072 : 65536;
        } else {
            function12 = function1;
        }
        int i4 = i3;
        if (cVarH.o(i4 & 1, (74899 & i4) != 74898)) {
            e.a aVar = e.a.b;
            if (z) {
                cVarH.L(-828358263);
                u6f.a(i, g.f(aVar, 1.0f), 0L, 0L, 0.0f, bh2.c(-1230487067, new wu5() { // from class: w5f
                    @Override // defpackage.wu5
                    public final Object q(Object obj, Object obj2, Object obj3) {
                        List list = (List) obj;
                        int iIntValue = ((Integer) obj3).intValue();
                        list.getClass();
                        z5f.f(list, i, (b) obj2, iIntValue & 14);
                        return j6g.a;
                    }
                }, cVarH), null, bh2.c(1253569509, new z2e(p5fVar2, i, function12, e13Var, e2bVar), cVarH), cVarH, (i4 & 14) | 12804144, 76);
                cVarH = cVarH;
                cVarH.U(false);
            } else {
                cVarH.L(-827957805);
                u6f.c(i, g.f(aVar, 1.0f), 0L, 0L, bh2.c(723104678, new wu5() { // from class: x5f
                    @Override // defpackage.wu5
                    public final Object q(Object obj, Object obj2, Object obj3) {
                        List list = (List) obj;
                        int iIntValue = ((Integer) obj3).intValue();
                        list.getClass();
                        z5f.f(list, i, (b) obj2, iIntValue & 14);
                        return j6g.a;
                    }
                }, cVarH), null, bh2.c(597976486, new is0(p5fVar, i, function1, e13Var, e2bVar), cVarH), cVarH, (i4 & 14) | 1597488, 44);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: y5f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z5f.a(i, p5fVar, e2bVar, e13Var, z, function1, (b) obj, ka2.L(i2 | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final np3 np3Var, final p5f p5fVar, final int i, androidx.compose.runtime.b bVar, final int i2) {
        int i3;
        androidx.compose.runtime.c cVarH = bVar.h(-195711118);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.K(np3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.x(p5fVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.d(i) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            n1b.a((i3 & 14) | 48, 16380, null, bh2.c(1963674385, new xu5() { // from class: u5f
                @Override // defpackage.xu5
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    b bVar2 = (b) obj3;
                    ((Integer) obj4).getClass();
                    ((u1b) obj).getClass();
                    e eVarD = g.d(e.a.b, 1.0f);
                    ag9 ag9VarD = hl1.d(c20.a.b, false);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarD);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ag9VarD, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    if (iIntValue == i) {
                        bVar2.L(2140407923);
                        ((a6f) p5fVar.a.get(iIntValue)).c.invoke(bVar2, 0);
                    } else {
                        bVar2.L(1921561943);
                    }
                    bVar2.F();
                    bVar2.q();
                    return j6g.a;
                }
            }, cVarH), null, null, null, null, np3Var, null, null, cVarH, g.f(e.a.b, 1.0f), false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: v5f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i2 | 1);
                    z5f.b(np3Var, p5fVar, i, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(p5f p5fVar, e8a e8aVar, androidx.compose.runtime.b bVar, int i) {
        lu2 lu2Var;
        Bundle bundleA;
        p5f p5fVar2 = p5fVar;
        e8aVar.getClass();
        c3a c3aVar = e8aVar.c;
        androidx.compose.runtime.c cVarH = bVar.h(-136780119);
        int i2 = (cVarH.x(p5fVar2) ? 4 : 2) | i | (cVarH.x(e8aVar) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Integer.valueOf(((dme) c3aVar).e()));
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            int iE = ((dme) c3aVar).e();
            boolean zX = cVarH.x(p5fVar2);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new oq(p5fVar2, 27);
                cVarH.p(objV2);
            }
            np3 np3VarB = h2b.b(iE, (gu5) objV2, cVarH, 48, 0);
            hq3 hq3Var = np3VarB.k;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                m74 m74Var = to4.a;
                objV3 = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV3;
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            ArrayList arrayList = p5fVar2.a;
            boolean zK = cVarH.K(arrayList);
            Object objV4 = cVarH.v();
            if (zK || objV4 == c0020a) {
                Iterator it = arrayList.iterator();
                int length = 0;
                while (it.hasNext()) {
                    length += context.getString(((a6f) it.next()).b).length();
                }
                objV4 = Integer.valueOf(length);
                cVarH.p(objV4);
            }
            float fIntValue = ((Number) objV4).intValue() * 18.0f;
            float f = ((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            cVarH.u(-1072256281);
            jrg jrgVarA = z09.a(cVarH);
            if (jrgVarA == null) {
                r6.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            p63 p63VarA = ojd.a(jrgVarA, cVarH);
            vh8 vh8Var = web.d;
            if (vh8Var == null) {
                r6.g("KoinApplication has not been started");
                return;
            }
            qpd qpdVar = (qpd) vh8Var.a.b;
            d dVar = jrgVarA instanceof d ? (d) jrgVarA : null;
            p63 p63VarQ = (dVar == null || (bundleA = dVar.a()) == null) ? null : pnb.Q(bundleA, jrgVarA);
            yd8 yd8VarB = fwc.a.b(ude.class);
            irg viewModelStore = jrgVarA.getViewModelStore();
            viewModelStore.getClass();
            brg brgVarA = p66.a(yd8VarB, viewModelStore, p63VarQ == null ? p63VarA : p63VarQ, null, qpdVar, null);
            cVarH.U(false);
            ude udeVar = (ude) brgVarA;
            Context context2 = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            String strI = ak2.I(R.string.switch_to_next_tab, cVarH);
            e eVarD = g.d(e.a.b, 1.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarD);
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
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            int iIntValue = ((Number) g4aVar.getValue()).intValue();
            boolean z = Float.compare(f, fIntValue) < 0;
            boolean zX2 = cVarH.x(udeVar);
            Object objV5 = cVarH.v();
            if (zX2 || objV5 == c0020a) {
                objV5 = new z9a(2, udeVar, g4aVar);
                cVarH.p(objV5);
            }
            int i3 = (i2 << 3) & 112;
            p5fVar2 = p5fVar;
            a(iIntValue, p5fVar2, np3VarB, e13Var, z, (Function1) objV5, cVarH, i3);
            b(np3VarB, p5fVar2, ((Number) g4aVar.getValue()).intValue(), cVarH, i3);
            Integer numValueOf = Integer.valueOf(np3VarB.k());
            Boolean boolValueOf = Boolean.valueOf(hq3Var.b());
            boolean zK2 = cVarH.K(np3VarB) | cVarH.x(context2) | cVarH.K(strI);
            Object objV6 = cVarH.v();
            if (zK2 || objV6 == c0020a) {
                lu2Var = null;
                a aVar2 = new a(np3VarB, context2, strI, g4aVar, null);
                cVarH.p(aVar2);
                objV6 = aVar2;
            } else {
                lu2Var = null;
            }
            to4.f(numValueOf, boolValueOf, (Function2) objV6, cVarH);
            cVarH.U(true);
            Integer numValueOf2 = Integer.valueOf(np3VarB.k());
            Boolean boolValueOf2 = Boolean.valueOf(hq3Var.b());
            boolean zX3 = cVarH.x(e8aVar) | cVarH.K(np3VarB);
            Object objV7 = cVarH.v();
            if (zX3 || objV7 == c0020a) {
                objV7 = new b(e8aVar, np3VarB, lu2Var);
                cVarH.p(objV7);
            }
            to4.f(numValueOf2, boolValueOf2, (Function2) objV7, cVarH);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ug(p5fVar2, i, 5, e8aVar);
        }
    }

    public static final void d(final a6f a6fVar, final boolean z, androidx.compose.runtime.b bVar, final int i) {
        androidx.compose.runtime.c cVar;
        a6fVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(1879275454);
        int i2 = (cVarH.K(a6fVar) ? 4 : 2) | i | (cVarH.a(z) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            e eVarF = g.f(e.a.b, 1.0f);
            af1.a aVar = c20.a.m;
            e eVarW = g.w(eVarF, aVar, 2);
            ob2 ob2VarA = mb2.a(vs0.c, aVar, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarW);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            cif.b(a6fVar.a, null, z ? eu6.k : eu6.n, 0L, null, z ? to5.d0 : to5.b0, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.b, cVarH, 0, 0, 65498);
            cif.b(ak2.I(a6fVar.b, cVarH), null, z ? eu6.k : eu6.n, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, z ? hz6.d : hz6.c, cVarH, 0, 0, 65530);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, i) { // from class: t5f
                public final /* synthetic */ boolean b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    z5f.d(this.a, this.b, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void e(p5f p5fVar, final int i, final Function1<? super Integer, j6g> function1, final e13 e13Var, final e2b e2bVar, androidx.compose.runtime.b bVar, int i2) {
        androidx.compose.runtime.c cVar;
        function1.getClass();
        e13Var.getClass();
        e2bVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-1368560401);
        int i3 = i2 | (cVarH.x(p5fVar) ? 4 : 2) | (cVarH.d(i) ? 32 : 16);
        boolean zX = cVarH.x(function1);
        int i4 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        int i5 = 16384;
        int i6 = i3 | (zX ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(e13Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(e2bVar) ? 16384 : 8192);
        if (cVarH.o(i6 & 1, (i6 & 9363) != 9362)) {
            final int i7 = 0;
            for (Object obj : p5fVar.a) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    u63.o0();
                    throw null;
                }
                final a6f a6fVar = (a6f) obj;
                boolean z = i7 == i;
                boolean zD = ((i6 & 896) == i4) | cVarH.d(i7) | cVarH.x(e13Var) | ((57344 & i6) == i5);
                Object objV = cVarH.v();
                if (zD || objV == b.a.a) {
                    objV = new gu5() { // from class: q5f
                        @Override // defpackage.gu5
                        public final Object invoke() {
                            int i9 = i7;
                            function1.invoke(Integer.valueOf(i9));
                            u63.Y(e13Var, null, null, new z5f.c(e2bVar, i9, null), 3);
                            return j6g.a;
                        }
                    };
                    cVarH.p(objV);
                }
                androidx.compose.runtime.c cVar2 = cVarH;
                f6f.b(z, (gu5) objV, null, false, bh2.c(-2014238791, new Function2() { // from class: r5f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        b bVar2 = (b) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                            z5f.d(a6fVar, i7 == i, bVar2, 0);
                        } else {
                            bVar2.D();
                        }
                        return j6g.a;
                    }
                }, cVarH), null, 0L, 0L, null, cVar2, 24576, 492);
                i6 = i6;
                cVarH = cVar2;
                i7 = i8;
                i5 = i5;
                i4 = i4;
            }
            cVar = cVarH;
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new ka1(p5fVar, i, function1, e13Var, e2bVar, i2);
        }
    }

    public static final void f(final List<o6f> list, final int i, androidx.compose.runtime.b bVar, final int i2) {
        int i3;
        list.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(624762840);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.x(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.d(i) ? 32 : 16;
        }
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            q6f.a.a(0.0f, 0, 2, eu6.k, cVarH, g.w(androidx.compose.ui.c.a(e.a.b, tf7.a, new s6f(list.get(i))), null, 3));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: s5f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i2 | 1);
                    z5f.f(list, i, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
