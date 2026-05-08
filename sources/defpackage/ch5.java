package defpackage;

import defpackage.pi7;
import defpackage.u4c;

/* JADX INFO: loaded from: classes3.dex */
public final class ch5 {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;
    public static final a N;
    public static final a a;
    public static final a b;
    public static final a c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final b p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;

    public static class a extends c<Boolean> {
        public final Boolean c(int i) {
            return Boolean.valueOf(((1 << this.a) & i) != 0);
        }
    }

    public static class b<E extends pi7.a> extends c<E> {
        public final E[] c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(int i, E[] eArr) {
            if (eArr == null) {
                l5.q("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
                throw null;
            }
            int i2 = 1;
            int length = eArr.length - 1;
            if (length != 0) {
                for (int i3 = 31; i3 >= 0; i3--) {
                    if (((1 << i3) & length) != 0) {
                        i2 = 1 + i3;
                    }
                }
                o6.k(eArr.getClass(), "Empty enum: ");
                throw null;
            }
            super(i, i2);
            this.c = eArr;
        }

        public final Object c(int i) {
            int i2 = (1 << this.b) - 1;
            int i3 = this.a;
            int i4 = (i & (i2 << i3)) >> i3;
            for (E e : this.c) {
                if (e.getNumber() == i4) {
                    return e;
                }
            }
            return null;
        }
    }

    public static abstract class c<E> {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public static a a(c<?> cVar) {
            return new a(cVar.a + cVar.b, 1);
        }

        public static a b() {
            return new a(0, 1);
        }
    }

    static {
        a aVarB = c.b();
        a = aVarB;
        b = c.a(aVarB);
        a aVarB2 = c.b();
        c = aVarB2;
        b bVar = new b(1, q5c.values());
        d = bVar;
        d5c[] d5cVarArrValues = d5c.values();
        int i2 = 1 + bVar.b;
        b bVar2 = new b(i2, d5cVarArrValues);
        e = bVar2;
        u4c.c[] cVarArrValues = u4c.c.values();
        int i3 = bVar2.b;
        b bVar3 = new b(i2 + i3, cVarArrValues);
        f = bVar3;
        a aVarA = c.a(bVar3);
        g = aVarA;
        a aVarA2 = c.a(aVarA);
        h = aVarA2;
        a aVarA3 = c.a(aVarA2);
        i = aVarA3;
        a aVarA4 = c.a(aVarA3);
        j = aVarA4;
        a aVarA5 = c.a(aVarA4);
        k = aVarA5;
        a aVarA6 = c.a(aVarA5);
        l = aVarA6;
        m = c.a(aVarA6);
        a aVarA7 = c.a(bVar);
        n = aVarA7;
        o = c.a(aVarA7);
        b bVar4 = new b(i2 + i3, c5c.values());
        p = bVar4;
        a aVarA8 = c.a(bVar4);
        q = aVarA8;
        a aVarA9 = c.a(aVarA8);
        r = aVarA9;
        a aVarA10 = c.a(aVarA9);
        s = aVarA10;
        a aVarA11 = c.a(aVarA10);
        t = aVarA11;
        a aVarA12 = c.a(aVarA11);
        u = aVarA12;
        a aVarA13 = c.a(aVarA12);
        v = aVarA13;
        a aVarA14 = c.a(aVarA13);
        w = aVarA14;
        x = c.a(aVarA14);
        a aVarA15 = c.a(bVar4);
        y = aVarA15;
        a aVarA16 = c.a(aVarA15);
        z = aVarA16;
        a aVarA17 = c.a(aVarA16);
        A = aVarA17;
        a aVarA18 = c.a(aVarA17);
        B = aVarA18;
        a aVarA19 = c.a(aVarA18);
        C = aVarA19;
        a aVarA20 = c.a(aVarA19);
        D = aVarA20;
        a aVarA21 = c.a(aVarA20);
        E = aVarA21;
        a aVarA22 = c.a(aVarA21);
        F = aVarA22;
        G = c.a(aVarA22);
        a aVarA23 = c.a(aVarB2);
        H = aVarA23;
        a aVarA24 = c.a(aVarA23);
        I = aVarA24;
        J = c.a(aVarA24);
        a aVarA25 = c.a(bVar2);
        K = aVarA25;
        a aVarA26 = c.a(aVarA25);
        L = aVarA26;
        M = c.a(aVarA26);
        N = c.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L2b
            if (r5 == r2) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r1] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r1] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r1] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r3] = r1
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r2] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r2] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r2] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r2] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r2] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch5.a(int):void");
    }
}
