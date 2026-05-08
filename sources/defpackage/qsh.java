package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class qsh<T> extends ssh<T> {
    public static final qsh<Object> a = new qsh<>();

    @Override // defpackage.ssh
    public final boolean a() {
        return false;
    }

    @Override // defpackage.ssh
    public final T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
