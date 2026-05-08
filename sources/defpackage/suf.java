package defpackage;

import defpackage.wf1;

/* JADX INFO: loaded from: classes.dex */
public final class suf extends wf1 {

    public static final class a implements wf1.f {
        public final qmf a;
        public final g4b b = new g4b();
        public final int c;

        public a(int i, qmf qmfVar) {
            this.c = i;
            this.a = qmfVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
        
            if (r13 == r16) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
        
            return new wf1.e(r13, -2, r4 + r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
        
            return wf1.e.d;
         */
        @Override // wf1.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final wf1.e a(defpackage.n55 r19, long r20) {
            /*
                r18 = this;
                r0 = r18
                long r4 = r19.getPosition()
                long r1 = r19.getLength()
                long r1 = r1 - r4
                r6 = 112800(0x1b8a0, double:5.57306E-319)
                long r1 = java.lang.Math.min(r6, r1)
                int r1 = (int) r1
                g4b r2 = r0.b
                r2.G(r1)
                byte[] r3 = r2.a
                r6 = 0
                r7 = r19
                r7.h(r6, r3, r1)
                int r1 = r2.c
                r6 = -1
                r10 = r6
                r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L2a:
                int r3 = r2.a()
                r12 = 188(0xbc, float:2.63E-43)
                if (r3 < r12) goto L9d
                byte[] r3 = r2.a
                int r12 = r2.b
            L36:
                if (r12 >= r1) goto L46
                r15 = r3[r12]
                r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r8 = 71
                if (r15 == r8) goto L4b
                int r12 = r12 + 1
                goto L36
            L46:
                r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L4b:
                int r3 = r12 + 188
                if (r3 <= r1) goto L50
                goto La2
            L50:
                int r6 = r0.c
                long r6 = defpackage.wuf.h(r2, r12, r6)
                int r8 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
                if (r8 == 0) goto L98
                qmf r8 = r0.a
                long r6 = r8.b(r6)
                int r8 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
                if (r8 <= 0) goto L7e
                int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
                if (r0 != 0) goto L70
                wf1$e r0 = new wf1$e
                r3 = -1
                r1 = r6
                r0.<init>(r1, r3, r4)
                return r0
            L70:
                long r16 = r4 + r10
                wf1$e r12 = new wf1$e
                r15 = 0
                r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r12.<init>(r13, r15, r16)
                return r12
            L7e:
                r13 = r6
                r6 = 100000(0x186a0, double:4.94066E-319)
                long r6 = r6 + r13
                int r6 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
                if (r6 <= 0) goto L96
                long r0 = (long) r12
                long r10 = r4 + r0
                wf1$e r6 = new wf1$e
                r9 = 0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r6.<init>(r7, r9, r10)
                return r6
            L96:
                long r6 = (long) r12
                r10 = r6
            L98:
                r2.J(r3)
                long r6 = (long) r3
                goto L2a
            L9d:
                r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            La2:
                int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
                if (r0 == 0) goto Laf
                long r16 = r4 + r6
                wf1$e r12 = new wf1$e
                r15 = -2
                r12.<init>(r13, r15, r16)
                return r12
            Laf:
                wf1$e r0 = wf1.e.d
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: suf.a.a(n55, long):wf1$e");
        }

        @Override // wf1.f
        public final void b() {
            byte[] bArr = vjg.b;
            g4b g4bVar = this.b;
            g4bVar.getClass();
            g4bVar.H(bArr.length, bArr);
        }
    }
}
