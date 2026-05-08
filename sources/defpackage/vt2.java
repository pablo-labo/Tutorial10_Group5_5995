package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vt2 {
    public final SnapshotStateList<wu5<st2, b, Integer, j6g>> a = new SnapshotStateList<>();

    public static void b(vt2 vt2Var, Function2 function2, ah2 ah2Var, gu5 gu5Var, int i) {
        if ((i & 8) != 0) {
            ah2Var = null;
        }
        vt2Var.a.add(new ah2(424163756, new ut2(function2, ah2Var, gu5Var), true));
    }

    public final void a(st2 st2Var, b bVar, int i) {
        c cVarH = bVar.h(1320309496);
        int i2 = (cVarH.K(st2Var) ? 4 : 2) | i | (cVarH.K(this) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList<wu5<st2, b, Integer, j6g>> snapshotStateList = this.a;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                snapshotStateList.get(i3).q(st2Var, cVarH, Integer.valueOf(i2 & 14));
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new tt2(this, i, 0, st2Var);
        }
    }
}
