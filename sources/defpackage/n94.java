package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n94 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n94) && j94.c(10.0f, 10.0f) && j94.c(40.0f, 40.0f) && j94.c(10.0f, 10.0f) && j94.c(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k6.c(k6.c(k6.c(Float.hashCode(10.0f) * 31, 40.0f, 31), 10.0f, 31), 40.0f, 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) j94.e(10.0f)) + ", top=" + ((Object) j94.e(40.0f)) + ", end=" + ((Object) j94.e(10.0f)) + ", bottom=" + ((Object) j94.e(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
