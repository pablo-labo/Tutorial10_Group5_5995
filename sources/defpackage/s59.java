package defpackage;

import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class s59 {
    public final PriorityQueue a = new PriorityQueue(11);
    public final PriorityQueue b = new PriorityQueue(11, uad.a);
    public double c;
    public int d;
    public long e;

    public final void a(long j) {
        double d;
        if (j != 0) {
            PriorityQueue priorityQueue = this.a;
            int size = priorityQueue.size();
            PriorityQueue priorityQueue2 = this.b;
            if (size == priorityQueue2.size()) {
                priorityQueue2.offer(Long.valueOf(j));
                priorityQueue.offer(priorityQueue2.poll());
            } else {
                priorityQueue.offer(Long.valueOf(j));
                priorityQueue2.offer(priorityQueue.poll());
            }
        }
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        if (i2 == 1) {
            d = j;
        } else {
            d = (j / ((long) i2)) + (this.c / ((double) (i2 / i)));
        }
        this.c = d;
        long j2 = this.e;
        if (j <= j2) {
            j = j2;
        }
        this.e = j;
    }

    public final double b() {
        long jLongValue;
        Long lValueOf;
        PriorityQueue priorityQueue = this.a;
        int size = priorityQueue.size();
        PriorityQueue priorityQueue2 = this.b;
        if (size == 0 && priorityQueue2.size() == 0) {
            return 0.0d;
        }
        if (priorityQueue.size() > priorityQueue2.size()) {
            lValueOf = (Long) priorityQueue.peek();
        } else {
            Long l = (Long) priorityQueue.peek();
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                Object objPeek = priorityQueue2.peek();
                objPeek.getClass();
                jLongValue = ((Number) objPeek).longValue();
            }
            lValueOf = Long.valueOf(jLongValue / 2);
        }
        return lValueOf.longValue();
    }
}
