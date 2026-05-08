package io.jsonwebtoken.impl.compression;

import io.jsonwebtoken.CompressionCodec;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class CompressionCodecs {
    private static final CompressionCodecs I = new CompressionCodecs();

    @Deprecated
    public static final CompressionCodec DEFLATE = io.jsonwebtoken.CompressionCodecs.DEFLATE;

    @Deprecated
    public static final CompressionCodec GZIP = io.jsonwebtoken.CompressionCodecs.GZIP;

    private CompressionCodecs() {
    }
}
