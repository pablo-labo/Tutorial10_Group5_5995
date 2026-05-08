package defpackage;

import java.io.ByteArrayOutputStream;
import org.spongycastle.util.encoders.DecoderException;

/* JADX INFO: loaded from: classes3.dex */
public final class sh6 {
    public static final by3 a = new by3(1);

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.c(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException(e, b0.h(e, new StringBuilder("exception decoding Hex string: ")));
        }
    }
}
