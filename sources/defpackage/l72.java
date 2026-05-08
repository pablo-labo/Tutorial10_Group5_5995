package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.le0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class l72 {
    public static final void a(String str, List list, tjf tjfVar, e eVar, Function1 function1, b bVar, int i) {
        int i2;
        str.getClass();
        function1.getClass();
        c cVarH = bVar.h(-171006561);
        int i3 = (i & 6) == 0 ? (cVarH.K(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= cVarH.x(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cVarH.K(tjfVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i3 |= cVarH.K(eVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i3 |= cVarH.x(function1) ? 16384 : 8192;
        }
        if (cVarH.o(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = (i3 & 14) == 4;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                le0.b bVar2 = new le0.b();
                List list2 = list;
                ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).d());
                }
                ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Pair) it2.next()).e());
                }
                int size = arrayList.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    String str2 = (String) arrayList.get(i5);
                    ke9 ke9VarA = new pxc(str2).a(str, i4);
                    if (ke9VarA != null) {
                        int i6 = ke9VarA.b().a;
                        int i7 = ke9VarA.b().b + 1;
                        String strSubstring = str.substring(i4, i6);
                        if (i4 < i6) {
                            bVar2.g(strSubstring);
                        }
                        int iK = bVar2.k(new foe(eu6.d, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, odf.c, (vbe) null, 61438));
                        try {
                            bVar2.g(str2);
                            j6g j6gVar = j6g.a;
                            bVar2.i(iK);
                            bVar2.a("URL", i6, i7, (String) arrayList2.get(i5));
                            i4 = i7;
                        } catch (Throwable th) {
                            bVar2.i(iK);
                            throw th;
                        }
                    }
                }
                i2 = 1;
                if (i4 < str.length()) {
                    bVar2.g(str.substring(i4, str.length()));
                }
                objV = bVar2.l();
                cVarH.p(objV);
            } else {
                i2 = 1;
            }
            le0 le0Var = (le0) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new kr(i2);
                cVarH.p(objV2);
            }
            e eVarD = androidx.compose.foundation.b.d(eVar, false, null, null, (gu5) objV2, 15);
            boolean zK = cVarH.K(le0Var) | ((57344 & i3) == 16384);
            Object objV3 = cVarH.v();
            if (zK || objV3 == c0020a) {
                objV3 = new gr0(1, le0Var, function1);
                cVarH.p(objV3);
            }
            p72.a(le0Var, eVarD, tjfVar, false, 0, 0, null, (Function1) objV3, cVarH, i3 & 896, 120);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new k72(str, list, tjfVar, eVar, function1, i);
        }
    }
}
