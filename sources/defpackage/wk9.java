package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wk9 implements Runnable {
    public final /* synthetic */ vdb a;
    public final /* synthetic */ int b;

    public /* synthetic */ wk9(int i, vdb vdbVar) {
        this.a = vdbVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vdb vdbVar = this.a;
        if (vdbVar.O0(26) || vdbVar.O0(34)) {
            int i = this.b;
            if (i == -100) {
                if (vdbVar.O0(34)) {
                    vdbVar.r(1, true);
                    return;
                } else {
                    vdbVar.I(true);
                    return;
                }
            }
            if (i == -1) {
                if (vdbVar.O0(34)) {
                    vdbVar.C(1);
                    return;
                } else {
                    vdbVar.s();
                    return;
                }
            }
            if (i == 1) {
                if (vdbVar.O0(34)) {
                    vdbVar.t(1);
                    return;
                } else {
                    vdbVar.O();
                    return;
                }
            }
            if (i == 100) {
                if (vdbVar.O0(34)) {
                    vdbVar.r(1, false);
                    return;
                } else {
                    vdbVar.I(false);
                    return;
                }
            }
            if (i != 101) {
                g7.j(i, "onAdjustVolume: Ignoring unknown direction: ", "VolumeProviderCompat");
            } else if (vdbVar.O0(34)) {
                vdbVar.r(1, !vdbVar.W0());
            } else {
                vdbVar.I(!vdbVar.W0());
            }
        }
    }
}
