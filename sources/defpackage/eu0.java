package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class eu0 extends x09<AssetFileDescriptor> {
    @Override // defpackage.ke3
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.x09
    public final void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // defpackage.x09
    public final Object f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException(p6.d(uri, "FileDescriptor is null for: "));
    }
}
