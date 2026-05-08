package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class rdi {
    public static final Logger a = Logger.getLogger(rdi.class.getName());
    public static final Unsafe b;
    public static final Class<?> c;
    public static final d d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    public static final class a extends d {
        @Override // rdi.d
        public final void a(Object obj, long j, double d) {
            c(obj, j, Double.doubleToLongBits(d));
        }

        @Override // rdi.d
        public final void b(Object obj, long j, float f) {
            e(obj, Float.floatToIntBits(f), j);
        }

        @Override // rdi.d
        public final void d(Object obj, long j, boolean z) {
            if (rdi.h) {
                rdi.b(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                rdi.f(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // rdi.d
        public final boolean h(Object obj, long j) {
            return rdi.h ? rdi.n(obj, j) != 0 : rdi.o(obj, j) != 0;
        }

        @Override // rdi.d
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(f(obj, j));
        }

        @Override // rdi.d
        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(g(obj, j));
        }

        @Override // rdi.d
        public final byte k(Object obj, long j) {
            return rdi.h ? rdi.n(obj, j) : rdi.o(obj, j);
        }
    }

    public static final class b extends d {
        @Override // rdi.d
        public final void a(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // rdi.d
        public final void b(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // rdi.d
        public final void d(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // rdi.d
        public final boolean h(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // rdi.d
        public final float i(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // rdi.d
        public final double j(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // rdi.d
        public final byte k(Object obj, long j) {
            return this.a.getByte(obj, j);
        }
    }

    public static final class c extends d {
        @Override // rdi.d
        public final void a(Object obj, long j, double d) {
            c(obj, j, Double.doubleToLongBits(d));
        }

        @Override // rdi.d
        public final void b(Object obj, long j, float f) {
            e(obj, Float.floatToIntBits(f), j);
        }

        @Override // rdi.d
        public final void d(Object obj, long j, boolean z) {
            if (rdi.h) {
                rdi.b(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                rdi.f(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // rdi.d
        public final boolean h(Object obj, long j) {
            return rdi.h ? rdi.n(obj, j) != 0 : rdi.o(obj, j) != 0;
        }

        @Override // rdi.d
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(f(obj, j));
        }

        @Override // rdi.d
        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(g(obj, j));
        }

        @Override // rdi.d
        public final byte k(Object obj, long j) {
            return rdi.h ? rdi.n(obj, j) : rdi.o(obj, j);
        }
    }

    public static abstract class d {
        public final Unsafe a;

        public d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract void a(Object obj, long j, double d);

        public abstract void b(Object obj, long j, float f);

        public final void c(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void d(Object obj, long j, boolean z);

        public final void e(Object obj, int i, long j) {
            this.a.putInt(obj, j, i);
        }

        public final int f(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long g(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public abstract boolean h(Object obj, long j);

        public abstract float i(Object obj, long j);

        public abstract double j(Object obj, long j);

        public abstract byte k(Object obj, long j);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdi.<clinit>():void");
    }

    public static byte a(long j, byte[] bArr) {
        return d.k(bArr, g + j);
    }

    public static void b(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iF = d.f(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        e(obj, ((255 & b2) << i) | (iF & (~(255 << i))), j2);
    }

    public static void c(Object obj, long j, long j2) {
        d.c(obj, j, j2);
    }

    public static void d(Object obj, long j, Object obj2) {
        d.a.putObject(obj, j, obj2);
    }

    public static void e(Object obj, int i, long j) {
        d.e(obj, i, j);
    }

    public static void f(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        e(obj, ((255 & b2) << i) | (d.f(obj, j2) & (~(255 << i))), j2);
    }

    public static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zdi());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field h() {
        Field declaredField;
        Field declaredField2;
        if (xzh.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static <T> T i(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            z3.q(e2);
            return null;
        }
    }

    public static int j(Class<?> cls) {
        if (f) {
            return d.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void k(Class cls) {
        if (f) {
            d.a.arrayIndexScale(cls);
        }
    }

    public static Object l(Object obj, long j) {
        return d.a.getObject(obj, j);
    }

    public static boolean m(Class<?> cls) {
        if (!xzh.a()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte n(Object obj, long j) {
        return (byte) (d.f(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    public static byte o(Object obj, long j) {
        return (byte) (d.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }
}
