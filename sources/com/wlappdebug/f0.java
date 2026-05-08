package com.wlappdebug;

import com.wlappdebug.DebugProctorActivity;
import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends mj8 implements Function1<DebugProctorActivity.e, Comparable<?>> {
    public static final f0 a = new f0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Comparable<?> invoke(DebugProctorActivity.e eVar) {
        DebugProctorActivity.e eVar2 = eVar;
        eVar2.getClass();
        return eVar2.a.getName();
    }
}
