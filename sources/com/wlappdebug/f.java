package com.wlappdebug;

import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends mj8 implements Function1<Byte, CharSequence> {
    public static final f a = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Byte b) {
        String hexString = Integer.toHexString(b.byteValue() | 256);
        hexString.getClass();
        int length = hexString.length();
        return hexString.substring(length - (2 > length ? length : 2));
    }
}
