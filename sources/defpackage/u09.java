package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class u09 extends q09 {
    public final Resources c;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u09(Executor executor, yn9 yn9Var, Resources resources) {
        super(executor, yn9Var);
        executor.getClass();
        yn9Var.getClass();
        resources.getClass();
        this.c = resources;
    }

    @Override // defpackage.q09
    public final vs4 d(com.facebook.imagepipeline.request.a aVar) {
        int length;
        String path;
        aVar.getClass();
        Uri uri = aVar.b;
        String path2 = uri.getPath();
        AssetFileDescriptor assetFileDescriptor = null;
        if (path2 == null) {
            r6.g("Required value was null.");
            return null;
        }
        int i = Integer.parseInt(path2.substring(1));
        Resources resources = this.c;
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        try {
            path = uri.getPath();
        } catch (Resources.NotFoundException unused) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused2) {
                }
            }
            length = -1;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(Integer.parseInt(path.substring(1)));
        length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
        try {
            assetFileDescriptorOpenRawResourceFd.close();
        } catch (IOException unused4) {
        }
        return c(inputStreamOpenRawResource, length);
    }

    @Override // defpackage.q09
    public final String e() {
        return "LocalResourceFetchProducer";
    }
}
