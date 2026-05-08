package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class g95 {
    public final File a;

    public g95(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g95)) {
            return false;
        }
        return this.a.equals(((g95) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
