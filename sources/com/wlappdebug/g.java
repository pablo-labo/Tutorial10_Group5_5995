package com.wlappdebug;

import android.content.pm.Signature;
import defpackage.mj8;
import defpackage.ut0;
import defpackage.wve;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends mj8 implements Function1<String, CharSequence> {
    final /* synthetic */ Signature $signature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Signature signature) {
        super(1);
        this.$signature = signature;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(String str) throws NoSuchAlgorithmException {
        String str2 = str;
        str2.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        messageDigest.update(this.$signature.toByteArray());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return wve.I(str2, "-", "") + ": " + ut0.s0(bArrDigest, ":", f.a, 30);
    }
}
