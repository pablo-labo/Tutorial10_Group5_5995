package io.jsonwebtoken.io;

import defpackage.b0;
import io.jsonwebtoken.lang.Assert;

/* JADX INFO: loaded from: classes3.dex */
class ExceptionPropagatingEncoder<T, R> implements Encoder<T, R> {
    private final Encoder<T, R> encoder;

    public ExceptionPropagatingEncoder(Encoder<T, R> encoder) {
        Assert.notNull(encoder, "Encoder cannot be null.");
        this.encoder = encoder;
    }

    @Override // io.jsonwebtoken.io.Encoder
    public R encode(T t) {
        Assert.notNull(t, "Encode argument cannot be null.");
        try {
            return this.encoder.encode(t);
        } catch (EncodingException e) {
            throw e;
        } catch (Exception e2) {
            throw new EncodingException(b0.h(e2, new StringBuilder("Unable to encode input: ")), e2);
        }
    }
}
