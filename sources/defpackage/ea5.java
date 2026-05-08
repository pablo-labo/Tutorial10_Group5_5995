package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ea5 {
    public final File a;
    public final List<File> b;

    /* JADX WARN: Multi-variable type inference failed */
    public ea5(File file, List<? extends File> list) {
        this.a = file;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea5)) {
            return false;
        }
        ea5 ea5Var = (ea5) obj;
        return this.a.equals(ea5Var.a) && this.b.equals(ea5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.a + ", segments=" + this.b + ')';
    }
}
