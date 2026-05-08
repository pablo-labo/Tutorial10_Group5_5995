package defpackage;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class uo3 implements Closeable {
    public final HttpURLConnection a;

    public uo3(HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
    }

    public final String a() {
        HttpURLConnection httpURLConnection = this.a;
        boolean z = httpURLConnection.getResponseCode() / 100 == 2;
        if (z) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to fetch ");
            sb.append(httpURLConnection.getURL());
            sb.append(". Failed with ");
            sb.append(httpURLConnection.getResponseCode());
            sb.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                }
            }
            sb.append(sb2.toString());
            return sb.toString();
        } catch (IOException e) {
            a49.c("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.disconnect();
    }
}
