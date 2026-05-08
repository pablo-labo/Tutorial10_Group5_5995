package defpackage;

import androidx.compose.ui.layout.w;
import defpackage.c20;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ds8 extends ks8 {
    public final /* synthetic */ int V;
    public final /* synthetic */ int W;
    public final /* synthetic */ c20.b X;
    public final /* synthetic */ c20.c Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ int a0;
    public final /* synthetic */ int b0;
    public final /* synthetic */ long c0;
    public final /* synthetic */ ss8 d0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ar8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds8(long j, boolean z, as8 as8Var, ar8 ar8Var, int i, int i2, c20.b bVar, c20.c cVar, boolean z2, int i3, int i4, long j2, ss8 ss8Var) {
        super(j, z, as8Var, ar8Var);
        this.e = z;
        this.f = ar8Var;
        this.V = i;
        this.W = i2;
        this.X = bVar;
        this.Y = cVar;
        this.Z = z2;
        this.a0 = i3;
        this.b0 = i4;
        this.c0 = j2;
        this.d0 = ss8Var;
    }

    @Override // defpackage.ks8
    public final js8 l(int i, Object obj, Object obj2, List<? extends w> list, long j) {
        return new js8(i, list, this.e, this.X, this.Y, this.f.b.getLayoutDirection(), this.Z, this.a0, this.b0, i == this.V + (-1) ? 0 : this.W, this.c0, obj, obj2, this.d0.n, j);
    }
}
