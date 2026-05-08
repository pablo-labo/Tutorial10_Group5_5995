package defpackage;

import defpackage.wf1;

/* JADX INFO: loaded from: classes.dex */
public final class k6c extends wf1 {

    public static final class a implements wf1.f {
        public final qmf a;
        public final g4b b = new g4b();

        public a(qmf qmfVar) {
            this.a = qmfVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0114 A[EDGE_INSN: B:68:0x0114->B:52:0x0114 BREAK  A[LOOP:1: B:38:0x00db->B:51:0x0103], SYNTHETIC] */
        @Override // wf1.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final wf1.e a(defpackage.n55 r17, long r18) {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k6c.a.a(n55, long):wf1$e");
        }

        @Override // wf1.f
        public final void b() {
            byte[] bArr = vjg.b;
            g4b g4bVar = this.b;
            g4bVar.getClass();
            g4bVar.H(bArr.length, bArr);
        }
    }

    public static int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
