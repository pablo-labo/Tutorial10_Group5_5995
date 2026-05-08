package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class u6g implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
    }
}
