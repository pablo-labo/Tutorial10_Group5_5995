package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.pr1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f25 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, kt0 kt0Var) {
        int iD = new e25(inputStream).d(1, "Orientation");
        if (iD == 0) {
            return -1;
        }
        return iD;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(ByteBuffer byteBuffer, kt0 kt0Var) {
        AtomicReference<byte[]> atomicReference = pr1.a;
        return a(new pr1.a(byteBuffer), kt0Var);
    }
}
