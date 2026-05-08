package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class a2d {
    public final b a;
    public final ArrayDeque<g4b> b = new ArrayDeque<>();
    public final ArrayDeque<a> c = new ArrayDeque<>();
    public final PriorityQueue<a> d = new PriorityQueue<>();
    public int e = -1;
    public a f;

    public static final class a implements Comparable<a> {
        public long b = -9223372036854775807L;
        public final ArrayList a = new ArrayList();

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return Long.compare(this.b, aVar.b);
        }
    }

    public interface b {
        void b(long j, g4b g4bVar);
    }

    public a2d(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r0.b) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r8, defpackage.g4b r10) {
        /*
            r7 = this;
            int r0 = r7.e
            if (r0 == 0) goto L96
            r1 = -1
            java.util.PriorityQueue<a2d$a> r2 = r7.d
            if (r0 == r1) goto L21
            int r0 = r2.size()
            int r3 = r7.e
            if (r0 < r3) goto L21
            java.lang.Object r0 = r2.peek()
            a2d$a r0 = (a2d.a) r0
            java.lang.String r3 = defpackage.vjg.a
            long r3 = r0.b
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L21
            goto L96
        L21:
            java.util.ArrayDeque<g4b> r0 = r7.b
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2f
            g4b r0 = new g4b
            r0.<init>()
            goto L35
        L2f:
            java.lang.Object r0 = r0.pop()
            g4b r0 = (defpackage.g4b) r0
        L35:
            int r3 = r10.a()
            r0.G(r3)
            byte[] r3 = r10.a
            int r10 = r10.b
            byte[] r4 = r0.a
            int r5 = r0.a()
            r6 = 0
            java.lang.System.arraycopy(r3, r10, r4, r6, r5)
            a2d$a r10 = r7.f
            if (r10 == 0) goto L5a
            long r3 = r10.b
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L5a
            java.util.ArrayList r7 = r10.a
            r7.add(r0)
            return
        L5a:
            java.util.ArrayDeque<a2d$a> r10 = r7.c
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L68
            a2d$a r10 = new a2d$a
            r10.<init>()
            goto L6e
        L68:
            java.lang.Object r10 = r10.pop()
            a2d$a r10 = (a2d.a) r10
        L6e:
            java.util.ArrayList r3 = r10.a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 == 0) goto L7a
            r6 = 1
        L7a:
            defpackage.ka2.l(r6)
            boolean r4 = r3.isEmpty()
            defpackage.ka2.q(r4)
            r10.b = r8
            r3.add(r0)
            r2.add(r10)
            r7.f = r10
            int r8 = r7.e
            if (r8 == r1) goto L95
            r7.b(r8)
        L95:
            return
        L96:
            a2d$b r7 = r7.a
            r7.b(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2d.a(long, g4b):void");
    }

    public final void b(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue<a> priorityQueue = this.d;
            if (priorityQueue.size() <= i) {
                return;
            }
            a aVarPoll = priorityQueue.poll();
            String str = vjg.a;
            int i2 = 0;
            while (true) {
                arrayList = aVarPoll.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                this.a.b(aVarPoll.b, (g4b) arrayList.get(i2));
                this.b.push((g4b) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            a aVar = this.f;
            if (aVar != null && aVar.b == aVarPoll.b) {
                this.f = null;
            }
            this.c.push(aVarPoll);
        }
    }

    public final void c(int i) {
        ka2.q(i >= 0);
        this.e = i;
        b(i);
    }
}
