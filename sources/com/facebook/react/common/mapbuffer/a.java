package com.facebook.react.common.mapbuffer;

import defpackage.oh7;
import defpackage.ze8;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends Iterable<c>, ze8 {
    public static final C0130a U = C0130a.a;

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.a$a, reason: collision with other inner class name */
    public static final class C0130a {
        public static final /* synthetic */ C0130a a = new C0130a();
        public static final oh7 b = new oh7(0, 65535, 1);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final /* synthetic */ b[] V;
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;

        static {
            b bVar = new b("BOOL", 0);
            a = bVar;
            b bVar2 = new b("INT", 1);
            b = bVar2;
            b bVar3 = new b("DOUBLE", 2);
            c = bVar3;
            b bVar4 = new b("STRING", 3);
            d = bVar4;
            b bVar5 = new b("MAP", 4);
            e = bVar5;
            b bVar6 = new b("LONG", 5);
            f = bVar6;
            V = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) V.clone();
        }
    }

    public interface c {
        long a();

        String b();

        double c();

        a d();

        int e();

        boolean f();

        int getKey();

        b getType();
    }

    boolean getBoolean(int i);

    /* JADX INFO: renamed from: getCount */
    int getC();

    double getDouble(int i);

    int getInt(int i);

    String getString(int i);

    boolean h1(int i);

    a j0(int i);
}
