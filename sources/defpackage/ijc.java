package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class ijc implements FilenameFilter {
    public final /* synthetic */ String a;

    public ijc(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}
