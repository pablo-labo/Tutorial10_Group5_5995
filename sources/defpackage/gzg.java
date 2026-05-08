package defpackage;

import com.datadog.android.core.internal.CoreFeature;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class gzg implements WildcardType, Type {
    public static final gzg c = new gzg(null, null);
    public final Type a;
    public final Type b;

    public gzg(Type type, Type type2) {
        this.a = type;
        this.b = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.b;
        if (type != null) {
            return "? super " + kzf.a(type);
        }
        Type type2 = this.a;
        if (type2 == null || wl7.b(type2, Object.class)) {
            return CoreFeature.DEFAULT_APP_VERSION;
        }
        return "? extends " + kzf.a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
