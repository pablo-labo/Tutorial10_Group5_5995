package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.media3.datasource.a;
import androidx.media3.datasource.b;
import androidx.media3.datasource.c;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.oney.WebRTCModule.WebRTCModule;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cf3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Comparable c;

    public /* synthetic */ cf3(Object obj, Comparable comparable, int i) {
        this.a = i;
        this.b = obj;
        this.c = comparable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Comparable comparable = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                Uri uri = (Uri) comparable;
                a aVarA = bVar.b.a();
                int i2 = bVar.c;
                try {
                    gf3 gf3Var = new gf3(uri);
                    c cVar = (c) aVarA;
                    cVar.b(gf3Var);
                    byte[] bArrCopyOf = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 != -1) {
                        if (i4 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                        }
                        i3 = cVar.read(bArrCopyOf, i4, bArrCopyOf.length - i4);
                        if (i3 != -1) {
                            i4 += i3;
                        }
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i4);
                    Bitmap bitmapA = fh1.a(bArrCopyOf2.length, bArrCopyOf2, i2);
                    cVar.close();
                    return bitmapA;
                } catch (Throwable th) {
                    ((c) aVarA).close();
                    throw th;
                }
            case 1:
                Context context = (Context) obj;
                String str = (String) comparable;
                s69 s69VarA = str == null ? null : t69.b.a(str);
                if (s69VarA != null) {
                    return new p79(s69VarA);
                }
                try {
                    return z69.b(context, context.getAssets().open(null), str);
                } catch (IOException e) {
                    return new p79(e);
                }
            default:
                return ((WebRTCModule) obj).lambda$senderGetCapabilities$30((String) comparable);
        }
    }
}
