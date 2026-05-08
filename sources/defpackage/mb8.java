package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface mb8 extends Closeable {

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
        public static final /* synthetic */ a[] b0;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;

        static {
            a aVar = new a("BEGIN_ARRAY", 0);
            a = aVar;
            a aVar2 = new a("END_ARRAY", 1);
            b = aVar2;
            a aVar3 = new a("BEGIN_OBJECT", 2);
            c = aVar3;
            a aVar4 = new a("END_OBJECT", 3);
            d = aVar4;
            a aVar5 = new a("NAME", 4);
            e = aVar5;
            a aVar6 = new a("STRING", 5);
            f = aVar6;
            a aVar7 = new a("NUMBER", 6);
            V = aVar7;
            a aVar8 = new a("LONG", 7);
            W = aVar8;
            a aVar9 = new a("BOOLEAN", 8);
            X = aVar9;
            a aVar10 = new a("NULL", 9);
            Y = aVar10;
            a aVar11 = new a("END_DOCUMENT", 10);
            Z = aVar11;
            a aVar12 = new a("ANY", 11);
            a0 = aVar12;
            b0 = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b0.clone();
        }
    }

    za8 B1();

    int D1(List<String> list);

    void I();

    String I0();

    String X();

    ArrayList c();

    boolean hasNext();

    mb8 j();

    void k();

    mb8 l();

    void l1();

    mb8 m();

    boolean nextBoolean();

    double nextDouble();

    int nextInt();

    long nextLong();

    a peek();

    mb8 t();
}
