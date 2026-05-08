package com.facebook.imagepipeline.decoder;

import defpackage.vs4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/imagepipeline/decoder/DecodeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lvs4;", "encodedImage", "Lvs4;", "a", "()Lvs4;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DecodeException extends RuntimeException {
    private final vs4 encodedImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecodeException(String str, vs4 vs4Var) {
        super(str);
        vs4Var.getClass();
        this.encodedImage = vs4Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final vs4 getEncodedImage() {
        return this.encodedImage;
    }
}
