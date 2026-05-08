package defpackage;

import androidx.media3.exoplayer.source.h;
import defpackage.emf;
import defpackage.v20;
import java.util.HashMap;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class sp3 {
    public static final rp3 h = new rp3();
    public static final Random i = new Random();
    public rj9 d;
    public String f;
    public final emf.d a = new emf.d();
    public final emf.b b = new emf.b();
    public final HashMap<String, a> c = new HashMap<>();
    public emf e = emf.a;
    public long g = -1;

    public final class a {
        public final String a;
        public int b;
        public long c;
        public final h.b d;
        public boolean e;
        public boolean f;

        public a(String str, int i, h.b bVar) {
            this.a = str;
            this.b = i;
            this.c = bVar == null ? -1L : bVar.d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.d = bVar;
        }

        public final boolean a(v20.a aVar) {
            h.b bVar = aVar.d;
            emf emfVar = aVar.b;
            if (bVar == null) {
                return this.b != aVar.c;
            }
            long j = this.c;
            if (j == -1) {
                return false;
            }
            if (bVar.d > j) {
                return true;
            }
            h.b bVar2 = this.d;
            if (bVar2 == null) {
                return false;
            }
            int i = bVar2.b;
            int iB = emfVar.b(bVar.a);
            int iB2 = emfVar.b(bVar2.a);
            if (bVar.d < bVar2.d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar.b()) {
                int i2 = bVar.e;
                return i2 == -1 || i2 > i;
            }
            int i3 = bVar.b;
            int i4 = bVar.c;
            if (i3 <= i) {
                return i3 == i && i4 > bVar2.c;
            }
            return true;
        }

        public final boolean b(emf emfVar, emf emfVar2) {
            h.b bVar;
            int i = this.b;
            if (i < emfVar.o()) {
                sp3 sp3Var = sp3.this;
                emf.d dVar = sp3Var.a;
                emfVar.n(i, dVar);
                for (int i2 = dVar.m; i2 <= dVar.n; i2++) {
                    int iB = emfVar2.b(emfVar.l(i2));
                    if (iB != -1) {
                        i = emfVar2.f(iB, sp3Var.b, false).c;
                        break;
                    }
                }
                i = -1;
            } else if (i >= emfVar2.o()) {
                i = -1;
            }
            this.b = i;
            return i != -1 && ((bVar = this.d) == null || emfVar2.b(bVar.a) != -1);
        }
    }

    public final void a(a aVar) {
        long j = aVar.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final sp3.a b(int r19, androidx.media3.exoplayer.source.h.b r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap<java.lang.String, sp3$a> r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r4.next()
            sp3$a r8 = (sp3.a) r8
            long r9 = r8.c
            androidx.media3.exoplayer.source.h$b r11 = r8.d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            long r9 = r2.d
            sp3 r14 = defpackage.sp3.this
            java.util.HashMap<java.lang.String, sp3$a> r15 = r14.c
            r16 = r12
            java.lang.String r12 = r14.f
            java.lang.Object r12 = r15.get(r12)
            sp3$a r12 = (sp3.a) r12
            if (r12 == 0) goto L4b
            long r12 = r12.c
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 == 0) goto L4b
            goto L50
        L4b:
            long r12 = r14.g
            r14 = 1
            long r12 = r12 + r14
        L50:
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L59
            r8.c = r9
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 != 0) goto L60
            int r9 = r8.b
            if (r1 != r9) goto L16
            goto L83
        L60:
            long r9 = r2.d
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L83
        L71:
            long r12 = r11.d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.b
            int r10 = r11.b
            if (r9 != r10) goto L16
            int r9 = r2.c
            int r10 = r11.c
            if (r9 != r10) goto L16
        L83:
            long r9 = r8.c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto L9b
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8e
            goto L9b
        L8e:
            if (r12 != 0) goto L16
            java.lang.String r9 = defpackage.vjg.a
            androidx.media3.exoplayer.source.h$b r9 = r5.d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r5 = r8
            goto L16
        L9b:
            r5 = r8
            r6 = r9
            goto L16
        L9f:
            if (r5 != 0) goto Lb1
            rp3 r4 = defpackage.sp3.h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            sp3$a r5 = new sp3$a
            r5.<init>(r4, r1, r2)
            r3.put(r4, r5)
        Lb1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp3.b(int, androidx.media3.exoplayer.source.h$b):sp3$a");
    }

    public final synchronized String c(emf emfVar, h.b bVar) {
        return b(emfVar.g(bVar.a, this.b).c, bVar).a;
    }

    @RequiresNonNull({"listener"})
    public final void d(v20.a aVar) {
        h.b bVar;
        emf emfVar = aVar.b;
        int i2 = aVar.c;
        h.b bVar2 = aVar.d;
        boolean zP = emfVar.p();
        String str = this.f;
        HashMap<String, a> map = this.c;
        if (zP) {
            if (str != null) {
                a aVar2 = map.get(str);
                aVar2.getClass();
                a(aVar2);
                return;
            }
            return;
        }
        a aVar3 = map.get(str);
        this.f = b(i2, bVar2).a;
        e(aVar);
        if (bVar2 != null) {
            long j = bVar2.d;
            if (bVar2.b()) {
                if (aVar3 != null && aVar3.c == j && (bVar = aVar3.d) != null && bVar.b == bVar2.b && bVar.c == bVar2.c) {
                    return;
                }
                b(i2, new h.b(bVar2.a, j));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b3, B:42:0x00b7, B:43:0x00be, B:45:0x00c8, B:47:0x00cc), top: B:52:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e(v20.a r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp3.e(v20$a):void");
    }
}
