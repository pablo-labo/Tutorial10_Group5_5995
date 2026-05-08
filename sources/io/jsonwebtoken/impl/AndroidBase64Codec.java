package io.jsonwebtoken.impl;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoders;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AndroidBase64Codec extends AbstractTextCodec {
    @Override // io.jsonwebtoken.impl.TextCodec
    public byte[] decode(String str) {
        return Decoders.BASE64.decode(str);
    }

    @Override // io.jsonwebtoken.impl.TextCodec
    public String encode(byte[] bArr) {
        return Encoders.BASE64.encode(bArr);
    }
}
