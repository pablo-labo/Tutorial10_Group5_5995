package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class ez1 implements xxe {
    public final ArrayDeque<a> a = new ArrayDeque<>();
    public final ArrayDeque<bye> b;
    public final ArrayDeque<a> c;
    public a d;
    public long e;
    public long f;
    public long g;

    public static final class a extends aye implements Comparable<a> {
        public long Y;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (h(4) != aVar2.h(4)) {
                return h(4) ? 1 : -1;
            }
            long j = this.f - aVar2.f;
            if (j == 0) {
                j = this.Y - aVar2.Y;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public static final class b extends bye {
        public dz1 f;

        @Override // defpackage.ck3
        public final void o() {
            ez1 ez1Var = (ez1) this.f.b;
            n();
            ez1Var.b.add(this);
        }
    }

    public ez1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new a());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque<bye> arrayDeque = this.b;
            dz1 dz1Var = new dz1(this, 0);
            b bVar = new b();
            bVar.f = dz1Var;
            arrayDeque.add(bVar);
        }
        this.c = new ArrayDeque<>();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.xxe
    public final void a(long j) {
        this.e = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // defpackage.zj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.aye r7) {
        /*
            r6 = this;
            ez1$a r0 = r6.d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            defpackage.ka2.l(r0)
            ez1$a r7 = (ez1.a) r7
            r0 = 4
            boolean r0 = r7.h(r0)
            if (r0 != 0) goto L33
            long r0 = r7.f
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L33
            long r2 = r6.g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L33
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L33
            r7.n()
            java.util.ArrayDeque<ez1$a> r0 = r6.a
            r0.add(r7)
            goto L41
        L33:
            long r0 = r6.f
            r2 = 1
            long r2 = r2 + r0
            r6.f = r2
            r7.Y = r0
            java.util.ArrayDeque<ez1$a> r0 = r6.c
            r0.add(r7)
        L41:
            r7 = 0
            r6.d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez1.c(aye):void");
    }

    @Override // defpackage.zj3
    public final void d(long j) {
        this.g = j;
    }

    @Override // defpackage.zj3
    public final aye e() {
        ka2.q(this.d == null);
        ArrayDeque<a> arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        a aVarPollFirst = arrayDeque.pollFirst();
        this.d = aVarPollFirst;
        return aVarPollFirst;
    }

    @Override // defpackage.zj3
    public void flush() {
        ArrayDeque<a> arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            a aVarPoll = arrayDeque2.poll();
            String str = vjg.a;
            aVarPoll.n();
            arrayDeque.add(aVarPoll);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.n();
            arrayDeque.add(aVar);
            this.d = null;
        }
    }

    public abstract fz1 g();

    public abstract void h(a aVar);

    @Override // defpackage.zj3
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public bye b() {
        ArrayDeque<bye> arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            a aVarPeek = arrayDeque2.peek();
            String str = vjg.a;
            if (aVarPeek.f > this.e) {
                return null;
            }
            a aVarPoll = arrayDeque2.poll();
            boolean zH = aVarPoll.h(4);
            ArrayDeque<a> arrayDeque3 = this.a;
            if (zH) {
                bye byeVarPollFirst = arrayDeque.pollFirst();
                byeVarPollFirst.c(4);
                aVarPoll.n();
                arrayDeque3.add(aVarPoll);
                return byeVarPollFirst;
            }
            h(aVarPoll);
            if (j()) {
                fz1 fz1VarG = g();
                bye byeVarPollFirst2 = arrayDeque.pollFirst();
                long j = aVarPoll.f;
                byeVarPollFirst2.b = j;
                byeVarPollFirst2.d = fz1VarG;
                byeVarPollFirst2.e = j;
                aVarPoll.n();
                arrayDeque3.add(aVarPoll);
                return byeVarPollFirst2;
            }
            aVarPoll.n();
            arrayDeque3.add(aVarPoll);
        }
    }

    public abstract boolean j();

    @Override // defpackage.zj3
    public void release() {
    }
}
