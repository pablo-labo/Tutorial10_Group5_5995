package defpackage;

import defpackage.u95;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class w95 implements u95.d<InputStream> {
    @Override // u95.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // u95.d
    public final void b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // u95.d
    public final InputStream c(File file) {
        return new FileInputStream(file);
    }
}
