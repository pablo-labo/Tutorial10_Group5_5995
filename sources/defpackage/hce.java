package defpackage;

import android.graphics.Path;
import defpackage.z91;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hce implements a6b, z91.a, ks2 {
    public final boolean b;
    public final j79 c;
    public final qce d;
    public boolean e;
    public final Path a = new Path();
    public final wm2 f = new wm2(0);

    public hce(j79 j79Var, ba1 ba1Var, vce vceVar) {
        this.b = vceVar.d;
        this.c = j79Var;
        qce qceVar = new qce((List) vceVar.c.c);
        this.d = qceVar;
        ba1Var.f(qceVar);
        qceVar.a(this);
    }

    @Override // z91.a
    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    @Override // defpackage.ks2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List<defpackage.ks2> r6, java.util.List<defpackage.ks2> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L41
            java.lang.Object r1 = r1.get(r0)
            ks2 r1 = (defpackage.ks2) r1
            boolean r2 = r1 instanceof defpackage.juf
            if (r2 == 0) goto L2b
            r2 = r1
            juf r2 = (defpackage.juf) r2
            ade$a r3 = r2.c
            ade$a r4 = ade.a.a
            if (r3 != r4) goto L2b
            wm2 r1 = r5.f
            java.lang.Object r1 = r1.a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r2)
            r2.f(r5)
            goto L3e
        L2b:
            boolean r2 = r1 instanceof defpackage.sce
            if (r2 == 0) goto L3e
            if (r7 != 0) goto L36
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L36:
            sce r1 = (defpackage.sce) r1
            r1.g(r5)
            r7.add(r1)
        L3e:
            int r0 = r0 + 1
            goto L2
        L41:
            qce r5 = r5.d
            r5.l = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hce.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.a6b
    public final Path c() {
        boolean z = this.e;
        qce qceVar = this.d;
        Path path = this.a;
        if (z) {
            qceVar.getClass();
            return path;
        }
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        Path pathE = qceVar.e();
        if (pathE == null) {
            return path;
        }
        path.set(pathE);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.a(path);
        this.e = true;
        return path;
    }
}
