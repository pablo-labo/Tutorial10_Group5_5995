package defpackage;

import android.net.Uri;
import com.facebook.react.common.DebugServerException;
import defpackage.xp1;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
public final class yp1 implements Callback {
    public final /* synthetic */ xp1 a;
    public final /* synthetic */ l34 b;
    public final /* synthetic */ File c;
    public final /* synthetic */ xp1.a d;

    public yp1(xp1 xp1Var, l34 l34Var, File file, xp1.a aVar) {
        this.a = xp1Var;
        this.b = l34Var;
        this.c = file;
        this.d = aVar;
    }

    @Override // okhttp3.Callback
    public final void h(Call call, IOException iOException) {
        xp1 xp1Var = this.a;
        RealCall realCall = xp1Var.b;
        if (realCall == null || realCall.e0) {
            xp1Var.b = null;
            return;
        }
        xp1Var.b = null;
        String str = call.getB().a.i;
        this.b.a(new DebugServerException(iOException, l5.m("Could not connect to development server.", wve.I("\n\nTry the following to fix the issue:\n\\u2022 Ensure that Metro is running\n\\u2022 Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n\\u2022 Ensure Airplane Mode is disabled\n\\u2022 If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT> to forward requests from your device\n\\u2022 If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n", "<PORT>", String.valueOf(Uri.parse(str).getPort())), "URL: ".concat(str))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r8v11, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [okhttp3.internal.connection.RealCall] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // okhttp3.Callback
    public final void p(Call call, Response response) {
        ?? r8;
        ?? r82;
        xp1 xp1Var = this.a;
        File file = this.c;
        xp1.a aVar = this.d;
        l34 l34Var = this.b;
        try {
            r8 = xp1Var.b;
            try {
                if (r8 == 0 || r8.e0) {
                    xp1Var.b = null;
                    response.close();
                    return;
                }
                xp1Var.b = null;
                String str = response.a.a.i;
                String strA = response.f.a("content-type");
                if (strA == null) {
                    strA = null;
                }
                if (strA == null) {
                    strA = "";
                }
                Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(strA);
                if (strA.length() <= 0 || !matcher.find()) {
                    r8 = response;
                    ResponseBody responseBody = r8.V;
                    if (responseBody != null) {
                        try {
                            xp1.a(xp1Var, str, r8.d, r8.f, responseBody.getE(), file, aVar, l34Var);
                        } finally {
                        }
                    }
                    j6g j6gVar = j6g.a;
                    c0h.q(responseBody, null);
                    r82 = r8;
                } else {
                    String strGroup = matcher.group(1);
                    hh1.n(strGroup);
                    try {
                        xp1.b(xp1Var, str, response, strGroup, file, aVar, l34Var);
                        r82 = response;
                    } catch (Throwable th) {
                        th = th;
                        r8 = response;
                    }
                }
                j6g j6gVar2 = j6g.a;
                r82.close();
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            r8 = response;
        }
        Throwable th4 = th;
        try {
            throw th4;
        } catch (Throwable th5) {
            c0h.q(r8, th4);
            throw th5;
        }
    }
}
