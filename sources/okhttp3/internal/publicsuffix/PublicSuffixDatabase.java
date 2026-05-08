package okhttp3.internal.publicsuffix;

import defpackage.a7e;
import defpackage.c0h;
import defpackage.j6g;
import defpackage.je6;
import defpackage.luc;
import defpackage.r6;
import defpackage.u63;
import defpackage.uqc;
import defpackage.wl7;
import defpackage.y92;
import defpackage.z92;
import defpackage.zr4;
import defpackage.zve;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {
    public static final Companion e = new Companion(0);
    public static final byte[] f = {42};
    public static final List<String> g = u63.Z("*");
    public static final PublicSuffixDatabase h = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List listJ0 = zve.j0(str, new char[]{JwtParser.SEPARATOR_CHAR});
        return wl7.b(z92.Y0(listJ0), "") ? z92.K0(1, listJ0) : listJ0;
    }

    public final String a(String str) {
        String strA;
        String strA2;
        String strA3;
        List<String> listJ0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listC = c(unicode);
        List<String> listJ02 = zr4.a;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        Platform.a.getClass();
                        Platform.b.getClass();
                        Platform.i(5, "Failed to read public suffix list", e2);
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.c == null) {
            r6.g("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            String str2 = (String) listC.get(i);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strA = null;
                break;
            }
            Companion companion = e;
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                wl7.g("publicSuffixListBytes");
                throw null;
            }
            strA = Companion.a(companion, bArr2, bArr, i2);
            if (strA != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = f;
                Companion companion2 = e;
                byte[] bArr4 = this.c;
                if (bArr4 == null) {
                    wl7.g("publicSuffixListBytes");
                    throw null;
                }
                strA2 = Companion.a(companion2, bArr4, bArr3, i3);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                Companion companion3 = e;
                byte[] bArr5 = this.d;
                if (bArr5 == null) {
                    wl7.g("publicSuffixExceptionListBytes");
                    throw null;
                }
                strA3 = Companion.a(companion3, bArr5, bArr, i5);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listJ0 = zve.j0("!".concat(strA3), new char[]{JwtParser.SEPARATOR_CHAR});
        } else if (strA == null && strA2 == null) {
            listJ0 = g;
        } else {
            List<String> listJ03 = strA != null ? zve.j0(strA, new char[]{JwtParser.SEPARATOR_CHAR}) : listJ02;
            if (strA2 != null) {
                listJ02 = zve.j0(strA2, new char[]{JwtParser.SEPARATOR_CHAR});
            }
            listJ0 = listJ03.size() > listJ02.size() ? listJ03 : listJ02;
        }
        if (listC.size() == listJ0.size() && listJ0.get(0).charAt(0) != '!') {
            return null;
        }
        if (listJ0.get(0).charAt(0) == '!') {
            size = listC.size();
            size2 = listJ0.size();
        } else {
            size = listC.size();
            size2 = listJ0.size() + 1;
        }
        return a7e.T(a7e.Q(new y92(c(str)), size - size2), ".");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    public final void b() {
        try {
            luc lucVar = new luc();
            luc lucVar2 = new luc();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                uqc uqcVar = new uqc(new je6(c0h.S(resourceAsStream)));
                try {
                    lucVar.element = uqcVar.l0(uqcVar.readInt());
                    lucVar2.element = uqcVar.l0(uqcVar.readInt());
                    j6g j6gVar = j6g.a;
                    uqcVar.close();
                    synchronized (this) {
                        T t = lucVar.element;
                        t.getClass();
                        this.c = (byte[]) t;
                        T t2 = lucVar2.element;
                        t2.getClass();
                        this.d = (byte[]) t2;
                    }
                } finally {
                }
            }
        } finally {
            this.b.countDown();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "<init>", "()V", "", "EXCEPTION_MARKER", "C", "", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "", "WILDCARD_LABEL", "[B", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static final String a(Companion companion, byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            companion.getClass();
            int length = bArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = (i5 + length) / 2;
                while (i6 > -1 && bArr[i6] != 10) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i2 = i7 + i8;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i8++;
                }
                int i9 = i2 - i7;
                int i10 = i;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte b = bArr2[i10][i11];
                        byte[] bArr3 = Util.a;
                        int i13 = b & 255;
                        z = z2;
                        i3 = i13;
                    }
                    byte b2 = bArr[i7 + i12];
                    byte[] bArr4 = Util.a;
                    i4 = i3 - (b2 & 255);
                    if (i4 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i14 = i9 - i12;
                        int length2 = bArr2[i10].length - i11;
                        int length3 = bArr2.length;
                        for (int i15 = i10 + 1; i15 < length3; i15++) {
                            length2 += bArr2[i15].length;
                        }
                        if (length2 >= i14) {
                            if (length2 <= i14) {
                                Charset charset = StandardCharsets.UTF_8;
                                charset.getClass();
                                return new String(bArr, i7, i9, charset);
                            }
                        }
                    }
                    i5 = i2 + 1;
                }
                length = i6;
            }
            return null;
        }

        private Companion() {
        }
    }
}
