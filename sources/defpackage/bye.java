package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class bye extends ck3 implements wxe {
    public wxe d;
    public long e;

    @Override // defpackage.wxe
    public final int a(long j) {
        wxe wxeVar = this.d;
        wxeVar.getClass();
        return wxeVar.a(j - this.e);
    }

    @Override // defpackage.wxe
    public final List<n83> e(long j) {
        wxe wxeVar = this.d;
        wxeVar.getClass();
        return wxeVar.e(j - this.e);
    }

    @Override // defpackage.wxe
    public final long f(int i) {
        wxe wxeVar = this.d;
        wxeVar.getClass();
        return wxeVar.f(i) + this.e;
    }

    @Override // defpackage.wxe
    public final int m() {
        wxe wxeVar = this.d;
        wxeVar.getClass();
        return wxeVar.m();
    }

    @Override // defpackage.ck3
    public final void n() {
        super.n();
        this.d = null;
    }
}
