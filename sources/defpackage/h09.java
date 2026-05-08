package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class h09 extends q09 {
    public final AssetManager c;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h09(Executor executor, yn9 yn9Var, AssetManager assetManager) {
        super(executor, yn9Var);
        executor.getClass();
        yn9Var.getClass();
        assetManager.getClass();
        this.c = assetManager;
    }

    @Override // defpackage.q09
    public final vs4 d(com.facebook.imagepipeline.request.a aVar) throws IOException {
        int length;
        aVar.getClass();
        Uri uri = aVar.b;
        String path = uri.getPath();
        path.getClass();
        String strSubstring = path.substring(1);
        AssetManager assetManager = this.c;
        InputStream inputStreamOpen = assetManager.open(strSubstring, 2);
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            String path2 = uri.getPath();
            path2.getClass();
            assetFileDescriptorOpenFd = assetManager.openFd(path2.substring(1));
            length = (int) assetFileDescriptorOpenFd.getLength();
            try {
                assetFileDescriptorOpenFd.close();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused3) {
                }
            }
            length = -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        return c(inputStreamOpen, length);
    }

    @Override // defpackage.q09
    public final String e() {
        return "LocalAssetFetchProducer";
    }
}
