package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class v9d {

    @uh3(c = "com.indeed.android.profile.components.ResumeUploadSuccessToastKt$ResumeUploadSuccessToast$1$1", f = "ResumeUploadSuccessToast.kt", l = {40}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $onClose;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gu5<j6g> gu5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$onClose = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$onClose, lu2Var);
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
                this.label = 1;
                Object objB = ls3.b(4000L, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            this.$onClose.invoke();
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.components.ResumeUploadSuccessToastKt$ResumeUploadSuccessToastRDI$1$1", f = "ResumeUploadSuccessToast.kt", l = {83}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $onClose;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gu5<j6g> gu5Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$onClose = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$onClose, lu2Var);
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
                this.label = 1;
                Object objB = ls3.b(4000L, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            this.$onClose.invoke();
            return j6g.a;
        }
    }

    public static final void a(final gu5<j6g> gu5Var, androidx.compose.runtime.b bVar, final int i) {
        int i2;
        gu5Var.getClass();
        c cVarH = bVar.h(-933119104);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            j6g j6gVar = j6g.a;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new a(gu5Var, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, j6gVar, (Function2) objV);
            e.a aVar = e.a.b;
            e eVarA = f.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.f.h(g.f(aVar, 1.0f), 12.0f, 0.0f, 2), eu6.k, ggd.a(5.0f)), "upload resume success toast");
            ehd ehdVarA = chd.a(vs0.g, c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            vq6.b(z2b.a(R.drawable.ic_idl_upload_24, 0, cVarH), null, androidx.compose.foundation.layout.f.j(f.a(aVar, "upload icon"), 10.0f, 0.0f, 0.0f, 0.0f, 14), kyb.c, cVarH, 3504, 0);
            cif.b(ak2.I(R.string.resume_upload_successful, cVarH), null, eu6.s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), cVarH, 0, 0, 65530);
            cVarH = cVarH;
            rq6.b(gu5Var, null, false, null, null, ck2.a, cVarH, i3 | 196608, 30);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: u9d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    v9d.a(gu5Var, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(gu5<j6g> gu5Var, androidx.compose.runtime.b bVar, int i) {
        int i2;
        int i3;
        gu5Var.getClass();
        c cVarH = bVar.h(-1867114345);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            j6g j6gVar = j6g.a;
            boolean z = (i2 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new b(gu5Var, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, j6gVar, (Function2) objV);
            e.a aVar = e.a.b;
            e eVarH = androidx.compose.foundation.layout.f.h(g.f(aVar, 1.0f), 12.0f, 0.0f, 2);
            o97.a aVar2 = o97Var.c;
            o97.a.e eVar = aVar2.a;
            e eVarA = f.a(androidx.compose.foundation.a.b(eVarH, aVar2.b.h.a, ggd.a(5.0f)), "upload resume success toast");
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 54);
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
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            vq6.b(z2b.a(2131231407, 0, cVarH), null, androidx.compose.foundation.layout.f.j(f.a(aVar, "upload icon"), 10.0f, 0.0f, 0.0f, 0.0f, 14), eVar.f, cVarH, 432, 0);
            i3 = 1;
            cif.b(ak2.I(R.string.resume_upload_successful_saved, cVarH), androidx.compose.foundation.layout.f.g(aVar, 12.0f, 19.0f), eVar.f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVarH, 48, 0, 65528);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            i3 = 1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new v7d(i, i3, gu5Var);
        }
    }
}
