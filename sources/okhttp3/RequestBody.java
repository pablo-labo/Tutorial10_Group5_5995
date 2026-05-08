package okhttp3;

import defpackage.a32;
import defpackage.ro1;
import defpackage.sy3;
import defpackage.vr1;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/RequestBody;", "", "<init>", "()V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lro1;", "sink", "Lj6g;", "writeTo", "(Lro1;)V", "", "isDuplex", "()Z", "isOneShot", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    @sy3
    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        Companion companion = INSTANCE;
        companion.getClass();
        bArr.getClass();
        return Companion.c(companion, mediaType, bArr, 0, 12);
    }

    public long contentLength() {
        return -1L;
    }

    /* JADX INFO: renamed from: contentType */
    public abstract MediaType getA();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(ro1 sink);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static RequestBody$Companion$toRequestBody$2 a(String str, MediaType mediaType) {
            str.getClass();
            Charset charset = a32.b;
            if (mediaType != null) {
                MediaType.Companion companion = MediaType.e;
                Charset charsetA = mediaType.a(null);
                if (charsetA == null) {
                    String str2 = mediaType + "; charset=utf-8";
                    MediaType.e.getClass();
                    try {
                        mediaType = MediaType.Companion.a(str2);
                    } catch (IllegalArgumentException unused) {
                        mediaType = null;
                    }
                } else {
                    charset = charsetA;
                }
            }
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            return b(mediaType, bytes, 0, bytes.length);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [okhttp3.RequestBody$Companion$toRequestBody$2] */
        public static RequestBody$Companion$toRequestBody$2 b(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
            bArr.getClass();
            long length = bArr.length;
            long j = i;
            long j2 = i2;
            byte[] bArr2 = Util.a;
            if ((j | j2) < 0 || j > length || length - j < j2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public final long contentLength() {
                    return i2;
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public final MediaType getA() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(ro1 ro1Var) {
                    ro1Var.getClass();
                    ro1Var.p0(i, bArr, i2);
                }
            };
        }

        public static RequestBody$Companion$toRequestBody$2 c(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            int length = bArr.length;
            companion.getClass();
            return b(mediaType, bArr, i, length);
        }

        public static /* synthetic */ RequestBody$Companion$toRequestBody$2 d(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            int length = bArr.length;
            companion.getClass();
            return b(mediaType, bArr, i, length);
        }

        private Companion() {
        }
    }

    @sy3
    public static final RequestBody create(MediaType mediaType, File file) {
        INSTANCE.getClass();
        file.getClass();
        return new RequestBody$Companion$asRequestBody$1(mediaType, file);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        INSTANCE.getClass();
        return Companion.a(str, mediaType);
    }

    @sy3
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        Companion companion = INSTANCE;
        companion.getClass();
        bArr.getClass();
        return Companion.c(companion, mediaType, bArr, i, 8);
    }

    public static final RequestBody create(byte[] bArr) {
        Companion companion = INSTANCE;
        companion.getClass();
        bArr.getClass();
        return Companion.d(companion, bArr, null, 0, 7);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        Companion companion = INSTANCE;
        companion.getClass();
        bArr.getClass();
        return Companion.d(companion, bArr, mediaType, 0, 6);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        Companion companion = INSTANCE;
        companion.getClass();
        bArr.getClass();
        return Companion.d(companion, bArr, mediaType, i, 4);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        INSTANCE.getClass();
        return Companion.b(mediaType, bArr, i, i2);
    }

    public static final RequestBody create(vr1 vr1Var, MediaType mediaType) {
        INSTANCE.getClass();
        vr1Var.getClass();
        return new RequestBody$Companion$toRequestBody$1(mediaType, vr1Var);
    }

    @sy3
    public static final RequestBody create(MediaType mediaType, vr1 vr1Var) {
        INSTANCE.getClass();
        vr1Var.getClass();
        return new RequestBody$Companion$toRequestBody$1(mediaType, vr1Var);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        INSTANCE.getClass();
        file.getClass();
        return new RequestBody$Companion$asRequestBody$1(mediaType, file);
    }

    @sy3
    public static final RequestBody create(MediaType mediaType, String str) {
        INSTANCE.getClass();
        str.getClass();
        return Companion.a(str, mediaType);
    }

    @sy3
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        INSTANCE.getClass();
        bArr.getClass();
        return Companion.b(mediaType, bArr, i, i2);
    }
}
