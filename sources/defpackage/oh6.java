package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class oh6 extends gq2 {
    public gq2[] q0 = new gq2[4];
    public int r0 = 0;

    public final void I(int i, dzg dzgVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            gq2 gq2Var = this.q0[i2];
            ArrayList<gq2> arrayList2 = dzgVar.a;
            if (!arrayList2.contains(gq2Var)) {
                arrayList2.add(gq2Var);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            sd6.a(this.q0[i3], i, arrayList, dzgVar);
        }
    }
}
