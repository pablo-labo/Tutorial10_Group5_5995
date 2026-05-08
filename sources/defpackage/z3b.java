package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import defpackage.t27;

/* JADX INFO: loaded from: classes.dex */
public final class z3b implements j5d<ParcelFileDescriptor, Bitmap> {
    public final h94 a;

    public z3b(h94 h94Var) {
        this.a = h94Var;
    }

    @Override // defpackage.j5d
    public final boolean a(ParcelFileDescriptor parcelFileDescriptor, ova ovaVar) {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= FilePersistenceConfig.MAX_DISK_SPACE) && !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // defpackage.j5d
    public final f5d<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, ova ovaVar) {
        h94 h94Var = this.a;
        return h94Var.a(new t27.c(parcelFileDescriptor, h94Var.d, h94Var.c), i, i2, ovaVar, h94.k);
    }
}
