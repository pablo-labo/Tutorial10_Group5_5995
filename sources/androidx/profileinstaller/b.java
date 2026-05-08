package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import defpackage.b44;
import defpackage.w1c;
import defpackage.z34;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Executor a;
    public final c.InterfaceC0074c b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public b44[] g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0074c interfaceC0074c, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = interfaceC0074c;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = w1c.d;
                    break;
                case 27:
                    bArr = w1c.c;
                    break;
                case 28:
                case 29:
                case RendererMetrics.SAMPLES /* 30 */:
                    bArr = w1c.b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = w1c.a;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.a();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new z34(this, i, serializable));
    }
}
