package defpackage;

import android.content.Context;
import com.indeed.android.jobsearch.R;
import defpackage.d79;
import io.jsonwebtoken.Header;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class j0d {
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(android.content.Context r13, defpackage.d79 r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, defpackage.pu2 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j0d.a(android.content.Context, d79, java.lang.String, java.lang.String, java.lang.String, java.lang.String, pu2):java.lang.Object");
    }

    public static final q79<s69> b(final Context context, d79 d79Var, final String str, boolean z) throws FileNotFoundException {
        int i = 0;
        if (d79Var instanceof d79.e) {
            if (!wl7.b(str, "__LottieInternalDefaultCacheKey__")) {
                HashMap map = z69.a;
                return z69.a(str, new w69(new WeakReference(context), context.getApplicationContext(), str, i), null);
            }
            HashMap map2 = z69.a;
            StringBuilder sb = new StringBuilder("rawRes");
            sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
            sb.append(R.raw.confetti);
            String string = sb.toString();
            return z69.a(string, new w69(new WeakReference(context), context.getApplicationContext(), string, i), null);
        }
        if (d79Var instanceof d79.f) {
            if (!wl7.b(str, "__LottieInternalDefaultCacheKey__")) {
                return z69.a(str, new Callable() { // from class: u69
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        p79 p79Var;
                        s69 s69Var;
                        nfa nfaVar;
                        Context context2 = context;
                        String str2 = str;
                        gga ggaVar = gj8.a;
                        boolean z2 = false;
                        if (ggaVar == null) {
                            synchronized (gga.class) {
                                try {
                                    ggaVar = gj8.a;
                                    if (ggaVar == null) {
                                        Context applicationContext = context2.getApplicationContext();
                                        nfa nfaVar2 = gj8.b;
                                        if (nfaVar2 == null) {
                                            synchronized (nfa.class) {
                                                nfaVar = gj8.b;
                                                if (nfaVar == null) {
                                                    nfaVar = new nfa(new ob3(applicationContext, 3), 0);
                                                    gj8.b = nfaVar;
                                                }
                                            }
                                            nfaVar2 = nfaVar;
                                        }
                                        ggaVar = new gga(nfaVar2, new q92(16));
                                        gj8.a = ggaVar;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        AutoCloseable autoCloseable = null;
                        if (str2 != null) {
                            try {
                                File file = new File(((Context) ((ob3) ((nfa) ggaVar.a).b).b).getCacheDir(), "lottie_network_cache");
                                if (file.isFile()) {
                                    file.delete();
                                }
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                nfa.d(n95.JSON, false);
                                throw null;
                            } catch (FileNotFoundException unused) {
                            }
                        }
                        a49.a();
                        a49.a();
                        try {
                            try {
                                uo3 uo3VarI = q92.i();
                                HttpURLConnection httpURLConnection = uo3VarI.a;
                                try {
                                    if (httpURLConnection.getResponseCode() / 100 == 2) {
                                        z2 = true;
                                    }
                                } catch (IOException unused2) {
                                }
                                if (z2) {
                                    p79Var = ggaVar.a(context2, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
                                    s69 s69Var2 = p79Var.a;
                                    a49.a();
                                } else {
                                    p79Var = new p79(new IllegalArgumentException(uo3VarI.a()));
                                }
                                try {
                                    uo3VarI.close();
                                } catch (IOException e) {
                                    a49.c("LottieFetchResult close failed ", e);
                                }
                            } catch (Exception e2) {
                                p79 p79Var2 = new p79(e2);
                                if (0 != 0) {
                                    try {
                                        autoCloseable.close();
                                    } catch (IOException e3) {
                                        a49.c("LottieFetchResult close failed ", e3);
                                    }
                                }
                                p79Var = p79Var2;
                            }
                            if (str2 != null && (s69Var = p79Var.a) != null) {
                                t69.b.a.c(str2, s69Var);
                            }
                            return p79Var;
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                try {
                                    autoCloseable.close();
                                } catch (IOException e4) {
                                    a49.c("LottieFetchResult close failed ", e4);
                                }
                            }
                            throw th2;
                        }
                    }
                }, null);
            }
            final String str2 = "url_null";
            return z69.a("url_null", new Callable() { // from class: u69
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    p79 p79Var;
                    s69 s69Var;
                    nfa nfaVar;
                    Context context2 = context;
                    String str22 = str2;
                    gga ggaVar = gj8.a;
                    boolean z2 = false;
                    if (ggaVar == null) {
                        synchronized (gga.class) {
                            try {
                                ggaVar = gj8.a;
                                if (ggaVar == null) {
                                    Context applicationContext = context2.getApplicationContext();
                                    nfa nfaVar2 = gj8.b;
                                    if (nfaVar2 == null) {
                                        synchronized (nfa.class) {
                                            nfaVar = gj8.b;
                                            if (nfaVar == null) {
                                                nfaVar = new nfa(new ob3(applicationContext, 3), 0);
                                                gj8.b = nfaVar;
                                            }
                                        }
                                        nfaVar2 = nfaVar;
                                    }
                                    ggaVar = new gga(nfaVar2, new q92(16));
                                    gj8.a = ggaVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    AutoCloseable autoCloseable = null;
                    if (str22 != null) {
                        try {
                            File file = new File(((Context) ((ob3) ((nfa) ggaVar.a).b).b).getCacheDir(), "lottie_network_cache");
                            if (file.isFile()) {
                                file.delete();
                            }
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            nfa.d(n95.JSON, false);
                            throw null;
                        } catch (FileNotFoundException unused) {
                        }
                    }
                    a49.a();
                    a49.a();
                    try {
                        try {
                            uo3 uo3VarI = q92.i();
                            HttpURLConnection httpURLConnection = uo3VarI.a;
                            try {
                                if (httpURLConnection.getResponseCode() / 100 == 2) {
                                    z2 = true;
                                }
                            } catch (IOException unused2) {
                            }
                            if (z2) {
                                p79Var = ggaVar.a(context2, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str22);
                                s69 s69Var2 = p79Var.a;
                                a49.a();
                            } else {
                                p79Var = new p79(new IllegalArgumentException(uo3VarI.a()));
                            }
                            try {
                                uo3VarI.close();
                            } catch (IOException e) {
                                a49.c("LottieFetchResult close failed ", e);
                            }
                        } catch (Exception e2) {
                            p79 p79Var2 = new p79(e2);
                            if (0 != 0) {
                                try {
                                    autoCloseable.close();
                                } catch (IOException e3) {
                                    a49.c("LottieFetchResult close failed ", e3);
                                }
                            }
                            p79Var = p79Var2;
                        }
                        if (str22 != null && (s69Var = p79Var.a) != null) {
                            t69.b.a.c(str22, s69Var);
                        }
                        return p79Var;
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            try {
                                autoCloseable.close();
                            } catch (IOException e4) {
                                a49.c("LottieFetchResult close failed ", e4);
                            }
                        }
                        throw th2;
                    }
                }
            }, null);
        }
        if (d79Var instanceof d79.c) {
            if (z) {
                return null;
            }
            new FileInputStream((String) null);
            wl7.b(str, "__LottieInternalDefaultCacheKey__");
            wve.D(null, Header.COMPRESSION_ALGORITHM, false);
            throw null;
        }
        int i2 = 1;
        if (d79Var instanceof d79.a) {
            if (wl7.b(str, "__LottieInternalDefaultCacheKey__")) {
                HashMap map3 = z69.a;
                return z69.a("asset_null", new cf3(context.getApplicationContext(), "asset_null", i2), null);
            }
            HashMap map4 = z69.a;
            return z69.a(str, new cf3(context.getApplicationContext(), str, i2), null);
        }
        if (d79Var instanceof d79.d) {
            if (wl7.b(str, "__LottieInternalDefaultCacheKey__")) {
                throw null;
            }
            return z69.a(str, new v69(), null);
        }
        if (!(d79Var instanceof d79.b)) {
            l.g();
            return null;
        }
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(null);
        if (wl7.b(str, "__LottieInternalDefaultCacheKey__")) {
            throw null;
        }
        HashMap map5 = z69.a;
        return z69.a(str, new jt3(i2, context.getApplicationContext(), inputStreamOpenInputStream, str), null);
    }
}
