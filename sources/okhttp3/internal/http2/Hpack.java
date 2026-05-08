package okhttp3.internal.http2;

import com.datadog.android.log.LogAttributes;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.pyd;
import defpackage.r40;
import defpackage.uqc;
import defpackage.vr1;
import defpackage.zn1;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Huffman;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "<init>", "()V", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Hpack {
    public static final Hpack a = new Hpack();
    public static final Header[] b;
    public static final Map<vr1, Integer> c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Reader {
        public final uqc c;
        public int f;
        public int g;
        public int a = 4096;
        public final ArrayList b = new ArrayList();
        public Header[] d = new Header[8];
        public int e = 7;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.c = new uqc(continuationSource);
        }

        public final int a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i2 = this.e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.d[length];
                    header.getClass();
                    int i4 = header.c;
                    i -= i4;
                    this.g -= i4;
                    this.f--;
                    i3++;
                }
                Header[] headerArr = this.d;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.f);
                this.e += i3;
            }
            return i3;
        }

        public final vr1 b(int i) throws IOException {
            if (i >= 0) {
                Hpack hpack = Hpack.a;
                hpack.getClass();
                Header[] headerArr = Hpack.b;
                if (i <= headerArr.length - 1) {
                    hpack.getClass();
                    return headerArr[i].a;
                }
            }
            Hpack.a.getClass();
            int length = this.e + 1 + (i - Hpack.b.length);
            if (length >= 0) {
                Header[] headerArr2 = this.d;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    header.getClass();
                    return header.a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void c(Header header) {
            this.b.add(header);
            int i = header.c;
            int i2 = this.a;
            if (i > i2) {
                Header[] headerArr = this.d;
                pyd.q(null, 0, headerArr, headerArr.length);
                this.e = this.d.length - 1;
                this.f = 0;
                this.g = 0;
                return;
            }
            a((this.g + i) - i2);
            int i3 = this.f + 1;
            Header[] headerArr2 = this.d;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.e = this.d.length - 1;
                this.d = headerArr3;
            }
            int i4 = this.e;
            this.e = i4 - 1;
            this.d[i4] = header;
            this.f++;
            this.g += i;
        }

        public final vr1 d() {
            uqc uqcVar = this.c;
            byte b = uqcVar.readByte();
            byte[] bArr = Util.a;
            int i = b & 255;
            int i2 = 0;
            boolean z = (b & 128) == 128;
            long jE = e(i, 127);
            if (!z) {
                return uqcVar.J0(jE);
            }
            zn1 zn1Var = new zn1();
            Huffman.a.getClass();
            uqcVar.getClass();
            Huffman.Node node = Huffman.d;
            Huffman.Node node2 = node;
            int i3 = 0;
            for (long j = 0; j < jE; j++) {
                byte b2 = uqcVar.readByte();
                byte[] bArr2 = Util.a;
                i2 = (i2 << 8) | (b2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    Huffman.Node[] nodeArr = node2.a;
                    nodeArr.getClass();
                    node2 = nodeArr[(i2 >>> (i3 - 8)) & 255];
                    node2.getClass();
                    if (node2.a == null) {
                        zn1Var.r0(node2.b);
                        i3 -= node2.c;
                        node2 = node;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                Huffman.Node[] nodeArr2 = node2.a;
                nodeArr2.getClass();
                Huffman.Node node3 = nodeArr2[(i2 << (8 - i3)) & 255];
                node3.getClass();
                int i4 = node3.c;
                if (node3.a != null || i4 > i3) {
                    break;
                }
                zn1Var.r0(node3.b);
                i3 -= i4;
                node2 = node;
            }
            return zn1Var.J0(zn1Var.b);
        }

        public final int e(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.c.readByte();
                byte[] bArr = Util.a;
                int i5 = b & 255;
                if ((b & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (b & 127) << i4;
                i4 += 7;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Writer {
        public final zn1 a;
        public boolean c;
        public int g;
        public int h;
        public int b = Integer.MAX_VALUE;
        public int d = 4096;
        public Header[] e = new Header[8];
        public int f = 7;

        public Writer(zn1 zn1Var) {
            this.a = zn1Var;
        }

        public final void a(int i) {
            int i2;
            if (i > 0) {
                int length = this.e.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.e[length];
                    header.getClass();
                    i -= header.c;
                    int i4 = this.h;
                    Header header2 = this.e[length];
                    header2.getClass();
                    this.h = i4 - header2.c;
                    this.g--;
                    i3++;
                    length--;
                }
                Header[] headerArr = this.e;
                int i5 = i2 + 1;
                System.arraycopy(headerArr, i5, headerArr, i5 + i3, this.g);
                Header[] headerArr2 = this.e;
                int i6 = this.f + 1;
                Arrays.fill(headerArr2, i6, i6 + i3, (Object) null);
                this.f += i3;
            }
        }

        public final void b(Header header) {
            int i = header.c;
            int i2 = this.d;
            if (i > i2) {
                Header[] headerArr = this.e;
                pyd.q(null, 0, headerArr, headerArr.length);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i) - i2);
            int i3 = this.g + 1;
            Header[] headerArr2 = this.e;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f = this.e.length - 1;
                this.e = headerArr3;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = header;
            this.g++;
            this.h += i;
        }

        public final void c(vr1 vr1Var) throws EOFException {
            vr1Var.getClass();
            Huffman.a.getClass();
            int iH = vr1Var.h();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < iH; i++) {
                byte bR = vr1Var.r(i);
                byte[] bArr = Util.a;
                j2 += (long) Huffman.c[bR & 255];
            }
            int i2 = (int) ((j2 + 7) >> 3);
            int iH2 = vr1Var.h();
            zn1 zn1Var = this.a;
            if (i2 >= iH2) {
                e(vr1Var.h(), 127, 0);
                zn1Var.o0(vr1Var);
                return;
            }
            zn1 zn1Var2 = new zn1();
            Huffman.a.getClass();
            int iH3 = vr1Var.h();
            int i3 = 0;
            for (int i4 = 0; i4 < iH3; i4++) {
                byte bR2 = vr1Var.r(i4);
                byte[] bArr2 = Util.a;
                int i5 = bR2 & 255;
                int i6 = Huffman.b[i5];
                byte b = Huffman.c[i5];
                j = (j << b) | ((long) i6);
                i3 += b;
                while (i3 >= 8) {
                    i3 -= 8;
                    zn1Var2.r0((int) (j >> i3));
                }
            }
            if (i3 > 0) {
                zn1Var2.r0((int) ((j << (8 - i3)) | (255 >>> i3)));
            }
            vr1 vr1VarJ0 = zn1Var2.J0(zn1Var2.b);
            e(vr1VarJ0.h(), 127, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            zn1Var.o0(vr1VarJ0);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(java.util.ArrayList r14) throws java.io.EOFException {
            /*
                Method dump skipped, instruction units count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.d(java.util.ArrayList):void");
        }

        public final void e(int i, int i2, int i3) {
            zn1 zn1Var = this.a;
            if (i < i2) {
                zn1Var.r0(i | i3);
                return;
            }
            zn1Var.r0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                zn1Var.r0(128 | (i4 & 127));
                i4 >>>= 7;
            }
            zn1Var.r0(i4);
        }
    }

    static {
        Header header = new Header(Header.i, "");
        vr1 vr1Var = Header.f;
        Header header2 = new Header(vr1Var, "GET");
        Header header3 = new Header(vr1Var, "POST");
        vr1 vr1Var2 = Header.g;
        Header header4 = new Header(vr1Var2, "/");
        Header header5 = new Header(vr1Var2, "/index.html");
        vr1 vr1Var3 = Header.h;
        Header header6 = new Header(vr1Var3, "http");
        Header header7 = new Header(vr1Var3, "https");
        vr1 vr1Var4 = Header.e;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(vr1Var4, "200"), new Header(vr1Var4, "204"), new Header(vr1Var4, "206"), new Header(vr1Var4, "304"), new Header(vr1Var4, "400"), new Header(vr1Var4, TracingInterceptor.RESOURCE_NAME_404), new Header(vr1Var4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header(LogAttributes.DATE, ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header(LogAttributes.HOST, ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        b = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            if (!linkedHashMap.containsKey(headerArr[i].a)) {
                linkedHashMap.put(headerArr[i].a, Integer.valueOf(i));
            }
        }
        Map<vr1, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        c = mapUnmodifiableMap;
    }

    private Hpack() {
    }

    public static void a(vr1 vr1Var) {
        vr1Var.getClass();
        int iH = vr1Var.h();
        for (int i = 0; i < iH; i++) {
            byte bR = vr1Var.r(i);
            if (65 <= bR && bR < 91) {
                r40.h("PROTOCOL_ERROR response malformed: mixed case name: ".concat(vr1Var.A()));
                return;
            }
        }
    }
}
