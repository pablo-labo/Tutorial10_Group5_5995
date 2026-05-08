package defpackage;

import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class vhc implements hb6 {
    public final c a;
    public final a b;
    public final b c;
    public final ArrayList d;

    public static abstract class a {

        /* JADX INFO: renamed from: vhc$a$a, reason: collision with other inner class name */
        public static final class C0451a extends a {
            public final ou8 a;
            public final ou8 b;

            public C0451a(ou8 ou8Var, ou8 ou8Var2) {
                this.a = ou8Var;
                this.b = ou8Var2;
            }
        }

        public static final class b extends a {
            public final c a;

            public b(c cVar) {
                this.a = cVar;
            }
        }

        public enum c {
            CLOSEST_SIDE("closest-side"),
            FARTHEST_SIDE("farthest-side"),
            CLOSEST_CORNER("closest-corner"),
            FARTHEST_CORNER("farthest-corner");

            public static final C0452a a = new C0452a();
            private final String value;

            /* JADX INFO: renamed from: vhc$a$c$a, reason: collision with other inner class name */
            public static final class C0452a {
            }

            c(String str) {
                this.value = str;
            }

            public final String a() {
                return this.value;
            }
        }
    }

    public static final class b {
        public final ou8 a;
        public final ou8 b;
        public final ou8 c;
        public final ou8 d;

        public b(ou8 ou8Var, ou8 ou8Var2, ou8 ou8Var3, ou8 ou8Var4) {
            this.a = ou8Var;
            this.b = ou8Var2;
            this.c = ou8Var3;
            this.d = ou8Var4;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final a a;
        public static final c b;
        public static final c c;
        public static final /* synthetic */ c[] d;

        public static final class a {
        }

        static {
            c cVar = new c("CIRCLE", 0);
            b = cVar;
            c cVar2 = new c("ELLIPSE", 1);
            c = cVar2;
            d = new c[]{cVar, cVar2};
            a = new a();
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }
    }

    public vhc(c cVar, a aVar, b bVar, ArrayList arrayList) {
        this.a = cVar;
        this.b = aVar;
        this.c = bVar;
        this.d = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    @Override // defpackage.hb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Shader a(float r14, float r15) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhc.a(float, float):android.graphics.Shader");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Pair<java.lang.Float, java.lang.Float> b(float r13, float r14, float r15, float r16, vhc.a.c r17) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhc.b(float, float, float, float, vhc$a$c):kotlin.Pair");
    }

    public final Pair<Float, Float> c(float f, float f2, float f3, float f4, a.c cVar) {
        float fMax;
        float fMax2;
        float f5 = f3 - f;
        float f6 = f4 - f2;
        a.c cVar2 = a.c.CLOSEST_SIDE;
        if (cVar == cVar2) {
            fMax = Math.min(f, f5);
            fMax2 = Math.min(f2, f6);
        } else {
            fMax = Math.max(f, f5);
            fMax2 = Math.max(f2, f6);
        }
        if (this.a != c.b) {
            return new Pair<>(Float.valueOf(fMax), Float.valueOf(fMax2));
        }
        float fMin = cVar == cVar2 ? Math.min(fMax, fMax2) : Math.max(fMax, fMax2);
        return new Pair<>(Float.valueOf(fMin), Float.valueOf(fMin));
    }
}
