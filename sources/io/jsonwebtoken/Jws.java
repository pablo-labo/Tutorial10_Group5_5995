package io.jsonwebtoken;

/* JADX INFO: loaded from: classes3.dex */
public interface Jws<B> extends Jwt<JwsHeader, B> {
    String getSignature();
}
