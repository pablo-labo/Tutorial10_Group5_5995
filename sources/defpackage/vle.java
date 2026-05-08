package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vle implements hoa {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ vle(Function2 function2) {
        this.a = function2;
    }

    @Override // defpackage.hoa
    public final void dispose() {
        Function2 function2 = this.a;
        synchronized (ame.c) {
            ame.h = z92.d1(ame.h, function2);
            j6g j6gVar = j6g.a;
        }
    }
}
