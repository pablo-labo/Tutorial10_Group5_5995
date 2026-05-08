package defpackage;

import android.app.Activity;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.JsonReader;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.x33;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l5 implements p55, v84, x33.a, lz8.a, af4, jg2, lz8.b {
    public final /* synthetic */ int a;

    public static int c(int i, int i2, int i3, int i4) {
        return ((i - i2) * i3) + i4;
    }

    public static /* bridge */ /* synthetic */ Activity.ScreenCaptureCallback j(Object obj) {
        return (Activity.ScreenCaptureCallback) obj;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb, Boolean bool, String str) {
        sb.append(bool);
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ void o(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                o6.h();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void q(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void r(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void s(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    @Override // x33.a
    public Object a(JsonReader jsonReader) throws IOException {
        String strConcat;
        jsonReader.beginObject();
        Long lValueOf = null;
        s21 s21Var = null;
        String strNextString = null;
        String strNextString2 = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                strConcat = s21Var == null ? " rolloutVariant" : "";
                if (strNextString == null) {
                    strConcat = strConcat.concat(" parameterKey");
                }
                if (strNextString2 == null) {
                    strConcat = strConcat.concat(" parameterValue");
                }
                if (lValueOf == null) {
                    strConcat = strConcat.concat(" templateVersion");
                }
                if (strConcat.isEmpty()) {
                    return new r21(s21Var, strNextString, strNextString2, lValueOf.longValue());
                }
                r6.g("Missing required properties:".concat(strConcat));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ja.k("Null parameterKey");
                        return null;
                    }
                    break;
                    break;
                case "templateVersion":
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    jsonReader.beginObject();
                    String strNextString3 = null;
                    String strNextString4 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("variantId")) {
                            strNextString4 = jsonReader.nextString();
                            if (strNextString4 == null) {
                                ja.k("Null variantId");
                                return null;
                            }
                        } else if (strNextName2.equals("rolloutId")) {
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                ja.k("Null rolloutId");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strConcat = strNextString3 == null ? " rolloutId" : "";
                    if (strNextString4 == null) {
                        strConcat = strConcat.concat(" variantId");
                    }
                    if (!strConcat.isEmpty()) {
                        r6.g("Missing required properties:".concat(strConcat));
                        return null;
                    }
                    s21Var = new s21(strNextString3, strNextString4);
                    break;
                    break;
                case "parameterValue":
                    strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        ja.k("Null parameterValue");
                        return null;
                    }
                    break;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    @Override // defpackage.af4
    public float b(float f) {
        return f;
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        switch (this.a) {
            case 12:
                cn8<ScheduledExecutorService> cn8Var = ExecutorsRegistrar.a;
                return a5g.a;
            default:
                return FirebaseSessionsRegistrar.m25getComponents$lambda0(l7dVar);
        }
    }

    @Override // defpackage.v84
    public double f(double d) {
        float[] fArr = ya2.a;
        return ya2.a(ya2.c, d);
    }

    @Override // defpackage.p55
    public m55[] h() {
        return new m55[]{new m5()};
    }

    @Override // lz8.b
    public void i(Object obj, bh5 bh5Var) {
        ((gdb.c) obj).o(new gdb.b(bh5Var));
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 8:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    public /* synthetic */ l5(int i) {
        this.a = i;
    }

    public /* synthetic */ l5(Object obj, int i) {
        this.a = i;
    }
}
