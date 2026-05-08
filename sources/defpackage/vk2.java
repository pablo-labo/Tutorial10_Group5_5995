package defpackage;

import androidx.navigation.k;
import defpackage.uk2;

/* JADX INFO: loaded from: classes.dex */
public final class vk2 extends eba<uk2.a> {
    public final uk2 h;
    public final ah2 i;
    public hs j;
    public iq0 k;
    public vg l;
    public kd m;

    public vk2(uk2 uk2Var, yd8 yd8Var, ah2 ah2Var) {
        super(uk2Var, (yd8<?>) yd8Var, bs4.a);
        this.h = uk2Var;
        this.i = ah2Var;
    }

    @Override // defpackage.eba
    public final k a() {
        uk2.a aVar = (uk2.a) super.a();
        aVar.b0 = this.j;
        aVar.c0 = this.k;
        aVar.d0 = this.l;
        aVar.e0 = this.m;
        return aVar;
    }

    @Override // defpackage.eba
    public final k b() {
        return new uk2.a(this.h, this.i);
    }

    public vk2(uk2 uk2Var, String str, ah2 ah2Var) {
        super(uk2Var, -1, str);
        this.h = uk2Var;
        this.i = ah2Var;
    }
}
