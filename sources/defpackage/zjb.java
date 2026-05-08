package defpackage;

import androidx.datastore.preferences.protobuf.n;
import defpackage.yjb;

/* JADX INFO: loaded from: classes.dex */
public final class zjb extends n<zjb, a> implements up9 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final zjb DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile p4b<zjb> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends n.a<zjb, a> implements up9 {
        public a() {
            super(zjb.DEFAULT_INSTANCE);
        }
    }

    static {
        zjb zjbVar = new zjb();
        DEFAULT_INSTANCE = zjbVar;
        n.m(zjb.class, zjbVar);
    }

    public static a E() {
        return (a) ((n.a) DEFAULT_INSTANCE.i(n.f.e));
    }

    public static void n(zjb zjbVar, long j) {
        zjbVar.valueCase_ = 4;
        zjbVar.value_ = Long.valueOf(j);
    }

    public static void o(zjb zjbVar, String str) {
        zjbVar.getClass();
        zjbVar.valueCase_ = 5;
        zjbVar.value_ = str;
    }

    public static void p(zjb zjbVar, yjb.a aVar) {
        zjbVar.getClass();
        zjbVar.value_ = aVar.h();
        zjbVar.valueCase_ = 6;
    }

    public static void q(zjb zjbVar, double d) {
        zjbVar.valueCase_ = 7;
        zjbVar.value_ = Double.valueOf(d);
    }

    public static void s(zjb zjbVar, boolean z) {
        zjbVar.valueCase_ = 1;
        zjbVar.value_ = Boolean.valueOf(z);
    }

    public static void t(zjb zjbVar, float f) {
        zjbVar.valueCase_ = 2;
        zjbVar.value_ = Float.valueOf(f);
    }

    public static void u(zjb zjbVar, int i) {
        zjbVar.valueCase_ = 3;
        zjbVar.value_ = Integer.valueOf(i);
    }

    public static zjb w() {
        return DEFAULT_INSTANCE;
    }

    public final long A() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String B() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final yjb C() {
        return this.valueCase_ == 6 ? (yjb) this.value_ : yjb.p();
    }

    public final int D() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final Object i(n.f fVar) {
        p4b bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new zic(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", yjb.class});
            case 3:
                return new zjb();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p4b<zjb> p4bVar = PARSER;
                if (p4bVar != null) {
                    return p4bVar;
                }
                synchronized (zjb.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new n.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                b0.l();
                return null;
        }
    }

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double x() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float y() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int z() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }
}
