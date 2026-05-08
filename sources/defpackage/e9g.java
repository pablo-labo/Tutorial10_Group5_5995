package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.sp7;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e9g {
    public static final void a(Function1 function1, ig3 ig3Var, Function1 function12, b bVar, int i) {
        int i2;
        function1.getClass();
        function12.getClass();
        c cVarH = bVar.h(171413883);
        if ((i & 48) == 0) {
            i2 = (cVarH.x(function1) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (cVarH.K(ig3Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            e eVarF = f.f(e.a.b, 12.0f);
            ob2 ob2VarA = mb2.a(new vs0.i(12.0f, true, new us0(0)), c20.a.m, cVarH, 6);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
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
            rrb.a(ak2.I(ho4.f.a(), cVarH), cVarH, 0);
            int i4 = i3 >> 3;
            gz9.c(function1, ig3Var, ak2.I(R.string.label_add_edu_isCurrent_enrolled, cVarH), false, true, function12, false, 0, 0, null, cVarH, (i4 & 112) | (i4 & 14) | 1597440 | 12582912, 3880);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new yt2(function1, ig3Var, function12, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final boolean z, final gu5 gu5Var, final gu5 gu5Var2, final ei eiVar, final Function1 function1, final ig3 ig3Var, boolean z2, final b5g b5gVar, b bVar, final int i) {
        c cVar;
        final boolean z3;
        int i2;
        int i3;
        gu5Var.getClass();
        gu5Var2.getClass();
        function1.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(-1542346089);
        int i4 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(eiVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | 24576 | (cVarH.K(ig3Var) ? 1048576 : 524288) | 12582912 | (cVarH.d(b5gVar.ordinal()) ? 67108864 : 33554432);
        if (cVarH.o(i4 & 1, (38347923 & i4) != 38347922)) {
            if (z) {
                i2 = -471729559;
                i3 = R.string.label_edit_education;
            } else {
                i2 = -471637334;
                i3 = R.string.label_add_education;
            }
            String strK = z3.k(cVarH, i2, i3, cVarH, false);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            ei eiVar2 = ((Boolean) g4aVar.getValue()).booleanValue() ? eiVar : null;
            Float fValueOf = Float.valueOf(i3c.b(ho4.f.c(), 6));
            boolean z4 = (i4 & 112) == 32;
            Object objV2 = cVarH.v();
            if (z4 || objV2 == c0020a) {
                objV2 = new mg(9, gu5Var);
                cVarH.p(objV2);
            }
            gu5 gu5Var3 = (gu5) objV2;
            boolean z5 = (i4 & 896) == 256;
            Object objV3 = cVarH.v();
            if (z5 || objV3 == c0020a) {
                objV3 = new ta(9, gu5Var2);
                cVarH.p(objV3);
            }
            cVar = cVarH;
            sb1.a(strK, gu5Var3, eiVar2, R.string.done_button_label, null, 0, (gu5) objV3, fValueOf, b5gVar, false, false, false, false, null, 0, bh2.c(314698329, new Function2() { // from class: c9g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e eVarB = nub.b(e.a.b);
                        b5g b5gVar2 = b5gVar;
                        b5g b5gVar3 = b5g.c;
                        hl1.a(nub.a(eVarB, b5gVar2 == b5gVar3, "Add education failed", oub.SAVE), bVar2, 0);
                        Object objV4 = bVar2.v();
                        b.a.C0020a c0020a2 = b.a.a;
                        if (objV4 == c0020a2) {
                            objV4 = new jg4(8, g4aVar);
                            bVar2.p(objV4);
                        }
                        e9g.a(function1, ig3Var, (Function1) objV4, bVar2, 3078);
                        if (b5gVar2 == b5gVar3) {
                            bVar2.L(-735015227);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-add-education", "error-toast", sp7.c.a.c, null, null, 24));
                            boolean zA = bVar2.a(true);
                            ei eiVar3 = eiVar;
                            boolean zK = zA | bVar2.K(eiVar3);
                            Object objV5 = bVar2.v();
                            if (zK || objV5 == c0020a2) {
                                objV5 = new qq(eiVar3, 27);
                                bVar2.p(objV5);
                            }
                            rg0.a((gu5) objV5, bVar2, 0);
                        } else {
                            bVar2.L(-739317655);
                        }
                        bVar2.F();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVar, i4 & 234938368, 196608, 32288);
            z3 = true;
        } else {
            cVar = cVarH;
            cVar.D();
            z3 = z2;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, gu5Var, gu5Var2, eiVar, function1, ig3Var, z3, b5gVar, i) { // from class: d9g
                public final /* synthetic */ boolean V;
                public final /* synthetic */ b5g W;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ ei d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ ig3 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(196609);
                    e9g.b(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
