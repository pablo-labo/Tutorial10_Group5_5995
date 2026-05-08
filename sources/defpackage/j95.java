package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j95 extends hu0<AssetFileDescriptor> {
    @Override // defpackage.ke3
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.hu0
    public final void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // defpackage.hu0
    public final AssetFileDescriptor f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
