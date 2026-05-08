package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.r6c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mw {
    public static final void a(final boolean z, final Function1 function1, final gu5 gu5Var, final b5g b5gVar, final r6c r6cVar, b bVar, final int i) {
        c cVar;
        int i2;
        int i3;
        iba ibaVar;
        r6c.a aVar;
        function1.getClass();
        gu5Var.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(-31580042);
        int i4 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.d(b5gVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(r6cVar) ? 16384 : 8192);
        int i5 = 1;
        if (cVarH.o(i4 & 1, (i4 & 9363) != 9362)) {
            if (z) {
                i2 = -202900973;
                i3 = R.string.edit_publication;
            } else {
                i2 = -202838508;
                i3 = R.string.add_publication;
            }
            String strK = z3.k(cVarH, i2, i3, cVarH, false);
            o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(r6cVar != null ? r6cVar.d : null);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(r6cVar != null ? r6cVar.e : null);
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(r6cVar != null ? r6cVar.c : null);
                cVarH.p(objV3);
            }
            g4a g4aVar3 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f((r6cVar == null || (aVar = r6cVar.b) == null) ? null : aVar.b);
                cVarH.p(objV4);
            }
            g4a g4aVar4 = (g4a) objV4;
            iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV5 = cVarH.v();
            if (zX || objV5 == c0020a) {
                objV5 = new kg(ibaVarB, i5);
                cVarH.p(objV5);
            }
            to4.b(ibaVarB, (Function1) objV5, cVarH);
            boolean zX2 = ((i4 & 896) == 256) | cVarH.x(ibaVarB) | cVarH.K(strK) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | cVarH.x(o97Var);
            Object objV6 = cVarH.v();
            if (zX2 || objV6 == c0020a) {
                ibaVar = ibaVarB;
                yv yvVar = new yv(gu5Var, o97Var, g4aVar, g4aVar2, g4aVar4, g4aVar3, ibaVar, b5gVar, strK, function1);
                cVarH.p(yvVar);
                objV6 = yvVar;
            } else {
                ibaVar = ibaVarB;
            }
            cVar = cVarH;
            nba.c(ibaVar, "TITLE", null, null, null, null, null, null, null, null, (Function1) objV6, cVar, 0, 0, 1020);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, function1, gu5Var, b5gVar, r6cVar, i) { // from class: aw
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ b5g d;
                public final /* synthetic */ r6c e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    mw.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final nw b(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -642035075:
                if (str.equals("DATE_PUBLISHED")) {
                    return nw.c;
                }
                return null;
            case 84303:
                if (str.equals("URL")) {
                    return nw.b;
                }
                return null;
            case 79833656:
                if (str.equals("TITLE")) {
                    return nw.a;
                }
                return null;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    return nw.d;
                }
                return null;
            default:
                return null;
        }
    }

    public static final void c(nw nwVar) {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-publication", nwVar, null, 8));
    }
}
