package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class sn6 {
    public static final ThreadLocal<char[]> a;

    static {
        char c = File.separatorChar;
        System.lineSeparator();
        dre.LF.getClass();
        dre.CRLF.getClass();
        ThreadLocal.withInitial(new qn6());
        a = ThreadLocal.withInitial(new rn6());
    }

    public static int a(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        Objects.requireNonNull(inputStream, "inputStream");
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                break;
            }
            fileOutputStream.write(bArr, 0, i);
            j += (long) i;
        }
        if (j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }

    @Deprecated
    public static String b(InputStream inputStream) throws IOException {
        Charset charsetDefaultCharset = Charset.defaultCharset();
        ave aveVar = new ave();
        int i = z22.a;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charsetDefaultCharset);
        char[] cArr = a.get();
        Arrays.fill(cArr, (char) 0);
        while (true) {
            int i2 = inputStreamReader.read(cArr);
            if (-1 == i2) {
                return aveVar.toString();
            }
            aveVar.write(cArr, 0, i2);
        }
    }
}
