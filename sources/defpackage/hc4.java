package defpackage;

import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class hc4 {
    public static final hc4 b = new hc4();
    public static final boolean c = true;
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(20);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a V;
        public static final a W;
        public static final a X;
        public static final a Y;
        public static final a Z;
        public static final a a;
        public static final a a0;
        public static final a b;
        public static final a b0;
        public static final a c;
        public static final a c0;
        public static final a d;
        public static final a d0;
        public static final a e;
        public static final a e0;
        public static final a f;
        public static final a f0;
        public static final a g0;
        public static final a h0;
        public static final /* synthetic */ a[] i0;

        static {
            a aVar = new a("ON_SET_HIERARCHY", 0);
            a = aVar;
            a aVar2 = new a("ON_CLEAR_HIERARCHY", 1);
            b = aVar2;
            a aVar3 = new a("ON_SET_CONTROLLER", 2);
            c = aVar3;
            a aVar4 = new a("ON_CLEAR_OLD_CONTROLLER", 3);
            d = aVar4;
            a aVar5 = new a("ON_CLEAR_CONTROLLER", 4);
            e = aVar5;
            a aVar6 = new a("ON_INIT_CONTROLLER", 5);
            f = aVar6;
            a aVar7 = new a("ON_ATTACH_CONTROLLER", 6);
            V = aVar7;
            a aVar8 = new a("ON_DETACH_CONTROLLER", 7);
            W = aVar8;
            a aVar9 = new a("ON_RELEASE_CONTROLLER", 8);
            X = aVar9;
            a aVar10 = new a("ON_DATASOURCE_SUBMIT", 9);
            Y = aVar10;
            a aVar11 = new a("ON_DATASOURCE_RESULT", 10);
            Z = aVar11;
            a aVar12 = new a("ON_DATASOURCE_RESULT_INT", 11);
            a0 = aVar12;
            a aVar13 = new a("ON_DATASOURCE_FAILURE", 12);
            b0 = aVar13;
            a aVar14 = new a("ON_DATASOURCE_FAILURE_INT", 13);
            c0 = aVar14;
            a aVar15 = new a("ON_HOLDER_ATTACH", 14);
            d0 = aVar15;
            a aVar16 = new a("ON_HOLDER_DETACH", 15);
            e0 = aVar16;
            a aVar17 = new a("ON_DRAWABLE_SHOW", 16);
            f0 = aVar17;
            a aVar18 = new a("ON_DRAWABLE_HIDE", 17);
            g0 = aVar18;
            a aVar19 = new a("ON_ACTIVITY_START", 18);
            a aVar20 = new a("ON_ACTIVITY_STOP", 19);
            a aVar21 = new a("ON_RUN_CLEAR_CONTROLLER", 20);
            a aVar22 = new a("ON_SCHEDULE_CLEAR_CONTROLLER", 21);
            a aVar23 = new a("ON_SAME_CONTROLLER_SKIPPED", 22);
            a aVar24 = new a("ON_SUBMIT_CACHE_HIT", 23);
            h0 = aVar24;
            i0 = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i0.clone();
        }
    }

    public final void a(a aVar) {
        if (!c) {
            return;
        }
        int i = 5;
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.a;
            if (arrayBlockingQueue.offer(aVar) || i <= 0) {
                return;
            }
            arrayBlockingQueue.poll();
            i--;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
