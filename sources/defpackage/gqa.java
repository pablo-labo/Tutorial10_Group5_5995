package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gqa extends wpa {
    public final /* synthetic */ Function1<wpa, j6g> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqa(Function1 function1) {
        super(true);
        this.d = function1;
    }

    @Override // defpackage.wpa
    public final void b() {
        this.d.invoke(this);
    }
}
