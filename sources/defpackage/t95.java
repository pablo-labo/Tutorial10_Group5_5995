package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class t95 implements kh8<File> {
    @Override // defpackage.kh8
    public final String a(File file, qva qvaVar) {
        File file2 = file;
        return file2.getPath() + ':' + file2.lastModified();
    }
}
