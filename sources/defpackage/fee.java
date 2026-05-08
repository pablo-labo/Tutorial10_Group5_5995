package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fee extends mj8 implements Function2<vld, hee, jee> {
    public static final fee a = new fee(2);

    @Override // kotlin.jvm.functions.Function2
    public final jee invoke(vld vldVar, hee heeVar) {
        return (jee) ((gme) heeVar.c.g).getValue();
    }
}
