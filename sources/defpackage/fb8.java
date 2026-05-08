package defpackage;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class fb8 extends ka8 {
    public final Serializable a;

    public fb8(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean i(fb8 fb8Var) {
        Serializable serializable = fb8Var.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // defpackage.ka8
    public final boolean a() {
        Serializable serializable = this.a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(g());
    }

    @Override // defpackage.ka8
    public final int b() {
        return this.a instanceof Number ? f().intValue() : Integer.parseInt(g());
    }

    @Override // defpackage.ka8
    public final long e() {
        return this.a instanceof Number ? f().longValue() : Long.parseLong(g());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fb8.class != obj.getClass()) {
            return false;
        }
        fb8 fb8Var = (fb8) obj;
        Serializable serializable = fb8Var.a;
        Serializable serializable2 = this.a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (i(this) && i(fb8Var)) {
            return f().longValue() == fb8Var.f().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        double dDoubleValue = f().doubleValue();
        double dDoubleValue2 = fb8Var.f().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // defpackage.ka8
    public final Number f() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new bn8((String) serializable);
        }
        b0.u("Primitive is neither a number nor a string");
        return null;
    }

    @Override // defpackage.ka8
    public final String g() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return f().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (i(this)) {
            jDoubleToLongBits = f().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(f().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public fb8(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public fb8(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
