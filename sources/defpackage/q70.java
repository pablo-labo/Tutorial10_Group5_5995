package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q70 implements bcb {
    public final int a;

    public q70(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q70) && this.a == ((q70) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return k6.h(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.a, ')');
    }
}
