package defpackage;

import defpackage.xz8;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class x6<Key, Value> {
    public final a[] a;
    public final xz8.a[] b;
    public final zs0<b<Key, Value>> c;
    public boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("UNBLOCKED", 0);
            a = aVar;
            a aVar2 = new a("COMPLETED", 1);
            b = aVar2;
            a aVar3 = new a("REQUIRES_REFRESH", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public static final class b<Key, Value> {
        public final zz8 a;
        public s2b<Key, Value> b;

        public b(zz8 zz8Var, s2b<Key, Value> s2bVar) {
            zz8Var.getClass();
            s2bVar.getClass();
            this.a = zz8Var;
            this.b = s2bVar;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[zz8.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class d extends mj8 implements Function1<b<Key, Value>, Boolean> {
        final /* synthetic */ zz8 $loadType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(zz8 zz8Var) {
            super(1);
            this.$loadType = zz8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            return Boolean.valueOf(bVar.a == this.$loadType);
        }
    }

    public x6() {
        int length = zz8.values().length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            aVarArr[i] = a.a;
        }
        this.a = aVarArr;
        int length2 = zz8.values().length;
        xz8.a[] aVarArr2 = new xz8.a[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            aVarArr2[i2] = null;
        }
        this.b = aVarArr2;
        this.c = new zs0<>();
    }

    public final void a(zz8 zz8Var) {
        zz8Var.getClass();
        w92.B0(this.c, new d(zz8Var));
    }

    public final xz8 b(zz8 zz8Var) {
        a aVar = this.a[zz8Var.ordinal()];
        zs0<b<Key, Value>> zs0Var = this.c;
        if (zs0Var == null || !zs0Var.isEmpty()) {
            Iterator<b<Key, Value>> it = zs0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().a == zz8Var) {
                    if (aVar != a.c) {
                        return xz8.b.b;
                    }
                }
            }
        }
        xz8.a aVar2 = this.b[zz8Var.ordinal()];
        if (aVar2 != null) {
            return aVar2;
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    l.g();
                    return null;
                }
            } else if (c.a[zz8Var.ordinal()] != 1) {
                return xz8.c.b;
            }
        }
        return xz8.c.c;
    }

    public final Pair<zz8, s2b<Key, Value>> c() {
        b<Key, Value> next;
        Iterator<b<Key, Value>> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            zz8 zz8Var = next.a;
            if (zz8Var != zz8.a && this.a[zz8Var.ordinal()] == a.a) {
                break;
            }
        }
        b<Key, Value> bVar = next;
        if (bVar != null) {
            return new Pair<>(bVar.a, bVar.b);
        }
        return null;
    }

    public final void d(zz8 zz8Var, a aVar) {
        zz8Var.getClass();
        this.a[zz8Var.ordinal()] = aVar;
    }

    public final void e(zz8 zz8Var, xz8.a aVar) {
        zz8Var.getClass();
        this.b[zz8Var.ordinal()] = aVar;
    }
}
