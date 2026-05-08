package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.sx1;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sx1 {

    @uh3(c = "com.indeed.android.myjobs.presentation.components.CardCarouselKt$CardCarousel$1$2$1$1$1", f = "CardCarousel.kt", l = {61}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ int $it;
        final /* synthetic */ e2b $pagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2b e2bVar, int i, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$pagerState = e2bVar;
            this.$it = i;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$pagerState, this.$it, lu2Var);
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
                e2b e2bVar = this.$pagerState;
                int i2 = this.$it;
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

    public static final <T> void a(tx1<T> tx1Var, b bVar, int i) {
        int i2;
        ArrayList arrayList = tx1Var.a;
        c cVarH = bVar.h(-531462874);
        int i3 = 4;
        int i4 = (cVarH.x(tx1Var) ? 4 : 2) | i;
        if (cVarH.o(i4 & 1, (i4 & 3) != 2)) {
            e.a aVar = e.a.b;
            e eVarV = g.v(aVar, null, 3);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarV);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            jh2.f(cVarH, g.h(aVar, 5.0f));
            boolean zX = cVarH.x(tx1Var);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new z0(tx1Var, i3);
                cVarH.p(objV);
            }
            final np3 np3VarB = h2b.b(0, (gu5) objV, cVarH, 54, 0);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                m74 m74Var = to4.a;
                objV2 = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objV2;
            i2 = 1;
            n1b.a(384, 16378, null, bh2.c(-1931775089, new o00(tx1Var, 1), cVarH), null, null, f.a(16.0f, 0.0f, 2), null, np3VarB, null, null, cVarH, null, false);
            final boolean z = arrayList.size() > 1;
            e eVarG = ygg.g(aVar, z ? 1.0f : 0.0f);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarG);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            long j = eu6.c;
            int size = arrayList.size();
            long j2 = tx1Var.b;
            boolean zA = cVarH.a(z) | cVarH.x(e13Var) | cVarH.K(np3VarB);
            Object objV3 = cVarH.v();
            if (zA || objV3 == c0020a) {
                objV3 = new Function1() { // from class: rx1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int iIntValue = ((Integer) obj).intValue();
                        if (z) {
                            u63.Y(e13Var, null, null, new sx1.a(np3VarB, iIntValue, null), 3);
                        }
                        return j6g.a;
                    }
                };
                cVarH.p(objV3);
            }
            h1b.a(null, np3VarB, size, 0.0f, null, 0.0f, j, 0L, j2, (Function1) objV3, cVarH, 0);
            cVarH = cVarH;
            cVarH.U(true);
            cVarH.U(true);
        } else {
            i2 = 1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pr(tx1Var, i, i2);
        }
    }
}
