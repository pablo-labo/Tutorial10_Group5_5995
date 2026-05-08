package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import defpackage.g37;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class dte {
    public static final ImageDecoder.Source a(g37 g37Var, nva nvaVar) {
        w5b w5bVarC1;
        if (g37Var.getFileSystem() == pa5.a && (w5bVarC1 = g37Var.C1()) != null) {
            return ImageDecoder.createSource(w5bVarC1.toFile());
        }
        g37.a metadata = g37Var.getMetadata();
        if (metadata instanceof fu0) {
            return ImageDecoder.createSource(nvaVar.a.getAssets(), ((fu0) metadata).a);
        }
        if ((metadata instanceof zs2) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptor = ((zs2) metadata).a;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: cte
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return assetFileDescriptor;
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof x5d) {
            x5d x5dVar = (x5d) metadata;
            if (wl7.b(x5dVar.a, nvaVar.a.getPackageName())) {
                return ImageDecoder.createSource(nvaVar.a.getResources(), x5dVar.b);
            }
        }
        if (metadata instanceof nr1) {
            return ImageDecoder.createSource(((nr1) metadata).a);
        }
        return null;
    }
}
