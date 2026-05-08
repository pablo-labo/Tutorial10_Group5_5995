package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.q5b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fv {
    public static final void a(final boolean z, final Function1 function1, final gu5 gu5Var, final b5g b5gVar, final q5b q5bVar, b bVar, final int i) {
        c cVar;
        int i2;
        int i3;
        iba ibaVar;
        q5b.a aVar;
        function1.getClass();
        gu5Var.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(-962394588);
        int i4 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.d(b5gVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(q5bVar) ? 16384 : 8192);
        int i5 = 1;
        if (cVarH.o(i4 & 1, (i4 & 9363) != 9362)) {
            if (z) {
                i2 = -1790193910;
                i3 = R.string.edit_patent;
            } else {
                i2 = -1790136405;
                i3 = R.string.add_patent;
            }
            String strK = z3.k(cVarH, i2, i3, cVarH, false);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                String str = q5bVar != null ? q5bVar.e : null;
                if (str == null) {
                    str = "";
                }
                objV = r.f(str);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                String str2 = q5bVar != null ? q5bVar.c : null;
                if (str2 == null) {
                    str2 = "";
                }
                objV2 = r.f(str2);
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(q5bVar != null ? q5bVar.f : null);
                cVarH.p(objV3);
            }
            g4a g4aVar3 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                String str3 = q5bVar != null ? q5bVar.d : null;
                objV4 = r.f(str3 != null ? str3 : "");
                cVarH.p(objV4);
            }
            g4a g4aVar4 = (g4a) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = r.f((q5bVar == null || (aVar = q5bVar.b) == null) ? null : aVar.b);
                cVarH.p(objV5);
            }
            g4a g4aVar5 = (g4a) objV5;
            iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV6 = cVarH.v();
            if (zX || objV6 == c0020a) {
                objV6 = new qd(ibaVarB, i5);
                cVarH.p(objV6);
            }
            to4.b(ibaVarB, (Function1) objV6, cVarH);
            boolean zX2 = ((i4 & 896) == 256) | cVarH.x(ibaVarB) | cVarH.K(strK) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048);
            Object objV7 = cVarH.v();
            if (zX2 || objV7 == c0020a) {
                ibaVar = ibaVarB;
                be beVar = new be(gu5Var, g4aVar, g4aVar2, g4aVar3, g4aVar5, g4aVar4, ibaVar, b5gVar, strK, function1);
                cVarH.p(beVar);
                objV7 = beVar;
            } else {
                ibaVar = ibaVarB;
            }
            cVar = cVarH;
            nba.c(ibaVar, "TITLE", null, null, null, null, null, null, null, null, (Function1) objV7, cVar, 0, 0, 1020);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, function1, gu5Var, b5gVar, q5bVar, i) { // from class: mu
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ b5g d;
                public final /* synthetic */ q5b e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    fv.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final gv b(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1962872821:
                if (str.equals("DATE_AWARDED")) {
                    return gv.d;
                }
                return null;
            case -1644461568:
                if (str.equals("PATENT_NUMBER")) {
                    return gv.b;
                }
                return null;
            case 84303:
                if (str.equals("URL")) {
                    return gv.c;
                }
                return null;
            case 79833656:
                if (str.equals("TITLE")) {
                    return gv.a;
                }
                return null;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    return gv.e;
                }
                return null;
            default:
                return null;
        }
    }

    public static final void c(gv gvVar) {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-patent", gvVar, null, 8));
    }
}
