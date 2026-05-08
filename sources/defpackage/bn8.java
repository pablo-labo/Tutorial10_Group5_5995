package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class bn8 extends Number {
    private final String value;

    public bn8(String str) {
        this.value = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new BigDecimal(this.value);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn8)) {
            return false;
        }
        String str = this.value;
        String str2 = ((bn8) obj).value;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.value);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.value).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.value);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.value);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.value).longValue();
        }
    }

    public final String toString() {
        return this.value;
    }
}
