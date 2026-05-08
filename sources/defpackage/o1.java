package defpackage;

import android.util.Pair;
import defpackage.emf;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1 extends emf {
    public static final /* synthetic */ int g = 0;
    public final int e;
    public final wee f;

    public o1(wee weeVar) {
        this.f = weeVar;
        this.e = weeVar.getLength();
    }

    @Override // defpackage.emf
    public final int a(boolean z) {
        if (this.e != 0) {
            int iG = z ? this.f.g() : 0;
            do {
                xdb xdbVar = (xdb) this;
                emf[] emfVarArr = xdbVar.l;
                if (!emfVarArr[iG].p()) {
                    return emfVarArr[iG].a(z) + xdbVar.k[iG];
                }
                iG = q(iG, z);
            } while (iG != -1);
        }
        return -1;
    }

    @Override // defpackage.emf
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            xdb xdbVar = (xdb) this;
            Integer num = xdbVar.n.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = xdbVar.l[iIntValue].b(obj3)) != -1) {
                return xdbVar.j[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // defpackage.emf
    public final int c(boolean z) {
        int i = this.e;
        if (i != 0) {
            wee weeVar = this.f;
            int iE = z ? weeVar.e() : i - 1;
            do {
                xdb xdbVar = (xdb) this;
                emf[] emfVarArr = xdbVar.l;
                if (!emfVarArr[iE].p()) {
                    return emfVarArr[iE].c(z) + xdbVar.k[iE];
                }
                iE = z ? weeVar.b(iE) : iE > 0 ? iE - 1 : -1;
            } while (iE != -1);
        }
        return -1;
    }

    @Override // defpackage.emf
    public final int e(int i, int i2, boolean z) {
        xdb xdbVar = (xdb) this;
        int[] iArr = xdbVar.k;
        int iD = vjg.d(iArr, i + 1, false, false);
        int i3 = iArr[iD];
        emf[] emfVarArr = xdbVar.l;
        int iE = emfVarArr[iD].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE != -1) {
            return i3 + iE;
        }
        int iQ = q(iD, z);
        while (iQ != -1 && emfVarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return emfVarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.emf
    public final emf.b f(int i, emf.b bVar, boolean z) {
        xdb xdbVar = (xdb) this;
        int[] iArr = xdbVar.j;
        int iD = vjg.d(iArr, i + 1, false, false);
        int i2 = xdbVar.k[iD];
        xdbVar.l[iD].f(i - iArr[iD], bVar, z);
        bVar.c += i2;
        if (z) {
            Object obj = xdbVar.m[iD];
            Object obj2 = bVar.b;
            obj2.getClass();
            bVar.b = Pair.create(obj, obj2);
        }
        return bVar;
    }

    @Override // defpackage.emf
    public final emf.b g(Object obj, emf.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        xdb xdbVar = (xdb) this;
        Integer num = xdbVar.n.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = xdbVar.k[iIntValue];
        xdbVar.l[iIntValue].g(obj3, bVar);
        bVar.c += i;
        bVar.b = obj;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0030, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0030, code lost:
    
        r1 = r1 - 1;
     */
    @Override // defpackage.emf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            r0 = r7
            xdb r0 = (defpackage.xdb) r0
            int r1 = r8 + 1
            int[] r2 = r0.k
            r3 = 0
            int r1 = defpackage.vjg.d(r2, r1, r3, r3)
            r4 = r2[r1]
            emf[] r0 = r0.l
            r5 = r0[r1]
            int r8 = r8 - r4
            r6 = 2
            if (r9 != r6) goto L17
            goto L18
        L17:
            r3 = r9
        L18:
            int r8 = r5.k(r8, r3, r10)
            r3 = -1
            if (r8 == r3) goto L21
            int r4 = r4 + r8
            return r4
        L21:
            wee r8 = r7.f
            if (r10 == 0) goto L2a
            int r1 = r8.b(r1)
            goto L30
        L2a:
            if (r1 <= 0) goto L2f
        L2c:
            int r1 = r1 + (-1)
            goto L30
        L2f:
            r1 = r3
        L30:
            if (r1 == r3) goto L44
            r4 = r0[r1]
            boolean r4 = r4.p()
            if (r4 == 0) goto L44
            if (r10 == 0) goto L41
            int r1 = r8.b(r1)
            goto L30
        L41:
            if (r1 <= 0) goto L2f
            goto L2c
        L44:
            if (r1 == r3) goto L50
            r7 = r2[r1]
            r8 = r0[r1]
            int r8 = r8.c(r10)
            int r8 = r8 + r7
            return r8
        L50:
            if (r9 != r6) goto L57
            int r7 = r7.c(r10)
            return r7
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1.k(int, int, boolean):int");
    }

    @Override // defpackage.emf
    public final Object l(int i) {
        xdb xdbVar = (xdb) this;
        int[] iArr = xdbVar.j;
        int iD = vjg.d(iArr, i + 1, false, false);
        return Pair.create(xdbVar.m[iD], xdbVar.l[iD].l(i - iArr[iD]));
    }

    @Override // defpackage.emf
    public final emf.d m(int i, emf.d dVar, long j) {
        xdb xdbVar = (xdb) this;
        int[] iArr = xdbVar.k;
        int iD = vjg.d(iArr, i + 1, false, false);
        int i2 = iArr[iD];
        int i3 = xdbVar.j[iD];
        xdbVar.l[iD].m(i - i2, dVar, j);
        Object objCreate = xdbVar.m[iD];
        Object obj = emf.d.p;
        Object obj2 = dVar.a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        dVar.a = objCreate;
        dVar.m += i3;
        dVar.n += i3;
        return dVar;
    }

    public final int q(int i, boolean z) {
        if (z) {
            return this.f.c(i);
        }
        if (i < this.e - 1) {
            return i + 1;
        }
        return -1;
    }
}
