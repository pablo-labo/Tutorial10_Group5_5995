package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class r8i {
    public static final Logger a = Logger.getLogger(r8i.class.getName());
    public static final Unsafe b;
    public static final Class<?> c;
    public static final c d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    public static final class a extends c {
        @Override // r8i.c
        public final byte a(Object obj, long j) {
            return r8i.h ? r8i.n(obj, j) : r8i.o(obj, j);
        }

        @Override // r8i.c
        public final void c(Object obj, long j, byte b) {
            if (r8i.h) {
                r8i.i(obj, j, b);
            } else {
                r8i.j(obj, j, b);
            }
        }

        @Override // r8i.c
        public final void d(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // r8i.c
        public final void e(Object obj, long j, float f) {
            b(obj, Float.floatToIntBits(f), j);
        }

        @Override // r8i.c
        public final void g(Object obj, long j, boolean z) {
            if (r8i.h) {
                r8i.i(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                r8i.j(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // r8i.c
        public final boolean h(Object obj, long j) {
            return r8i.h ? r8i.n(obj, j) != 0 : r8i.o(obj, j) != 0;
        }

        @Override // r8i.c
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        @Override // r8i.c
        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(l(obj, j));
        }
    }

    public static final class b extends c {
        @Override // r8i.c
        public final byte a(Object obj, long j) {
            return r8i.h ? r8i.n(obj, j) : r8i.o(obj, j);
        }

        @Override // r8i.c
        public final void c(Object obj, long j, byte b) {
            if (r8i.h) {
                r8i.i(obj, j, b);
            } else {
                r8i.j(obj, j, b);
            }
        }

        @Override // r8i.c
        public final void d(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // r8i.c
        public final void e(Object obj, long j, float f) {
            b(obj, Float.floatToIntBits(f), j);
        }

        @Override // r8i.c
        public final void g(Object obj, long j, boolean z) {
            if (r8i.h) {
                r8i.i(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                r8i.j(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // r8i.c
        public final boolean h(Object obj, long j) {
            return r8i.h ? r8i.n(obj, j) != 0 : r8i.o(obj, j) != 0;
        }

        @Override // r8i.c
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        @Override // r8i.c
        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(l(obj, j));
        }
    }

    public static abstract class c {
        public final Unsafe a;

        public c(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public final void b(Object obj, int i, long j) {
            this.a.putInt(obj, j, i);
        }

        public abstract void c(Object obj, long j, byte b);

        public abstract void d(Object obj, long j, double d);

        public abstract void e(Object obj, long j, float f);

        public final void f(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void g(Object obj, long j, boolean z);

        public abstract boolean h(Object obj, long j);

        public abstract float i(Object obj, long j);

        public abstract double j(Object obj, long j);

        public final int k(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long l(Object obj, long j) {
            return this.a.getLong(obj, j);
        }
    }

    public static final class d extends c {
        @Override // r8i.c
        public final byte a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // r8i.c
        public final void c(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // r8i.c
        public final void d(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // r8i.c
        public final void e(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // r8i.c
        public final void g(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // r8i.c
        public final boolean h(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // r8i.c
        public final float i(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // r8i.c
        public final double j(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r8i.<clinit>():void");
    }

    public static byte a(long j, byte[] bArr) {
        return d.a(bArr, g + j);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            z3.q(e2);
            return null;
        }
    }

    public static void c(Object obj, int i, long j) {
        d.b(obj, i, j);
    }

    public static void d(Object obj, long j, Object obj2) {
        d.a.putObject(obj, j, obj2);
    }

    public static void e(byte[] bArr, long j, byte b2) {
        d.c(bArr, g + j, b2);
    }

    public static int f(Class<?> cls) {
        if (f) {
            return d.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o8i());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void h(Class cls) {
        if (f) {
            d.a.arrayIndexScale(cls);
        }
    }

    public static void i(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iK = d.k(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        c(obj, ((255 & b2) << i) | (iK & (~(255 << i))), j2);
    }

    public static void j(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        c(obj, ((255 & b2) << i) | (d.k(obj, j2) & (~(255 << i))), j2);
    }

    public static boolean k(Class<?> cls) {
        if (!duh.a()) {
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

    public static Object l(Object obj, long j) {
        return d.a.getObject(obj, j);
    }

    public static Field m() {
        Field declaredField;
        Field declaredField2;
        if (duh.a()) {
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

    public static byte n(Object obj, long j) {
        return (byte) (d.k(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    public static byte o(Object obj, long j) {
        return (byte) (d.k(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }
}
