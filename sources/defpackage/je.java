package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class je {

    public static final class a implements l74 {
        public final /* synthetic */ iba a;
        public final /* synthetic */ de b;

        public a(iba ibaVar, de deVar) {
            this.a = ibaVar;
            this.b = deVar;
        }

        @Override // defpackage.l74
        public final void dispose() {
            iba ibaVar = this.a;
            ibaVar.getClass();
            ibaVar.q.remove(this.b);
        }
    }

    public static final class b implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            je.c(ke.b);
        }
    }

    public static final class c implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            je.c(ke.c);
        }
    }

    public static final void a(final boolean z, final m61 m61Var, final Function1<? super m61, j6g> function1, final gu5<j6g> gu5Var, final b5g b5gVar, androidx.compose.runtime.b bVar, final int i) {
        iba ibaVar;
        function1.getClass();
        gu5Var.getClass();
        b5gVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-1261977420);
        int i2 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.K(m61Var) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.d(b5gVar.ordinal()) ? 16384 : 8192);
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            String strK = z ? z3.k(cVarH, -1720324773, R.string.edit_award, cVarH, false) : z3.k(cVarH, -1720268167, R.string.title_awards, cVarH, false);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(new m61((tg3) null, (String) null, (String) null, 15));
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(m61Var != null ? m61Var.d : null);
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(m61Var != null ? m61Var.b : null);
                cVarH.p(objV3);
            }
            g4a g4aVar3 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f(m61Var != null ? m61Var.c : null);
                cVarH.p(objV4);
            }
            g4a g4aVar4 = (g4a) objV4;
            o97 o97Var = (o97) cVarH.M(p97.a);
            iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV5 = cVarH.v();
            if (zX || objV5 == c0020a) {
                objV5 = new qd(ibaVarB, i3);
                cVarH.p(objV5);
            }
            to4.b(ibaVarB, (Function1) objV5, cVarH);
            boolean zX2 = ((i2 & 7168) == 2048) | cVarH.x(ibaVarB) | cVarH.K(strK) | ((i2 & 896) == 256) | ((i2 & 57344) == 16384) | cVarH.x(o97Var);
            Object objV6 = cVarH.v();
            if (zX2 || objV6 == c0020a) {
                ibaVar = ibaVarB;
                be beVar = new be(gu5Var, o97Var, g4aVar2, g4aVar3, g4aVar, g4aVar4, ibaVar, b5gVar, strK, function1);
                cVarH.p(beVar);
                objV6 = beVar;
            } else {
                ibaVar = ibaVarB;
            }
            nba.c(ibaVar, "TITLE", null, null, null, null, null, null, null, null, (Function1) objV6, cVarH, 0, 0, 1020);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, m61Var, function1, gu5Var, b5gVar, i) { // from class: ce
                public final /* synthetic */ boolean a;
                public final /* synthetic */ m61 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ b5g e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    je.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final ke b(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -1962872821) {
            if (str.equals("DATE_AWARDED")) {
                return ke.b;
            }
            return null;
        }
        if (iHashCode == 79833656) {
            if (str.equals("TITLE")) {
                return ke.a;
            }
            return null;
        }
        if (iHashCode == 428414940 && str.equals("DESCRIPTION")) {
            return ke.c;
        }
        return null;
    }

    public static final void c(ke keVar) {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-award", keVar, null, 8));
    }
}
