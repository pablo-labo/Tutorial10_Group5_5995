package defpackage;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.media3.common.PlaybackException;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.core.File;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.google.firebase.encoders.EncodingException;
import defpackage.gdb;
import defpackage.l6d;
import defpackage.lz8;
import defpackage.zy1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yy1 implements lz8.a, n8, l6d.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yy1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public zy1.b a(zy1.a aVar) throws IOException {
        zy1 zy1Var = (zy1) this.b;
        URL url = aVar.a;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(zy1Var.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(DataOkHttpUploader.HEADER_USER_AGENT, "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(TracingInterceptor.HEADER_CT, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    i62 i62Var = zy1Var.a;
                    t11 t11Var = aVar.b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    ea8 ea8Var = (ea8) i62Var.a;
                    fc8 fc8Var = new fc8(bufferedWriter, ea8Var.a, ea8Var.b, ea8Var.c, ea8Var.d);
                    fc8Var.j(t11Var);
                    fc8Var.l();
                    fc8Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    i49.a(httpURLConnection.getHeaderField(TracingInterceptor.HEADER_CT), "CctTransportBackend", "Content-Type: %s");
                    i49.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new zy1.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new zy1.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            zy1.b bVar = new zy1.b(responseCode, null, h31.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException e) {
            e = e;
            i49.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new zy1.b(DataOkHttpUploader.HTTP_BAD_REQUEST, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            i49.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new zy1.b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            i49.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new zy1.b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            i49.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new zy1.b(DataOkHttpUploader.HTTP_BAD_REQUEST, null, 0L);
        }
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        yw9 yw9Var = (yw9) this.b;
        ActivityResult activityResult = (ActivityResult) obj;
        activityResult.getClass();
        vw9 vw9Var = yw9Var.l0;
        if (vw9Var != null) {
            String url = yw9Var.N().getUrl();
            if (url == null) {
                url = "";
            }
            vw9Var.i(url, activityResult.a, activityResult.b);
        }
    }

    @Override // l6d.b
    public void e(Object obj) {
        RiveAnimationView.loadFromNetwork$lambda$4((Function1) this.b, (File) obj);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                adb adbVar = (adb) obj2;
                gdb.c cVar = (gdb.c) obj;
                cVar.p(adbVar.g);
                cVar.U(adbVar.g);
                break;
            case 2:
                ((gdb.c) obj).b0((q83) obj2);
                break;
            default:
                ((gdb.c) obj).q0((PlaybackException) obj2);
                break;
        }
    }
}
