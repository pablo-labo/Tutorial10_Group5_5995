package io.jsonwebtoken.io;

import io.jsonwebtoken.lang.Assert;

/* JADX INFO: loaded from: classes3.dex */
class Base64Decoder extends Base64Support implements Decoder<String, byte[]> {
    public Base64Decoder() {
        super(Base64.DEFAULT);
    }

    @Override // io.jsonwebtoken.io.Decoder
    public byte[] decode(String str) {
        Assert.notNull(str, "String argument cannot be null");
        return this.base64.decodeFast(str.toCharArray());
    }

    public Base64Decoder(Base64 base64) {
        super(base64);
    }
}
