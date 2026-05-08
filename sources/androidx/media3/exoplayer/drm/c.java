package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.os.Build;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import defpackage.df3;
import defpackage.gf3;
import defpackage.ka2;
import defpackage.ote;
import defpackage.rr1;
import defpackage.vjg;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static byte[] a(androidx.media3.datasource.a aVar, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        Map<String, List<String>> map2;
        List<String> list;
        ote oteVar = new ote(aVar);
        Map map3 = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(str);
        ka2.s(uri, "The uri must be set.");
        gf3 gf3Var = new gf3(uri, 0L, 2, bArr, map, 0L, -1L, null, 1);
        int i = 0;
        int i2 = 0;
        gf3 gf3VarA = gf3Var;
        while (true) {
            try {
                df3 df3Var = new df3(gf3VarA, oteVar);
                try {
                    byte[] bArrB = rr1.b(df3Var);
                    vjg.g(df3Var);
                    return bArrB;
                } catch (HttpDataSource$InvalidResponseCodeException e) {
                    try {
                        int i3 = e.responseCode;
                        String str2 = null;
                        if ((i3 == 307 || i3 == 308) && i2 < 5 && (map2 = e.headerFields) != null && (list = map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = list.get(i);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i2++;
                        gf3.a aVarA = gf3VarA.a();
                        aVarA.a = Uri.parse(str2);
                        gf3VarA = aVarA.a();
                        vjg.g(df3Var);
                    } catch (Throwable th) {
                        vjg.g(df3Var);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                throw new MediaDrmCallbackException(gf3Var, oteVar.c, oteVar.a.e(), oteVar.b, e2);
            }
        }
    }

    public static boolean b(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
