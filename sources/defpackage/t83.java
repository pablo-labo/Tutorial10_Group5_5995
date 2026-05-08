package defpackage;

import defpackage.e47;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t83 implements wxe {
    public static final uq1 c;
    public final e47<e47<n83>> a;
    public final long[] b;

    static {
        kaa kaaVar = kaa.a;
        p6 p6Var = new p6(5);
        kaaVar.getClass();
        c = new uq1(p6Var, kaaVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t83(defpackage.qyc r19) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t83.<init>(qyc):void");
    }

    @Override // defpackage.wxe
    public final int a(long j) {
        int iA = vjg.a(this.b, j, false);
        if (iA < this.a.size()) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.wxe
    public final List e(long j) {
        int iE = vjg.e(this.b, j, false);
        if (iE != -1) {
            return this.a.get(iE);
        }
        e47.b bVar = e47.b;
        return qyc.e;
    }

    @Override // defpackage.wxe
    public final long f(int i) {
        ka2.l(i < this.a.size());
        return this.b[i];
    }

    @Override // defpackage.wxe
    public final int m() {
        return this.a.size();
    }
}
