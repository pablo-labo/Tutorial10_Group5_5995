package com.wlappdebug;

import com.wlappdebug.DebugFlagsActivity;
import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends mj8 implements Function1<DebugFlagsActivity.a, Comparable<?>> {
    public static final s a = new s(1);

    @Override // kotlin.jvm.functions.Function1
    public final Comparable<?> invoke(DebugFlagsActivity.a aVar) {
        aVar.getClass();
        return true;
    }
}
