package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b33 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(".ae");
    }
}
