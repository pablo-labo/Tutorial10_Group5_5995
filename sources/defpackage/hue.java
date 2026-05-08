package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class hue extends hu0<InputStream> {
    @Override // defpackage.ke3
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.hu0
    public final void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // defpackage.hu0
    public final InputStream f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
