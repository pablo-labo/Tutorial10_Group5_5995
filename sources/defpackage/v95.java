package defpackage;

import android.os.ParcelFileDescriptor;
import defpackage.u95;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class v95 implements u95.d<ParcelFileDescriptor> {
    @Override // u95.d
    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // u95.d
    public final void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // u95.d
    public final ParcelFileDescriptor c(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
