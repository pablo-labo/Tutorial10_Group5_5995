package io.jsonwebtoken.io;

import defpackage.b0;
import io.jsonwebtoken.lang.Assert;

/* JADX INFO: loaded from: classes3.dex */
class ExceptionPropagatingDecoder<T, R> implements Decoder<T, R> {
    private final Decoder<T, R> decoder;

    public ExceptionPropagatingDecoder(Decoder<T, R> decoder) {
        Assert.notNull(decoder, "Decoder cannot be null.");
        this.decoder = decoder;
    }

    @Override // io.jsonwebtoken.io.Decoder
    public R decode(T t) {
        Assert.notNull(t, "Decode argument cannot be null.");
        try {
            return this.decoder.decode(t);
        } catch (DecodingException e) {
            throw e;
        } catch (Exception e2) {
            throw new DecodingException(b0.h(e2, new StringBuilder("Unable to decode input: ")), e2);
        }
    }
}
