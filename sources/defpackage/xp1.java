package defpackage;

import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.runtime.ReactHostImpl;
import defpackage.vr1;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class xp1 {
    public final OkHttpClient a;
    public RealCall b;

    public static final class a {
        public String a;
        public int b;
    }

    public xp1(OkHttpClient okHttpClient) {
        this.a = okHttpClient;
    }

    public static final void a(xp1 xp1Var, String str, int i, Headers headers, to1 to1Var, File file, a aVar, l34 l34Var) throws IOException {
        xp1Var.getClass();
        DebugServerException debugServerException = null;
        String string = null;
        debugServerException = null;
        if (i != 200) {
            String strZ1 = to1Var.z1();
            if (strZ1.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(strZ1);
                    String string2 = jSONObject.getString(BatchMetricsDispatcher.FILE_NAME);
                    String string3 = jSONObject.getString("message");
                    string3.getClass();
                    string2.getClass();
                    debugServerException = new DebugServerException(string3, jSONObject.getInt("lineNumber"), jSONObject.getInt("column"), DebugServerException.a.a(string2));
                } catch (JSONException e) {
                    s55.o("ReactNative", "Could not parse DebugServerException from: ".concat(strZ1), e);
                }
            }
            if (debugServerException != null) {
                l34Var.a(debugServerException);
                return;
            }
            StringBuilder sbJ = m6.j(i, "The development server returned response error code: ", "\n\nURL: ", str, "\n\nBody:\n");
            sbJ.append(strZ1);
            l34Var.a(new DebugServerException(sbJ.toString()));
            return;
        }
        aVar.a = str;
        String strA = headers.a("X-Metro-Files-Changed-Count");
        if (strA != null) {
            try {
                aVar.b = Integer.parseInt(strA);
            } catch (NumberFormatException e2) {
                aVar.b = -2;
                s55.g("BundleDownloader", "Can't populate bundle info: ", e2);
            }
        }
        File file2 = new File(t40.k(file.getPath(), ".tmp"));
        dxa dxaVarQ = c0h.Q(file2);
        try {
            to1Var.k1(dxaVarQ);
            dxaVarQ.close();
            if (!file2.renameTo(file)) {
                ja.o("Couldn't rename ", file2, file);
                return;
            }
            i34 i34Var = l34Var.a;
            tm3 tm3Var = i34Var.d;
            if (tm3Var != null) {
                tm3Var.c();
            }
            i34Var.t = false;
            ReactMarkerConstants reactMarkerConstants = ReactMarkerConstants.DOWNLOAD_END;
            a aVar2 = l34Var.b;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", aVar2.a);
                jSONObject2.put("filesChangedCount", aVar2.b);
                string = jSONObject2.toString();
            } catch (JSONException e3) {
                s55.g("BundleDownloader", "Can't serialize bundle info: ", e3);
            }
            ReactMarker.logMarker(reactMarkerConstants, string);
            ulc ulcVar = l34Var.c;
            ReactHostImpl reactHostImpl = ulcVar.a;
            AtomicInteger atomicInteger = ReactHostImpl.A;
            reactHostImpl.t("loadJSBundleFromMetro()", "Creating BundleLoader");
            ulcVar.d.v(JSBundleLoader.INSTANCE.createCachedBundleFromNetworkLoader(ulcVar.b, ulcVar.c.c()));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0h.q(dxaVarQ, th);
                throw th2;
            }
        }
    }

    public static final void b(xp1 xp1Var, String str, Response response, String str2, File file, a aVar, l34 l34Var) throws EOFException {
        boolean z;
        zp1 zp1Var;
        vr1 vr1Var;
        vr1 vr1Var2;
        String str3;
        zn1 zn1Var;
        LinkedHashMap linkedHashMapB;
        long j;
        vr1 vr1Var3;
        k2a k2aVar;
        long j2;
        boolean z2;
        xp1Var.getClass();
        ResponseBody responseBody = response.V;
        int i = response.d;
        if (responseBody == null) {
            l34Var.a(new DebugServerException(sve.w("\n                    Error while reading multipart response.\n                    \n                    Response body was empty: " + i + "\n                    \n                    URL: " + str + "\n                    \n                    \n                    ")));
            return;
        }
        to1 e = responseBody.getE();
        if (e == null) {
            r6.g("Required value was null.");
            return;
        }
        k2a k2aVar2 = new k2a(e, str2);
        zp1 zp1Var2 = new zp1(response, xp1Var, str, file, aVar, l34Var);
        vr1 vr1Var4 = vr1.c;
        vr1 vr1VarC = vr1.a.c("\r\n--" + str2 + "\r\n");
        vr1 vr1VarC2 = vr1.a.c("\r\n--" + str2 + "--\r\n");
        String str4 = "\r\n\r\n";
        vr1 vr1VarC3 = vr1.a.c("\r\n\r\n");
        zn1 zn1Var2 = new zn1();
        zp1 zp1Var3 = zp1Var2;
        LinkedHashMap linkedHashMap = null;
        long j3 = 0;
        long j4 = 0;
        long jH = 0;
        long jH2 = 0;
        while (true) {
            k2a k2aVar3 = k2aVar2;
            long jMax = (long) Math.max(jH - ((long) vr1VarC2.h()), j4);
            long jW = zn1Var2.W(jMax, vr1VarC);
            if (jW == -1) {
                jW = zn1Var2.W(jMax, vr1VarC2);
                z = true;
            } else {
                z = false;
            }
            boolean z3 = z;
            if (jW == -1) {
                long j5 = zn1Var2.b;
                if (linkedHashMap == null) {
                    long j6 = j4;
                    long jW2 = zn1Var2.W(jMax, vr1VarC3);
                    if (jW2 >= j3) {
                        e.f1(zn1Var2, jW2);
                        zn1 zn1Var3 = new zn1();
                        zn1 zn1Var4 = zn1Var2;
                        zn1Var4.G(zn1Var3, jMax, jW2 - jMax);
                        zp1Var = zp1Var3;
                        jH2 = zn1Var3.b + ((long) vr1VarC3.h());
                        vr1Var = vr1VarC2;
                        vr1Var2 = vr1VarC;
                        str3 = str4;
                        zn1Var = zn1Var4;
                        linkedHashMapB = k2a.b(zn1Var3);
                        j = j6;
                        vr1Var3 = vr1VarC3;
                        jH = j5;
                        k2aVar = k2aVar3;
                        j2 = j3;
                    } else {
                        zp1Var = zp1Var3;
                        vr1Var = vr1VarC2;
                        jH = j5;
                        vr1Var2 = vr1VarC;
                        str3 = str4;
                        j2 = j3;
                        j = j6;
                        zn1Var = zn1Var2;
                        linkedHashMapB = linkedHashMap;
                        vr1Var3 = vr1VarC3;
                        k2aVar = k2aVar3;
                    }
                } else {
                    long j7 = j5 - jH2;
                    zp1Var = zp1Var3;
                    vr1Var = vr1VarC2;
                    vr1Var2 = vr1VarC;
                    str3 = str4;
                    zn1Var = zn1Var2;
                    linkedHashMapB = linkedHashMap;
                    j = j4;
                    vr1Var3 = vr1VarC3;
                    jH = j5;
                    k2aVar = k2aVar3;
                    j2 = j3;
                    k2aVar.a(linkedHashMapB, j7, false, zp1Var);
                }
                if (e.f1(zn1Var, 4096L) <= j2) {
                    l34Var.a(new DebugServerException(sve.w("\n                    Error while reading multipart response.\n                    \n                    Response code: " + i + "\n                    \n                    URL: " + str + "\n                    \n                    \n                    ")));
                    return;
                }
                j3 = j2;
                k2aVar2 = k2aVar;
                vr1VarC3 = vr1Var3;
                linkedHashMap = linkedHashMapB;
                zn1Var2 = zn1Var;
                vr1VarC2 = vr1Var;
                zp1Var3 = zp1Var;
                j4 = j;
                vr1VarC = vr1Var2;
                str4 = str3;
            } else {
                vr1 vr1Var5 = vr1VarC;
                String str5 = str4;
                long j8 = j4;
                long j9 = jW;
                zp1 zp1Var4 = zp1Var3;
                vr1 vr1Var6 = vr1VarC2;
                zn1 zn1Var5 = zn1Var2;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                vr1 vr1Var7 = vr1VarC3;
                long j10 = j9 - j8;
                if (j8 > j3) {
                    zn1 zn1Var6 = new zn1();
                    zn1Var5.skip(j8);
                    zn1Var5.f1(zn1Var6, j10);
                    k2aVar3.a(linkedHashMap2, zn1Var6.b - jH2, true, zp1Var4);
                    vr1 vr1Var8 = vr1.c;
                    long jW3 = zn1Var6.W(j3, vr1.a.c(str5));
                    if (jW3 == -1) {
                        z2 = z3;
                        zp1Var4.a(bs4.a, zn1Var6, z2);
                    } else {
                        z2 = z3;
                        zn1 zn1Var7 = new zn1();
                        zn1 zn1Var8 = new zn1();
                        zn1Var6.f1(zn1Var7, jW3);
                        zn1Var6.skip(r1.h());
                        zn1Var6.k1(zn1Var8);
                        zp1Var4.a(k2a.b(zn1Var7), zn1Var8, z2);
                    }
                    linkedHashMap2 = null;
                    jH2 = 0;
                } else {
                    z2 = z3;
                    zn1Var5.skip(j9);
                }
                if (z2) {
                    return;
                }
                k2aVar2 = k2aVar3;
                jH = vr1Var5.h();
                vr1VarC3 = vr1Var7;
                vr1VarC = vr1Var5;
                str4 = str5;
                j3 = 0;
                linkedHashMap = linkedHashMap2;
                zn1Var2 = zn1Var5;
                vr1VarC2 = vr1Var6;
                zp1Var3 = zp1Var4;
                j4 = jH;
            }
        }
    }
}
