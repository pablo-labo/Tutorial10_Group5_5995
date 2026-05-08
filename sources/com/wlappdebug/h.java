package com.wlappdebug;

import android.content.pm.Signature;
import defpackage.mj8;
import defpackage.u63;
import defpackage.z92;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends mj8 implements Function1<Signature, CharSequence> {
    public static final h a = new h(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Signature signature) {
        return z92.W0(u63.a0("SHA-1", "SHA-256"), "\n", null, null, new g(signature), 30);
    }
}
